package fr.sylviebal.dragon.equipement;

public abstract class OffensiveEquipment {
    private String name;
    private String type;
    private int offensivePower;

    public OffensiveEquipment(String name, String type, int offensivePower) {
        this.name = name;
        this.type = type;
        this.offensivePower = offensivePower;
    }
<<<<<<< HEAD

=======

    public abstract void offensive();

    public String getName() {
        return name;
    }

    public int getOffensivePower() {
        return offensivePower;
    }

>>>>>>> e48b1ea2ff8fa48a612540ec3dfd40402a2d1f55
    @Override
    public String toString() {
        return type + " " + name +
                " | ⚔️ Offensive: " + offensivePower;
    }
<<<<<<< HEAD

    public abstract void offensive();

    public String getName() {
        return name;
    }

    public int getOffensivePower() {
        return offensivePower;
    }

=======
>>>>>>> e48b1ea2ff8fa48a612540ec3dfd40402a2d1f55
}