package com.deflatedpickle.purplepower.init;

import com.deflatedpickle.purplepower.tabs.CreativeTab;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class ModCreativeTabs {
    public static CreativeTab COMBAT;
    public static CreativeTab TOOLS;

    public static void init() {
        COMBAT = new CreativeTab("combat", new ItemStack(Items.DIAMOND_SWORD));
        TOOLS = new CreativeTab("tools", new ItemStack(Items.DIAMOND_SHOVEL));
    }
}
