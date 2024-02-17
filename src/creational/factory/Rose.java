package creational.factory;

import creational.factory.Flower;

public class Rose extends Flower {
    @Override
    public void bloom() {
        System.out.println("The rose bloomed!");
    }

    @Override
    public void dry() {
        System.out.println("The rose has dried up :(");
    }
}
