/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 * Subclase de Usuario.
 * Representa un usuario convencional que necesita soporte técnico.
 * Puede crear tickets y ver únicamente sus tickets creados.
 */
public class Cliente extends Usuario {

    public Cliente(String nombre, String correo, int id, String password) {
        super(nombre, correo, id, password);
    }

    // Implementación de crearTicket
    @Override
    public boolean crearTicket(TicketManager gestor, String titulo, String descripcion, String prioridad) {
        int id = gestor.obtenerCantidad() + 1;
        Ticket nuevo = new Ticket(id, titulo, descripcion, prioridad, "Abierto", getId());
        return gestor.agregarTicket(nuevo);
    }

    // Implementación de verMisTickets
    @Override
    public Ticket[] verMisTickets(TicketManager gestor) {
        return gestor.ticketsPorCliente(getId());
    }
}
