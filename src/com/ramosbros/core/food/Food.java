package com.ramosbros.core.food;

public class Food {
    private int calories;
    private Foods food;

    public Food(Foods food, int calories) {
        this.food = food;
        this.calories = calories;
    }


    public Foods getFood() {
        return food;
    }

    public void setFood(Foods food) {
        this.food = food;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }
}
