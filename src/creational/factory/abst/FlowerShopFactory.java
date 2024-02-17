package creational.factory.abst;

import creational.factory.FLowerTypeFactory;
import creational.factory.method.FlowerFactory;

public class FlowerShopFactory {
    public FLowerTypeFactory growFlowerFactory(FlowerTypeFactoryType flowerTypeFactoryType) {
        switch (flowerTypeFactoryType) {
            case FLOWER -> {
                return new FlowerFactory();
            }
            case PLANT -> {
                return new PlantFactory();
            }
            default -> {
                return null;
            }
        }
    }
}
