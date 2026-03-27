package fr.sylviebal.dragon.character.hero;

import fr.sylviebal.dragon.character.game.GameCharacter;
import fr.sylviebal.dragon.equipement.Sword;
import fr.sylviebal.dragon.equipement.WeaponClub;

/**
 * Représente un Guerrier dans le jeu Donjon et Dragon.
 * Le Warrior est un personnage spécialisé dans le combat au corps à corps.
 * Il peut équiper une Massue et une Épée pour augmenter sa puissance d'attaque.
 *
 * <p>Statistiques de base :
 * <ul>
 *   <li>Vie : 5</li>
 *   <li>Attaque : 10</li>
 *   <li>Bonus d'attaque : 5</li>
 * </ul>
 *
 * @author Sylvie Bal
 * @version 1.0
 * @see GameCharacter
 * @see WeaponClub
 * @see Sword
 */
public class Warrior extends GameCharacter {

    /** Massue équipée par le Warrior, null si non équipée. */
    private WeaponClub weaponClub;

    /** Épée équipée par le Warrior, null si non équipée. */
    private Sword sword;

    /**
     * Crée un Warrior avec le nom donné et des statistiques prédéfinies.
     *
     * @param name le nom du Warrior choisi par le joueur
     */
    public Warrior(String name) {
        super(name, "Warrior", 5, 10, 5);
    }

    /**
     * Retourne l'épée actuellement équipée par le Warrior.
     *
     * @return l'épée équipée, ou null si aucune épée n'est équipée
     */
    public Sword getSword() {
        return sword;
    }

    /**
     * Retourne la massue actuellement équipée par le Warrior.
     *
     * @return la massue équipée, ou null si aucune massue n'est équipée
     */
    public WeaponClub getWeaponClub() {
        return weaponClub;
    }

    /**
     * Définit la massue équipée par le Warrior.
     *
     * @param weaponClub la massue à équiper
     */
    public void setWeaponClub(WeaponClub weaponClub) {
        this.weaponClub = weaponClub;
    }

    /**
     * Définit l'épée équipée par le Warrior.
     *
     * @param sword l'épée à équiper
     */
    public void setSword(Sword sword) {
        this.sword = sword;
    }

    /**
     * Effectue une attaque en utilisant la puissance d'attaque
     * et les armes équipées si disponibles.
     */
    @Override
    public void attack() {
        int totalAttack = getAttackPower();
        if (weaponClub != null) {
            totalAttack += weaponClub.getOffensivePower();
        }
        if (sword != null) {
            totalAttack += sword.getOffensivePower();
        }
        System.out.println("⚔️ " + getName() + " attaque avec "
                + (sword != null ? sword.getName() : weaponClub != null ? weaponClub.getName() : "son épée")
                + " ! attaque : " + totalAttack);
    }

    /**
     * Augmente la puissance d'attaque du Warrior.
     * La puissance d'attaque ne peut pas descendre en dessous de 0.
     *
     * @param up points ajoutés à la puissance d'attaque
     */
    public void pickUp(int up) {
        setAttackPower(getAttackPower() + up);
        if (getAttackPower() < 0) setAttackPower(0);
    }

    /**
     * Retourne une représentation textuelle du Warrior
     * incluant ses statistiques et les armes actuellement équipées.
     *
     * @return une chaîne affichant l'emoji, le type, le nom, la vie,
     * l'attaque et les armes équipées
     */
    @Override
    public String toString() {
        String armes = "";
        if (weaponClub != null) armes += " 🪓 " + weaponClub.getName();
        if (sword != null) armes += " ⚔️ " + sword.getName();
        return "🧝🏽 " + super.toString()
                + (armes.isEmpty() ? "" : " | Armes : " + armes);
    }
}


