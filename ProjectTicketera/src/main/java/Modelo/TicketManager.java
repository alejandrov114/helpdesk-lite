package Modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TicketManager {

    private List<Ticket> listaTickets;
    private int contadorId; // autoincremental

    public TicketManager() {
        listaTickets = new ArrayList<>();
        contadorId = 1;
    }

    // Crear ticket nuevo
    public void crearTicket(String titulo, String descripcion, String prioridad, Cliente cliente) {
    Ticket nuevo = new Ticket(titulo, descripcion, prioridad, cliente);
    nuevo.setId(contadorId); // Asignamos el ID autoincremental
    listaTickets.add(nuevo);
    contadorId++;
}

    // Listar todos los tickets (por ejemplo, para admin)
    public List<Ticket> listarTodosLosTickets() {
        return new ArrayList<>(listaTickets); // copia para no exponer la original
    }

    // Listar tickets por clienteId
    public List<Ticket> obtenerTicketsPorCliente(int clienteId) {
        return listaTickets.stream()
                .filter(ticket -> ticket.getClienteId() == clienteId)
                .collect(Collectors.toList());
    }

    // Cambiar estado de ticket por id
    public boolean cambiarEstadoTicket(int id, String nuevoEstado) {
        for (Ticket t : listaTickets) {
            if (t.getId() == id) {
                t.setEstado(nuevoEstado);
                return true;
            }
        }
        return false;
    }

    // Buscar ticket por ID
    public Ticket buscarPorId(int id) {
        for (Ticket t : listaTickets) {
            if (t.getId() == id) {
                return t;
            }
        }
        return null;
    }

}
