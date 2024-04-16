package behavioral.state;

public class PlayerContext {
    private PlayerState currentState;

    public void setState(PlayerState currentState) {
        this.currentState = currentState;
    }

    public void handle() {
        currentState.handle();
    }
}
