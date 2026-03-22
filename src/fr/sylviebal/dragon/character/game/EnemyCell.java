package fr.sylviebal.dragon.character.game;

import java.util.Scanner;

public abstract class EnemyCell extends Cell {
    protected String name;
    protected int life;
    protected int attackPower ;
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
        System.out.println("⚔️ Combat contre " + name + " ! ❤️ " + life);

        if (character.getOffensiveEquipment() != null) {
            playerAttack += character.getOffensiveEquipment().getOffensivePower();
        }
        this.takeDamage(playerAttack);

        while (character.isAlive() && this.isAlive()) {
            System.out.println("\n👊 Appuie sur Entrée pour attaquer...");
            scanner.nextLine();

            if (character.getOffensiveEquipment() != null) {
                playerAttack += character.getOffensiveEquipment().getOffensivePower();
            }

            this.takeDamage(playerAttack);
            System.out.println(name + " : ❤️ " + this.life + " restant");

            if (this.isAlive()) {
                System.out.println("💀 " + name + " contre-attaque !");
                character.takeDamage(this.attackPower);
            }
        }

        if (character.isAlive()) {
            System.out.println("🏆 Tu as vaincu " + name + " !");
        }
    }
}