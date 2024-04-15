package behavioral.chainOfResponsibility;

public class PhoenixAgent implements BombDeactivationHandler {
    private BombDeactivationHandler nextAgent;

    @Override
    public void deactivateBomb(BombLevel bombLevel) {
        if (bombLevel == BombLevel.LEVEL_2) {
            System.out.println("Phoenix: Deactivated bomb level 2.");
        } else if (nextAgent != null) {
            nextAgent.deactivateBomb(bombLevel);
        } else {
            System.out.println("No agent available to deactivate bomb level " + bombLevel + ".");
        }
    }

    @Override
    public void setNextHandler(BombDeactivationHandler nextAgent) {
        this.nextAgent = nextAgent;
    }
}