/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package imobilia;

/**
 *
 * @author aleon
 */
public class Propiedades {
    
        //codigo de propiedad
    	private int codigoPropiedad;
        //descripcion
	private String Descripción;
	//Ubicación (Provincia y Cantón)
        private String provincia;
        private String canton;
        //Tipo. (Lote – Bodega – Casa – Edificio - Local)
	private String tipo;
        //Propietario
        private Cliente cliente;
	//Propósito (Vender Alquilar Eventos)
        private String proposito;
	//Precio
        private double precio;
        //Servicios asociados.(agua - Luz - Teléfono - Cable - Transporte - publico seguridad - etc)
        //Estado (Desocupada – alquilada - remodelando - vendida)
        private String Estado;
	//Tamaño del terreno
        private double tamañoTerreno;
        //tiene construccion
        private boolean tieneConstruccion = false;
        //tamaño construccion
        private double tamañoConstruccion;

        //constructor por verificar y modificar
    public Propiedades(int codigoPropiedad, String Descripción, String provincia, String canton, String tipo, Cliente cliente, String proposito, double precio, String Estado, double tamañoTerreno, double tamañoConstruccion) {
        this.codigoPropiedad = codigoPropiedad;
        this.Descripción = Descripción;
        this.provincia = provincia;
        this.canton = canton;
        this.tipo = tipo;
        this.cliente = cliente;
        this.proposito = proposito;
        this.precio = precio;
        this.Estado = Estado;
        this.tamañoTerreno = tamañoTerreno;
        this.tamañoConstruccion = tamañoConstruccion;
    }
    //getters y setters
    public int getCodigoPropiedad() {
        return codigoPropiedad;
    }
    public void setCodigoPropiedad(int codigoPropiedad) {
        this.codigoPropiedad = codigoPropiedad;
    }
    public String getDescripción() {
        return Descripción;
    }
    public void setDescripción(String Descripción) {
        this.Descripción = Descripción;
    }
    public String getProvincia() {
        return provincia;
    }
    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
    public String getCanton() {
        return canton;
    }
    public void setCanton(String canton) {
        this.canton = canton;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public String getProposito() {
        return proposito;
    }
    public void setProposito(String proposito) {
        this.proposito = proposito;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public String getEstado() {
        return Estado;
    }
    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
    public double getTamañoTerreno() {
        return tamañoTerreno;
    }
    public void setTamañoTerreno(double tamañoTerreno) {
        this.tamañoTerreno = tamañoTerreno;
    }
    public boolean isTieneConstruccion() {
        return tieneConstruccion;
    }
    public void setTieneConstruccion(boolean tieneConstruccion) {
        this.tieneConstruccion = tieneConstruccion;
    }
    public double getTamañoConstruccion() {
        return tamañoConstruccion;
    }
    public void setTamañoConstruccion(double tamañoConstruccion) {
        this.tamañoConstruccion = tamañoConstruccion;
    }
       
        

    
}
