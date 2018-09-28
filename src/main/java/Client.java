import pizzeriaPlaces.ItalianPizzeria;

public class Client {

    public static void main(String[] args) {
        ItalianPizzeria italianPizzeria =
                new ItalianPizzeria();
        italianPizzeria.orderPizza("serowa");
        System.out.println("\n\n");
        italianPizzeria.orderPizza("owoce morza");
        System.out.println("\n\n");
        italianPizzeria.orderPizza("wegetariańska");
    }
}
