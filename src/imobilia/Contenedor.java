/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package imobilia;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author christopher
 */
public class Contenedor implements Serializable{
    
    
    private ArrayList<Cliente> clientes = null;
    private ArrayList<Propiedad> propiedades = null;
    private ArrayList<Servicio> servicios = null;
    
    public Contenedor(ArrayList<Cliente> pClientes, ArrayList<Propiedad> pPropiedades, ArrayList<Servicio> pServicios){
        clientes=pClientes;
        propiedades=pPropiedades;
        servicios=pServicios;
    }
    public Contenedor(){}
    public ArrayList<Cliente> getClientes(){
        return clientes;
    }
    public ArrayList<Propiedad> getPropiedades(){
        return propiedades;
    }
    public ArrayList<Servicio> getServicios(){
        return servicios;
    }
    
}
