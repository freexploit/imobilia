/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package imobilia;

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
        //constructor
    public ServiciosAsoc(String Nombre, double tarifaBasica, String proveedor) {
        this.Nombre = Nombre;
        this.tarifaBasica = tarifaBasica;
        this.proveedor = proveedor;
    }

    //getter and setters
    public String getNombre() {
        return Nombre;
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

    
}
