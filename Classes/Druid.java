package Classes;

import java.util.ArrayList;
import java.util.List;

public class Druid extends CharacterClass{
    private List<String> spells;

    public Druid(){
        this.name = "Druid";
        this.dice = 8;

        this.spells = new ArrayList<>();
        spells.add("Healing Word");
        spells.add("Animal Shape");
    }

    @Override
    public void printMagic(){
        System.out.println("\nClass " + name + " uses spells:");

        for(String spell : spells){
            System.out.println(spell);
        }
    }
}
