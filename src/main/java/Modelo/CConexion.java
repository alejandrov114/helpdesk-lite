/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author alejo
 */
public class CConexion {
    
    Connection conectar = null;
    
    String usuario = "postgres";
    String contrasenia = "1234";
    String bd = "javadb";
    String ip = "localhost";
    String Puerto = "5432";
    
    String cadena = "jdbc:postgresql://"+ip+":"+Puerto+"/"+bd;
    
    public Connection establecerConexion(){
        try{
            Class.forName("org.postgresql.Driver");
            conectar = DriverManager.getConnection(cadena,usuario,contrasenia);
            JOptionPane.showMessageDialog(null,"Se conectó correctamente a la base de datos ");
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"error al conectar a la base de datos: " +e.toString());
        }
        
        return conectar;
    }
    
}
