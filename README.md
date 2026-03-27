# 🐉 Donjon et Dragon

> Jeu de plateau en Java développé dans le cadre de ma formation **Concepteur Développeur d'Applications (Bac+3)** au Campus Numérique in the Alps, Grenoble.

---

## 📖 Description

<<<<<<< HEAD
Donjon et Dragon est un jeu de plateau en console où un héros doit traverser 65 cases remplies de monstres et de bonus pour sauver le royaume de Valdris.
=======
Donjon et Dragon est un jeu de plateau en console où un héros doit traverser 64 cases remplies de monstres et de bonus pour sauver le royaume de Valdris.
>>>>>>> e48b1ea2ff8fa48a612540ec3dfd40402a2d1f55

Le joueur choisit son personnage (**Warrior** ou **Wizard**), lance un dé à chaque tour et se déplace sur le plateau. Selon la case sur laquelle il arrive, il combat un ennemi ou récupère un bonus.

---

## 🎮 Fonctionnalités

<<<<<<< HEAD
- 🎲 Déplacement aléatoire sur un plateau de 65 cases
=======
- 🎲 Déplacement aléatoire sur un plateau de 64 cases
>>>>>>> e48b1ea2ff8fa48a612540ec3dfd40402a2d1f55
- ⚔️ Système de combat par échange (joueur frappe → ennemi réplique et s'enfuit)
- 🧙 2 personnages jouables : Warrior et Wizard
- 👺 3 types d'ennemis : Dragon, Gobelin, Sorcier
- 🎁 6 types de bonus : Potion, Grande Potion, Épée, Massue, Sort Éclair, Boule de Feu
- 💾 Sauvegarde des personnages en base de données MySQL
<<<<<<< HEAD
- 📖 Narration et animations ASCII à chaque événement
=======
- 📖 Narration  à chaque événement
>>>>>>> e48b1ea2ff8fa48a612540ec3dfd40402a2d1f55

---

## 🏗️ Architecture

Le projet utilise les principes de la **Programmation Orientée Objet** :

```
character/
├── enemy/          → Dragon, Gobelin, Witch (héritent de EnemyCell)
├── game/           → Board, Cell, BonusCell, EnemyCell, Game, Story...
├── hero/           → Warrior, Wizard (héritent de GameCharacter)
├── DAO/            → DataBaseConnection, GameCharacterDao
├── equipement/     → OffensiveEquipment, DefensiveEquipment, Sword, Spell...
└── outofboardexception/
```

### Diagramme d'héritage simplifié

```
Cell (abstract)
├── EnemyCell (abstract) → Dragon, Gobelin, Witch
├── BonusCell (abstract) → Potion, GrandePotion, Epee, Massue, SortEclair, SortBouleDeFeu
└── EmptyCell

GameCharacter (abstract)
├── Warrior
└── Wizard

OffensiveEquipment (abstract)
├── Sword
├── WeaponClub
└── Spell
```

---

## 🚀 Installation et lancement

### Prérequis

- Java 17+
<<<<<<< HEAD
- MySQL 8+
=======
- Maria DB
>>>>>>> e48b1ea2ff8fa48a612540ec3dfd40402a2d1f55
- IntelliJ IDEA (recommandé)

### Étapes

1. Clone le projet :
```bash
git clone https://github.com/SYL566/donjon-et-dragon.git
```

2. Crée la base de données MySQL :
```sql
CREATE DATABASE donjon_et_dragon;
```

3. Configure la connexion dans `DataBaseConnection.java` :
```java
private static final String URL = "jdbc:mysql://localhost:3306/donjon_et_dragon";
private static final String USER = "root";
private static final String PASSWORD = "ton_mot_de_passe";
```

4. Lance `Main.java` dans IntelliJ ▶️

---

## 🎯 Exemple de partie

```
🏰 DONJON ET DRAGON 🐉

📜 Il était une fois, dans le royaume de Valdris...

Choisissez votre personnage :
1 - 🧝 Warrior
2 - 🧙 Wizard

🎲 Vous avez fait : 3
👺 Un Gobelin surgit de l'ombre !
⚔️ Guerrier frappe Gobelin avec 10 !
💀 Gobelin est vaincu !

🧝 Warrior Guerrier | Armes : ⚔️ Excalibur | ❤️ Life: 5 | Attack: 15
```

---

## 🛠️ Technologies utilisées

<<<<<<< HEAD
| Technologie | Usage |
|-------------|-------|
| Java 17 | Langage principal |
| MySQL 8 | Base de données |
| MySQL Connector J | Connexion JDBC |
| IntelliJ IDEA | IDE |
| Git | Versioning |
=======
| Technologie   | Usage |
|---------------|-------|
| Java 17       | Langage principal |
| MariaDB       | Base de données |
|               | Connexion JDBC |
| IntelliJ IDEA | IDE |
| Git           | Versioning |
>>>>>>> e48b1ea2ff8fa48a612540ec3dfd40402a2d1f55

---

## 📚 Concepts Java appliqués

- ✅ Héritage et polymorphisme
- ✅ Classes abstraites et interfaces
- ✅ Encapsulation (getters/setters)
- ✅ Collections (ArrayList)
- ✅ Gestion des exceptions
- ✅ Connexion base de données (JDBC)
- ✅ Design Pattern DAO

---

## 👩‍💻 Auteur

**Sylvie Bal** — Développeuse d'applications Java/Web en formation (Bac+3 CDA)

[![LinkedIn](https://img.shields.io/badge/LinkedIn-Sylvie%20Bal-blue)](https://www.linkedin.com/in/sylvie-bal-542008395)
[![GitHub](https://img.shields.io/badge/GitHub-SYL566-black)](https://github.com/SYL566)

---

## 📄 Licence

<<<<<<< HEAD
Projet réalisé dans le cadre de la formation CDA — Campus Numérique in the Alps, Grenoble 2025-2026.
=======
Projet réalisé dans le cadre de la formation CDA — Campus Numérique in the Alps, Grenoble 2025-2026.
>>>>>>> e48b1ea2ff8fa48a612540ec3dfd40402a2d1f55
