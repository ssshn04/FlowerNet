package behavioral.memento;

public class CatalogCareTaker {
    private CatalogMemento memento;

    public CatalogMemento getMemento() {
        return memento;
    }

    public void setMemento(CatalogMemento memento) {
        this.memento = memento;
    }
}
