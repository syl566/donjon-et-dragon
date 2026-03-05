package fr.sylviebal.dragon.character;

public class Dragon extends GameCharacter{
    public Dragon(String name){
        super(name, "",15,4);
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
