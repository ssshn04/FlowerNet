package creational.factory;

import creational.factory.Flower;
import creational.factory.FlowerType;

public abstract class FLowerTypeFactory {
    public abstract Flower growFlower(FlowerType flowerType);
}
