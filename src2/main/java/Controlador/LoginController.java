package Controlador;


import Modelo.Usuario;
import Modelo.UsuarioManager;
import Modelo.Administrador;
import Modelo.Cliente;

import Vista.MainLogin; // o LoginAdmin, según cómo unifiques tu login
import Vista.panelControlCliente;
import Vista.panelControlAdmin;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class LoginController {
    
    private UsuarioManager usuarioManager;

    public LoginController() {
        usuarioManager = new UsuarioManager(); // ya viene con usuarios de ejemplo
    }
    
    public void iniciarSesion(String usuario, String contrasenia, JFrame ventanaActual) {
        Usuario u = usuarioManager.login(usuario, contrasenia);

        if (u != null) {
            JOptionPane.showMessageDialog(null, "¡Inicio de sesión exitoso!");

            ventanaActual.dispose(); // Cierra la ventana de login

            if (u instanceof Administrador) {
                    panelControlAdmin panelAdmin = new panelControlAdmin(u);
                panelAdmin.setVisible(true);
            } else if (u instanceof Cliente) {
                panelControlCliente panelCliente = new panelControlCliente(u);
                panelCliente.setVisible(true);
            }

        } else {
            JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public UsuarioManager getUsuarioManager() {
        return usuarioManager;
    }
}
