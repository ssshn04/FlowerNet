package behavioral.observe;

import java.util.ArrayList;
import java.util.List;

public class GameEventSubject implements Subject {
    private List<Observer> observers;

    public GameEventSubject() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String event) {
        for (Observer observer : observers) {
            observer.update(event);
        }
    }
}
