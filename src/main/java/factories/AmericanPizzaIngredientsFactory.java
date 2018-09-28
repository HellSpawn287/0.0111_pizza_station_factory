package factories;

import ingredients.*;

public class AmericanPizzaIngredientsFactory implements PizzaIngredientsFactory {

    @Override
    public PizzaPie createPizzaPie() {
        return new GrubeChrupkieCiasto();
    }

    @Override
    public Sauce createSause() {
        return new PassataSauce();
    }

    @Override
    public Cheese createCheese() {
        return new SerMozzarella();
    }

    @Override
    public Vegetables[] createVegetables() {
        Vegetables vegetables[] = {new Bakłażan(), new CzarneOliwki(), new Szpinak()};
        return vegetables;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new PepperoniSlices();
    }

    @Override
    public FruttiDiMare createMussels() {
        return new FrozenMussels();
    }
}
