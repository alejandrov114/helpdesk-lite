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
public class Administrador extends Usuario{

    public Administrador(String nombre, String correo, int id, String password) {
        super(nombre, correo, id, password);
    }
    
}
