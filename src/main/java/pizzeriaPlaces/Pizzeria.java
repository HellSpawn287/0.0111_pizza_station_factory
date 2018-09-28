package pizzeriaPlaces;

import pizza.Pizza;

public abstract class Pizzeria {

    public Pizza orderPizza(String pizzaType){
        Pizza pizza;

        pizza= createPizza(pizzaType);

        pizza.preparation();
        pizza.baking();
        pizza.cutting();
        pizza.packing();

        return pizza;
    }

    abstract Pizza createPizza(String item);
}
