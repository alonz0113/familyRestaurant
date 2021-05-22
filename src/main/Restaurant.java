package main;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private float cash;
    private List<Ingredient> ingredients;

    public Restaurant() {
        this.cash = 100000;
        this.ingredients = new ArrayList<>();
        //Later, the way to initialize the ingredients list to start the program:
        //ingredients.add(new Ingredient("bread", (float) 0.2, 5400, 8));
       // ingredients.add(new Ingredient("ham", (float) 2, 5000, 9));
    }

    public float getCash() {
        return cash;
    }

    public void setCash(float cash) {
        this.cash = cash;
    }

    public void addCash(float cash) {
        this.cash += cash;
    }

    //method to add an ingredient into the list of ingredients
    public void addIngredient(Ingredient ingredient){
        this.ingredients.add(ingredient);
    }

    //getter to obtain the list of ingredients
    public List<Ingredient> getIngredients() {
        return this.ingredients;
    }


    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }


}
