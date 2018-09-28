package factories;

import ingredients.*;

public interface PizzaIngredientsFactory {

    PizzaPie createPizzaPie();
    Sauce createSause();
    Cheese createCheese();
    Vegetables[] createVegetables();
    Pepperoni createPepperoni();
    FruttiDiMare createMussels();
}
