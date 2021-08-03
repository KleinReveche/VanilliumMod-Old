package com.klr2003.vanillium.blocks;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.CakeBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.pathfinder.PathComputationType;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.Map;

public class CandleCakeBlock extends AbstractCandleBlock {
  public CandleCakeBlock(Block candle, Properties settings) {
    super(settings);
    registerDefaultState((this.stateDefinition.any()).setValue(LIT, false));
    CANDLES_TO_CANDLE_CAKES.put(candle, this);
  }
  
  @Environment(EnvType.CLIENT)
  protected Iterable<Vec3> getParticleOffsets(BlockState state) {
    return PARTICLE_OFFSETS;
  }
  
  public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
    return SHAPE;
  }
  
  public InteractionResult use(BlockState state, Level world, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit) {
    ItemStack itemStack = player.getItemInHand(hand);
    Item item = itemStack.getItem();
    if (item == Items.FLINT_AND_STEEL && !(state.getValue(LIT))) {
      light(world, state, pos);
      if (player instanceof net.minecraft.server.level.ServerPlayer)
        itemStack.hurtAndBreak(1, (LivingEntity)player, p -> player.broadcastBreakEvent(hand)); 
      world.playSound(null, pos, SoundEvents.FLINTANDSTEEL_USE, SoundSource.BLOCKS, 1.0F, 1.0F);
      return InteractionResult.sidedSuccess(world.isClientSide);
    } 
    if (item == Items.FIRE_CHARGE && !(state.getValue(LIT))) {
      light(world, state, pos);
      if (player instanceof net.minecraft.server.level.ServerPlayer && !player.isCreative())
        itemStack.shrink(1); 
      world.playSound(null, pos, SoundEvents.FIRECHARGE_USE, SoundSource.BLOCKS, 1.0F, 1.0F);
      return InteractionResult.sidedSuccess(world.isClientSide);
    } 
    if (itemStack.getItem() != Items.FLINT_AND_STEEL && itemStack.getItem() != Items.FIRE_CHARGE) {
      if (isHittingCandle(hit) && player.getItemInHand(hand).isEmpty() && (state.getValue(LIT))) {
        extinguish(player, state, world, pos);
        return InteractionResult.sidedSuccess(world.isClientSide);
      } 
      if (!player.isShiftKeyDown() && (player.isCreative() || player.canEat(false))) {
        InteractionResult actionResult = tryEat(world, pos, Blocks.CAKE.defaultBlockState(), player);
        if (actionResult.consumesAction())
          dropResources(state, world, pos); 
        return actionResult;
      } 
      world.setBlockAndUpdate(pos, Blocks.CAKE.defaultBlockState());
      dropResources(state, world, pos);
      return InteractionResult.SUCCESS;
    } 
    return InteractionResult.PASS;
  }
  
  private InteractionResult tryEat(LevelAccessor world, BlockPos pos, BlockState state, Player player) {
    if (!player.canEat(false))
      return InteractionResult.PASS; 
    player.awardStat(Stats.EAT_CAKE_SLICE);
    player.getFoodData().eat(2, 0.1F);
    int i = (state.getValue(CakeBlock.BITES));
    if (i < 6) {
      world.setBlock(pos, state.setValue(CakeBlock.BITES, i + 1), 3);
    } else {
      world.removeBlock(pos, false);
    } 
    return InteractionResult.SUCCESS;
  }
  
  private static boolean isHittingCandle(BlockHitResult hitResult) {
    return ((hitResult.getLocation()).y - hitResult.getBlockPos().getY() > 0.5D);
  }
  
  protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
    builder.add(LIT);
  }
  
  @Environment(EnvType.CLIENT)
  public ItemStack getCloneItemStack(BlockGetter world, BlockPos pos, BlockState state) {
    return new ItemStack(Blocks.CAKE);
  }
  
  public BlockState updateShape(BlockState state, Direction direction, BlockState neighborState, LevelAccessor world, BlockPos pos, BlockPos neighborPos) {
    return (direction == Direction.DOWN && !state.canSurvive(world, pos)) ? Blocks.AIR.defaultBlockState() : super.updateShape(state, direction, neighborState, world, pos, neighborPos);
  }
  
  public boolean canSurvive(BlockState state, LevelReader world, BlockPos pos) {
    return world.getBlockState(pos.below()).getMaterial().isSolid();
  }
  
  public int getAnalogOutputSignal(BlockState state, Level world, BlockPos pos) {
    return (7 - (state.getValue(CakeBlock.BITES))) * 2;
  }
  
  public boolean hasAnalogOutputSignal(BlockState state) {
    return true;
  }
  
  public boolean isPathfindable(BlockState state, BlockGetter world, BlockPos pos, PathComputationType type) {
    return false;
  }
  
  public static BlockState getCandleCakeFromCandle(Block candle) {
    return (CANDLES_TO_CANDLE_CAKES.get(candle)).defaultBlockState();
  }
  
  public static boolean canBeLit(BlockState state) {
    return !(state.getValue(LIT));
  }
  
  public static final BooleanProperty LIT = AbstractCandleBlock.LIT;
  
  protected static final VoxelShape CAKE_SHAPE = Block.box(1.0D, 0.0D, 1.0D, 15.0D, 8.0D, 15.0D);
  
  protected static final VoxelShape CANDLE_SHAPE = Block.box(7.0D, 8.0D, 7.0D, 9.0D, 14.0D, 9.0D);
  
  protected static final VoxelShape SHAPE = Shapes.or(CAKE_SHAPE, CANDLE_SHAPE);
  
  private static final Map<Block, CandleCakeBlock> CANDLES_TO_CANDLE_CAKES = Maps.newHashMap();
  
  private static final Iterable<Vec3> PARTICLE_OFFSETS = ImmutableList.of(new Vec3(0.5D, 1.0D, 0.5D));
}
