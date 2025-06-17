/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author alejo
 * 
 * Gestor de Datos DAO.
 * Esta clase gestiona el acceso a los datos de los tickets(Crear, leer, actualizar, eliminar) Con SQLite.
 * No es un usuario.
 * Permite abstaer la logia de la persistenica evitando que otras clases interactuen con la bbdd.
 */
public class TicketManager {
    
    private static Ticket [] ticket = new Ticket[100];
    private static int ticketCount = 0;
    
}
