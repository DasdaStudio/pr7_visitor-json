package Race;

import Main.Stats;

public class Human extends CharacterRace{

    Human(String name, Stats stats){
        this.name = name;
        this.bonuses = stats;
    }

    public Human(Stats stats) {
        super();
    }

    @Override
    public int getRaceBonuses(String type){

        if (type.equals("Strength"))
            return 1;
        else if (type.equals("Dexterity"))
            return 1;
        else if (type.equals("Constitution"))
            return 1;
        else if (type.equals("Intelligence"))
            return 1;
        else if (type.equals("Wisdom"))
            return 1;
        else if (type.equals("Charisma"))
            return 1;

        return 0;
    }

    @Override
    public void battleCry(){
        System.out.println("Here and now");
    }
}
