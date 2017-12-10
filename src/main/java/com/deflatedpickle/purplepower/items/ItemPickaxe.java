package com.deflatedpickle.purplepower.items;

import com.deflatedpickle.purplepower.Reference;
import com.deflatedpickle.purplepower.init.ModCreativeTabs;
import com.google.common.collect.Sets;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import vazkii.arl.item.ItemModTool;

import java.util.Set;

public class ItemPickaxe extends ItemModTool {
    private static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(Blocks.ACTIVATOR_RAIL, Blocks.COAL_ORE, Blocks.COBBLESTONE, Blocks.DETECTOR_RAIL, Blocks.DIAMOND_BLOCK, Blocks.DIAMOND_ORE, Blocks.DOUBLE_STONE_SLAB, Blocks.GOLDEN_RAIL, Blocks.GOLD_BLOCK, Blocks.GOLD_ORE, Blocks.ICE, Blocks.IRON_BLOCK, Blocks.IRON_ORE, Blocks.LAPIS_BLOCK, Blocks.LAPIS_ORE, Blocks.LIT_REDSTONE_ORE, Blocks.MOSSY_COBBLESTONE, Blocks.NETHERRACK, Blocks.PACKED_ICE, Blocks.RAIL, Blocks.REDSTONE_ORE, Blocks.SANDSTONE, Blocks.RED_SANDSTONE, Blocks.STONE, Blocks.STONE_SLAB);

    public ItemPickaxe(String name, float attackDamage, float speed, ToolMaterial material) {
        super(name, attackDamage, speed, material, EFFECTIVE_ON);
        setCreativeTab(ModCreativeTabs.TOOLS);
    }

    @Override
    public String getModNamespace() {
        return Reference.MOD_ID;
    }

    @Override
    public boolean canHarvestBlock(IBlockState blockIn) {
        return Items.IRON_PICKAXE.canHarvestBlock(blockIn);
    }
}
