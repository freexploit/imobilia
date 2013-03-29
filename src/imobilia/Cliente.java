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
public class Cliente {
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
    private static ArrayList lClientes = new ArrayList();

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

    public static ArrayList getlClientes() {
        return lClientes;
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

    private static int LlenarFecha(String Variable) {
        int vTemporal = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el " + Variable));
        return (vTemporal);
    }

    /**
     *
     */
    public void CrearObjeto() {
        try {
            String nNombre = JOptionPane.showInputDialog("ingrese nombre");
            String nApellido1 = JOptionPane.showInputDialog("ingrese apellido");
            String nApellido2 = JOptionPane.showInputDialog("ingrese segundo apellido");
            Long nCedula = Long.parseLong(JOptionPane.showInputDialog("ingrese cedula"));
            int nCCod;
            if (Cliente.lClientes.isEmpty()) {
                nCCod = 0;
            } else {
                nCCod = lClientes.size() + 1;
            }//este codigo hay q verificarlo
            Fecha fecha1 = new Fecha(LlenarFecha("Mes de nacimiento"), LlenarFecha("Dia De Nacimiento"), LlenarFecha("Año"));
            long nTelefono = Long.parseLong(JOptionPane.showInputDialog("ingrese telefono"));
            String ndireccion = JOptionPane.showInputDialog("ingrese direccion");
            int nTipoCliente = Integer.parseInt(JOptionPane.showInputDialog("ingrese tipo cliente\n 1 para fisico\n 2 para juridico"));
            int nPeriodoPago = Integer.parseInt(JOptionPane.showInputDialog("ingrese periodo de pagos \n 1 para 30 dias\n 2 para 60 dias"));
            Cliente cliente1 = new Cliente(nCedula, nCCod, nNombre, nApellido1, nApellido2, fecha1, nTelefono, ndireccion, nTipoCliente, nPeriodoPago);
            Cliente.lClientes.add(cliente1);
        } catch (Exception e) {
        }

    }

    public static Cliente BuscarCliente(int nCCod) {
        for (int i = 0; i < lClientes.size(); i++) {
            Cliente usuario = (Cliente) lClientes.get(i);
            if (String.valueOf(usuario.getcCod()).contains(String.valueOf(nCCod))) {
                return usuario;
            }
        }
        return null;
    }
}