/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.infox.dal;
import java.sql.*;
/**
 *
 * @author Admin
 */
public class ModuloConexao {
    // método responsavel por estabelecer a conexão com o banco
    
    public static Connection conector() {  
     
    java.sql.Connection conexao = null;
   System.out.print(conexao);
    // a linha abaixo chama o driver  
    String driver = "com.mysql.cj.jdbc.Driver";
    // Armazenando informações referentes ao banco 
    String url ="jdbc:mysql://localhost:3306/dbinfox";
    String user ="root";
    String password = "";
    // estabelecer conexão com o banco 
        try {
            Class.forName(driver);
            conexao =  DriverManager.getConnection(url, user, password);
            return conexao; 
        } catch (Exception e) {
            // a linha abaixo serve de apoio para esclarecer o erro
            // System.out.println(e);
            e.printStackTrace();
            return null;
        }
        
    
    }
    
    
}
