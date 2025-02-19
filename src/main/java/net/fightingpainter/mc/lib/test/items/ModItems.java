package net.fightingpainter.mc.lib.test.items;

import net.fightingpainter.mc.lib.registries.ItemRegistry;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems("fighter_lib");

    public static final ItemRegistry ITEM_REGISTRY = new ItemRegistry("fighter_lib");
}
