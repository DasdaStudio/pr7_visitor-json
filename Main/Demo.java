package Main;

import Race.DragonbornFactory;
import Race.HumanFactory;
import Race.RaceFactory;
import Visitor.DataElement;
import Visitor.ElementVisitor;
import Classes.ClassFactory;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Demo {

    public static void main(String[] args) throws IOException {
        ElementVisitor visitor = new ElementVisitor();
        FileWriter file = new FileWriter("Characters.json");
        JSONObject jsonObject = new JSONObject();

        jsonObject.put("Characteristics", "Values");

        file.write("[");

        Character character1 = new Character("Dasda", ClassFactory.getClass("Druid"), RaceFactory.getRace(new DragonbornFactory()));
        putCharacterToJSON(character1, jsonObject, file, visitor);

        Character character2 = new Character("Luke", ClassFactory.getClass("Fighter"), RaceFactory.getRace(new HumanFactory()));
        file.write(",\n");
        putCharacterToJSON(character2, jsonObject, file, visitor);

        file.write("]");
        file.flush();

        file.close();
    }

    public static void putCharacterToJSON(Character character, JSONObject jsonObject, FileWriter file, ElementVisitor visitor) throws IOException {
        List<DataElement> list = new ArrayList<>();

        character.setAttributes(Stats.generate());
        character.addRaceBonuses();

        list.add(character);
        list.add(character.getDndClass());
        list.add(character.getRace());
        list.add(character.getAttributes());

        for (DataElement val : list){
            jsonObject.putAll(val.accept(visitor));
        }

        file.write(jsonObject.toJSONString());
        list.clear();
        file.flush();
    }
}
