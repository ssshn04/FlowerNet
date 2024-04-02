package structural.composite;

public class SalesReport implements DocumentComponent {
    private String date;

    public SalesReport(String date) {
        this.date = date;
    }

    @Override
    public void display() {
        System.out.println("Sales Report for " + date);
    }
}