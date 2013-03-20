/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package imobilia;

import javax.swing.JOptionPane;

/**
 *
 * @author christopher
 */
public class Imobilia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cliente ncliente = new Cliente();
        Propiedades npropiedad = new Propiedades();
        
        int opc = 0;
        
        while (opc != 4) {
            opc = Integer.parseInt(JOptionPane.showInputDialog("Ingrese\n"
                    + "1) para ver opciones de Cliente\n"
                    + "2) Para ver opciones de Propiedades\n"
                    + "3) Para ver opciones de Servicios Asociados\n"
                    + "4) Para salir del programa"));
            switch (opc) {
                case 1:
                    ncliente.CrearObjeto();
                    break;
                case 2:
                    npropiedad.CrearObjeto();
                    break;
                case 3:
                    break;
                case 4:
                    System.exit(0);
                
            }
        }
    }
}
