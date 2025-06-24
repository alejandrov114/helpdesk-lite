/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 * Representa un usuario con privilegios avanzados (Técnico).
 * Puede ver todos los tickets, cambiar su estado y realizar búsquedas.
 * Se comunica con TicketManager para acceder o modificar los datos.
 */
public class Administrador extends Usuario {

    public Administrador(String nombre, String correo, int id, String password) {
        super(nombre, correo, id, password);
    }

    // No crea tickets, pero se requiere por ser clase hija de Usuario
    @Override
    public boolean crearTicket(TicketManager gestor, String titulo, String descripcion, String prioridad) {
        return false; // El administrador no crea tickets
    }

    // Puede ver todos los tickets
    @Override
    public Ticket[] verMisTickets(TicketManager gestor) {
        return gestor.obtenerTodos();
    }

    // Función adicional: cambiar estado
    public boolean cambiarEstadoTicket(TicketManager gestor, int id, String nuevoEstado) {
        return gestor.actualizarEstado(id, nuevoEstado);
    }

    // Función adicional: buscar por prioridad
    public Ticket[] buscarPorPrioridad(TicketManager gestor, String prioridad) {
        return gestor.buscarPorPrioridad(prioridad);
    }

    // Función adicional: buscar por estado
    public Ticket[] buscarPorEstado(TicketManager gestor, String estado) {
        return gestor.buscarPorEstado(estado);
    }
}
