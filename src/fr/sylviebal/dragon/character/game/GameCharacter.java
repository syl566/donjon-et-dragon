package fr.sylviebal.dragon.character.game;

import fr.sylviebal.dragon.equipement.OffensiveEquipment;
import fr.sylviebal.dragon.equipement.Spell;

/**
 * Classe abstraite représentant un personnage du jeu Donjon et Dragon.
 * Tout personnage jouable ou ennemi hérite de cette classe.
 * Elle définit les attributs et comportements communs à tous les personnages
 * tels que la vie, l'attaque, les équipements et la persistance en base de données.
 *
 * @author Sylvie Bal
 * @version 1.0
 */
public abstract class GameCharacter {

    /** Identifiant unique du personnage en base de données. */
    private int id;

    /** Nom du personnage choisi par le joueur. */
    private String name;

    /** Type du personnage (ex: "Warrior", "Wizard", "Dragon"). */
    private String type;

    /** Points de vie actuels du personnage. */
    private int life;

    /** Puissance d'attaque de base du personnage. */
    private int attackPower;

    /** Bonus d'attaque supplémentaire acquis via les équipements. */
    private int attackBonus;

    /** Équipement offensif actuellement équipé, null si aucun. */
    private OffensiveEquipment offensiveEquipment;

    /**
     * Crée un personnage avec les statistiques données.
     *
     * @param name        le nom du personnage
     * @param type        le type du personnage (ex: "Warrior", "Wizard")
     * @param life        les points de vie de départ
     * @param attackPower la puissance d'attaque de base
     * @param attackBonus le bonus d'attaque initial
     */
    protected GameCharacter(String name, String type, int life, int attackPower, int attackBonus) {
        this.name = name;
        this.type = type;
        this.life = life;
        this.attackPower = attackPower;
        this.attackBonus = attackBonus;
    }

    /**
     * Définit le comportement d'attaque du personnage.
     * Chaque sous-classe implémente sa propre logique d'attaque.
     */
    public abstract void attack();

    /**
     * Retourne l'identifiant unique du personnage en base de données.
     *
     * @return l'identifiant du personnage
     */
    public int getId() {
        return id;
    }

    /**
     * Retourne le nom du personnage.
     *
     * @return le nom du personnage
     */
    public String getName() {
        return name;
    }

    /**
     * Retourne le type du personnage.
     *
     * @return le type du personnage (ex: "Warrior", "Wizard")
     */
    public String getType() {
        return type;
    }

    /**
     * Retourne les points de vie actuels du personnage.
     *
     * @return les points de vie
     */
    public int getLifePoints() {
        return life;
    }

    /**
     * Retourne la puissance d'attaque de base du personnage.
     *
     * @return la puissance d'attaque
     */
    public int getAttackPower() {
        return attackPower;
    }

    /**
     * Vérifie si le personnage est encore en vie.
     *
     * @return true si les points de vie sont supérieurs à 0, false sinon
     */
    public boolean isAlive() {
        return this.life > 0;
    }

    /**
     * Retourne le bonus d'attaque du personnage.
     *
     * @return le bonus d'attaque
     */
    public int getAttackBonus() {
        return attackBonus;
    }

    /**
     * Retourne l'équipement offensif actuellement équipé.
     *
     * @return l'équipement offensif, ou null si aucun équipement n'est équipé
     */
    public OffensiveEquipment getOffensiveEquipment() {
        return offensiveEquipment;
    }

    /**
     * Définit l'identifiant unique du personnage en base de données.
     *
     * @param id l'identifiant à assigner
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Modifie le nom du personnage.
     *
     * @param name le nouveau nom
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Modifie le type du personnage.
     *
     * @param type le nouveau type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Modifie les points de vie du personnage.
     *
     * @param life les nouveaux points de vie
     */
    public void setLifePoints(int life) {
        this.life = life;
    }

    /**
     * Modifie la puissance d'attaque du personnage.
     *
     * @param attackPower la nouvelle puissance d'attaque
     */
    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    /**
     * Modifie le bonus d'attaque du personnage.
     *
     * @param attackBonus le nouveau bonus d'attaque
     */
    public void setAttackBonus(int attackBonus) {
        this.attackBonus = attackBonus;
    }

    /**
     * Équipe le personnage avec un équipement offensif.
     *
     * @param offensiveEquipment l'équipement offensif à équiper
     */
    public void setOffensiveEquipment(OffensiveEquipment offensiveEquipment) {
        this.offensiveEquipment = offensiveEquipment;
    }

    /**
     * Inflige des dégâts au personnage.
     * Les points de vie ne peuvent pas descendre en dessous de 0.
     *
     * @param damage le nombre de points de dégâts à infliger
     */
    public void takeDamage(int damage) {
        this.life -= damage;
        if (this.life < 0) this.life = 0;
        System.out.println("💔 " + name + " perd " + damage + " points de vie ! Vie restante : " + this.life);
    }

    /**
     * Soigne le personnage en ajoutant des points de vie.
     *
     * @param amount le nombre de points de vie à récupérer
     */
    public void heal(int amount) {
        this.life += amount;
        System.out.println("💚 " + getName() + " récupère " + amount + " points de vie ! Vie : " + this.life);
    }

    /**
     * Retourne une représentation textuelle du personnage
     * incluant son type, son nom, ses points de vie et sa puissance d'attaque.
     *
     * @return une chaîne décrivant le personnage
     */
    @Override
    public String toString() {
        return type + " " + getName() + " | ❤️ Life: " + life + " | Attack: " + attackPower;
    }
}