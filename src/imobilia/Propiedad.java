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
    private double tamanoTerreno;
    //tiene construccion
    private boolean tieneConstruccion = false;
    //tamaño construccion
    private double tamañoConstruccion;
    //Arraylist de clientes
    private static ArrayList lPropiedad = new ArrayList();

    //constructor por verificar y modificar
    public Propiedad(int codigoPropiedad, String descripcion, String provincia, String canton, int tipo, Cliente cliente, int proposito, double precio, int Estado, double tamanoTerreno, boolean tieneConstruccion, double tamañoConstruccion) {
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

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
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

    public static ArrayList getlPropiedad() {
        return lPropiedad;
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

    public void CrearObjeto() {
        try {
            if(!Cliente.getlClientes().isEmpty()||!ServiciosAsoc.getlServicios().isEmpty())
            {}
            else{
            int  nCodigoDePropiedad = Integer.parseInt(JOptionPane.showInputDialog("ingrese Coddigo de Propiedad"));
            String nDescripcion = JOptionPane.showInputDialog("ingrese Descripcion");
            String nProvincia = JOptionPane.showInputDialog("ingrese provincia");
            String nCanton = JOptionPane.showInputDialog("ingrese Canton");
            int nTipo = Integer.parseInt(JOptionPane.showInputDialog("ingrese:\n 1) para lote\n 2) para bodega\n 3) para casa\n 4) para edificio\n 5) para local"));
            //Cliente nCliente = // por terminar 
            int nProposito = Integer.parseInt(JOptionPane.showInputDialog("ingrese Proposito:\n 1) vender\n 2) alquilar\n 3) "));
            int nPrecio = Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor de la propiedad"));
            //ServiciosAsoc nServicio;
            int nEstado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el estado de la propiedad:\n 1) alquilada\n 2) remodelando\n 3) vendida"));
            int nTamanoDelTerreno = Integer.parseInt(JOptionPane.showInputDialog("ingrese Tamaño del terreno"));
            int nboolean = Integer.parseInt(JOptionPane.showInputDialog("ingrese:\n 1) si tiene construccion\n 2) si no tiene construccion"));
            if (nboolean == 1){
                boolean nTieneConstruccion=true;
            
            }
            else{boolean nTieneConstruccion=false;} 
            Propiedad propiedad1 = new Propiedad(nCedula, nCCod, nNombre, nApellido1, nApellido2, fecha1, nTelefono, ndireccion, nTipoCliente, nPeriodoPago);
            Propiedad.lPropiedad.add(propiedad1);
            }
        } catch (Exception e) {
        }
    }
}
