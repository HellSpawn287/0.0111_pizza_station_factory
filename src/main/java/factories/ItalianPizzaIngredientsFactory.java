package factories;

import ingredients.*;

public class ItalianPizzaIngredientsFactory implements PizzaIngredientsFactory {

    @Override
    public PizzaPie createPizzaPie() {
        return  new CienkieChrupkieCiasto();
    }

    @Override
    public Sauce createSause() {
        return  new SosMarinara();
    }

    @Override
    public Cheese createCheese() {
        return  new SerReggiano();
    }

    @Override
    public Vegetables[] createVegetables() {
        Vegetables vegetables[]= {new Garlic(), new Onion(), new Mushrooms(), new RedPepper() };
        return vegetables;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new PepperoniSlices();
    }

    @Override
    public FruttiDiMare createMussels() {
        return new FreshMussels();
    }
}
