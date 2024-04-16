package behavioral.state;

public class NormalState implements PlayerState {
    @Override
    public void handle() {
        System.out.println("Player is in normal state.");
    }
}
