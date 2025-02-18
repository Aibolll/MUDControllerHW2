public class SciFiMUDFactory implements IMUDAbstractFactory {
    @Override
    public IGameEntity createRoom() {
        return new Room("Space Station X", "A high-tech station orbiting a distant planet.");
    }

    @Override
    public IGameEntity createNPC() {
        return new NPC("Cyber Droid", "An AI-controlled machine programmed for assistance.");
    }
}
