package Race;

import Main.Stats;

public class Dragonborn extends CharacterRace{

    Dragonborn(String name, Stats stats){
        this.name = name;
        this.bonuses = stats;
    }

    public Dragonborn(Stats stats) {
        super();
    }

    @Override
    public int getRaceBonuses(String type){
        if(type == "Charisma")
            return 1;
        else if(type == "Strength")
            return 2;

        return 0;
    }

    @Override
    public void battleCry(){
        System.out.println("Fire!");
    }
}
