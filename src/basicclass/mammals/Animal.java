package basicclass.mammals;

import interfaces.Functional;

// This is how we can create a class with an interface
// implement the methods in the interface
public class Animal implements Functional {

    private int legs;
    private int color;
    private int weight;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
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

    // To be overriden in child class
    public void screech() {

    }

    @Override
    public void eat() {
        // TODO Auto-generated method stub

    }

    @Override
    public void poop() {
        // TODO Auto-generated method stub

    }

    @Override
    public void sleep() {
        // TODO Auto-generated method stub

    }

}
