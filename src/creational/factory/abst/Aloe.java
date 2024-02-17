package creational.factory.abst;

import creational.factory.Flower;

public class Aloe extends Flower {
    @Override
    public void bloom() {
        System.out.println("The aloe bloomed!");
    }

    @Override
    public void dry() {
        System.out.println("The aloe has dried up :(");
    }
}
