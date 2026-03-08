package fr.sylviebal.dragon.character.game;

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
    protected GameCharacter(String name, String type, int life, int attackPower) {
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

     public boolean isAlive() {
        return this.life > 0;
    }

    // prendre des dégâts
    public void takeDamage(int damage) {
        this.life -= damage;
        if (this.life < 0) {
            this.life = 0;
        }
        System.out.println("💔 " + name + " perd " + damage + " points de vie ! Vie restante : " + this.life);
    }

    // récupérer de la vie
    public void heal(int amount) {
        this.life += amount;
        System.out.println("💚 " + name + " récupère " + amount + " points de vie ! Vie : " + this.life);
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


