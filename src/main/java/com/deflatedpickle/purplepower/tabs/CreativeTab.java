package com.deflatedpickle.purplepower.tabs;

import com.deflatedpickle.purplepower.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class CreativeTab extends CreativeTabs {
    private String name;
    private ItemStack icon;

    public CreativeTab(String name, ItemStack icon) {
        super(Reference.MOD_ID + "_" + name);
        this.name = name;
        this.icon = icon;
    }

    @Override
    public ItemStack getTabIconItem(){
        return icon;
    }
}
