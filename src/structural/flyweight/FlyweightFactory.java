package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

// Фабрика для створення квітів
public class FlyweightFactory {
    private Map<String, Flyweight> flyweights = new HashMap<>();

    private static FlyweightFactory instance;

    private FlyweightFactory() {}

    public static FlyweightFactory getInstance() {
        if (instance == null) {
            instance = new FlyweightFactory();
        }
        return instance;
    }

    public Flyweight getFlower(String type, String color, int size) {
        String key = type + "_" + color + "_" + size;
        if (!flyweights.containsKey(key)) {
            flyweights.put(key, new GetFlowers(type, color, size));
        }
        return flyweights.get(key);

    }
}

