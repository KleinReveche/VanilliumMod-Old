package com.klr2003.anaesia.behaviour.items;

import com.klr2003.anaesia.blocks.CandleCakeBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CakeBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.phys.BlockHitResult;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({CakeBlock.class})
public class CandleCakeMixin {
  @Shadow
  @Final
  public static IntegerProperty BITES;
  
  @Inject(method = {"use"}, at = {@At("HEAD")}, cancellable = true)
  private void use(BlockState state, Level world, BlockPos pos, Player player,
                   InteractionHand hand, BlockHitResult hit, CallbackInfoReturnable<InteractionResult> cir) {
    ItemStack itemStack = player.getItemInHand(hand);
    Item item = itemStack.getItem();
    if(state.getValue(BITES) == 0){
      Block block = Block.byItem(item);
      if (block instanceof com.klr2003.anaesia.blocks.CandleBlock) {
        if (!player.isCreative())
          itemStack.shrink(1); 
        world.playSound(null, pos, SoundEvents.HONEY_BLOCK_PLACE, SoundSource.BLOCKS, 1.0F, 1.0F);
        world.setBlockAndUpdate(pos, CandleCakeBlock.getCandleCakeFromCandle(block));
        cir.setReturnValue(InteractionResult.SUCCESS);
      } 
    } 
  }
}
