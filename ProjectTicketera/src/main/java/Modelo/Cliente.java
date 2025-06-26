package Modelo;

import java.util.Arrays;
import java.util.List;

public class Cliente extends Usuario{

    //Constructores
    public Cliente() {
    }

    public Cliente(String nombre, String correo, String usuario, int idUsuario, String contrasenia) {
        super(nombre, correo, usuario, idUsuario, contrasenia);
    }

    @Override
    public List<String> permisosUsuario() {
        return Arrays.asList(
                "Ver solo mis tickets",
                "Crear Ticket"
        );
    }
    //Crear ticket
    //VerMISTickets

}
