// Player.java
import java.util.List;

public class Player {
    private String name;
    private String description;
    private int health;
    private List<String> inventory;

    public Player(String name, String description, int health, List<String> inventory) {
        this.name = name;
        this.description = description;
        this.health = health;
        this.inventory = inventory;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
