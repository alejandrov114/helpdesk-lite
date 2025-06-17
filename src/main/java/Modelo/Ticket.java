/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author alejo
 * Entidad del negocio.
 * Esta clase representa un ticket de soporte tecnico.
 * Contiene atributos como id, nombre, email, descripcion, prioridad y estado.
 * Incluye sus respectivos gett y sett y el metodo toString() para su visualizacion.
 * 
 */
public class Ticket {
    
    private int id;
    private String nombre;
    private String correo;
    private String descripcion;
    private String prioridad;
    private String estado;

    //Constructor Vacio
    public Ticket() {
    }
    
    //Constructor con atributos

    public Ticket(int id, String nombre, String correo, String descripcion, String prioridad, String estado) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    @Override
    public String toString(){
        return "Ticket # " + id + " [ " + prioridad + " ] - " + estado;
    }
    
    
    
    
}
