package fr.sylviebal.dragon.character;

public class witch extends GameCharacter{
    public witch(String name){
        super(name, "",9,2);
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


