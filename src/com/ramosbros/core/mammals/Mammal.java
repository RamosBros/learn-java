package com.ramosbros.core.mammals;

import com.ramosbros.core.food.Food;
import com.ramosbros.interfaces.Functional;

// This is how we can create a class with an interface
// implement the methods in the interface
public abstract class Mammal implements Functional {

    private int legs;
    private int arms;
    private int color;
    private float weight;
    private float height;

    public Mammal(int legs, int arms, float weight, float height) {
        this.legs = legs;
        this.arms = arms;
        this.weight = weight;
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public int getArms() {
        return arms;
    }

    public void setArms(int arms) {
        this.arms = arms;
    }


    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void gainWeight(float additionalWeight) {
        this.weight += additionalWeight;
    }

    public void loseWeight(float subWeight) {
        this.weight -= subWeight;
    }

    // To be overriden in child class
    public void screech() {
        // TODO
    }

    @Override
    public void eat(Food food) {
        // TODO Auto-generated method stub

    }

    @Override
    public void poop() {
        // TODO Auto-generated method stub

    }

    @Override
    public void sleep(float hours) {
        // TODO Auto-generated method stub

    }

}
