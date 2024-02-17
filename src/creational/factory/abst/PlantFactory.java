package creational.factory.abst;

import creational.factory.FLowerTypeFactory;
import creational.factory.Flower;
import creational.factory.FlowerType;

public class PlantFactory extends FLowerTypeFactory {
    @Override
    public Flower growFlower(FlowerType flowerType) {
        switch (flowerType) {
            case ALOE_PLANT -> {
                return new Aloe();
            }
            case CALATHEA_PLANT -> {
                return new Calathea();
            }
            case MONSTERA_PLANT -> {
                return new Mostera();
            }
            default -> {
                return null;
            }
        }
    }
}
