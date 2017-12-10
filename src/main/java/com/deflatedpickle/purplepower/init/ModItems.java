package com.deflatedpickle.purplepower.init;

import com.deflatedpickle.purplepower.items.ItemPickaxe;
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
    public static Item RUBY_PICKAXE;

    public static Item SAPPHIRE_SWORD;
    public static Item SAPPHIRE_SHOVEL;
    public static Item SAPPHIRE_PICKAXE;

    public static Item EMERALD_SWORD;
    public static Item EMERALD_SHOVEL;
    public static Item EMERALD_PICKAXE;

    public static Item AMETHYST_SWORD;
    public static Item AMETHYST_SHOVEL;
    public static Item AMETHYST_PICKAXE;

    public static void init() {
        RUBY_SWORD = new ItemSword("ruby_sword", RUBY);
        RUBY_SHOVEL = new ItemSpade("ruby_shovel", 1.5f, -3.0f, RUBY);
        RUBY_PICKAXE = new ItemPickaxe("ruby_pickaxe", 1.0F, -2.8F, RUBY);

        SAPPHIRE_SWORD = new ItemSword("sapphire_sword", SAPPHIRE);
        SAPPHIRE_SHOVEL = new ItemSpade("sapphire_shovel", 1.5f, -3.0f, SAPPHIRE);
        SAPPHIRE_PICKAXE = new ItemPickaxe("sapphire_pickaxe", 1.0F, -2.8F, SAPPHIRE);

        EMERALD_SWORD = new ItemSword("emerald_sword", EMERALD);
        EMERALD_SHOVEL = new ItemSpade("emerald_shovel", 1.5f, -3.0f, EMERALD);
        EMERALD_PICKAXE = new ItemPickaxe("emerald_pickaxe", 1.0F, -2.8F, EMERALD);

        AMETHYST_SWORD = new ItemSword("amethyst_sword", AMETHYST);
        AMETHYST_SHOVEL = new ItemSpade("amethyst_shovel", 1.5f, -3.0f, AMETHYST);
        AMETHYST_PICKAXE = new ItemPickaxe("amethyst_pickaxe", 1.0F, -2.8F, AMETHYST);
    }
}
