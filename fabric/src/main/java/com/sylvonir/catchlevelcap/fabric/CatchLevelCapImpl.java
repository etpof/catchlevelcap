package com.sylvonir.catchlevelcap.fabric;

import net.fabricmc.fabric.api.gamerule.v1.GameRuleFactory;
import net.fabricmc.fabric.api.gamerule.v1.GameRuleRegistry;
import net.minecraft.world.GameRules;

public class CatchLevelCapImpl {
    public static GameRules.Key<GameRules.IntRule> registerIntRule(String name, GameRules.Category category, int initialValue) {
        return GameRuleRegistry.register(name, category, GameRuleFactory.createIntRule(initialValue));
    }

    public static GameRules.Key<GameRules.BooleanRule> registerBooleanRule(String name, GameRules.Category category, boolean initialValue) {
        return GameRuleRegistry.register(name, category, GameRuleFactory.createBooleanRule(initialValue));
    }
}
