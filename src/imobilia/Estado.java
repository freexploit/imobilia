/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package imobilia;

/**
 *
 * @author christopher
 * Define estados de las propiedades
 */
public enum Estado {
    
    DESOCUPADA("Desocupada"),
    ALQUILADA("Alquilada"),
    REMODELANDO("Remodelando"),
    VENDIDA("Vendida");
    
    
    private String Estado="";
    Estado(String pEstado)
    {
        this.Estado=pEstado;
    }
}
