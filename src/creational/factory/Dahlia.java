package creational.factory;

public class Dahlia extends Flower {

    @Override
    public void bloom() {
        System.out.println("The dahlia bloomed!");
    }

    @Override
    public void dry() {
        System.out.println("The dahlia has dried up :(");
    }
}
