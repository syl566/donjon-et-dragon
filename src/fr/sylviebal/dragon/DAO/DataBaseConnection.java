package fr.sylviebal.dragon.DAO;

import java.sql.*;
import java.sql.Connection;

public class DataBaseConnection {

    private static final String URL = "jdbc:mysql://localhost:3306/donjon-et-dragon";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    private static Connection connection;

    public static Connection getConnection() throws SQLException{

      if(connection == null || connection.isClosed()){
          connection = DriverManager.getConnection(URL, USER, PASSWORD);
      }
      return connection;
    }
}

