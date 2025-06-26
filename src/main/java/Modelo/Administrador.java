/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author alejo
 * Representa un usuario con privilegios avanzados (Tecnico).
 * Puede ver todos los tickets, cambiar su estado y realizar busquedas.
 * Se comunica con TicketManager para acceder o modificar los datos.
 * 
 */
public class Administrador extends Usuario {
    
    public Administrador(String nombre, String correo, int id, String password) {
        super(nombre, correo, id, password);
    }

    public Administrador() {
    }
    
    
    // Getters y Setters
    @Override
    public String getNombre() {
        return super.getNombre(); // O usa protected/private accesor si es necesario
    }
    
    @Override
    public void setNombre(String nombre) {
        super.setNombre(nombre);
    }
    
    @Override
    public String getCorreo() {
        return super.getCorreo();
    }
    
    /**
     *
     * @param correo
     */
    @Override
    public void setCorreo(String correo) {
        super.setCorreo(correo);
    }
    
    @Override
    public int getId() {
        return super.getId();
    }
    
    /**
     *
     * @param id
     */
    @Override
    public void setId(int id) {
        super.setId(id);
    }
    
    @Override
    public String getPassword() {
        return super.getPassword();
    }
    
    @Override
    public void setPassword(String password) {
        super.setPassword(password);
    }
}