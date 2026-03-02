package fr.sylviebal.dragon;

public class Wizard extends Character {

    private int sort;

    public Wizard(String name, int life, int attackPower) {
        super(name, life, attackPower);
        this.sort = sort;
    }

    //getters
    public int getSort() {
        return sort;
    }
}
