package com.moonjew.nutt.items;

import net.minecraft.item.Food;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class ModFoods {

    public static final Food PISTACHIO = (new Food.Builder()).setAlwaysEdible().hunger(1).saturation(0.4f).effect(new EffectInstance(Effects.SPEED, 100, 1), 1.0F).build();
    public static final Food PEANUT = (new Food.Builder()).setAlwaysEdible().hunger(1).saturation(0.4f).effect(new EffectInstance(Effects.JUMP_BOOST, 100, 1), 1.0f).build();
    public static final Food MACADAMIA = (new Food.Builder()).setAlwaysEdible().hunger(1).saturation(0.4f).effect(new EffectInstance(Effects.INVISIBILITY, 100, 1), 1.0f).build();
    public static final Food CASHEW = (new Food.Builder()).setAlwaysEdible().hunger(1).saturation(0.4f).effect(new EffectInstance(Effects.HASTE, 100, 1), 1.0f).build();
    public static final Food ALMOND = (new Food.Builder()).setAlwaysEdible().hunger(1).saturation(0.4f).effect(new EffectInstance(Effects.FIRE_RESISTANCE, 100, 1), 1.0f).build();
    
}
