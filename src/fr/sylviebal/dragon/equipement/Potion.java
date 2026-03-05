package fr.sylviebal.dragon.equipement;

public class Potion extends DefensiveEquipment {
    public Potion(String name) {
        super(name, "Potion", 5);
    }

    @Override
    public String defensive() {
        return "se défendre à l'aide d'une potion" + getDefensePower();
    }

    @Override
    public String toString() {
        return " " + super.toString();
    }
}