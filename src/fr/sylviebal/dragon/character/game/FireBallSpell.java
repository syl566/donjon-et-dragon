package fr.sylviebal.dragon.character.game;

import fr.sylviebal.dragon.character.hero.Wizard;
import fr.sylviebal.dragon.equipement.Spell;

public class FireBallSpell extends BonusCell {
    @Override
    public void interact(GameCharacter character) {
        if (character instanceof Wizard){
        Spell fireBall = new Spell("Boule de Feu", 7);
        character.setOffensiveEquipment(fireBall);
        ((Wizard) character).setFireBallSpell(fireBall);
            ((Wizard) character).pickUp(7, 2);
        System.out.println("Tu trouves une boule de feu !");
        }else{
            System.out.println(" Tu vois une boule  de feu mais tu ne peux pas l'utiliser ");
        }
        character.takeDamage(7);

    }

    @Override
    public String toString() {
        return " \uD83D\uDD25 boule de feu";
    }

}
