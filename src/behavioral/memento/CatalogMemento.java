package behavioral.memento;

import java.util.ArrayList;
import java.util.List;

public class CatalogMemento {
    private final List<String> flowers;

    public CatalogMemento(List<String> flowers) {
        this.flowers = new ArrayList<>(flowers);
    }

    public List<String> getFlowers() {
        return flowers;
    }
}

