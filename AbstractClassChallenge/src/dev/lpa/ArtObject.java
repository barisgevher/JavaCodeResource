package dev.lpa;

public class ArtObject extends ProductForSale{

    public ArtObject(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    void showDetails() {
        System.out.println("This " + type + " is a beatiful reproduction");
        System.out.printf("The price of the piece is $%6.2f %n", price);
        System.out.println(description);
    }
}
