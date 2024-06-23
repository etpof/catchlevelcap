package com.sylvonir.catchlevelcap;

import dev.architectury.injectables.annotations.ExpectPlatform;
import net.minecraft.world.GameRules;

public class CatchLevelCap {
    public static final String MOD_ID = "catchlevelcap";

    public static final GameRules.Key<GameRules.IntRule> LEVEL_CAP;
    public static final GameRules.Key<GameRules.IntRule> EXTERNAL_LEVEL_CAP;
    public static final GameRules.Key<GameRules.BooleanRule> SHOW_LEVEL_CAP_MESSAGES;

    static {
        LEVEL_CAP = registerIntRule("levelCap", GameRules.Category.MISC, 5);
        EXTERNAL_LEVEL_CAP = registerIntRule("externalLevelCap", GameRules.Category.MISC, 5);
        SHOW_LEVEL_CAP_MESSAGES = registerBooleanRule("showLevelCapMessages", GameRules.Category.MISC, true);
    }
    public static void init() {

    }

    @ExpectPlatform
    public static GameRules.Key<GameRules.IntRule> registerIntRule(String name, GameRules.Category category, int initialValue) {
        throw new AssertionError();
    }

    @ExpectPlatform
    public static GameRules.Key<GameRules.BooleanRule> registerBooleanRule(String name, GameRules.Category category, boolean initialValue) {
        throw new AssertionError();
    }
}
