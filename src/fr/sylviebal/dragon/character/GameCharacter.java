package fr.sylviebal.dragon.character;

import fr.sylviebal.dragon.equipement.OffensiveEquipment;

public abstract class GameCharacter {

    private String name;
    private String type;
    private int life;
    private int attackPower;
    private OffensiveEquipment offensiveEquipment;

    public GameCharacter(String name, String type, int life, int attackPower) {
        this.name = name;
        this.type = type;
        this.life = life;
        this.attackPower = attackPower;
    }

    // Méthode abstraite
    public abstract void attack();

    // Getters
    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getLife() {
        return life;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public OffensiveEquipment getOffensiveEquipment() {
        return offensiveEquipment;
    }

    public void setOffensiveEquipment(OffensiveEquipment offensiveEquipment) {
        this.offensiveEquipment = offensiveEquipment;
    }

    @Override
    public String toString() {
        return type + " " + name +
                " | ❤️ Life: " + life +
                " | ⚔️ Attack: " + attackPower;
    }
}


