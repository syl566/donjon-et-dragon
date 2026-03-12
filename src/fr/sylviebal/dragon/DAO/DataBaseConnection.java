package fr.sylviebal.dragon.DAO;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DataBaseConnection {
    private static Connection connection;

    public static Connection getConnection() throws SQLException {
        if (connection == null || connection.isClosed()) {
            try {
                Properties props = new Properties();

           
                InputStream input = DataBaseConnection.class
                        .getClassLoader()
                        .getResourceAsStream("config.example.properties");

                if (input == null) {
                    throw new IOException("config.example.properties introuvable !");
                }

                props.load(input);

                String url = props.getProperty("db.url");
                String user = props.getProperty("db.user");
                String password = props.getProperty("db.password");

                connection = DriverManager.getConnection(url, user, password);
                System.out.println("✅ Connexion à la base de données réussie !");

            } catch (IOException e) {
                System.out.println("❌ Fichier config.properties introuvable !");
                throw new SQLException(e);
            }
        }
        return connection;
    }
}

