package creational.factory.method;

import creational.factory.*;
import creational.factory.Rose;

public class FlowerFactory extends FLowerTypeFactory {
    @Override
    public Flower growFlower(FlowerType flowerType) {
        switch (flowerType) {
            case TULIP -> {
                return new Tulip();
            }
            case ROSE -> {
                return new Rose();
            }
            case DAHLIA -> {
                return new Dahlia();
            }
            default -> {
                return null;
            }
        }
    }
}
