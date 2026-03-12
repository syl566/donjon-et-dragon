package fr.sylviebal.dragon.character.game;

import fr.sylviebal.dragon.equipement.OffensiveEquipment;

//class abstrait
public abstract class GameCharacter {

    // Attributs
    private int id; // <- ajouté pour identifier le personnage en base
    private String name;
    private String type;
    private int life;
    private int attackPower;
    private int attackBonus;
    private OffensiveEquipment offensiveEquipment;

    // Constructeur
    protected GameCharacter(String name, String type, int life, int attackPower, int attackBonus) {
        this.name = name;
        this.type = type;
        this.life = life;
        this.attackPower = attackPower;
        this.attackBonus = attackBonus;
    }

    // Getters
    public int getId() { // <- getter pour id
        return id;
    }

    public String getName() {
        return name;
    }
    public String getType(){
        return type;
    }

    public int getLifePoints() {
        return life;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public boolean isAlive() {
        return this.life > 0;
    }

    public int getAttackBonus() {
          return attackBonus;
    }

    public OffensiveEquipment getOffensiveEquipment() {
        return offensiveEquipment;
    }

    // Setters
    public void setId(int id) { // <- setter pour id
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setType(String type){
        this.type = type;
    }
    public void setLifePoints(int life){
        this.life = life;
    }
    public void setAttackPower(int attackPower){this.attackPower = attackPower;}
    public void setAttackBonus(int attackBonus){this.attackBonus = attackBonus;}

    public void setOffensiveEquipment(OffensiveEquipment offensiveEquipment) {
        this.offensiveEquipment = offensiveEquipment;
    }

    // Méthode abstraite
    public abstract void attack();

    public void takeDamage(int damage) {
        this.life -= damage;
        if (this.life < 0) this.life = 0;
        System.out.println("💔 " + name + " perd " + damage + " points de vie ! Vie restante : " + this.life);
    }
    // Méthodes pour gérer la vie
    public void heal(int amount) {
        this.life += amount;
        System.out.println("💚 " + name + " récupère " + amount + " points de vie ! Vie : " + this.life);
    }


    @Override
    public String toString() {
        return type + " " + name + " | ❤️ Life: " + life + " |  Attack: " + attackPower;
    }
}

