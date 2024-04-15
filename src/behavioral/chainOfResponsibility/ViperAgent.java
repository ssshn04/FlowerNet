package behavioral.chainOfResponsibility;

public class ViperAgent implements BombDeactivationHandler {
    private BombDeactivationHandler nextHandler;

    @Override
    public void deactivateBomb(BombLevel bombLevel) {
        if (bombLevel == BombLevel.LEVEL_1) {
            System.out.println("Viper: Deactivated bomb level 1.");
        } else if (nextHandler != null) {
            nextHandler.deactivateBomb(bombLevel);
        } else {
            System.out.println("No agent available to deactivate bomb level " + bombLevel + ".");
        }
    }

    @Override
    public void setNextHandler(BombDeactivationHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
