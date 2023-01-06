package Classes;

public class Fighter extends CharacterClass{
    private String perk;

    public Fighter(){
        this.name = "Fighter";
        this.dice = 10;
        this.perk = "Extra Attack";
    }

    @Override
    public void printMagic(){
        System.out.println("Class " + name + "can do " + perk);
    }
}
