package creational.factory;

import creational.factory.Flower;

public class Tulip extends Flower {
    @Override
    public void bloom() {
        System.out.println("The tulip bloomed!");
    }

    @Override
    public void dry() {
        System.out.println("The tulip has dried up :(");
    }
}
