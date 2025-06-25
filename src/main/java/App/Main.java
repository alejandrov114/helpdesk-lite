
package App;

import Modelo.CConexion;
import Vista.Login;

import java.awt.*;

public class Main {
    
    public static void main(String[] args){
        
        CConexion objetoConexion = new CConexion();
        objetoConexion.establecerConexion();
        
        
        Login pantallaInicial = new Login();
        pantallaInicial.setVisible(true);
        pantallaInicial.setLocationRelativeTo(null);
        
    }           
}
