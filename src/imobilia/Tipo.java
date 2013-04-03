/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package imobilia;

/**
 *
 * @author christopher
 */
public enum Tipo {
    
    LOTE ("Lote"),
    BODEGA ("Bodega"),
    CASA("Casa"),
    EDIFICIO("Edificio"),
    LOCAL("Local");
    
    
    private String tipo="";
    Tipo(String pTipo){
        this.tipo=pTipo;
    }
        public String getFromOrdinal(int ordinal){
        if (this.ordinal()== ordinal)
        {return this.tipo;}
        else {return null;}
        
    }
}
