package pizza;

import factories.PizzaIngredientsFactory;

public class WegetariańskaPizza extends Pizza {

    PizzaIngredientsFactory factory;

    public WegetariańskaPizza(PizzaIngredientsFactory factory) {
        this.factory = factory;
    }

    @Override
    public void preparation() {
        System.out.println("Przygotowanie: " + name
                + "\nSkładniki: " + sauce + ", " + cheese );
        typeOfPizzaPie = factory.createPizzaPie();
        sauce = factory.createSause();
        cheese = factory.createCheese();
        vegetables = factory.createVegetables();
        mussels = factory.createMussels();
    }
}
