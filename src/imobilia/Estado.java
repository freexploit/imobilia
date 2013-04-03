/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package imobilia;

import java.util.HashMap;
import java.util.Map;

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
    public String getFromOrdinal(int ordinal){
        if (this.ordinal()== ordinal)
        {return this.Estado;}
        else {return null;}
        
    }
    
}
