package Modelo;


import java.util.ArrayList;
import java.util.List;

public class UsuarioManager {

    private List<Usuario> usuarios;

    public UsuarioManager() {
        usuarios = new ArrayList<>();
        cargarUsuariosEjemplo(); // Usuarios quemados
    }

    private void cargarUsuariosEjemplo() {
        usuarios.add(new Cliente("Juan Correa", "juan@gmail.com", "juanp", 1, "1234"));
        usuarios.add(new Administrador("Alejandro Admin", "ana@admin.com", "admin1", 2, "admin123", 311234567));
    }

    // Método de login: retorna el Usuario si encuentra coincidencia, o null si falla
    public Usuario login(String usuarioIngresado, String contraseniaIngresada) {
        for (Usuario u : usuarios) {
            if (u.getUsuario().equals(usuarioIngresado) && u.getContrasenia().equals(contraseniaIngresada)) {
                return u;
            }
        }
        return null;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }
}
