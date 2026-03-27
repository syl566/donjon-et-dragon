package fr.sylviebal.dragon.equipement;

public  abstract class  DefensiveEquipment {
    private String name;
    private int defensePower;
    private String type;

    protected DefensiveEquipment(String name,String type, int defensePower){
        this.name = name;
        this.type = type;
        this.defensePower = defensePower;
    }
    public abstract String defensive();

    public String getName(){
        return name;
    }
    public int getDefensePower(){
        return defensePower;
    }


    @Override
    public String toString() {
        return type + " " + name +
                " | \uD83D\uDEE1\uFE0F  Defence: " + defensePower;
    }
}
