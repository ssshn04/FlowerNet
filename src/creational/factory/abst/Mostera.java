package creational.factory.abst;

import creational.factory.Flower;

public class Mostera extends Flower {
    @Override
    public void bloom() {
        System.out.println("The monstera bloomed!");
    }

    @Override
    public void dry() {
        System.out.println("The monstera has dried up :(");
    }
}
