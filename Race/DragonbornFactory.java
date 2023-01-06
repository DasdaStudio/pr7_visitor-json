package Race;

import Main.Stats;

public class DragonbornFactory implements RaceAbstractFactory{

    @Override
    public Dragonborn create(){
        return new Dragonborn(new Stats(0, 0, 0, 0, 0, 0));
    }
}
