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
public class Propiedades {

    //codigo de propiedad
    private int codigoPropiedad;
    //descripcion
    private String Descripción;
    //Ubicación (Provincia y Cantón)
    private String provincia;
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
    private ServiciosAsoc servicio;
    //Estado (Desocupada – alquilada - remodelando - vendida)
    private int Estado;
    //Tamaño del terreno
    private double tamañoTerreno;
    //tiene construccion
    private boolean tieneConstruccion = false;
    //tamaño construccion
    private double tamañoConstruccion;
    //arraylist de propiedades
    private static ArrayList lPropiedades = new ArrayList();

    //constructor por verificar y modificar
    public Propiedades(){}
    public Propiedades(int codigoPropiedad, String Descripción, String provincia, String canton, int tipo, Cliente cliente, int proposito, double precio, ServiciosAsoc servicio, int Estado, double tamañoTerreno, boolean tieneConstruccion, double tamañoConstruccion) {
        this.codigoPropiedad = codigoPropiedad;
        this.Descripción = Descripción;
        this.provincia = provincia;
        this.canton = canton;
        this.tipo = tipo;
        this.cliente = cliente;
        this.proposito = proposito;
        this.precio = precio;
        this.servicio = servicio;
        this.Estado = Estado;
        this.tamañoTerreno = tamañoTerreno;
        this.tieneConstruccion = tieneConstruccion;
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
    public ServiciosAsoc getServicio() {
        return servicio;
    }
    public void setServicio(ServiciosAsoc servicio) {
        this.servicio = servicio;
    }
    public static ArrayList getlPropiedades() {
        return lPropiedades;
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
    public void CrearObjeto() {
        int nCodigoPropiedad = Integer.parseInt(JOptionPane.showInputDialog("ingrese codigo de propiedad"));
        String nDescripcion = JOptionPane.showInputDialog("ingrese descripcion de la propiedad");
        String nProvincia = JOptionPane.showInputDialog("ingrese Provincia");
        String nCanton = JOptionPane.showInputDialog("ingrese canton");
        int nTipo = Integer.parseInt(JOptionPane.showInputDialog("ingrese Tipo\n 1) para Lote\n 2) para Bodega\n 3) para Casa\n 4) para Edificio\n 5) para Local "));
        Cliente nCliente=null;//implementar
        int nProposito = Integer.parseInt(JOptionPane.showInputDialog("ingrese Proposito\n 1) para Vender\n 2) para Alquilar\n 3) Eventos"));
        double nPrecio = Double.parseDouble(JOptionPane.showInputDialog("ingrese Precio"));
        ServiciosAsoc nServicio=null;//implementar
        int nEstado = Integer.parseInt(JOptionPane.showInputDialog("ingrese Estado\n 1) para Desocupada\n 2) para alquilada\n 3) para remodelando\n 4) para vendida "));
        double nTamanoTerreno = Double.parseDouble(JOptionPane.showInputDialog("ingrese Tamaño Terreno"));
        int nPregunta = Integer.parseInt(JOptionPane.showInputDialog("Seleccione\n 1) para si\n 2) para no"));
        boolean nConstruccion;
        if (nPregunta == 1) {
            nConstruccion = true;
        } else {
            nConstruccion = false;
        }
        double nTamañoConstruccion;
        if (nConstruccion == true) {
            nTamañoConstruccion = Double.parseDouble(JOptionPane.showInputDialog("ingrese Tamaño de la construccion"));
        } else {
            nTamañoConstruccion = 0.0;
        }
        Propiedades propiedad1 = new Propiedades(nCodigoPropiedad, nDescripcion, nProvincia, nCanton, nTipo, nCliente, nProposito, nPrecio, nServicio, nEstado, nTamanoTerreno, nConstruccion, nTamañoConstruccion);
        Propiedades.lPropiedades.add(propiedad1);

    }
}
