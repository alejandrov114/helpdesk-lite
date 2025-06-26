/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package App;

/**
 *
 * @author alejo
 */

import Modelo.Cliente;
import Modelo.TicketManager;
import Vista.panelControlCliente;

public class Main {
    public static void main(String[] args) {
         TicketManager manager = new TicketManager();
        Cliente cliente = new Cliente("Juan Pérez", "juan@mail.com", "cliente1", 1, "1234");

        panelControlCliente ventana = new panelControlCliente(manager, cliente);
        ventana.setVisible(true);
    }

    }
    
}
