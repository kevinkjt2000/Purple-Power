package com.deflatedpickle.purplepower.init;

import com.deflatedpickle.purplepower.items.ItemSword;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {
    public static ToolMaterial RUBY = EnumHelper.addToolMaterial("RUBY", 2,750, 6.0f, 2.0f, 18);
    public static ToolMaterial SAPPHIRE = EnumHelper.addToolMaterial("SAPPHIRE", 2,750, 6.0f, 2.0f, 18);
    public static ToolMaterial EMERALD = EnumHelper.addToolMaterial("EMERALD", 2,750, 6.0f, 2.0f, 18);
    public static ToolMaterial AMETHYST = EnumHelper.addToolMaterial("AMETHYST", 2,750, 6.0f, 2.0f, 18);

    public static Item ruby_sword;

    public static void init() {
        ruby_sword = new ItemSword("ruby_sword", RUBY);
    }
}
