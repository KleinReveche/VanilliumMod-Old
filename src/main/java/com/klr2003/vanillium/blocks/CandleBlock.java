package com.klr2003.vanillium.blocks;

import com.google.common.collect.ImmutableList;
import com.klr2003.vanillium.utils.UtilHandler;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.Util;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.List;
import java.util.Objects;
import java.util.function.ToIntFunction;

public class CandleBlock extends AbstractCandleBlock implements SimpleWaterloggedBlock {
  public CandleBlock(Properties settings) {
    super(settings);
    registerDefaultState(this.stateDefinition.any().setValue(CANDLES, 1)
            .setValue(LIT, false).setValue(WATERLOGGED, false));
  }
  
  public InteractionResult use(BlockState state, Level world, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit) {
    ItemStack itemStack = player.getItemInHand(hand);
    Item item = itemStack.getItem();
    if (item == Items.FLINT_AND_STEEL && canBeLit(state)) {
      light(world, state, pos);
      if (player instanceof net.minecraft.server.level.ServerPlayer)
        itemStack.hurtAndBreak(1, (LivingEntity)player, p -> player.broadcastBreakEvent(hand)); 
      world.playSound(null, pos, SoundEvents.FLINTANDSTEEL_USE, SoundSource.BLOCKS, 1.0F, 1.0F);
      return InteractionResult.sidedSuccess(world.isClientSide);
    } 
    if (item == Items.FIRE_CHARGE && canBeLit(state)) {
      light(world, state, pos);
      if (player instanceof net.minecraft.server.level.ServerPlayer && !player.isCreative())
        itemStack.shrink(1); 
      world.playSound(null, pos, SoundEvents.FIRECHARGE_USE, SoundSource.BLOCKS, 1.0F, 1.0F);
      return InteractionResult.sidedSuccess(world.isClientSide);
    } 
    if (player.getItemInHand(hand).isEmpty() && state.getValue(LIT)) {
      extinguish(player, state, world, pos);
      return InteractionResult.sidedSuccess(world.isClientSide);
    } 
    return InteractionResult.PASS;
  }
  
  public boolean canBeReplaced(BlockState state, BlockPlaceContext context) {
    return !context.isSecondaryUseActive() && context.getItemInHand().getItem() == 
            asItem() && state.getValue( CANDLES) < 4 || super.canBeReplaced(state, context);
  }
  
  public BlockState getStateForPlacement(BlockPlaceContext ctx) {
    BlockState blockState = ctx.getLevel().getBlockState(ctx.getClickedPos());
    if (blockState.is(this))
      return blockState.cycle(CANDLES); 
    FluidState fluidState = ctx.getLevel().getFluidState(ctx.getClickedPos());
    boolean bl = (fluidState.getType() == Fluids.WATER);
    return Objects.requireNonNull(super.getStateForPlacement(ctx)).setValue(WATERLOGGED, bl);
  }
  
  public BlockState updateShape(BlockState state, Direction direction, BlockState neighborState, LevelAccessor world, BlockPos pos, BlockPos neighborPos) {
    if (state.getValue(WATERLOGGED))
      world.getLiquidTicks().scheduleTick(pos, Fluids.WATER, Fluids.WATER.getTickDelay(world));
    return super.updateShape(state, direction, neighborState, world, pos, neighborPos);
  }
  
  public FluidState getFluidState(BlockState state) {
    return (state.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(state));
  }
  
  public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
    switch (state.getValue(CANDLES)) {
      default:
        return ONE_CANDLE_SHAPE;
      case 2:
        return TWO_CANDLES_SHAPE;
      case 3:
        return THREE_CANDLES_SHAPE;
      case 4:
        break;
    } 
    return FOUR_CANDLES_SHAPE;
  }
  
  protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
    builder.add(CANDLES, LIT, WATERLOGGED);
  }
  
  public boolean placeLiquid(LevelAccessor world, BlockPos pos, BlockState state, FluidState fluidState) {
    if (!(state.getValue(WATERLOGGED)) && fluidState.getType() == Fluids.WATER) {
      BlockState blockState = state.setValue(WATERLOGGED, true);
      if ( state.getValue(LIT)) {
        extinguish(null, blockState, world, pos);
      } else {
        world.setBlock(pos, blockState, 3);
      } 
      world.getLiquidTicks().scheduleTick(pos, fluidState.getType(), fluidState.getType().getTickDelay(world));
      return true;
    } 
    return false;
  }
  
  public static boolean canBeLit(BlockState state) {
    return (!(state.getValue(LIT)) && !(state.getValue(WATERLOGGED)));
  }
  
  @Environment(EnvType.CLIENT)
  protected Iterable<Vec3> getParticleOffsets(BlockState state) {
    return CANDLES_TO_PARTICLE_OFFSETS.get(state.getValue(CANDLES));
  }
  
  public boolean canSurvive(BlockState state, LevelReader world, BlockPos pos) {
    return Block.canSupportCenter(world, pos.below(), Direction.UP);
  }

  public static final IntegerProperty CANDLES = UtilHandler.CANDLES;

  public static final BooleanProperty LIT = AbstractCandleBlock.LIT;
  
  public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
  
  public static final ToIntFunction<BlockState> STATE_TO_LUMINANCE;
  
  private static final Int2ObjectMap<List<Vec3>> CANDLES_TO_PARTICLE_OFFSETS;
  
  static {
    STATE_TO_LUMINANCE = (state -> state.getValue(LIT) ? (3 * (state.getValue(CANDLES))) : 0);
    CANDLES_TO_PARTICLE_OFFSETS = Util.make(() -> {
      Int2ObjectMap<List<Vec3>> int2ObjectMap = new Int2ObjectOpenHashMap<>();
      int2ObjectMap.defaultReturnValue(ImmutableList.of());
      int2ObjectMap.put(1, ImmutableList.of(new Vec3(0.5D, 0.5D, 0.5D)));
      int2ObjectMap.put(2, ImmutableList.of(new Vec3(0.375D, 0.44D, 0.5D), new Vec3(0.625D, 0.5D, 0.44D)));
      int2ObjectMap.put(3, ImmutableList.of(new Vec3(0.5D, 0.313D, 0.625D), new Vec3(0.375D, 0.44D, 0.5D), new Vec3(0.56D, 0.5D, 0.44D)));
      int2ObjectMap.put(4, ImmutableList.of(new Vec3(0.44D, 0.313D, 0.56D), new Vec3(0.625D, 0.44D, 0.56D), new Vec3(0.375D, 0.44D, 0.375D), new Vec3(0.56D, 0.5D, 0.375D)));
      return Int2ObjectMaps.unmodifiable(int2ObjectMap);
    });
  }
  
  private static final VoxelShape ONE_CANDLE_SHAPE = Block.box(7.0D, 0.0D, 7.0D, 9.0D, 6.0D, 9.0D);
  
  private static final VoxelShape TWO_CANDLES_SHAPE = Block.box(5.0D, 0.0D, 6.0D, 11.0D, 6.0D, 9.0D);
  
  private static final VoxelShape THREE_CANDLES_SHAPE = Block.box(5.0D, 0.0D, 6.0D, 10.0D, 6.0D, 11.0D);
  
  private static final VoxelShape FOUR_CANDLES_SHAPE = Block.box(5.0D, 0.0D, 5.0D, 11.0D, 6.0D, 10.0D);
}
