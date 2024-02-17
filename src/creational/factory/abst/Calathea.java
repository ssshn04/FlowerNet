package creational.factory.abst;

import creational.factory.Flower;

public class Calathea extends Flower {
    @Override
    public void bloom() {
        System.out.println("The calathea bloomed!");
    }

    @Override
    public void dry() {
        System.out.println("The calatea has dried up :(");
    }
}
