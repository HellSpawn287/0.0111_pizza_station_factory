package pizzeriaPlaces;

import factories.MexicanPizzaIngredientsFactory;
import factories.PizzaIngredientsFactory;
import pizza.*;

public class MexicanPizzeria extends Pizzeria {
    @Override
    Pizza createPizza(String item) {
        Pizza pizza = null;

        PizzaIngredientsFactory ingredientsFactory =
                new MexicanPizzaIngredientsFactory();

        if (item.equals("serowa")) {
            pizza = new SerowaPizza(ingredientsFactory);
            pizza.setName("Meksykańska Pizza z serem");
        } else if (item.equals("wegetariańska")) {
            pizza = new WegetariańskaPizza(ingredientsFactory);
            pizza.setName("Meksykańska Pizza Wegetariańska");
        } else if (item.equals("owoce morza")) {
            pizza = new OwoceMorzaPizza(ingredientsFactory);
            pizza.setName("Meksykańska Pizza Owoce Morza");
        } else if (item.equals("pepperoni")) {
            pizza = new PepperoniPizza(ingredientsFactory);
            pizza.setName("Meksykańska Pizza Pepperoni");
        } else return null;

        return pizza;
    }
}
