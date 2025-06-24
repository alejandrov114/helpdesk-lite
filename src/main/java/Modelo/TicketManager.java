/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

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
    
    private static Ticket [] ticket = new Ticket[100];
    private static int ticketCount = 0;
    
    //Agrega un nuevo ticket al arreglo si hay espacio 
   public boolean agregarTicket(Ticket nuevo) {
        if (ticketCount < ticket.length) {
            ticket[ticketCount] = nuevo;
            ticketCount++;
            return true;
        } else {
            return false;
        }
    }
   
   //Listar todos los tickets 
   public Ticket[] obtenerTodosa(){
       Ticket[] copia = new Ticket[ticketCount]; 
       for (int i = 0; i < ticketCount; i++){
           copia[i] = ticket[i];
       }
       return copia; 
   }
     // Buscar ticket por ID
    public Ticket buscarPorId(int id) {
        for (int i = 0; i < ticketCount; i++) {
            if (ticket[i].getId() == id) {
                return ticket[i];
            }
        }
        return null;
    }
// Devuelve todos los tickets de un cliente específico
    public Ticket[] ticketsPorCliente(int clienteId) {
        int cantidad = 0;

        // Contar cuántos son del cliente
        for (int i = 0; i < ticketCount; i++) {
            if (ticket[i].getClienteId() == clienteId) {
                cantidad++;
            }
        }

        // Crear arreglo con esos tickets
        Ticket[] resultado = new Ticket[cantidad];
        int j = 0;
        for (int i = 0; i < ticketCount; i++) {
            if (ticket[i].getClienteId() == clienteId) {
                resultado[j++] = ticket[i];
            }
        }

        return resultado;
    }

    // Cambia el estado de un ticket
    public boolean actualizarEstado(int id, String nuevoEstado) {
        for (int i = 0; i < ticketCount; i++) {
            if (ticket[i].getId() == id) {
                ticket[i].setEstado(nuevoEstado);
                return true;
            }
        }
        return false; // No se encontró el ticket
    }
    public boolean eliminarTicket(int id) {
    for (int i = 0; i < ticketCount; i++) {
        if (ticket[i].getId() == id) {
            for (int j = i; j < ticketCount - 1; j++) {
                ticket[j] = ticket[j + 1];
            }
            ticket[ticketCount - 1] = null;
            ticketCount--;
            return true;
        }
    }
    return false;
}
    // Busca todos los tickets con una prioridad específica (Alta, Media, Baja)
    public Ticket[] buscarPorPrioridad(String prioridad) {
        int cantidad = 0;

        // Contar cuántos tienen esa prioridad
        for (int i = 0; i < ticketCount; i++) {
            if (ticket[i].getPrioridad().equalsIgnoreCase(prioridad)) {
                cantidad++;
            }
        }

        // Crear arreglo con los que coinciden
        Ticket[] resultado = new Ticket[cantidad];
        int j = 0;
        for (int i = 0; i < ticketCount; i++) {
            if (ticket[i].getPrioridad().equalsIgnoreCase(prioridad)) {
                resultado[j++] = ticket[i];
            }
        }

        return resultado;
    }

    // Busca todos los tickets con un estado específico (Abierto, En proceso, Cerrado)
    public Ticket[] buscarPorEstado(String estado) {
        int cantidad = 0;

        // Contar cuántos tienen ese estado
        for (int i = 0; i < ticketCount; i++) {
            if (ticket[i].getEstado().equalsIgnoreCase(estado)) {
                cantidad++;
            }
        }

        // Crear arreglo con los que coinciden
        Ticket[] resultado = new Ticket[cantidad];
        int j = 0;
        for (int i = 0; i < ticketCount; i++) {
            if (ticket[i].getEstado().equalsIgnoreCase(estado)) {
                resultado[j++] = ticket[i];
            }
        }

        return resultado;
    }
    public Ticket[] obtenerTodos() {
    Ticket[] copia = new Ticket[ticketCount];
    for (int i = 0; i < ticketCount; i++) {
        copia[i] = ticket[i];
    }
    return copia;
}
    // Devuelve la cantidad actual de tickets almacenados
public int obtenerCantidad() {
    return ticketCount;
}

}
   
   
   


