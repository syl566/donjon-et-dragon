package fr.sylviebal.dragon;

import javax.xml.namespace.QName;

public class Character {
    protected String name;
    protected int life;
    protected int attackPower;

    //Constructeur
    public Character(String name, int life, int attackPower) {
        this.name = name;
        this.life = life;
        this.attackPower = attackPower;
    }

    // getters
    public String getName() {
        return name;
    }

    public int getLife() {
        return life;
    }

    public int getAttackPower() {
        return attackPower;
    }
}



