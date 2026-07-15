/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.*;

/**
 *
 * @author PABLOSOMAVILLADEMELL
 */
public class conexao {
    private static final String url= "jdbc:mysql://localhost:3306/memes_bd_modc";
    private static final String usuario= "root";
     private static final String senha = "root";
     
     public static Connection getconexao(){
         try {
             return DriverManager.getConnection(url, usuario, senha);
         }catch(SQLException e) {
             System.out.println("erro ao conectar ao banco de dados"+e.getMessage());
             return null;
         }
         
         }
     }
    

