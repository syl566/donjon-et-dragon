package fr.sylviebal.dragon.equipement;

public class Shield extends DefensiveEquipment{
    public Shield(String name){
        super(name,"Shield", 4);
    }

    @Override
    public  String defensive(){
        return "se défendre à l'aide d'un bouclier" + getDefensePower();
    }
    @Override
    public String toString() {
        return "️ " + super.toString();
    }
}
