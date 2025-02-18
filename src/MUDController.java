// MUDController.java
import java.util.Scanner;

public class MUDController {
    private final Player player;
    private final IMUDAbstractFactory factory;
    private boolean running;
    private final Scanner scanner;

    public MUDController(Player player, IMUDAbstractFactory factory) {
        this.player = player;
        this.factory = factory;
        this.running = true;
        this.scanner = new Scanner(System.in);
    }

    public void runGameLoop() {
        System.out.println("Welcome to the MUD game! Type 'help' for a list of commands.");
        while (running) {
            System.out.print("> ");
            String input = scanner.nextLine().trim();
            handleInput(input);
        }
        System.out.println("Thanks for playing!");
    }

    public void handleInput(String input) {
        String[] parts = input.split(" ", 2);
        String command = parts[0].toLowerCase();
        String argument = parts.length > 1 ? parts[1] : "";

        switch (command) {
            case "look":
                lookAround();
                break;
            case "spawn_room":
                spawnRoom();
                break;
            case "spawn_npc":
                spawnNPC();
                break;
            case "help":
                showHelp();
                break;
            case "quit":
                running = false;
                break;
            default:
                System.out.println("Unknown command. Type 'help' for a list of commands.");
        }
    }

    private void lookAround() {
        System.out.println("Player: " + player.getName() + " - " + player.getDescription());
    }

    private void spawnRoom() {
        IGameEntity room = factory.createRoom();
        room.describe();
    }

    private void spawnNPC() {
        IGameEntity npc = factory.createNPC();
        npc.describe();
    }

    private void showHelp() {
        System.out.println("Available commands:");
        System.out.println("look - Describe the player.");
        System.out.println("spawn_room - Create and describe a new room.");
        System.out.println("spawn_npc - Create and describe a new NPC.");
        System.out.println("help - Show this help menu.");
        System.out.println("quit - End the game.");
    }
}
