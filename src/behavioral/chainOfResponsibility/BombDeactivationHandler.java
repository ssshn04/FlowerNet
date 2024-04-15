package behavioral.chainOfResponsibility;

public interface BombDeactivationHandler {
    void deactivateBomb(BombLevel bombLevel);
    void setNextHandler(BombDeactivationHandler nextHandler);
}

