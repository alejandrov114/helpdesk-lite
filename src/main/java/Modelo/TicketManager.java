/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;

/**
 *
 * @author alejo
 * 
 * Gestor de Datos DAO.
 * Esta clase gestiona el acceso a los datos de los tickets(Crear, leer, actualizar, eliminar) Con SQLite.
 * No es un usuario.
 * Permite abstaer la logia de la persistenica evitando que otras clases interactuen con la bbdd.
 */
public class TicketManager {
    private CConexion conexion = new CConexion();

    
    //Metodo para crear ticket
    public boolean crearTicket(Ticket ticket) {
        String sql = "INSERT INTO tickets (titulo, descripcion, prioridad, estado, cliente_id) VALUES (?, ?, ?, ?, ?)";

        try (
            Connection conn = conexion.establecerConexion();
            PreparedStatement stmt = conn.prepareStatement(sql)
        ) {
            stmt.setString(1, ticket.getTitulo());
            stmt.setString(2, ticket.getDescripcion());
            stmt.setString(3, ticket.getPrioridad());
            stmt.setString(4, ticket.getEstado());
            stmt.setInt(5, ticket.getClienteId());

            stmt.executeUpdate();
            return true;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    //Metodo para obtenerTickets por cliente
    public ArrayList<Ticket> obtenerTicketsPorCliente(int clienteId) {
        ArrayList<Ticket> listaTickets = new ArrayList<>();

        String sql = "SELECT id, titulo, descripcion, prioridad, estado, cliente_id, cliente_nombre, cliente_email FROM tickets WHERE cliente_id = ?";

        // Instancia de CConexion para llamar al método no estático establecerConexion()
        CConexion conexion = new CConexion();

        try (
            Connection conn = conexion.establecerConexion();
            PreparedStatement stmt = conn.prepareStatement(sql)
        ) {
            stmt.setInt(1, clienteId);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Ticket ticket = new Ticket();
                ticket.setId(rs.getInt("id"));
                ticket.setTitulo(rs.getString("titulo"));
                ticket.setDescripcion(rs.getString("descripcion"));
                ticket.setPrioridad(rs.getString("prioridad"));
                ticket.setEstado(rs.getString("estado"));
                ticket.setClienteId(rs.getInt("cliente_id"));
                ticket.setClienteNombre(rs.getString("cliente_nombre"));
                ticket.setClienteEmail(rs.getString("cliente_email"));

                listaTickets.add(ticket);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return listaTickets;
    }
    
        //Metodo para obtener todos los tickets para administrador
    
    public ArrayList<Ticket> obtenerTodosLosTickets() {
        ArrayList<Ticket> listaTickets = new ArrayList<>();

        String sql = "SELECT id, titulo, descripcion, prioridad, estado, cliente_id, cliente_nombre, cliente_email FROM tickets";

        // Instancia de CConexion para llamar al método no estático establecerConexion()
        CConexion conexion = new CConexion();

        try (
            Connection conn = conexion.establecerConexion();
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery()
        ) {
            while (rs.next()) {
                Ticket ticket = new Ticket();
                ticket.setId(rs.getInt("id"));
                ticket.setTitulo(rs.getString("titulo"));
                ticket.setDescripcion(rs.getString("descripcion"));
                ticket.setPrioridad(rs.getString("prioridad"));
                ticket.setEstado(rs.getString("estado"));
                ticket.setClienteId(rs.getInt("cliente_id"));
                ticket.setClienteNombre(rs.getString("cliente_nombre"));
                ticket.setClienteEmail(rs.getString("cliente_email"));

                listaTickets.add(ticket);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return listaTickets;
    }
    
    //Metodo para actualizar el estado del ticket para administrador 
    public boolean actualizarEstadoTicket(int idTicket, String nuevoEstado) {
        String sql = "UPDATE tickets SET estado = ? WHERE id = ?";

        try (
            Connection conn = conexion.establecerConexion();
            PreparedStatement stmt = conn.prepareStatement(sql)
        ) {
            stmt.setString(1, nuevoEstado);
            stmt.setInt(2, idTicket);

            int filasActualizadas = stmt.executeUpdate();
            return filasActualizadas > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

}