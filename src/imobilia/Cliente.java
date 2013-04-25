/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package imobilia;

import java.io.Serializable;
import java.util.ArrayList;


/**
 *
 * @author aleon
 */
public class Cliente  implements Serializable{
    //cedula

    private long cedula;
    //codigo cliente
    private int cCod;
    //nombre cliente
    private String nombre;
    //apellido1
    private String apellido1;
    //apellido 2
    private String apellido2;
    //fecha nacimiento
    private Fecha fechaN;
    //Físico / Jurídico 
    private int tipoCliente;
    //telefono
    private long telefono;
    //direccion
    private String direccion;
    //Periodo de pago (30 días – 60 días)
    private int periodoPago;
    //arrylist de clientes
    private ArrayList<Factura> facturas = new ArrayList<Factura>();


    //constructor por verificar y modificar
    public Cliente(long cedula, int cCod, String nombre, String apellido1, String apellido2, Fecha fechaN, long telefono, String direccion, int tipoCliente, int periodoPago) {
        this.cedula = cedula;
        this.cCod = cCod;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.fechaN = fechaN;
        this.telefono = telefono;
        this.direccion = direccion;
        this.tipoCliente = tipoCliente;
        this.periodoPago = periodoPago;
    }
        public boolean setFactura(Factura factura)
    {
        if (factura instanceof Factura)
        {
            return this.facturas.add(factura);
        } 
        else 
        {
            return false;
        }
      
    }
    //busca las facturas que pertenecen al cliente sin pagar y retorna un array con ellas.
    public ArrayList<Factura> getFacturasPorPagar(){
        return facturas;
        /*ArrayList<Factura> facturasPorPagar = new ArrayList<Factura>();
        if(facturas.size()>0)
        {
            for (Factura f: facturas)
            {
                if (f.esPagada())
                {
                    facturasPorPagar.add(f);
                }
            }
            return facturasPorPagar;
        }
        else 
        {
            return null;
        }*/
        
    }
    //getters y setters

    Cliente() {
    }

    public int getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(int tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public int getPeriodoPago() {
        return periodoPago;
    }

    public void setPeriodoPago(int periodoPago) {
        this.periodoPago = periodoPago;
    }

    public long getCedula() {
        return cedula;
    }

    public void setCedula(long cedula) {
        this.cedula = cedula;
    }

    public int getcCod() {
        return cCod;
    }

    public void setcCod(int cCod) {
        this.cCod = cCod;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public Fecha getFechaN() {
        return fechaN;
    }

    public void setFechaN(Fecha fechaN) {
        this.fechaN = fechaN;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}