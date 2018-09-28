package factories;

import ingredients.*;

public class MexicanPizzaIngredientsFactory implements PizzaIngredientsFactory {

    @Override
    public PizzaPie createPizzaPie() {
        return new VeryThinPie();
    }

    @Override
    public Sauce createSause() {
        return new BruschettaSauce();
    }

    @Override
    public Cheese createCheese() {
        return new GoatCheese();
    }

    @Override
    public Vegetables[] createVegetables() {
        Vegetables vegetables[]= {new Bakłażan(), new Corn(), new CzerwonaFasola() };
        return vegetables;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new ExtraPepperoniSlices();
    }

    @Override
    public FruttiDiMare createMussels() {
        return new Prawns();
    }
}
