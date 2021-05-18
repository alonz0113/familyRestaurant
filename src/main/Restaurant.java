package main;

public class Restaurant {
    private float cash;

    public Restaurant(float cash) {
        this.cash = 100000;
    }

    public float getCash() {
        return cash;
    }

    public void setCash(float cash) {
        this.cash += cash;
    }
}
