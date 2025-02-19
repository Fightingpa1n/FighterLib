package net.fightingpainter.mc.lib.registries;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;


/**
 * The Item Registry is a Wrapper for DeferredRegister.Items that should make it easier to use
*/
public class ItemRegistry{

    private final DeferredRegister.Items DEFERRED_REGISTER;

    /**
     * Create An Item Registry where all your Items for your mod can be registered 
     * @param modId the modId of your mod (it's reccomended to set this by using <ModMainClass>.MOD_ID)
    */
    public ItemRegistry(String modId) {
        DEFERRED_REGISTER = DeferredRegister.createItems(modId); //create wrapped DeferredRegister
    }

    
    
    /**
     * Used to add the DeferredRegister to the event bus or in otherwords to add all the Items
     * @param modEventBus the event bus to add the DeferredRegister to (the one in the Main Mod Class Constructor)
    */
    public void addToEventBus(IEventBus modEventBus) {
        DEFERRED_REGISTER.register(modEventBus); //add the DeferredRegister to the event bus        
    }

    

    
    
}
