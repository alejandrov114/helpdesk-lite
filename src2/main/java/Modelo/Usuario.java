package Modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public abstract class Usuario {

    //Capa de encapsulamiento***
    private String nombre;
    private String correo;
    private String usuario;
    private int idUsuario;
    private String contrasenia;


    //Constructor Vacio

    public Usuario() {
    }

    public Usuario(String nombre, String correo, String usuario, int idUsuario, String contrasenia) {
        this.nombre = nombre;
        this.correo = correo;
        this.usuario = usuario;
        this.idUsuario = idUsuario;
        this.contrasenia = contrasenia;

    }

    //Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setPassword(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public List<String> permisosUsuario() {

        return Collections.emptyList();
    }


}



