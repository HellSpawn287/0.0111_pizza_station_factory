package pizza;

import ingredients.*;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class Pizza {

    protected String name;
    protected PizzaPie typeOfPizzaPie;
    protected Sauce sauce;
    protected Vegetables[] vegetables;
    protected Cheese cheese;
    protected Pepperoni pepperoni;
    protected FruttiDiMare mussels;

    protected ArrayList extras =new ArrayList();

    public abstract void preparation();

    public void baking() {
        System.out.println("Pieczenie w 350 stopniach Celcjusza przez 20 minut...");
    }

    public void cutting() {
        System.out.println("Kroję na 8 równych kawałków...");
    }

    public void packing() {
        System.out.println("Produkt spakowanyw oficjalne pudełko z logo firmy");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", typeOfPizzaPie=" + typeOfPizzaPie +
                ", sauce=" + sauce +
                ", vegetables=" + Arrays.toString(vegetables) +
                ", cheese=" + cheese +
                ", pepperoni=" + pepperoni +
                ", mussels=" + mussels +
                ", extras=" + extras +
                '}';
    }

}
