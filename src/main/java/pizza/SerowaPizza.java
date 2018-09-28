package pizza;

import factories.PizzaIngredientsFactory;

public class SerowaPizza extends Pizza {

    PizzaIngredientsFactory ingredientsFactory;

    public SerowaPizza(PizzaIngredientsFactory ingredientsFactory) {
        this.ingredientsFactory = ingredientsFactory;
    }

    @Override
    public void preparation() {
        System.out.println("Przygotowanie: " + name);
        typeOfPizzaPie = ingredientsFactory.createPizzaPie();
        sauce = ingredientsFactory.createSause();
        cheese = ingredientsFactory.createCheese();
    }
}
