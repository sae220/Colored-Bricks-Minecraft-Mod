package net.Pinary_Pi.coloredbricks.data.client;

import net.Pinary_Pi.coloredbricks.coloredbricks;
import net.Pinary_Pi.coloredbricks.setup.ModBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, coloredbricks.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlock(ModBlocks.WHITE_BRICKS.get());
        simpleBlock(ModBlocks.ORANGE_BRICKS.get());
        simpleBlock(ModBlocks.PINK_BRICKS.get());
        simpleBlock(ModBlocks.YELLOW_BRICKS.get());
        simpleBlock(ModBlocks.LIME_BRICKS.get());
        simpleBlock(ModBlocks.GREEN_BRICKS.get());
        simpleBlock(ModBlocks.LIGHT_BLUE_BRICKS.get());
        simpleBlock(ModBlocks.CYAN_BRICKS.get());
        simpleBlock(ModBlocks.BLUE_BRICKS.get());
        simpleBlock(ModBlocks.MAGENTA_BRICKS.get());
        simpleBlock(ModBlocks.PURPLE_BRICKS.get());
        simpleBlock(ModBlocks.BROWN_BRICKS.get());
        simpleBlock(ModBlocks.GRAY_BRICKS.get());
        simpleBlock(ModBlocks.LIGHT_GRAY_BRICKS.get());
        simpleBlock(ModBlocks.BLACK_BRICKS.get());
        simpleBlock(ModBlocks.RED_BRICKS.get());
        
        slabBlock(ModBlocks.WHITE_BRICK_SLAB.get(), modLoc("block/white_bricks"), modLoc("block/white_bricks"));
        slabBlock(ModBlocks.ORANGE_BRICK_SLAB.get(), modLoc("block/orange_bricks"), modLoc("block/orange_bricks"));    
        slabBlock(ModBlocks.PINK_BRICK_SLAB.get(), modLoc("block/pink_bricks"), modLoc("block/pink_bricks"));
        slabBlock(ModBlocks.YELLOW_BRICK_SLAB.get(), modLoc("block/yellow_bricks"), modLoc("block/yellow_bricks"));
        slabBlock(ModBlocks.LIME_BRICK_SLAB.get(), modLoc("block/lime_bricks"), modLoc("block/lime_bricks"));
        slabBlock(ModBlocks.GREEN_BRICK_SLAB.get(), modLoc("block/green_bricks"), modLoc("block/green_bricks"));
        slabBlock(ModBlocks.LIGHT_BLUE_BRICK_SLAB.get(), modLoc("block/light_blue_bricks"), modLoc("block/light_blue_bricks"));
        slabBlock(ModBlocks.CYAN_BRICK_SLAB.get(), modLoc("block/cyan_bricks"), modLoc("block/cyan_bricks"));
        slabBlock(ModBlocks.BLUE_BRICK_SLAB.get(), modLoc("block/blue_bricks"), modLoc("block/blue_bricks"));
        slabBlock(ModBlocks.MAGENTA_BRICK_SLAB.get(), modLoc("block/magenta_bricks"), modLoc("block/magenta_bricks"));
        slabBlock(ModBlocks.PURPLE_BRICK_SLAB.get(), modLoc("block/purple_bricks"), modLoc("block/purple_bricks"));
        slabBlock(ModBlocks.BROWN_BRICK_SLAB.get(), modLoc("block/brown_bricks"), modLoc("block/brown_bricks"));
        slabBlock(ModBlocks.LIGHT_GRAY_BRICK_SLAB.get(), modLoc("block/light_gray_bricks"), modLoc("block/light_gray_bricks"));
        slabBlock(ModBlocks.GRAY_BRICK_SLAB.get(), modLoc("block/gray_bricks"), modLoc("block/gray_bricks"));
        slabBlock(ModBlocks.BLACK_BRICK_SLAB.get(), modLoc("block/black_bricks"), modLoc("block/black_bricks"));
        slabBlock(ModBlocks.RED_BRICK_SLAB.get(), modLoc("block/red_bricks"), modLoc("block/red_bricks"));

        // Stairs

        stairsBlock(ModBlocks.WHITE_BRICK_STAIRS.get(), modLoc("block/white_bricks"));
        stairsBlock(ModBlocks.ORANGE_BRICK_STAIRS.get(), modLoc("block/orange_bricks"));
        stairsBlock(ModBlocks.PINK_BRICK_STAIRS.get(), modLoc("block/pink_bricks"));
        stairsBlock(ModBlocks.YELLOW_BRICK_STAIRS.get(), modLoc("block/yellow_bricks"));
        stairsBlock(ModBlocks.LIME_BRICK_STAIRS.get(), modLoc("block/lime_bricks"));
        stairsBlock(ModBlocks.GREEN_BRICK_STAIRS.get(), modLoc("block/green_bricks"));
        stairsBlock(ModBlocks.LIGHT_BLUE_BRICK_STAIRS.get(), modLoc("block/light_blue_bricks"));
        stairsBlock(ModBlocks.CYAN_BRICK_STAIRS.get(), modLoc("block/cyan_bricks"));
        stairsBlock(ModBlocks.BLUE_BRICK_STAIRS.get(), modLoc("block/blue_bricks"));
        stairsBlock(ModBlocks.MAGENTA_BRICK_STAIRS.get(), modLoc("block/magenta_bricks"));
        stairsBlock(ModBlocks.PURPLE_BRICK_STAIRS.get(), modLoc("block/purple_bricks"));
        stairsBlock(ModBlocks.BROWN_BRICK_STAIRS.get(), modLoc("block/brown_bricks"));
        stairsBlock(ModBlocks.LIGHT_GRAY_BRICK_STAIRS.get(), modLoc("block/light_gray_bricks"));
        stairsBlock(ModBlocks.GRAY_BRICK_STAIRS.get(), modLoc("block/gray_bricks"));
        stairsBlock(ModBlocks.BLACK_BRICK_STAIRS.get(), modLoc("block/black_bricks"));
        stairsBlock(ModBlocks.RED_BRICK_STAIRS.get(), modLoc("block/red_bricks"));

        // Walls

        wallBlock(ModBlocks.WHITE_BRICK_WALL.get(), modLoc("block/white_bricks"));
        wallBlock(ModBlocks.ORANGE_BRICK_WALL.get(), modLoc("block/orange_bricks"));
        wallBlock(ModBlocks.PINK_BRICK_WALL.get(), modLoc("block/pink_bricks"));
        wallBlock(ModBlocks.YELLOW_BRICK_WALL.get(), modLoc("block/yellow_bricks"));
        wallBlock(ModBlocks.LIME_BRICK_WALL.get(), modLoc("block/lime_bricks"));
        wallBlock(ModBlocks.GREEN_BRICK_WALL.get(), modLoc("block/green_bricks"));
        wallBlock(ModBlocks.LIGHT_BLUE_BRICK_WALL.get(), modLoc("block/light_blue_bricks"));
        wallBlock(ModBlocks.CYAN_BRICK_WALL.get(), modLoc("block/cyan_bricks"));
        wallBlock(ModBlocks.BLUE_BRICK_WALL.get(), modLoc("block/blue_bricks"));
        wallBlock(ModBlocks.MAGENTA_BRICK_WALL.get(), modLoc("block/magenta_bricks"));
        wallBlock(ModBlocks.PURPLE_BRICK_WALL.get(), modLoc("block/purple_bricks"));
        wallBlock(ModBlocks.BROWN_BRICK_WALL.get(), modLoc("block/brown_bricks"));
        wallBlock(ModBlocks.LIGHT_GRAY_BRICK_WALL.get(), modLoc("block/light_gray_bricks"));
        wallBlock(ModBlocks.GRAY_BRICK_WALL.get(), modLoc("block/gray_bricks"));
        wallBlock(ModBlocks.BLACK_BRICK_WALL.get(), modLoc("block/black_bricks"));
        wallBlock(ModBlocks.RED_BRICK_WALL.get(), modLoc("block/red_bricks"));
    }
}
