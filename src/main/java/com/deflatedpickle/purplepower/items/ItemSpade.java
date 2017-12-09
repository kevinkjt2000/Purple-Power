package com.deflatedpickle.purplepower.items;

import com.deflatedpickle.purplepower.Reference;
import com.deflatedpickle.purplepower.init.ModCreativeTabs;
import com.google.common.collect.Sets;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import vazkii.arl.item.ItemModTool;

import java.util.Set;

public class ItemSpade extends ItemModTool {
    private static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(Blocks.CLAY, Blocks.DIRT, Blocks.FARMLAND, Blocks.GRASS, Blocks.GRAVEL, Blocks.MYCELIUM, Blocks.SAND, Blocks.SNOW, Blocks.SNOW_LAYER, Blocks.SOUL_SAND, Blocks.GRASS_PATH, Blocks.CONCRETE_POWDER);

    public ItemSpade(String name, float attackDamage, float speed, ToolMaterial material) {
        super(name, attackDamage, speed, material, EFFECTIVE_ON);
        setCreativeTab(ModCreativeTabs.TOOLS);
    }

    @Override
    public boolean canHarvestBlock(IBlockState blockIn) {
        return Items.IRON_SHOVEL.canHarvestBlock(blockIn);
    }

    @Override
    public EnumActionResult onItemUse(EntityPlayer playerIn, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        return Items.IRON_SHOVEL.onItemUse(playerIn, worldIn, pos, hand, facing, hitX, hitY, hitZ);
    }

    @Override
    public String getModNamespace() {
        return Reference.MOD_ID;
    }
}
