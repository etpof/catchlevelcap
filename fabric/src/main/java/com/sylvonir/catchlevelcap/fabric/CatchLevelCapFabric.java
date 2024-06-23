package com.sylvonir.catchlevelcap.fabric;

import com.sylvonir.catchlevelcap.CatchLevelCap;
import net.fabricmc.api.ModInitializer;

public class CatchLevelCapFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        CatchLevelCap.init();
    }
}
