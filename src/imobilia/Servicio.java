/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package imobilia;

import java.io.Serializable;
import javax.swing.JOptionPane;

/**
 *
 * @author aleon
 */
public class Servicio implements Serializable {
    	//nombre
        private String nombre;
        //precio por consumo
        private double precioConsumo;
	//Tarifa básica
        private double tarifaBasica;
        //provedor
	private String proveedor;
       
        //constructor
    public Servicio() {
    }

    public Servicio(String nombre, double precioConsumo, double tarifaBasica, String proveedor) {
        this.nombre = nombre;
        this.tarifaBasica = tarifaBasica;
        this.proveedor = proveedor;
        this.precioConsumo = precioConsumo;
    }

    //getter and setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String Nombre) {
        this.nombre = Nombre;
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
    
}

