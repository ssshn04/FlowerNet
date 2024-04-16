package behavioral.state;

public class UltState implements PlayerState {
    @Override
    public void handle() {
        System.out.println("Player is in ult state.");
        // Додаткові дії для ульті стану
    }
}
