package com.ramosbros.core.mammals.human;

import com.ramosbros.core.food.Food;
import com.ramosbros.core.mammals.Mammal;

public class Person extends Mammal {

    // These are in no units yet so...
    private static final int GAIN_WEIGHT = 3_000;
    private static final float NECESSARY_SLEEP = 8.0f;

    public Person(int legs, int arms, float weight, float height) {
        super(legs, arms, weight, height);
    }

    @Override
    public void sleep(float hours) {
        if (hours < NECESSARY_SLEEP) {
            // change mood
        }
    }

    @Override
    public void eat(Food food) {
        if (food.getCalories() >= GAIN_WEIGHT) {
            gainWeight(1);
        }
    }
}
