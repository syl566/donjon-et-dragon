package fr.sylviebal.dragon.equipement;

public class Spell extends OffensiveEquipment {

    public Spell(String name, int offensivePower) {
        super(name, "Sort", offensivePower);
    }

    @Override
    public void offensive() {
        System.out.println("✨ " + getName() + " lancé ! +" + getOffensivePower() + " en attaque !");
    }

    @Override
    public String toString() {
        return "✨ Sort : " + getName();
    }
}