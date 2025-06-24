/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author alejo
 * 
 * Clase abstracta que representa a cualquier persona que interactua con la aplicación. 
 * Define atributos y comportamientos comunes entre distintos tipos de usuarios
 * Contiene metodos abstractos que serán implementdos por subclases.
 */
public abstract class Usuario {
    private String nombre;
    private String correo;
    private int id;
    private String password;

    //Constructor vacio
    public Usuario() {
    }
    
    //Constructor completo
    public Usuario(String nombre, String correo, int id, String password) {
        this.nombre = nombre;
        this.correo = correo;
        this.id = id;
        this.password = password;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
      // Métodos abstractos que implementarán las subclases
    public abstract Ticket[] verMisTickets(TicketManager gestor);

    public abstract boolean crearTicket(TicketManager gestor, String titulo, String descripcion, String prioridad);
}
    
    

