/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import DAOClasse.FournisseurDAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
/**
 *
 * @author HP
 */
@WebServlet("/AjouterFournisseurServlet")
public class AjouterFournisseurServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Récupérer les données du formulaire
        String nom = request.getParameter("nom");
        String adresse = request.getParameter("adresse");
        String email = request.getParameter("email");
        String telephone = request.getParameter("telephone");
        String site_web = request.getParameter("site_web");

        // Insérer les données dans la base de données
        FournisseurDAO.insertFournisseur(nom, adresse, email, telephone, site_web);

        // Rediriger l'utilisateur vers une autre page ou réafficher la même page avec un message de confirmation
       response.sendRedirect("Vue/fournisseur.jsp");

    }
}