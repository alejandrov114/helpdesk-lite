/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Administrador;
import Modelo.CConexion;
import Modelo.Cliente;
import Modelo.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author alejo
 * Gestiona el proceso de autenticación o selección de tipo usuario.
 * Determina si se debe mostrar la interfaz Cliente o Administrador.
 * 
 */
public class LoginController {
    private CConexion conexion = new CConexion();
    
     public Usuario validarLogin(String email, String contrasena) {
        String sql = "SELECT * FROM usuarios WHERE email = ? AND contrasena = ?";
        
        try (Connection conn = conexion.establecerConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, email);
            stmt.setString(2, contrasena);

            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                String tipo = rs.getString("tipo");
                if (tipo.equalsIgnoreCase("cliente")) {
                    Cliente cliente = new Cliente();
                    cliente.setId(rs.getInt("id"));
                    cliente.setNombre(rs.getString("nombre"));
                    cliente.setClienteEmail(rs.getString("email"));
                    return cliente;
                } else if (tipo.equalsIgnoreCase("admin")) {
                    Administrador admin = new Administrador();
                    admin.setId(rs.getInt("id"));
                    admin.setNombre(rs.getString("nombre"));
                    admin.setCorreo(rs.getString("email"));
                    return admin;
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
    

