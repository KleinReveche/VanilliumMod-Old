package com.klr2003.vanillium.items;


import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import com.klr2003.vanillium.blocks.VanilliumBlocks;
import com.klr2003.vanillium.utils.UtilHandler;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

import java.util.Optional;
import java.util.function.Supplier;

public class HoneycombItem extends Item {
    public static final Supplier<ImmutableBiMap<Block, Block>> WAXABLES =
        Suppliers.memoize(() -> {
            ImmutableBiMap.Builder<Block, Block> builder = new ImmutableBiMap.Builder<>();
            builder.put(VanilliumBlocks.COPPER_BLOCK, VanilliumBlocks.WAXED_COPPER_BLOCK);
            builder.put(VanilliumBlocks.EXPOSED_COPPER, VanilliumBlocks.WAXED_EXPOSED_COPPER);
            builder.put(VanilliumBlocks.WEATHERED_COPPER, VanilliumBlocks.WAXED_WEATHERED_COPPER);
            builder.put(VanilliumBlocks.OXIDIZED_COPPER, VanilliumBlocks.WAXED_OXIDIZED_COPPER);
            builder.put(VanilliumBlocks.CUT_COPPER, VanilliumBlocks.WAXED_CUT_COPPER);
            builder.put(VanilliumBlocks.EXPOSED_CUT_COPPER, VanilliumBlocks.WAXED_EXPOSED_CUT_COPPER);
            builder.put(VanilliumBlocks.WEATHERED_CUT_COPPER, VanilliumBlocks.WAXED_WEATHERED_CUT_COPPER);
            builder.put(VanilliumBlocks.OXIDIZED_CUT_COPPER, VanilliumBlocks.WAXED_OXIDIZED_CUT_COPPER);
            builder.put(VanilliumBlocks.CUT_COPPER_SLAB, VanilliumBlocks.WAXED_CUT_COPPER_SLAB);
            builder.put(VanilliumBlocks.EXPOSED_CUT_COPPER_SLAB, VanilliumBlocks.WAXED_EXPOSED_CUT_COPPER_SLAB);
            builder.put(VanilliumBlocks.WEATHERED_CUT_COPPER_SLAB, VanilliumBlocks.WAXED_WEATHERED_CUT_COPPER_SLAB);
            builder.put(VanilliumBlocks.OXIDIZED_CUT_COPPER_SLAB, VanilliumBlocks.WAXED_OXIDIZED_CUT_COPPER_SLAB);
            builder.put(VanilliumBlocks.CUT_COPPER_STAIRS, VanilliumBlocks.WAXED_CUT_COPPER_STAIRS);
            builder.put(VanilliumBlocks.EXPOSED_CUT_COPPER_STAIRS, VanilliumBlocks.WAXED_EXPOSED_CUT_COPPER_STAIRS);
            builder.put(VanilliumBlocks.WEATHERED_CUT_COPPER_STAIRS, VanilliumBlocks.WAXED_WEATHERED_CUT_COPPER_STAIRS);
            builder.put(VanilliumBlocks.OXIDIZED_CUT_COPPER_STAIRS, VanilliumBlocks.WAXED_OXIDIZED_CUT_COPPER_STAIRS);
            return builder.build();
        });
    public static final Supplier<BiMap<Block, Block>> WAX_OFF_BY_BLOCK = Suppliers.memoize(() -> WAXABLES.get());

    public HoneycombItem(Item.Properties properties) {
        super(properties);
    }

    public InteractionResult useOn(UseOnContext useOnContext) {
        Level level = useOnContext.getLevel();
        BlockPos blockPos = useOnContext.getClickedPos();
        BlockState blockState = level.getBlockState(blockPos);
        return getWaxed(blockState).map((blockStatex) -> {
            Player player = useOnContext.getPlayer();
            ItemStack itemStack = useOnContext.getItemInHand();
            if (player instanceof ServerPlayer) {
                CriteriaTriggers.ITEM_USED_ON_BLOCK.trigger((ServerPlayer)player, blockPos, itemStack);
            }

            itemStack.shrink(1);
            level.setBlock(blockPos, blockStatex, 11);
            level.levelEvent(player, 3003, blockPos, 0);
            return InteractionResult.sidedSuccess(level.isClientSide);
        }).orElse(InteractionResult.PASS);
    }

    public static Optional<BlockState> getWaxed(BlockState blockState) {
        return Optional.ofNullable((WAXABLES.get()).get(blockState.getBlock())).map((block) ->
                UtilHandler.withPropertiesOf(block.defaultBlockState().getBlock(), blockState));
    }
}

