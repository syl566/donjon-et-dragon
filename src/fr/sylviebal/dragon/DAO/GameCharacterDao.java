package fr.sylviebal.dragon.DAO;

import fr.sylviebal.dragon.character.game.GameCharacter;
import fr.sylviebal.dragon.character.hero.Wizard;

import javax.swing.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class GameCharacterDao {

    private Connection connection;

    public GameCharacterDao() throws SQLException{
        connection = DataBaseConnection.getConnection();
    }

    // afficher tous les personnages
    public List<GameCharacter> getHeroes() {

        List<GameCharacter> heroes = new ArrayList<>();
        String sql = "SELECT * FROM GameCharacter";

        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();

            while (rs.next()) {

                GameCharacter hero = new Wizard("");

                hero.setId(rs.getInt("id"));
                hero.setName(rs.getString("name"));
                hero.setType(rs.getString("type"));
                hero.setLifePoints(rs.getInt("lifePoints"));
                hero.setAttackPower(rs.getInt("attackPower"));

                heroes.add(hero);

                System.out.println(hero.getId() + " - " + hero.getName());
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return heroes;
    }

    // créer un personnage
    public void createHero(GameCharacter hero) {

        String sql = "INSERT INTO GameCharacter (name, type, lifePoints, AttackPower) VALUES (?, ?, ?, ?)";

        try {

            PreparedStatement statement = connection.prepareStatement(sql);

            statement.setString(1, hero.getName());
            statement.setString(2, hero.getType());
            statement.setInt(3, hero.getLifePoints());
            statement.setInt(4, hero.getAttackPower());

            statement.executeUpdate();

            System.out.println("Hero ajouté en base !");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // modifier un personnage
    public void editHero(GameCharacter hero) {

        String sql = "UPDATE GameCharacter SET name=?, type=?, lifePoints=?, AttackPower=? WHERE id=?";

        try {

            PreparedStatement statement = connection.prepareStatement(sql);

            statement.setString(1, hero.getName());
            statement.setString(2, hero.getType());
            statement.setInt(3, hero.getLifePoints());
            statement.setInt(4, hero.getAttackPower());
            statement.setInt(5, hero.getId());

            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // mettre à jour les points de vie
    public void changeLifePoints(GameCharacter hero) {

        String sql = "UPDATE GameCharacter SET lifePoints=? WHERE id=?";

        try {

            PreparedStatement statement = connection.prepareStatement(sql);

            statement.setInt(1, hero.getLifePoints());
            statement.setInt(2, hero.getId());

            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}