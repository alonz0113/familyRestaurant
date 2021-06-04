package main;

import java.util.*;

public class ManageRestaurant {

public static  void showMenu(){
    System.out.print("\n choose an option from the menu:" +
            "\n a. Print my current money amount" +
            "\n b. Print my current ingredient inventory" +
            "\n c. Buy some amount of any ingredient" +
            "\n d. exit \n");
}
    public static void main(String[] args) {

        Restaurant lasTresEsquinas = new Restaurant();

        List<Ingredient> ingredients = new ArrayList<>();
        lasTresEsquinas.addIngredient(new Ingredient("carrot", 150, 25, 10));
        lasTresEsquinas.addIngredient(new Ingredient("flour", 75, 125, 10));
        lasTresEsquinas.addIngredient(new Ingredient("milk", 175, 33, 10));
        lasTresEsquinas.addIngredient(new Ingredient("salt", 10, 10, 10));
        lasTresEsquinas.addIngredient(new Ingredient("sugar", 25, 50, 10));
        lasTresEsquinas.addIngredient(new Ingredient("cocoa", 220, 35, 10));
        lasTresEsquinas.addIngredient(new Ingredient("vegetable oil", 110, 65, 10));
        lasTresEsquinas.addIngredient(new Ingredient("tomato", 175, 35, 10));
        lasTresEsquinas.addIngredient(new Ingredient("cheese", 350, 120, 10));
        lasTresEsquinas.addIngredient(new Ingredient("orange", 86, 13, 10));
        lasTresEsquinas.addIngredient(new Ingredient("water", 25, 0, 10));
        lasTresEsquinas.addIngredient(new Ingredient("peperoni", 185, 25, 10));
        ingredients = lasTresEsquinas.getIngredients();


        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        String option = null;

        List<Ingredient> ingredients1 = new ArrayList<>();

        ingredients1.add(new Ingredient("carrot", 150, 25, 10));
        ingredients1.add(new Ingredient("flour", 75, 125, 10));
        ingredients1.add(new Ingredient("milk", 175, 33, 10));
        ingredients1.add(new Ingredient("salt", 10, 10, 10));
        ingredients1.add(new Ingredient("sugar", 25, 50, 10));
        ingredients1.add(new Ingredient("cocoa", 220, 35, 10));
        ingredients1.add(new Ingredient("vegetable oil", 110, 65, 10));
        ingredients1.add(new Ingredient("tomato", 175, 35, 10));
        ingredients1.add(new Ingredient("cheese", 350, 120, 10));
        ingredients1.add(new Ingredient("orange", 86, 13, 10));
        ingredients1.add(new Ingredient("water", 25, 0, 10));
        ingredients1.add(new Ingredient("peperoni", 185, 25, 10));

        showMenu();
        while (option != "d") {
            option = input.nextLine();

            switch (option) {

                case "a":
                    System.out.print("\n your balance is: " + lasTresEsquinas.getCash() + "\n");
                    showMenu();
                    break;

                case "b":
                    System.out.print("list of ingredients : " + "\n");
                    lasTresEsquinas.showIngredients(ingredients);
                    showMenu();
                    break;

                case "c":
                    lasTresEsquinas.showList(ingredients1);
                    System.out.print("\n"+"If the product is on the list, enter option 1, otherwise, enter option 2 to add a new product:" + "\n");
                    int options = Integer.parseInt(input.nextLine());
                    if(options == 1){
                        int optionList;
                        System.out.print("enter the product number you want to buy: " + "\n");
                        optionList = Integer.parseInt(input.nextLine());
                        System.out.println(ingredients1.get(optionList - 1).getName() + " $" + ingredients1.get(optionList - 1).getPrice());
                        System.out.print("\n"+"quantity of items: ");
                        float items = Float.parseFloat(input.nextLine());
                        lasTresEsquinas.setCash(lasTresEsquinas.getCash() - items * ingredients.get(optionList-1).getPrice());
                        float cantidadItems = lasTresEsquinas.getIngredients().get(optionList-1).getAmount();
                        lasTresEsquinas.getIngredients().get(optionList-1).setAmount(cantidadItems + items);
                    } else if(options == 2){
                        System.out.println("\n" + "ingredient name: ");
                        String name = input.nextLine();
                        System.out.println("\n"+"ingredient calories: ");
                        float calories = Float.parseFloat(input.nextLine());
                        System.out.print("\n"+"ingredient price: ");
                        float price = Float.parseFloat(input.nextLine());
                        System.out.print("\n"+"quantity of items: ");
                        float amount = Float.parseFloat(input.nextLine());
                        lasTresEsquinas.addIngredient(new Ingredient(name, calories, price, amount));
                        lasTresEsquinas.setCash(lasTresEsquinas.getCash() - amount * price);
                    }else{System.out.print("\n"+"the option is not valid");}
                    showMenu();
                    break;

                case "d":
                    System.out.print("see you soon" + "\n");
                    option ="d";
                    break;

                    default: showMenu();
                break;

            }


        }


    }
}
