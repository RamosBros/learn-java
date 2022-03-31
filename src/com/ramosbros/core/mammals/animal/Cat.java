package com.ramosbros.core.mammals.animal;

import com.ramosbros.core.food.Food;
import com.ramosbros.core.mammals.Mammal;

public class Cat extends Mammal {

    public Cat(int legs, int arms, float weight, float height) {
        super(legs, arms, weight, height);
    }

    // This is how we can override the behavior of the parent class
    @Override
    public void screech() {
        // do something custom for the cat class
    }

    @Override
    public void eat(Food food) {

    }
}
