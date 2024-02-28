package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class FlowerComposite implements FlowerComponent {
    private List<FlowerComponent> components = new ArrayList<>();
    private String name;

    public FlowerComposite(String name) {
        this.name = name;
    }

    public void addComponent(FlowerComponent component) {
        components.add(component);
    }

    public void removeComponent(FlowerComponent component) {
        components.remove(component);
    }

    @Override
    public void display() {
        System.out.println("Flower group: " + name);
        for (FlowerComponent component : components) {
            component.display();
        }
    }
}
