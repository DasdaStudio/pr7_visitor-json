package Classes;

public class ClassFactory {
    public static CharacterClass getClass(String type){
        if("Fighter".equalsIgnoreCase(type))
            return new Fighter();
        else if ("Druid".equalsIgnoreCase(type))
            return new Druid();

        return null;
    }
}
