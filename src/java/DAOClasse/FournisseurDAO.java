/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package DAOClasse;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author HP
 */
@WebServlet(name = "FournisseurDAO", urlPatterns = {"/FournisseurDAO"})
public class FournisseurDAO extends HttpServlet {



    
    public static void insertFournisseur(String nom, String adresse, String email, String telephone, String site_web) {
        Connection conn = null;
        PreparedStatement stmt = null;
        
      try {
    // Charger le pilote JDBC
    Class.forName("com.mysql.cj.jdbc.Driver");
    
    // Établir la connexion à la base de données
     conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestionm", "root", "");
    
    // Créer la requête SQL pour insérer des données dans la table
    String sql = "INSERT INTO fournisseur (nom, adresse, email, telephone, site_web) VALUES (?, ?, ?, ?, ?)";
    stmt = conn.prepareStatement(sql);
    stmt.setString(1, nom);
    stmt.setString(2, adresse);
    stmt.setString(3, email);
    stmt.setString(4, telephone);
    stmt.setString(5, site_web);
    
    // Exécuter la requête
    int rowsAffected = stmt.executeUpdate();
    
    if (rowsAffected > 0) {
        // Succès de l'insertion
        System.out.println("Insertion réussie.");
    } else {
        // Aucune ligne insérée
        System.out.println("Aucune insertion effectuée.");
    }
    
    // Fermer les ressources
    stmt.close();
    conn.close();
} catch (ClassNotFoundException | SQLException ex) {
    // Gestion des exceptions
    ex.printStackTrace();
}

    }}
