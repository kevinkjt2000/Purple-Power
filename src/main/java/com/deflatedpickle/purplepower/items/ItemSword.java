package com.deflatedpickle.purplepower.items;

import com.deflatedpickle.purplepower.Reference;
import vazkii.arl.item.ItemModSword;

public class ItemSword extends ItemModSword {
    public ItemSword(String name, ToolMaterial material) {
        super(name, material);
    }

    @Override
    public String getModNamespace() {
        return Reference.MOD_ID;
    }
}
