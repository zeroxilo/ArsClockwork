package slimegirl.arsclockwork;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.item.BlockItem;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModBlocks {
    private static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ArsClockwork.MODID);
    private static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(ArsClockwork.MODID);

    //方块注册
    public static final DeferredBlock<Block> BAD_GOLD_BLOCK = BLOCKS.registerSimpleBlock(
            "bad_gold_block",
            BlockBehaviour.Properties.of().mapColor(MapColor.GOLD).strength(1)
    );
    public static final DeferredItem<BlockItem> BAD_GOLD_BLOCK_ITEM =
            ITEMS.registerSimpleBlockItem("bad_gold_block", ModBlocks.BAD_GOLD_BLOCK);

    public static final DeferredBlock<Block> GOOD_GOLD_BLOCK = BLOCKS.registerSimpleBlock(
            "good_gold_block",
            BlockBehaviour.Properties.of().mapColor(MapColor.GOLD).strength(1)
    );
    public static final DeferredItem<BlockItem> GOOD_GOLD_BLOCK_ITEM =
            ITEMS.registerSimpleBlockItem("good_gold_block", ModBlocks.GOOD_GOLD_BLOCK);

    public static final DeferredBlock<Block> ORICHALCUM_BLOCK = BLOCKS.registerSimpleBlock(
            "orichalcum_block",
            BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_YELLOW).strength(4)
    );
    public static final DeferredItem<BlockItem> ORICHALCUM_BLOCK_ITEM =
            ITEMS.registerSimpleBlockItem("orichalcum_block", ModBlocks.ORICHALCUM_BLOCK);

    public static final DeferredBlock<Block> MITHRIL_BLOCK = BLOCKS.registerSimpleBlock(
            "mithril_block",
            BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GREEN).strength(8)
    );
    public static final DeferredItem<BlockItem> MITHRIL_BLOCK_ITEM =
            ITEMS.registerSimpleBlockItem("mithril_block", ModBlocks.MITHRIL_BLOCK);

    public static final DeferredBlock<Block> ADAMANTINE_BLOCK = BLOCKS.registerSimpleBlock(
            "adamantine_block",
            BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).strength(20)
    );
    public static final DeferredItem<BlockItem> ADAMANTINE_BLOCK_ITEM =
            ITEMS.registerSimpleBlockItem("adamantine_block", ModBlocks.ADAMANTINE_BLOCK);

    public static final DeferredBlock<Block> ETHEREAL_BLOCK = BLOCKS.registerSimpleBlock(
            "ethereal_block",
            BlockBehaviour.Properties.of().mapColor(MapColor.CLAY).strength(1)
    );
    public static final DeferredItem<BlockItem> ETHEREAL_BLOCK_ITEM =
            ITEMS.registerSimpleBlockItem("ethereal_block", ModBlocks.ETHEREAL_BLOCK);

    public static final DeferredBlock<Block> ROSE_GOLD_BLOCK = BLOCKS.registerSimpleBlock(
            "rose_gold_block",
            BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).strength(0.4f)
    );
    public static final DeferredItem<BlockItem> ROSE_GOLD_BLOCK_ITEM =
            ITEMS.registerSimpleBlockItem("rose_gold_block", ModBlocks.ROSE_GOLD_BLOCK);

    public static final DeferredBlock<Block> ROSA_IRON_BLOCK = BLOCKS.registerSimpleBlock(
            "rosa_iron_block",
            BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_ORANGE).strength(3)
    );
    public static final DeferredItem<BlockItem> ROSA_IRON_BLOCK_ITEM =
            ITEMS.registerSimpleBlockItem("rosa_iron_block", ModBlocks.ROSA_IRON_BLOCK);

    public static final DeferredBlock<Block> CLOUDS = BLOCKS.registerSimpleBlock(
            "clouds",
            BlockBehaviour.Properties.of().mapColor(MapColor.SNOW).strength(0.2f)
    );
    public static final DeferredItem<BlockItem> CLOUDS_ITEM =
            ITEMS.registerSimpleBlockItem("clouds", ModBlocks.CLOUDS);

    public static final DeferredBlock<Block> RAIN_CLOUDS = BLOCKS.registerSimpleBlock(
            "rain_clouds",
            BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).strength(0.8f)
    );
    public static final DeferredItem<BlockItem> RAIN_CLOUDS_ITEM =
            ITEMS.registerSimpleBlockItem("rain_clouds", ModBlocks.RAIN_CLOUDS);

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
        ITEMS.register(eventBus);
    }

    public static void addToCreativeTab(CreativeModeTab.Output output) {
        ITEMS.getEntries().forEach(item -> output.accept(item.get()));
    }

    private ModBlocks() {
    }
}
