package xyz.przemyk.simpleplanes.setup;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import xyz.przemyk.simpleplanes.SimplePlanesMod;
import xyz.przemyk.simpleplanes.entities.LargePlaneEntity;
import xyz.przemyk.simpleplanes.entities.PlaneEntity;
import xyz.przemyk.simpleplanes.items.InformationItem;
import xyz.przemyk.simpleplanes.items.PlaneItem;

@SuppressWarnings("unused")
public class SimplePlanesItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SimplePlanesMod.MODID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    public static final ItemGroup SIMPLE_PLANES_ITEM_GROUP = new ItemGroup("simpleplanes") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(SPRUCE_FURNACE_PLANE.get());
        }
    };

    public static final RegistryObject<PlaneItem> OAK_FURNACE_PLANE = ITEMS.register("oak_furnace_plane", () -> new PlaneItem(new Item.Properties().group(SIMPLE_PLANES_ITEM_GROUP), world -> new PlaneEntity(SimplePlanesEntities.OAK_FURNACE_PLANE.get(), world)));
    public static final RegistryObject<PlaneItem> SPRUCE_FURNACE_PLANE = ITEMS.register("spruce_furnace_plane", () -> new PlaneItem(new Item.Properties().group(SIMPLE_PLANES_ITEM_GROUP), world -> new PlaneEntity(SimplePlanesEntities.SPRUCE_FURNACE_PLANE.get(), world)));
    public static final RegistryObject<PlaneItem> BIRCH_FURNACE_PLANE = ITEMS.register("birch_furnace_plane", () -> new PlaneItem(new Item.Properties().group(SIMPLE_PLANES_ITEM_GROUP), world -> new PlaneEntity(SimplePlanesEntities.BIRCH_FURNACE_PLANE.get(), world)));
    public static final RegistryObject<PlaneItem> JUNGLE_FURNACE_PLANE = ITEMS.register("jungle_furnace_plane", () -> new PlaneItem(new Item.Properties().group(SIMPLE_PLANES_ITEM_GROUP), world -> new PlaneEntity(SimplePlanesEntities.JUNGLE_FURNACE_PLANE.get(), world)));
    public static final RegistryObject<PlaneItem> ACACIA_FURNACE_PLANE = ITEMS.register("acacia_furnace_plane", () -> new PlaneItem(new Item.Properties().group(SIMPLE_PLANES_ITEM_GROUP), world -> new PlaneEntity(SimplePlanesEntities.ACACIA_FURNACE_PLANE.get(), world)));
    public static final RegistryObject<PlaneItem> DARK_OAK_FURNACE_PLANE = ITEMS.register("dark_oak_furnace_plane", () -> new PlaneItem(new Item.Properties().group(SIMPLE_PLANES_ITEM_GROUP), world -> new PlaneEntity(SimplePlanesEntities.DARK_OAK_FURNACE_PLANE.get(), world)));
    public static final RegistryObject<PlaneItem> CRIMSON_FURNACE_PLANE = ITEMS.register("crimson_furnace_plane", () -> new PlaneItem(new Item.Properties().group(SIMPLE_PLANES_ITEM_GROUP), world -> new PlaneEntity(SimplePlanesEntities.CRIMSON_FURNACE_PLANE.get(), world)));
    public static final RegistryObject<PlaneItem> WARPED_FURNACE_PLANE = ITEMS.register("warped_furnace_plane", () -> new PlaneItem(new Item.Properties().group(SIMPLE_PLANES_ITEM_GROUP), world -> new PlaneEntity(SimplePlanesEntities.WARPED_FURNACE_PLANE.get(), world)));

    public static final RegistryObject<PlaneItem> OAK_LARGE_FURNACE_PLANE = ITEMS.register("oak_large_furnace_plane", () -> new PlaneItem(new Item.Properties().group(SIMPLE_PLANES_ITEM_GROUP), world -> new LargePlaneEntity(SimplePlanesEntities.OAK_LARGE_FURNACE_PLANE.get(), world)));
    public static final RegistryObject<PlaneItem> SPRUCE_LARGE_FURNACE_PLANE = ITEMS.register("spruce_large_furnace_plane", () -> new PlaneItem(new Item.Properties().group(SIMPLE_PLANES_ITEM_GROUP), world -> new LargePlaneEntity(SimplePlanesEntities.SPRUCE_LARGE_FURNACE_PLANE.get(), world)));
    public static final RegistryObject<PlaneItem> BIRCH_LARGE_FURNACE_PLANE = ITEMS.register("birch_large_furnace_plane", () -> new PlaneItem(new Item.Properties().group(SIMPLE_PLANES_ITEM_GROUP), world -> new LargePlaneEntity(SimplePlanesEntities.BIRCH_LARGE_FURNACE_PLANE.get(), world)));
    public static final RegistryObject<PlaneItem> JUNGLE_LARGE_FURNACE_PLANE = ITEMS.register("jungle_large_furnace_plane", () -> new PlaneItem(new Item.Properties().group(SIMPLE_PLANES_ITEM_GROUP), world -> new LargePlaneEntity(SimplePlanesEntities.JUNGLE_LARGE_FURNACE_PLANE.get(), world)));
    public static final RegistryObject<PlaneItem> ACACIA_LARGE_FURNACE_PLANE = ITEMS.register("acacia_large_furnace_plane", () -> new PlaneItem(new Item.Properties().group(SIMPLE_PLANES_ITEM_GROUP), world -> new LargePlaneEntity(SimplePlanesEntities.ACACIA_LARGE_FURNACE_PLANE.get(), world)));
    public static final RegistryObject<PlaneItem> DARK_OAK_LARGE_FURNACE_PLANE = ITEMS.register("dark_oak_large_furnace_plane", () -> new PlaneItem(new Item.Properties().group(SIMPLE_PLANES_ITEM_GROUP), world -> new LargePlaneEntity(SimplePlanesEntities.DARK_OAK_LARGE_FURNACE_PLANE.get(), world)));
    public static final RegistryObject<PlaneItem> CRIMSON_LARGE_FURNACE_PLANE = ITEMS.register("crimson_large_furnace_plane", () -> new PlaneItem(new Item.Properties().group(SIMPLE_PLANES_ITEM_GROUP), world -> new LargePlaneEntity(SimplePlanesEntities.CRIMSON_LARGE_FURNACE_PLANE.get(), world)));
    public static final RegistryObject<PlaneItem> WARPED_LARGE_FURNACE_PLANE = ITEMS.register("warped_large_furnace_plane", () -> new PlaneItem(new Item.Properties().group(SIMPLE_PLANES_ITEM_GROUP), world -> new LargePlaneEntity(SimplePlanesEntities.WARPED_LARGE_FURNACE_PLANE.get(), world)));

    public static final RegistryObject<Item> PROPELLER = ITEMS.register("propeller", () -> new Item(new Item.Properties().group(SIMPLE_PLANES_ITEM_GROUP)));
    public static final RegistryObject<Item> FURNACE_ENGINE = ITEMS.register("furnace_engine", () -> new Item(new Item.Properties().group(SIMPLE_PLANES_ITEM_GROUP)));

    public static final RegistryObject<Item> SPRAYER = ITEMS.register("sprayer", () -> new InformationItem(new TranslationTextComponent("description.simpleplanes.sprayer")));
    public static final RegistryObject<Item> BOOSTER = ITEMS.register("booster", () -> new InformationItem(new TranslationTextComponent("description.simpleplanes.booster")));
    public static final RegistryObject<Item> FLOATY_BEDDING = ITEMS.register("floaty_bedding", () -> new InformationItem(new TranslationTextComponent("description.simpleplanes.floaty_bedding")));
    public static final RegistryObject<Item> SHOOTER = ITEMS.register("shooter", () -> new InformationItem(new TranslationTextComponent("description.simpleplanes.shooter")));
}