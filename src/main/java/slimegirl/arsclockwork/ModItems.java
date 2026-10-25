package slimegirl.arsclockwork;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import slimegirl.arsclockwork.items.ExampleCosmetic;

public class ModItems {
    private static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ArsClockwork.MODID);

    public static final Item.Properties DEFAULT_PROP = new Item.Properties();
    public static final Item.Properties CURIOS_PROP = new Item.Properties().stacksTo(1);
    public static final Item.Properties GLYPH_PROP = new Item.Properties();
    //普通物品注册
    public static final DeferredItem<Item> BAD_GOLD_INGOT = ITEMS.registerSimpleItem(
        "bad_gold_ingot",DEFAULT_PROP);
    public static final DeferredItem<Item> BAD_GOLD_NUGGET = ITEMS.registerSimpleItem(
        "bad_gold_nugget",DEFAULT_PROP);
    public static final DeferredItem<Item> GOOD_GOLD_INGOT = ITEMS.registerSimpleItem(
        "good_gold_ingot",DEFAULT_PROP);
    public static final DeferredItem<Item> GOOD_GOLD_NUGGET = ITEMS.registerSimpleItem(
        "good_gold_nugget",DEFAULT_PROP);
    public static final DeferredItem<Item> ORICHALCUM_INGOT = ITEMS.registerSimpleItem(
        "orichalcum_ingot",DEFAULT_PROP);
    public static final DeferredItem<Item> ORICHALCUM_NUGGET = ITEMS.registerSimpleItem(
        "orichalcum_nugget",DEFAULT_PROP);
    public static final DeferredItem<Item> MITHRIL_INGOT = ITEMS.registerSimpleItem(
        "mithril_ingot",DEFAULT_PROP);
    public static final DeferredItem<Item> MITHRIL_NUGGET = ITEMS.registerSimpleItem(
        "mithril_nugget",DEFAULT_PROP);
    public static final DeferredItem<Item> ADAMANTINE_INGOT = ITEMS.registerSimpleItem(
        "adamantine_ingot",DEFAULT_PROP);
    public static final DeferredItem<Item> ADAMANTINE_NUGGET = ITEMS.registerSimpleItem(
        "adamantine_nugget",DEFAULT_PROP);
    public static final DeferredItem<Item> ETHEREAL_INGOT = ITEMS.registerSimpleItem(
        "ethereal_ingot",DEFAULT_PROP);
    public static final DeferredItem<Item> ETHEREAL_NUGGET = ITEMS.registerSimpleItem(
        "ethereal_nugget",DEFAULT_PROP);
    public static final DeferredItem<Item> ROSE_GOLD_INGOT = ITEMS.registerSimpleItem(
        "rose_gold_ingot",DEFAULT_PROP);
    public static final DeferredItem<Item> ROSE_GOLD_NUGGET = ITEMS.registerSimpleItem(
        "rose_gold_nugget",DEFAULT_PROP);
    public static final DeferredItem<Item> ROSA_IRON_INGOT = ITEMS.registerSimpleItem(
        "rosa_iron_ingot",DEFAULT_PROP);
    public static final DeferredItem<Item> ROSA_IRON_NUGGET = ITEMS.registerSimpleItem(
        "rosa_iron_nugget",DEFAULT_PROP);
    public static final DeferredItem<Item> JADE = ITEMS.registerSimpleItem(
        "jade",DEFAULT_PROP);
    public static final DeferredItem<Item> LUNAR_STONE = ITEMS.registerSimpleItem(
        "lunar_stone",DEFAULT_PROP);
    public static final DeferredItem<Item> SOLAR_STONE = ITEMS.registerSimpleItem(
        "solar_stone",DEFAULT_PROP);
    public static final DeferredItem<Item> LUNAR_ESSENCE = ITEMS.registerSimpleItem(
        "lunar_essence",DEFAULT_PROP);
    public static final DeferredItem<Item> SOLAR_ESSENCE = ITEMS.registerSimpleItem(
        "solar_essence",DEFAULT_PROP);
    public static final DeferredItem<Item> RANDOM_SEED = ITEMS.registerSimpleItem(
        "random_seed",DEFAULT_PROP);
    public static final DeferredItem<Item> TARGET_GEM = ITEMS.registerSimpleItem(
        "target_gem",DEFAULT_PROP);
    public static final DeferredItem<Item> GOLD_COGWHEEL = ITEMS.registerSimpleItem(
        "gold_cogwheel",DEFAULT_PROP);

    //饰品注册
    /*public static final DeferredItem<Item> INFINITY_COGWHEEL = ITEMS.registerSimpleItem(
        "infinity_cogwheel",CURIOS_PROP);
    public static final DeferredItem<Item> FORTUNE_WHEEL = ITEMS.registerSimpleItem(
        "fortune_wheel",CURIOS_PROP);
    public static final DeferredItem<Item> WINGED_SHOES = ITEMS.registerSimpleItem(
        "winged_shoes",CURIOS_PROP);
    public static final DeferredItem<Item> MERMAID_HEART = ITEMS.registerSimpleItem(
        "mermaid_heart",CURIOS_PROP);*/
    public static final DeferredItem<Item> SISYPHUS_BLOUDER = ITEMS.registerSimpleItem(
        "sisyphus_blouder",CURIOS_PROP);
    public static final DeferredItem<Item> MEDUSA_EYE = ITEMS.registerSimpleItem(
        "medusa_eye",CURIOS_PROP);
    public static final DeferredItem<Item> YING = ITEMS.registerSimpleItem(
        "ying",CURIOS_PROP);
    public static final DeferredItem<Item> YANG = ITEMS.registerSimpleItem(
        "yang",CURIOS_PROP);
    public static final DeferredItem<Item> BALANCE = ITEMS.registerSimpleItem(
        "balance",CURIOS_PROP);
    /*public static final DeferredItem<Item> MYSTERY_TALISMAN = ITEMS.registerSimpleItem(
        "mystery_talisman",CURIOS_PROP);*/

    //仪式之板
    public static final DeferredItem<Item> RITUAL_LUNAR_SERVANT = ITEMS.register(
        "ritual_lunar_servant",() -> new ExampleCosmetic(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> RITUAL_SOLAR_SERVANT = ITEMS.register(
        "ritual_solar_servant",() -> new ExampleCosmetic(new Item.Properties().stacksTo(1)));

    //魔符
    public static final DeferredItem<Item> GLYPH_MOONBEAM = ITEMS.register(
        "glyph_moonbeam",() -> new ExampleCosmetic(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> GLYPH_MOON_SLASH = ITEMS.register(
        "glyph_moon_slash",() -> new ExampleCosmetic(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> GLYPH_MOON_WALK = ITEMS.register(
        "glyph_moon_walk",() -> new ExampleCosmetic(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> GLYPH_SUNBURST = ITEMS.register(
        "glyph_sunburst",() -> new ExampleCosmetic(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> GLYPH_HIGH_NOON = ITEMS.register(
        "glyph_high_noon",() -> new ExampleCosmetic(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> GLYPH_PALADIN = ITEMS.register(
        "glyph_paladin",() -> new ExampleCosmetic(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> GLYPH_MERGE = ITEMS.register(
        "glyph_merge",() -> new ExampleCosmetic(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> GLYPH_SAPARATE = ITEMS.register(
        "glyph_saparate",() -> new ExampleCosmetic(new Item.Properties().stacksTo(1)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    public static void addToCreativeTab(CreativeModeTab.Output output) {
        ITEMS.getEntries().forEach(item -> output.accept(item.get()));
    }

    private ModItems() {
    }
}
