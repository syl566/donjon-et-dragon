package fr.sylviebal.dragon.character;

public class Goblin extends GameCharacter{
    public Goblin(String name){
        super(name, "",6,1);
    }
    @Override
    public void attack() {
        System.out.println("⚔️ " + getName() + " " + getAttackPower());
    }

    @Override
    public String toString() {
        return " " + super.toString();
    }
}
