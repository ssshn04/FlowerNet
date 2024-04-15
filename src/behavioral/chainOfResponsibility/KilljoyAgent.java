package behavioral.chainOfResponsibility;

public class KilljoyAgent implements BombDeactivationHandler  {
    private BombDeactivationHandler  nextAgent;

    @Override
    public void deactivateBomb(BombLevel bombLevel) {
        if (bombLevel == BombLevel.LEVEL_3) {
            System.out.println("Killjoy: Deactivated bomb level 3.");
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