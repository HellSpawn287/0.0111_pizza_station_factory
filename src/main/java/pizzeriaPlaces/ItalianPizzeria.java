package pizzeriaPlaces;

import factories.ItalianPizzaIngredientsFactory;
import factories.PizzaIngredientsFactory;
import pizza.*;

public class ItalianPizzeria extends Pizzeria {

    protected Pizza createPizza(String item) {
        Pizza pizza = null;


        PizzaIngredientsFactory ingredientsFactory =
                new ItalianPizzaIngredientsFactory();

        if (item.equals("serowa")) {
            pizza = new SerowaPizza(ingredientsFactory);
            pizza.setName("Włoska Pizza z serem");
        } else if (item.equals("wegetariańska")) {
            pizza = new WegetariańskaPizza(ingredientsFactory);
            pizza.setName("Włoska Pizza Wegetariańska");
        } else if (item.equals("owoce morza")) {
            pizza = new OwoceMorzaPizza(ingredientsFactory);
            pizza.setName("Włoska Pizza Owoce Morza");
        } else if (item.equals("pepperoni")) {
            pizza = new PepperoniPizza(ingredientsFactory);
            pizza.setName("Włoska Pizza Pepperoni");
        } else return null;

        return pizza;
    }
}
