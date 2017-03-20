/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Ricardo
 */
public class conexao {
    
       public Connection getConexao(){
           try {
               
               Connection conexao = null;
               String url = "jdbc:mysql://localhost:3306/cartas";
               String user = "root";
               String pass = "";
               conexao = DriverManager.getConnection(url, user, pass);
               return conexao;
               
               
                       
               
               
               
               
           } catch (Exception e) {
               System.out.println(e);
               return null;
           }
           
           
       }
    
    
}
