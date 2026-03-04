package fr.sylviebal.dragon.equipement;

public class Spell extends OffensiveEquipment{
    public Spell(String name){
        super(name,"Spell",7);
    }
    @Override
    public void offensive(){
        System.out.println("🔥" + getName() + " attaque avec une boule de feu " + getOffensivePower());
    }
    }

