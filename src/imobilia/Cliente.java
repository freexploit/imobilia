/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package imobilia;

/**
 *
 * @author aleon
 */
public class Cliente {
    	private long cedula;
	private int cCod;
	private String nombre;
        private String apellido1;
        private String apellido2;
	private Fecha fechaN;
	//Físico / Jurídico /pendiente por pensar
	private long telefono;
	private String Dirección;
	//Periodo de pago (30 días – 60 días)/pendiente
    
        //constructor por verificar y modificar
    public Cliente(long cedula, int cCod, String nombre, String apellido1, String apellido2, Fecha fechaN, long telefono, String Dirección) {
        this.cedula = cedula;
        this.cCod = cCod;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.fechaN = fechaN;
        this.telefono = telefono;
        this.Dirección = Dirección;
    }
    //getters y setters
    
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
    public String getDirección() {
        return Dirección;
    }
    public void setDirección(String Dirección) {
        this.Dirección = Dirección;
    }
   
}
