package net.fightingpainter.mc.lib.results;

import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.item.ItemStack;

public class ItemUseResult {

    private final ItemStack stack;
    private final String result;

    public ItemUseResult(ItemStack stack, String result) {
        this.stack = stack;
        this.result = result;
    }

    public static ItemUseResult pass(ItemStack stack) {
        return new ItemUseResult(stack, "pass");
    }




    public InteractionResultHolder<ItemStack> getResult() {
        if (result.equals("pass")) {return InteractionResultHolder.pass(stack);}
        else {return InteractionResultHolder.fail(stack);}

    }
    
}
