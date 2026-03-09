package fr.sylviebal.dragon.equipement;

public class Sword extends OffensiveEquipment{
    public Sword(String name){
        super(name,"Sword",7);
    }
    @Override
    public void offensive(){
        System.out.println("🔥" + getName() + " attaque avec une boule de feu " + getOffensivePower());
    }
    }

