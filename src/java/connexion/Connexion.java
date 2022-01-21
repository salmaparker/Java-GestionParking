/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author dell
 */
public class Connexion {
   private static Connection connection;
    private static Connexion instane;

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/parking", "root", "");
        } catch (ClassNotFoundException e) {
            System.out.println("Impossible de charger le driver");
        } catch (SQLException e) {
            System.out.println("Impossible d etabir la connexion");
        }

    }

   

    public static Connexion getInstane() {
        if (instane == null) {
            instane = new Connexion();
        }
        return instane;
    }   

    public static Connection getConnection() {
       return connection;
    }
}
