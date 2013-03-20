/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package imobilia;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author aleon
 */
public class ServiciosAsoc {
    	//nombre
        private String Nombre;
        //precio por consumo
        private double precioConsumo;
	//Tarifa básica
        private double tarifaBasica;
        //provedor
	private String proveedor;
        //ArrayList de servicios
        public static ArrayList lServicios = new ArrayList();
        //constructores
    public ServiciosAsoc(){}    
    public ServiciosAsoc(String Nombre, double precioConsumo, double tarifaBasica, String proveedor) {
        this.Nombre = Nombre;
        this.tarifaBasica = tarifaBasica;
        this.proveedor = proveedor;
        this.precioConsumo = precioConsumo;
    }

    //getter and setters
    public String getNombre() {
        return Nombre;
    }
    public static ArrayList getlServicios() {
        return lServicios;
    }
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    public double getPrecioConsumo() {
        return precioConsumo;
    }
    public void setPrecioConsumo(double precioConsumo) {
        this.precioConsumo = precioConsumo;
    }
    public double getTarifaBasica() {
        return tarifaBasica;
    }
    public void setTarifaBasica(double tarifaBasica) {
        this.tarifaBasica = tarifaBasica;
    }
    public String getProveedor() {
        return proveedor;
    }
    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }
    
    public void CrearObjeto(){
    String nNombre = JOptionPane.showInputDialog("Ingrese Nombre del Servicio");
    double nPrecioConsumo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Precio"));
    double nTarifaBasica = Double.parseDouble("Ingrese Tarifa Basica");
    String nProveedor = JOptionPane.showInputDialog("Ingrese Proveedor");
    ServiciosAsoc servicio1 = new ServiciosAsoc(nNombre, nPrecioConsumo, nTarifaBasica, nProveedor);
    ServiciosAsoc.lServicios.add(servicio1);
}
    
}
