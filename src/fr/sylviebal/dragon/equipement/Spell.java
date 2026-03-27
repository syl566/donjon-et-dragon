package fr.sylviebal.dragon.equipement;

<<<<<<< HEAD
public class Spell  extends  OffensiveEquipment{
=======
public class Spell extends OffensiveEquipment {
>>>>>>> e48b1ea2ff8fa48a612540ec3dfd40402a2d1f55

    public Spell(String name, int offensivePower) {
        super(name, "Sort", offensivePower);
    }

    @Override
    public void offensive() {
        System.out.println("✨ " + getName() + " lancé ! +" + getOffensivePower() + " en attaque !");
    }

    @Override
    public String toString() {
        return "✨ Sort : " + getName();
    }
}
<<<<<<< HEAD

=======
>>>>>>> e48b1ea2ff8fa48a612540ec3dfd40402a2d1f55
