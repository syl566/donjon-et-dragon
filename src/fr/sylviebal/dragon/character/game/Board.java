package fr.sylviebal.dragon.character.game;

import fr.sylviebal.dragon.character.enemy.Dragon;
import fr.sylviebal.dragon.character.enemy.Goblin;
import fr.sylviebal.dragon.character.enemy.Witch;
import fr.sylviebal.dragon.outofboardexception.OutOfBoardException;


import java.util.ArrayList;

public class Board {
    private ArrayList<Cell> cells;
    private int playerPosition;

    public Board() {
        cells = new ArrayList<>();
        playerPosition = 0;

        for (int i = 0; i <= 65; i++) {
            cells.add(new EmptyCell()); /* toutes les cases vides par défaut*/
        }

<<<<<<< HEAD
        /*🐉 Dragons (cases 45, 52, 56, 62)*/
        cells.set(45, new Dragon("Ryuu"));
        cells.set(52, new Dragon("Ryuu"));
        cells.set(56, new Dragon("Ryuu"));
        Dragon finalDragon = new Dragon("Ryuu");
        finalDragon.setFinalBoss(true);
        cells.set(65, finalDragon);
=======
        // 🐉 Dragons (cases 45, 52, 56, 62)
        cells.set(45, new Dragon("Dragon"));
        cells.set(52, new Dragon("Dragon"));
        cells.set(56, new Dragon("dragon"));
        cells.set(64, new Dragon("Ryuu", true));
>>>>>>> e48b1ea2ff8fa48a612540ec3dfd40402a2d1f55

        /*🧙 Sorciers (cases 10, 20, 25, 32, 35, 36, 37, 40, 44, 47)*/
        cells.set(10, new Witch("Gargamel"));
        cells.set(20, new Witch("Gargamel"));
        cells.set(25, new Witch("Gargamel"));
        cells.set(32, new Witch("Ragnar"));
        cells.set(35, new Witch("Ragnar"));
        cells.set(36, new Witch("Ragnar"));
        cells.set(37, new Witch("Thorgrim "));
        cells.set(40, new Witch("Thorgrim "));
        cells.set(44, new Witch("Thorgrim "));
        cells.set(47, new Witch("Thorgrim "));

        /* 👺 Gobelins (cases 3, 6, 9, 12, 15, 18, 21, 24, 27, 30)*/
        cells.set(3, new Goblin("Gobelin"));
        cells.set(6, new Goblin("Gobelin"));
        cells.set(9, new Goblin("Gobelin"));
        cells.set(12, new Goblin("Gobelin"));
        cells.set(15, new Goblin("Gobelin"));
        cells.set(18, new Goblin("Gobelin"));
        cells.set(21, new Goblin("Gobelin"));
        cells.set(24, new Goblin("Gobelin"));
        cells.set(27, new Goblin("Gobelin"));
        cells.set(30, new Goblin("Gobelin"));

        /* 🪓 Massues (cases 2, 5, 11, 22, 38)*/
        cells.set(2, new WeaponClubCell());
        cells.set(5, new WeaponClubCell());
        cells.set(11, new WeaponClubCell());
        cells.set(22, new WeaponClubCell());
        cells.set(38, new WeaponClubCell());

        /*⚔️ Epées (cases 19, 26, 42, 53)*/
        cells.set(19, new SwordCell());
        cells.set(26, new SwordCell());
        cells.set(42, new SwordCell());
        cells.set(53, new SwordCell());

        /* ⚡ Sorts éclair (cases 1, 4, 8, 17, 23)*/
        cells.set(1, new LightningSpell());
        cells.set(4, new LightningSpell());
        cells.set(8, new LightningSpell());
        cells.set(17, new LightningSpell());
        cells.set(23, new LightningSpell());

        /*🔥 Sorts boule de feu (cases 48, 49)*/
        cells.set(48, new FireBallSpell());
        cells.set(49, new FireBallSpell());

        /*🧪 Potions standards (cases 7, 13, 31, 33, 39, 43)*/
        cells.set(7, new Potion());
        cells.set(13, new Potion());
        cells.set(31, new Potion());
        cells.set(33, new Potion());
        cells.set(39, new Potion());
        cells.set(43, new Potion());

        /* 💊 Grandes Potions (cases 28, 41)*/
        cells.set(28, new GreatPotion());
        cells.set(41, new GreatPotion());
    }

    public void moveCharacter(int move) throws OutOfBoardException {
        int newPosition = playerPosition + move;

        if (newPosition < 0) {
            throw new OutOfBoardException(" Déplacement impossible, Tu sors du plateau de jeu !");
        }

        // Si on dépasse la fin, on s'arrête à la dernière case
        if (newPosition >= cells.size()) {
            newPosition = cells.size() - 1;
        }

        playerPosition = newPosition;
        System.out.println("Le joueur est maintenant à la position " + playerPosition);
    }

    public int size() {
        return cells.size();
    }

    public Cell getCell(int position) {
        return cells.get(position);
    }

    public int getPlayerPosition() {
        return playerPosition;
    }

    public void print(GameCharacter character) {  //prend le personnage en paramètre
        System.out.println(" ");
        for (int i = 0; i < cells.size(); i++) {
            if (i == playerPosition) {
                System.out.print(character);  // affiche le personnage sur sa case
            } else {
                System.out.print(" ◻ ");
            }
            System.out.print("");
        }
        System.out.println(" ");
    }
}

