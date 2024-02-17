package creational.prototype;

import java.util.Objects;

public class Bloom implements Prototype {
    private final String color;
    private final String type;

    public Bloom(String color, String type) {
        this.color = color;
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bloom flower = (Bloom) o;
        return Objects.equals(color, flower.color) && Objects.equals(type, flower.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, type);
    }

    @Override
    public Prototype doClone() {
        return new Bloom(color, type);
    }
}
