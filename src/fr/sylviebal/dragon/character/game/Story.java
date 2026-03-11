package fr.sylviebal.dragon.character.game;

import fr.sylviebal.dragon.character.hero.Warrior;
import fr.sylviebal.dragon.character.hero.Wizard;
public class Story {

    public static void introduction() {
        System.out.println("=================================================");
        System.out.println("        🏰 ####       ####   ###  ##  #######    ####   ###  ##     🏰       ######   ######   🏰     ####     ######   ######     ####     \n" +
                " ## ##    ##  ##   ###  #     # #    ##  ##   ###  #                ##  #                  ## ##        ##     ## #   ##  ##   ##  ##   ###  #\n" +
                " ##  ##  ###  ##   #### #    # ##   ###  ##   #### #            ##        ##               ##  ##   ##   #    ##  #  ###      ###  ##   #### #\n" +
                " ##  ##  ###  ##   ## # #    # ##   ###  ##   ## # #           #######   ###               ##  ##  #######    #####  ### ###  ###  ##   ## # #\n" +
                " ##  ##  ###  ##   ## ###  # # #    ###  ##   ## ###            ##        ##               ##  ##   ####     ##   #  ###   #  ###  ##   ## ###\n" +
                " ## ##   ### ##    ##  ##  ## ##    ### ##    ##  ##            ##  ##    ##               ## ##    ## ##    ##   #  ### ###  ### ##    ##  ##\n" +
                "####  🐉 ####    ###   #   ###      ####    ###   #   🐉         ######    ##    🐉            ####     ###  ##  ##   ##   ####     ####    ###   #\n 🐉                   ");

        System.out.println("=================================================");
        System.out.println();
        System.out.println("📜 Il était une fois, dans un royaume lointain...");
        System.out.println("   Une terrible malédiction s'est abattue sur le ");
        System.out.println("   royaume de Valdris. Un dragon maléfique nommé  ");
        System.out.println("   Ryuu a volé le cristal sacré qui protégeait    ");
        System.out.println("   le royaume et se cache au fond d'un donjon     ");
        System.out.println("   rempli de monstres terrifiants...              ");
        System.out.println();
        System.out.println("   Un héros courageux doit traverser 64 cases     ");
        System.out.println("   de dangers pour récupérer le cristal !         ");
        System.out.println("=================================================");
        System.out.println();
    }

    public static void characterIntro(GameCharacter character) {
        System.out.println("⚡ " + character.getName() + " accepte la quête !");
        if (character instanceof Warrior) {
            System.out.println("🗡️  En tant que Warrior, il brandit son épée et");
            System.out.println("   pénètre dans le donjon sans crainte...");
        } else if (character instanceof Wizard) {
            System.out.println("✨ En tant que Wizard, il murmure un sort de   ");
            System.out.println("   protection et s'avance dans l'obscurité...  ");
        }
        System.out.println();
    }

    public static void onEnemyEncounter(String enemyName) {
        switch (enemyName) {
            case "Gobelin":
                System.out.println("👺 Soudain, un Gobelin surgit de l'ombre !");
                System.out.println("   Il grogne et montre ses dents jaunes...");
                break;
            case "Dragon":
                System.out.println("🐉 Un rugissement fait trembler les murs !");
                System.out.println("   Un Dragon crache des flammes vers toi !");
                break;
            case "Sorcier":
                System.out.println("🧙 Un Sorcier maléfique apparaît dans un  ");
                System.out.println("   nuage de fumée noire...");
                break;
            default:
                System.out.println("⚔️ Un ennemi se dresse sur ton chemin !");
        }
    }

    public static void onBonusFound(String bonusName) {
        switch (bonusName) {
            case "Potion":
                System.out.println("🧪 Tu découvres une fiole brillante cachée ");
                System.out.println("   derrière une pierre... C'est une potion !");
                break;
            case "Épée":
                System.out.println("⚔️  Une épée légendaire repose sur un autel.");
                System.out.println("   Elle semble t'appeler...");
                break;
            case "Éclair":
                System.out.println("⚡ Un parchemin ancien flotte dans les airs.");
                System.out.println("   C'est le sort Éclair !");
                break;
            case "Boule de Feu":
                System.out.println("🔥 Une boule de feu tourbillonne devant toi.");
                System.out.println("   Tu peux la capturer !");
                break;
            default:
                System.out.println("✨ Tu trouves quelque chose d'utile !");
        }
    }

    public static void onVictory(GameCharacter character) {
        System.out.println("=================================================");
        System.out.println("🏆 VICTOIRE ! 🏆");
        System.out.println();
        System.out.println("   " + character.getName() + " a traversé le donjon !");
        System.out.println("   Le cristal sacré est récupéré !               ");
        System.out.println("   Le royaume de Valdris est sauvé ! 🎉           ");
        System.out.println("=================================================");
    }

    public static void onGameOver(GameCharacter character) {
        System.out.println("=================================================");
        System.out.println("💀 GAME OVER 💀");
        System.out.println();
        System.out.println("   " + character.getName() + " est tombé au combat...");
        System.out.println("   Le royaume de Valdris est perdu à jamais...   ");
        System.out.println("   Peut-être qu'un autre héros tentera sa chance.");
        System.out.println("=================================================");
    }
}