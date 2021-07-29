package com.klr2003.anaesia.behaviour.items;

import com.klr2003.anaesia.items.HoneycombItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.Slice;

@SuppressWarnings("UnresolvedMixinReference")
@Mixin(Items.class)
public class HoneycombMixin {

    @Redirect(
            method = "<clinit>",
            slice = @Slice(from = @At(value = "CONSTANT", args = "stringValue=honeycomb")),
            at = @At(value = "NEW", target = "net/minecraft/world/item/Items;", ordinal = 0))
    public Item honeycomb(Item.Properties properties){
        return new HoneycombItem(properties.tab(CreativeModeTab.TAB_MATERIALS));
    }
}
