import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Player player = new Player("Hero", "A brave adventurer.", 100, Arrays.asList("sword", "shield"));

        IMUDAbstractFactory factory = new FantasyMUDFactory();

        MUDController controller = new MUDController(player, factory);
        controller.runGameLoop();
    }
}
