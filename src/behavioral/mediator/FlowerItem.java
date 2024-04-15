package behavioral.mediator;

class FlowerItem {
    private String type;
    private int quantity;

    public FlowerItem(String type, int quantity) {
        this.type = type;
        this.quantity = quantity;
    }

    public String getType() {
        return type;
    }

    public int getQuantity() {
        return quantity;
    }
}
