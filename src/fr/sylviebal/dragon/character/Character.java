package fr.sylviebal.dragon.character;

import fr.sylviebal.dragon.equipement.OffensiveEquipment;

public class Character {

    private String name;
    private String type;
    private int life ;
    private int attackPower;
    private OffensiveEquipment offensiveEquipment;

    public Character(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String toString() {
        return "x";
    }
}



