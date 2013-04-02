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
public class Propiedad {

    //codigo de propiedad
    private int codigoPropiedad;
    //descripcion
    private String descripcion;
    //Ubicación (Provincia y Cantón)
    private int provincia;
    private String canton;
    //Tipo. (Lote – Bodega – Casa – Edificio - Local)
    private int tipo;
    //Propietario
    private Cliente cliente;
    //Propósito (Vender Alquilar Eventos)
    private int proposito;
    //Precio
    private double precio;
    //Servicios asociados.(agua - Luz - Teléfono - Cable - Transporte - publico seguridad - etc)
    private ArrayList servicios = new ArrayList();
    //Estado (Desocupada – alquilada - remodelando - vendida)
    private int Estado;
    //Tamaño del terreno
    private double tamanoTerreno;
    //tiene construccion
    private boolean tieneConstruccion = false;
    //tamaño construccion
    private double tamañoConstruccion;
    //Arraylist de clientes
    

    //constructor por verificar y modificar
    public Propiedad(int codigoPropiedad, String descripcion, int provincia, String canton, int tipo, Cliente cliente, int proposito, double precio, ArrayList servicios, int Estado, double tamanoTerreno, boolean tieneConstruccion, double tamañoConstruccion) {
        this.codigoPropiedad = codigoPropiedad;
        this.descripcion = descripcion;
        this.provincia = provincia;
        this.canton = canton;
        this.tipo = tipo;
        this.cliente = cliente;
        this.proposito = proposito;
        this.precio = precio;
        this.Estado = Estado;
        this.tamanoTerreno = tamanoTerreno;
        this.tieneConstruccion = tieneConstruccion;
        this.tamañoConstruccion = tamañoConstruccion;
        this.servicios = servicios;
    }
    //getters y setters

    public int getCodigoPropiedad() {
        return codigoPropiedad;
    }

    public void setCodigoPropiedad(int codigoPropiedad) {
        this.codigoPropiedad = codigoPropiedad;
    }

    public String getdescripcion() {
        return descripcion;
    }

    public void setdescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getProvincia() {
        return provincia;
    }

    public void setProvincia(int provincia) {
        this.provincia = provincia;
    }

    public String getCanton() {
        return canton;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setTamanoTerreno(double tamanoTerreno) {
        this.tamanoTerreno = tamanoTerreno;
    }

    public double getTamanoTerreno() {
        return tamanoTerreno;
    }

    public void setCanton(String canton) {
        this.canton = canton;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getProposito() {
        return proposito;
    }

    public void setProposito(int proposito) {
        this.proposito = proposito;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getEstado() {
        return Estado;
    }

    public void setEstado(int Estado) {
        this.Estado = Estado;
    }

    public double getTamañoTerreno() {
        return tamanoTerreno;
    }

    public void setTamañoTerreno(double tamanoTerreno) {
        this.tamanoTerreno = tamanoTerreno;
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
