package com.deflatedpickle.purplepower.items;

import com.deflatedpickle.purplepower.Reference;
import com.deflatedpickle.purplepower.init.ModCreativeTabs;
import vazkii.arl.item.ItemModSword;

public class ItemSword extends ItemModSword {
    public ItemSword(String name, ToolMaterial material) {
        super(name, material);
        setCreativeTab(ModCreativeTabs.COMBAT);
    }

    @Override
    public String getModNamespace() {
        return Reference.MOD_ID;
    }
}
