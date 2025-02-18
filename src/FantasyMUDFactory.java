public class FantasyMUDFactory implements IMUDAbstractFactory {
    @Override
    public IGameEntity createRoom() {
        return new Room("Enchanted Forest", "A mystical forest full of magic and wonder.");
    }

    @Override
    public IGameEntity createNPC() {
        return new NPC("Elf Guardian", "A mystical elf protecting the sacred lands.");
    }
}