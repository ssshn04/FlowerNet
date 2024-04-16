package behavioral.state;

public class DeadState implements PlayerState {
    @Override
    public void handle() {
        System.out.println("Player is dead.");
        // Додаткові дії для стану після смерті гравця
    }
}