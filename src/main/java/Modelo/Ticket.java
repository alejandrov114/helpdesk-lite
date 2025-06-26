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
    private String titulo;
    private String descripcion;
    private String prioridad;
    private String estado;
    private int clienteId;
    private String ClienteNombre;
    private String ClienteEmail;

    //Constructor Vacio
    public Ticket() {
    }
    
    //Constructor con atributos

    public Ticket(int id, String titulo, String descripcion, String prioridad, String estado, int clienteId, String ClienteNombre, String ClienteEmail) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.estado = estado;
        this.clienteId = clienteId;
        this.ClienteNombre = ClienteNombre;
        this.ClienteEmail = ClienteEmail;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
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

    public int getClienteId() {
        return clienteId;
    }

    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }

    public String getClienteNombre() {
        return ClienteNombre;
    }

    public void setClienteNombre(String ClienteNombre) {
        this.ClienteNombre = ClienteNombre;
    }

    public String getClienteEmail() {
        return ClienteEmail;
    }

    public void setClienteEmail(String ClienteEmail) {
        this.ClienteEmail = ClienteEmail;
    }
    
    

}