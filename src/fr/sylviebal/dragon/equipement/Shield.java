package fr.sylviebal.dragon.equipement;

public class Shield extends DefensiveEquipment{
    public Shield(String name){
        super(name,"Shield", 4);
    }

    @Override
    public void defensive(){
        System.out.println(" \uD83D\uDEE1\uFE0F " + getName() + "se défendre à l'aide d'un bouclier" + getDefensePower());
    }
    @Override
    public String toString() {
        return "️ " + super.toString();
    }
}
