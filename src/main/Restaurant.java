package main;

public class Restaurant {
    private float cash;

    //Constructor:
    public Restaurant() {
        this.cash = 100000;
    }

    //getter and setter: cash
    public float getCash() {
        return cash;
    }

    public void setCash(float cash) {
        this.cash += cash;
    }
}
