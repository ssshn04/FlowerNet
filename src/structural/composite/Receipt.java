package structural.composite;

import structural.composite.DocumentComponent;

public class Receipt implements DocumentComponent {
    private int receiptNumber;
    private double totalAmount;

    public Receipt(int receiptNumber, double totalAmount) {
        this.receiptNumber = receiptNumber;
        this.totalAmount = totalAmount;
    }

    @Override
    public void display() {
        System.out.println("Receipt #" + receiptNumber + " - Total Amount: $" + totalAmount);
    }
}