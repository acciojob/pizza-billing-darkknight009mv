package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        // your code goes here
         // will call parent constructor
        // your code goes here

        //below methods are by default coz its deluxe pizza
        addExtraCheese();
        addExtraToppings();

    }
}
