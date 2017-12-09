package com.deflatedpickle.purplepower.init;

import com.deflatedpickle.purplepower.items.ItemSpade;
import com.deflatedpickle.purplepower.items.ItemSword;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {
    public static ToolMaterial RUBY = EnumHelper.addToolMaterial("RUBY", 2,750, 6.0f, 2.0f, 18);
    public static ToolMaterial SAPPHIRE = EnumHelper.addToolMaterial("SAPPHIRE", 2,750, 6.0f, 2.0f, 18);
    public static ToolMaterial EMERALD = EnumHelper.addToolMaterial("EMERALD", 2,750, 6.0f, 2.0f, 18);
    public static ToolMaterial AMETHYST = EnumHelper.addToolMaterial("AMETHYST", 2,750, 6.0f, 2.0f, 18);

    public static Item RUBY_SWORD;
    public static Item RUBY_SHOVEL;

    public static Item SAPPHIRE_SWORD;

    public static Item EMERALD_SWORD;

    public static Item AMETHYST_SWORD;

    public static void init() {
        RUBY_SWORD = new ItemSword("ruby_sword", RUBY);
        RUBY_SHOVEL = new ItemSpade("ruby_shovel", 1.5f, -3.0f, RUBY);

        SAPPHIRE_SWORD = new ItemSword("sapphire_sword", SAPPHIRE);

        EMERALD_SWORD = new ItemSword("emerald_sword", EMERALD);

        AMETHYST_SWORD = new ItemSword("amethyst_sword", AMETHYST);
    }
}
