package pizza;

import factories.PizzaIngredientsFactory;

public class PepperoniPizza extends Pizza {

    PizzaIngredientsFactory factory;

    public PepperoniPizza(PizzaIngredientsFactory factory) {
        this.factory = factory;
    }

    @Override
    public void preparation() {
        System.out.println("Przygotowanie: " + name);
        typeOfPizzaPie = factory.createPizzaPie();
        sauce = factory.createSause();
        cheese = factory.createCheese();
    }
}
