/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import clases.Enviroment;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author mcsmo
 */
public class Conexion {
    
    Connection con;
    Statement st;
    
    public Connection getConnection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection(Enviroment.url,Enviroment.user,Enviroment.pass);
        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null,"Error: "+e);
        }
        return con;
    }
    
}
