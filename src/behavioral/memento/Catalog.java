package behavioral.memento;

import java.util.ArrayList;
import java.util.List;

public class Catalog {
    private List<String> flowers;

    public Catalog() {
        this.flowers = new ArrayList<>();
    }

    public void addFlower(String flower) {
        flowers.add(flower);
    }

    public void removeFlower(String flower) {
        flowers.remove(flower);
    }

    public CatalogMemento saveStateToMemento() {
        return new CatalogMemento(flowers);
    }

    public void getStateFromMemento(CatalogMemento memento) {
        flowers = new ArrayList<>(memento.getFlowers());
    }

    public void printCatalog() {
        System.out.println("Current Catalog:");
        for (String flower : flowers) {
            System.out.println("- " + flower);
        }
    }
}

