package com.deflatedpickle.purplepower.init;

import com.deflatedpickle.purplepower.tabs.CreativeTab;
import net.minecraft.item.ItemStack;

public class ModCreativeTabs {
    public static CreativeTab tabCombat;

    public static void init() {
        tabCombat = new CreativeTab("combat", new ItemStack(ModItems.ruby_sword));
    }
}
