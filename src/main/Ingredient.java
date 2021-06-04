package main;

public class Ingredient {
    private String name;
    private float calories;
    private float price;
    private float amount;

    public Ingredient(String name, float calories, float price, float amount) {
        this.name = name;
        this.calories = calories;
        this.price = price;
        this.amount = amount;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getCalories() {
        return calories;
    }

    public void setCalories(float calories) {
        this.calories = calories;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    //Added to let view the ingredients from Resturant class
    @Override
    public String toString() {
        return "name=" + name +
                ", calories=" + calories +
                ", price=" + price +
                ", amount=" + amount;
    }
}