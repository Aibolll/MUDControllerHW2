public class NPC implements IGameEntity{
    private String name;
    private String description;

    public NPC(String name, String description){
        this.name = name;
        this.description = description;
    }
    public void describe(){
        System.out.println("NPC: " + name + " - " + description);
    }
}
