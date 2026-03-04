package fr.sylviebal.dragon.character;

import fr.sylviebal.dragon.equipement.OffensiveEquipment;
//class abstrait
public abstract class GameCharacter {
//attribut
    private String name;
    private String type;
    private int life;
    private int attackPower;
    private OffensiveEquipment offensiveEquipment;
//constructeur
    public GameCharacter(String name, String type, int life, int attackPower) {
        this.name = name;
        this.type = type;
        this.life = life;
        this.attackPower = attackPower;
    }

    // Méthode abstraite
    public abstract void attack();

    // Getters sert à lire les variables privées
    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getLife() {
        return life;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public OffensiveEquipment getOffensiveEquipment() {
        return offensiveEquipment;
    }
// setter permet de modifier
    public void setOffensiveEquipment(OffensiveEquipment offensiveEquipment) {
        this.offensiveEquipment = offensiveEquipment;
    }

    @Override // redefinis une methode qui existe déja

    public String toString() { //sert à afficher l' objet
        return type + " " + name +
                " | ❤️ Life: " + life +
                " | ⚔️ Attack: " + attackPower;
    }
}


