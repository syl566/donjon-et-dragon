package fr.sylviebal.dragon.character.game;

import java.util.Scanner;

public abstract class EnemyCell extends Cell {
    protected String name;
    protected int life;
    protected int attackPower;
    private Scanner scanner = new Scanner(System.in);

    public EnemyCell(String name, int life, int attackPower) {
        this.name = name;
        this.life = life;
        this.attackPower = attackPower;
    }

    public boolean isAlive() {
        return life > 0;
    }

    public void takeDamage(int damage) {
        this.life -= damage;
        if (this.life < 0) this.life = 0;
    }


    @Override
    public void interact(GameCharacter character) {
        Story.onEnemyEncounter(this.name);

        int playerAttack = character.getAttackPower();
        if (character.getOffensiveEquipment() != null) {
            playerAttack += character.getOffensiveEquipment().getOffensivePower();
        }

        this.takeDamage(playerAttack);
        System.out.println(" " + character.getName() + " Il frappe " + name + " avec " + playerAttack + " !");
        System.out.println("💔 " + name + " : ❤️ " + this.life + " restant");

        character.setAttackPower(character.getAttackPower() - 1);
        System.out.println("😓 Le combat épuise " + name + " ! Attaque : " + character.getAttackPower());

        if (!this.isAlive()) {
            System.out.println("💀 " + name + " est vaincu !");
        } else {
            System.out.println("💥 " + name + " réplique et s'enfuit !");
            character.takeDamage(this.attackPower);
        }
    }
}


