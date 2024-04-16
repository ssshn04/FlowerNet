package behavioral.command;

public class CancelOrderCommand implements Command {
    private FlowerOrder order;

    public CancelOrderCommand(FlowerOrder order) {
        this.order = order;
    }

    @Override
    public void execute() {
        order.cancelOrder();
    }
}