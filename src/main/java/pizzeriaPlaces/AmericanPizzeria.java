package pizzeriaPlaces;

import factories.AmericanPizzaIngredientsFactory;
import factories.PizzaIngredientsFactory;
import pizza.*;

public class AmericanPizzeria extends Pizzeria{
    protected Pizza createPizza(String item) {
        Pizza pizza = null;

        PizzaIngredientsFactory ingredientsFactory =
                new AmericanPizzaIngredientsFactory();

        if (item.equals("serowa")) {
            pizza = new SerowaPizza(ingredientsFactory);
            pizza.setName("Amerykańska Pizza z serem");
        } else if (item.equals("wegetariańska")) {
            pizza = new WegetariańskaPizza(ingredientsFactory);
            pizza.setName("Amerykańska Pizza Wegetariańska");
        } else if (item.equals("owoce morza")) {
            pizza = new OwoceMorzaPizza(ingredientsFactory);
            pizza.setName("Amerykańska Pizza Owoce Morza");
        } else if (item.equals("pepperoni")) {
            pizza = new PepperoniPizza(ingredientsFactory);
            pizza.setName("Amerykańska Pizza Pepperoni");
        } else return null;

        return pizza;
    }
}
