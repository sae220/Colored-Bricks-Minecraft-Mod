package net.Pinary_Pi.coloredbricks.data.loot;

import java.util.stream.Collectors;

import net.Pinary_Pi.coloredbricks.coloredbricks;
import net.Pinary_Pi.coloredbricks.setup.ModBlocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.data.loot.BlockLoot;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlockLootTables extends BlockLoot {
    
    @Override
    protected void addTables() {
        this.dropSelf(ModBlocks.WHITE_BRICKS.get());
        this.dropSelf(ModBlocks.ORANGE_BRICKS.get());
        this.dropSelf(ModBlocks.PINK_BRICKS.get());
        this.dropSelf(ModBlocks.YELLOW_BRICKS.get());
        this.dropSelf(ModBlocks.LIME_BRICKS.get());
        this.dropSelf(ModBlocks.GREEN_BRICKS.get());
        this.dropSelf(ModBlocks.LIGHT_BLUE_BRICKS.get());
        this.dropSelf(ModBlocks.CYAN_BRICKS.get());
        this.dropSelf(ModBlocks.BLUE_BRICKS.get());
        this.dropSelf(ModBlocks.MAGENTA_BRICKS.get());
        this.dropSelf(ModBlocks.PURPLE_BRICKS.get());
        this.dropSelf(ModBlocks.BROWN_BRICKS.get());
        this.dropSelf(ModBlocks.LIGHT_GRAY_BRICKS.get());
        this.dropSelf(ModBlocks.GRAY_BRICKS.get());
        this.dropSelf(ModBlocks.BLACK_BRICKS.get());
        this.dropSelf(ModBlocks.RED_BRICKS.get());
        this.add(ModBlocks.WHITE_BRICK_SLAB.get(), BlockLoot::createSlabItemTable);
        this.add(ModBlocks.ORANGE_BRICK_SLAB.get(), BlockLoot::createSlabItemTable);
        this.add(ModBlocks.PINK_BRICK_SLAB.get(), BlockLoot::createSlabItemTable);
        this.add(ModBlocks.YELLOW_BRICK_SLAB.get(), BlockLoot::createSlabItemTable);
        this.add(ModBlocks.LIME_BRICK_SLAB.get(), BlockLoot::createSlabItemTable);
        this.add(ModBlocks.GREEN_BRICK_SLAB.get(), BlockLoot::createSlabItemTable);
        this.add(ModBlocks.LIGHT_BLUE_BRICK_SLAB.get(), BlockLoot::createSlabItemTable);
        this.add(ModBlocks.CYAN_BRICK_SLAB.get(), BlockLoot::createSlabItemTable);
        this.add(ModBlocks.BLUE_BRICK_SLAB.get(), BlockLoot::createSlabItemTable);
        this.add(ModBlocks.MAGENTA_BRICK_SLAB.get(), BlockLoot::createSlabItemTable);
        this.add(ModBlocks.PURPLE_BRICK_SLAB.get(), BlockLoot::createSlabItemTable);
        this.add(ModBlocks.BROWN_BRICK_SLAB.get(), BlockLoot::createSlabItemTable);
        this.add(ModBlocks.LIGHT_GRAY_BRICK_SLAB.get(), BlockLoot::createSlabItemTable);
        this.add(ModBlocks.GRAY_BRICK_SLAB.get(), BlockLoot::createSlabItemTable);
        this.add(ModBlocks.BLACK_BRICK_SLAB.get(), BlockLoot::createSlabItemTable);
        this.add(ModBlocks.RED_BRICK_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.WHITE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.ORANGE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.PINK_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.YELLOW_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.LIME_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.GREEN_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.LIGHT_BLUE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.CYAN_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.BLUE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.MAGENTA_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.PURPLE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.BROWN_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.LIGHT_GRAY_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.GRAY_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.BLACK_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.RED_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.WHITE_BRICK_WALL.get());
        this.dropSelf(ModBlocks.ORANGE_BRICK_WALL.get());
        this.dropSelf(ModBlocks.PINK_BRICK_WALL.get());
        this.dropSelf(ModBlocks.YELLOW_BRICK_WALL.get());
        this.dropSelf(ModBlocks.LIME_BRICK_WALL.get());
        this.dropSelf(ModBlocks.GREEN_BRICK_WALL.get());
        this.dropSelf(ModBlocks.LIGHT_BLUE_BRICK_WALL.get());
        this.dropSelf(ModBlocks.CYAN_BRICK_WALL.get());
        this.dropSelf(ModBlocks.BLUE_BRICK_WALL.get());
        this.dropSelf(ModBlocks.MAGENTA_BRICK_WALL.get());
        this.dropSelf(ModBlocks.PURPLE_BRICK_WALL.get());
        this.dropSelf(ModBlocks.BROWN_BRICK_WALL.get());
        this.dropSelf(ModBlocks.LIGHT_GRAY_BRICK_WALL.get());
        this.dropSelf(ModBlocks.GRAY_BRICK_WALL.get());
        this.dropSelf(ModBlocks.BLACK_BRICK_WALL.get());
        this.dropSelf(ModBlocks.RED_BRICK_WALL.get());
        this.dropSelf(ModBlocks.WHITE_CHISELED_BRICKS.get());
        this.dropSelf(ModBlocks.ORANGE_CHISELED_BRICKS.get());
        this.dropSelf(ModBlocks.PINK_CHISELED_BRICKS.get());
        this.dropSelf(ModBlocks.YELLOW_CHISELED_BRICKS.get());
        this.dropSelf(ModBlocks.LIME_CHISELED_BRICKS.get());
        this.dropSelf(ModBlocks.GREEN_CHISELED_BRICKS.get());
        this.dropSelf(ModBlocks.LIGHT_BLUE_CHISELED_BRICKS.get());
        this.dropSelf(ModBlocks.CYAN_CHISELED_BRICKS.get());
        this.dropSelf(ModBlocks.BLUE_CHISELED_BRICKS.get());
        this.dropSelf(ModBlocks.MAGENTA_CHISELED_BRICKS.get());
        this.dropSelf(ModBlocks.PURPLE_CHISELED_BRICKS.get());
        this.dropSelf(ModBlocks.BROWN_CHISELED_BRICKS.get());
        this.dropSelf(ModBlocks.LIGHT_GRAY_CHISELED_BRICKS.get());
        this.dropSelf(ModBlocks.GRAY_CHISELED_BRICKS.get());
        this.dropSelf(ModBlocks.BLACK_CHISELED_BRICKS.get());
        this.dropSelf(ModBlocks.RED_CHISELED_BRICKS.get());
        this.dropSelf(ModBlocks.CHISELED_BRICKS.get());
        this.dropSelf(ModBlocks.CRACKED_BRICKS.get());
        this.dropSelf(ModBlocks.WHITE_CRACKED_BRICKS.get());
        this.dropSelf(ModBlocks.ORANGE_CRACKED_BRICKS.get());
        this.dropSelf(ModBlocks.PINK_CRACKED_BRICKS.get());
        this.dropSelf(ModBlocks.YELLOW_CRACKED_BRICKS.get());
        this.dropSelf(ModBlocks.LIME_CRACKED_BRICKS.get());
        this.dropSelf(ModBlocks.GREEN_CRACKED_BRICKS.get());
        this.dropSelf(ModBlocks.LIGHT_BLUE_CRACKED_BRICKS.get());
        this.dropSelf(ModBlocks.CYAN_CRACKED_BRICKS.get());
        this.dropSelf(ModBlocks.BLUE_CRACKED_BRICKS.get());
        this.dropSelf(ModBlocks.MAGENTA_CRACKED_BRICKS.get());
        this.dropSelf(ModBlocks.PURPLE_CRACKED_BRICKS.get());
        this.dropSelf(ModBlocks.BROWN_CRACKED_BRICKS.get());
        this.dropSelf(ModBlocks.LIGHT_GRAY_CRACKED_BRICKS.get());
        this.dropSelf(ModBlocks.GRAY_CRACKED_BRICKS.get());
        this.dropSelf(ModBlocks.BLACK_CRACKED_BRICKS.get());
        this.dropSelf(ModBlocks.RED_CRACKED_BRICKS.get());
        this.add(ModBlocks.CRACKED_BRICK_SLAB.get(), BlockLoot::createSlabItemTable);
        this.add(ModBlocks.WHITE_CRACKED_BRICK_SLAB.get(), BlockLoot::createSlabItemTable);
        this.add(ModBlocks.ORANGE_CRACKED_BRICK_SLAB.get(), BlockLoot::createSlabItemTable);
        this.add(ModBlocks.PINK_CRACKED_BRICK_SLAB.get(), BlockLoot::createSlabItemTable);
        this.add(ModBlocks.YELLOW_CRACKED_BRICK_SLAB.get(), BlockLoot::createSlabItemTable);
        this.add(ModBlocks.LIME_CRACKED_BRICK_SLAB.get(), BlockLoot::createSlabItemTable);
        this.add(ModBlocks.GREEN_CRACKED_BRICK_SLAB.get(), BlockLoot::createSlabItemTable);
        this.add(ModBlocks.CYAN_CRACKED_BRICK_SLAB.get(), BlockLoot::createSlabItemTable);
        this.add(ModBlocks.LIGHT_BLUE_CRACKED_BRICK_SLAB.get(), BlockLoot::createSlabItemTable);
        this.add(ModBlocks.BLUE_CRACKED_BRICK_SLAB.get(), BlockLoot::createSlabItemTable);
        this.add(ModBlocks.MAGENTA_CRACKED_BRICK_SLAB.get(), BlockLoot::createSlabItemTable);
        this.add(ModBlocks.PURPLE_CRACKED_BRICK_SLAB.get(), BlockLoot::createSlabItemTable);
        this.add(ModBlocks.BROWN_CRACKED_BRICK_SLAB.get(), BlockLoot::createSlabItemTable);
        this.add(ModBlocks.LIGHT_GRAY_CRACKED_BRICK_SLAB.get(), BlockLoot::createSlabItemTable);
        this.add(ModBlocks.GRAY_CRACKED_BRICK_SLAB.get(), BlockLoot::createSlabItemTable);
        this.add(ModBlocks.BLACK_CRACKED_BRICK_SLAB.get(), BlockLoot::createSlabItemTable);
        this.add(ModBlocks.RED_CRACKED_BRICK_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.CRACKED_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.WHITE_CRACKED_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.ORANGE_CRACKED_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.PINK_CRACKED_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.YELLOW_CRACKED_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.LIME_CRACKED_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.GREEN_CRACKED_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.LIGHT_BLUE_CRACKED_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.CYAN_CRACKED_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.BLUE_CRACKED_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.MAGENTA_CRACKED_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.PURPLE_CRACKED_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.BROWN_CRACKED_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.LIGHT_GRAY_CRACKED_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.GRAY_CRACKED_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.BLACK_CRACKED_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.RED_CRACKED_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.CRACKED_BRICK_WALL.get());
        this.dropSelf(ModBlocks.WHITE_CRACKED_BRICK_WALL.get());
        this.dropSelf(ModBlocks.ORANGE_CRACKED_BRICK_WALL.get());
        this.dropSelf(ModBlocks.PINK_CRACKED_BRICK_WALL.get());
        this.dropSelf(ModBlocks.YELLOW_CRACKED_BRICK_WALL.get());
        this.dropSelf(ModBlocks.LIME_CRACKED_BRICK_WALL.get());
        this.dropSelf(ModBlocks.GREEN_CRACKED_BRICK_WALL.get());
        this.dropSelf(ModBlocks.LIGHT_BLUE_CRACKED_BRICK_WALL.get());
        this.dropSelf(ModBlocks.CYAN_CRACKED_BRICK_WALL.get());
        this.dropSelf(ModBlocks.BLUE_CRACKED_BRICK_WALL.get());
        this.dropSelf(ModBlocks.MAGENTA_CRACKED_BRICK_WALL.get());
        this.dropSelf(ModBlocks.PURPLE_CRACKED_BRICK_WALL.get());
        this.dropSelf(ModBlocks.BROWN_CRACKED_BRICK_WALL.get());
        this.dropSelf(ModBlocks.LIGHT_GRAY_CRACKED_BRICK_WALL.get());
        this.dropSelf(ModBlocks.GRAY_CRACKED_BRICK_WALL.get());
        this.dropSelf(ModBlocks.BLACK_CRACKED_BRICK_WALL.get());
        this.dropSelf(ModBlocks.RED_CRACKED_BRICK_WALL.get());
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ForgeRegistries.BLOCKS.getValues().stream()
                .filter(block -> coloredbricks.MOD_ID.equals(block.getRegistryName().getNamespace()))
                .collect(Collectors.toSet());
    }
}
