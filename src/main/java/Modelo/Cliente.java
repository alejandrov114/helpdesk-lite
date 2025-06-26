/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author alejo
 * Subclase de Usuario.
 * Representa un usuario convencional que necesita soporte técnico.
 * Puede crear tickets y ver unicamente sus tickets creados.
 */
public class Cliente extends Usuario {
    
    private String ClienteNombre;
    private String ClienteEmail;

    public Cliente() {
    }
    

    public Cliente(String nombre, String correo, int id, String password) {
        super(nombre, correo, id, password);
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
