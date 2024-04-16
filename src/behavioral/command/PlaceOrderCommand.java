package behavioral.command;

public class PlaceOrderCommand implements Command {
    private FlowerOrder order;

    public PlaceOrderCommand(FlowerOrder order) {
        this.order = order;
    }

    @Override
    public void execute() {
        order.placeOrder();
    }
}
