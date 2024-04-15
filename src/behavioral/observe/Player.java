package behavioral.observe;

// Клас спостерігача для гри Valorant
public class Player implements Observer {
    private String name;

    public Player(String name) {
        this.name = name;
    }

    @Override
    public void update(String event) {
        if (event.contains(name)) {
            System.out.println(name + ": Received game event - " + event);
        }
    }
}

