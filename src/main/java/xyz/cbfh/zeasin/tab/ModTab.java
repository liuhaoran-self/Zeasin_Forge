package xyz.cbfh.zeasin.tab;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import xyz.cbfh.zeasin.ItemRegistry;

public class ModTab extends ItemGroup {
    public static final ItemGroup itemTab = new ModTab();
    public ModTab() {
        super("main_group");
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(ItemRegistry.obsidianIngot.get());
    }
}
