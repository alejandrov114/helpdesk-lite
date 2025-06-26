package Modelo;

import java.util.Arrays;
import java.util.List;

public class Administrador extends Usuario {
    private int telefono;


    //Constructores
    public Administrador() {
    }

    public Administrador(String nombre, String correo, String usuario, int idUsuario, String contrasenia, int telefono) {
        super(nombre, correo, usuario, idUsuario, contrasenia);
        this.telefono = telefono;
    }

    //Getters y setters
    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public List<String> permisosUsuario() {
        return Arrays.asList(
                "Ver todos los tickets",
                "Cambiar estado de ticket",
                "Eliminar ticket"
        );
    }
}

    //VertodosLosTickets
    //Cambiar de estado un ticket
    //Eliminar tickets

