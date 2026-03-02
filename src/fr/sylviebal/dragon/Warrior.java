package fr.sylviebal.dragon;

public class Warrior extends Character {

    private int armor;

    //Constructeur
    public Warrior(String name, int life, int attackPower, int armor) {
        super(name, life, attackPower);
        this.armor = armor;
    }

    //getters
    public int getArmor() {
        return armor;
    }
}

