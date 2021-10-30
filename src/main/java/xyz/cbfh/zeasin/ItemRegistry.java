package xyz.cbfh.zeasin;

import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import xyz.cbfh.zeasin.item.ItemObsidianApple;
import xyz.cbfh.zeasin.item.ItemObsidianIngot;

public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Utils.MOD_ID);
    public static final RegistryObject<Item> obsidianIngot = ITEMS.register("obsidian_ingot", ItemObsidianIngot::new);
    public static final RegistryObject<Item> obsidianApple = ITEMS.register("obsidian_apple", ItemObsidianApple::new);
}
