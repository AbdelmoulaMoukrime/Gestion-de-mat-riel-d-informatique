/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestionm;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author HP
 */
public class GestionM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here   try {
           String url="jdbc:MySQL://localhost:3306/gestionm";
        String user="root";
        String pass="";
        Connection con;
try{
 Class.forName("com.mysql.cj.jdbc.Driver");
    con = DriverManager.getConnection(url, user, pass);
    System.out.println("Connexion à la base de données établie avec succès.");
 


        } catch (Exception ex) {
    System.out.println("Erreur lors de la connexion à la base de données : " + ex.getMessage());
        }

    }
           
}

    
    

