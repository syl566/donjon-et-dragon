package fr.sylviebal.dragon.character.hero;

import fr.sylviebal.dragon.character.game.GameCharacter;
import fr.sylviebal.dragon.equipement.Spell;
<<<<<<< HEAD
import fr.sylviebal.dragon.equipement.Sword;
=======
>>>>>>> e48b1ea2ff8fa48a612540ec3dfd40402a2d1f55

/**
 * Représente un Mage dans le jeu Donjon et Dragon.
 * Le Wizard est un personnage spécialisé dans la magie offensive.
 * Il peut équiper des sorts (Boule de Feu, Éclair) pour augmenter sa puissance d'attaque.
 *
 * <p>Statistiques de base :
 * <ul>
 *   <li>Vie : 6</li>
 *   <li>Attaque : 8</li>
 *   <li>Bonus d'attaque : 7</li>
 * </ul>
 *
 * @author Sylvie Bal
 * @version 1.0
 * @see GameCharacter
 * @see Spell
 */
public class Wizard extends GameCharacter {

<<<<<<< HEAD
    private Spell fireBallSpell;
    private Spell lightningSpell;

=======
    /** Sort Boule de Feu équipé par le Wizard, null si non équipé. */
    private Spell fireBallSpell;

    /** Sort Éclair équipé par le Wizard, null si non équipé. */
    private Spell lightningSpell;

    /**
     * Crée un Wizard avec le nom donné et des statistiques prédéfinies.
     *
     * @param name le nom du Wizard choisi par le joueur
     */
>>>>>>> e48b1ea2ff8fa48a612540ec3dfd40402a2d1f55
    public Wizard(String name) {
        super(name, "Wizard", 6, 8, 7);
    }

    /**
     * Équipe le Wizard avec un sort Boule de Feu.
     * Ce sort augmente la puissance d'attaque lors des combats.
     *
     * @param fireBallSpell le sort Boule de Feu à équiper
     */
    public void setFireBallSpell(Spell fireBallSpell) {
        this.fireBallSpell = fireBallSpell;
    }

    /**
     * Équipe le Wizard avec un sort Éclair.
     * Ce sort augmente la puissance d'attaque lors des combats.
     *
     * @param lightningSpell le sort Éclair à équiper
     */
    public void setLightningSpell(Spell lightningSpell) {
        this.lightningSpell = lightningSpell;
    }
    /**
     * Retourne le sort Boule de Feu actuellement équipé par le Wizard.
     *
     * @return le sort Boule de Feu, ou null si non équipé
     */
    public Spell getFireBallSpell() {
        return fireBallSpell;
    }

    /**
     * Retourne le sort Éclair actuellement équipé par le Wizard.
     *
     * @return le sort Éclair, ou null si non équipé
     */
    public Spell getLightningSpell() {
        return lightningSpell;
    }
    /**
     * Effectue une attaque en utilisant la puissance de base
     * et le bonus apporté par l'équipement offensif équipé.
     * Si aucun équipement n'est équipé, le Wizard attaque avec sa magie de base.
     */
    @Override
    public void attack() {
        int totalAttack = getAttackPower();
<<<<<<< HEAD

        /* ajout du bonus de l'équipement offensif (sort éclair ou boule de feu)*/
=======
>>>>>>> e48b1ea2ff8fa48a612540ec3dfd40402a2d1f55
        if (getOffensiveEquipment() != null) {
            totalAttack += getOffensiveEquipment().getOffensivePower();
            System.out.println("✨ " + getName() + " utilise " + getOffensiveEquipment().getName()
                    + " ! attaque totale : " + totalAttack);
        } else {
<<<<<<< HEAD
            System.out.println("🧙 ");
        }
    }

=======
            System.out.println(" ");
        }
    }

    /**
     * Augmente les statistiques d'attaque du Wizard
     * lors de la récupération d'un sort ou d'un bonus.
     *
     * @param powerUp  points ajoutés à la puissance d'attaque de base
     * @param bonusUp  points ajoutés au bonus d'attaque
     */
    public void pickUp(int powerUp, int bonusUp) {
        setAttackPower(getAttackPower() + powerUp);
        setAttackBonus(getAttackBonus() + bonusUp);
    }

    /**
     * Retourne une représentation textuelle du Wizard
     * incluant ses statistiques et les sorts actuellement équipés.
     *
     * @return une chaîne affichant le nom, la vie, l'attaque et les sorts équipés
     */
>>>>>>> e48b1ea2ff8fa48a612540ec3dfd40402a2d1f55
    @Override
    public String toString() {
        String sorts = "";
        if (fireBallSpell != null) sorts += " 🔥 " + fireBallSpell.getName();
        if (lightningSpell != null) sorts += " ⚡ " + lightningSpell.getName();
        return "🧙🏻‍♂️ " + super.toString() + (sorts.isEmpty() ? "" : " | Sorts : " + sorts);
<<<<<<< HEAD
    }

    public void setFireBallSpell(Spell fireBallSpell) {
        this.fireBallSpell = fireBallSpell;

    }

    public void setLightningSpell(Spell lightningSpell) {
        this.lightningSpell = lightningSpell;

    }

    public void pickUp(int powerUp, int bonusUp) {
        setAttackPower(getAttackPower() + powerUp);
        setAttackBonus(getAttackBonus() + bonusUp);

=======
>>>>>>> e48b1ea2ff8fa48a612540ec3dfd40402a2d1f55
    }
}

