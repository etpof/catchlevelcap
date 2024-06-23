package com.sylvonir.catchlevelcap.forge;

import net.minecraft.world.GameRules;

public class CatchLevelCapImpl {
    public static GameRules.Key<GameRules.IntRule> registerIntRule(String name, GameRules.Category category, int initialValue) {
        return GameRules.register(name, category, GameRules.IntRule.create(initialValue));
    }

    public static GameRules.Key<GameRules.BooleanRule> registerBooleanRule(String name, GameRules.Category category, boolean initialValue) {
        return GameRules.register(name, category, GameRules.BooleanRule.create(initialValue));
    }
}
