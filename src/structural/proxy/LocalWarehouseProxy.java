package structural.proxy;

public class LocalWarehouseProxy implements Warehouse {
    private LocalWarehouse localWarehouse;
    private boolean isOwner;

    public LocalWarehouseProxy(boolean isOwner) {
        this.isOwner = isOwner;
    }


    @Override
    public void fullNow() {
        if (isOwner) {
            if (localWarehouse == null) {
                localWarehouse = new LocalWarehouse();
            }
            localWarehouse.fullNow();
        } else {
            System.out.println("You do not have permission to access the warehouse.");
        }
    }
}
