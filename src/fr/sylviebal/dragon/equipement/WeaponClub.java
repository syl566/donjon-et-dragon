package fr.sylviebal.dragon.equipement;

public class WeaponClub extends OffensiveEquipment {
    public WeaponClub(String name) {
        super(name, "Weapon", 5);
    }

    @Override
    public void offensive() {
        System.out.println("\uD83D\uDDE1\uFE0F" + getName() + " attaque avec une épée" + getOffensivePower());
    }
}


