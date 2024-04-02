package structural.composite;

import structural.composite.DocumentComponent;

import java.util.ArrayList;
import java.util.List;

public class Folder implements DocumentComponent {
    private List<DocumentComponent> components = new ArrayList<>();

    public void addComponent(DocumentComponent component) {
        components.add(component);
    }

    public void removeComponent(DocumentComponent component) {
        components.remove(component);
    }

    @Override
    public void display() {
        System.out.println("Folder:");
        for (DocumentComponent component : components) {
            component.display();
        }
    }
}
