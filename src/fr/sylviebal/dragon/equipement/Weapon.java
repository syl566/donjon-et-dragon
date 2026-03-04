package fr.sylviebal.dragon.equipement;

public class Weapon extends OffensiveEquipment {
    public Weapon(String name) {
        super(name, "Weapon", 5);
    }

    @Override
    public void offensive() {
        System.out.println("\uD83D\uDDE1\uFE0F" + getName() + " attaque avec une épée" + getOffensivePower());
    }
}

