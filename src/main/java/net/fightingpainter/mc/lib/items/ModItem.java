package net.fightingpainter.mc.lib.items;

import net.fightingpainter.mc.lib.results.ItemUseResult;
import net.fightingpainter.mc.lib.world.World;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.level.Level;

public class ModItem {
    private final ItemTranslator translator;

    public ModItem(Properties properties) {
        this.translator = new ItemTranslator(properties, this);
    }

    public ItemUseResult use(World world, Player player, InteractionHand usedHand) {
        return ItemUseResult.pass(player.getItemInHand(usedHand));
    }


    
    private static class ItemTranslator extends Item {
        private final ModItem item;

        public ItemTranslator(Properties properties, ModItem item) {
            super(properties);
            this.item = item;
        }

        @Override
        public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand usedHand) {
            //translate behavior to the ModItem
            World world = new World(level); //translate the level to the World
            
            ItemUseResult result = item.use(world, player, usedHand); //translate the use to the ModItem
            return result.getResult(); //translate the result to the InteractionResultHolder
        }


    }
}
