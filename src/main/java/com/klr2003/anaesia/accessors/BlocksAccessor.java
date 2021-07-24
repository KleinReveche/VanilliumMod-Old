package com.klr2003.anaesia.accessors;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.LeavesBlock;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(Blocks.class)
public class BlocksAccessor extends Block {
    public BlocksAccessor(Settings settings) {
        super(settings);
    }

    @Accessor
    public static LeavesBlock createLeavesBlock(){
        throw new AssertionError();
    }

}
