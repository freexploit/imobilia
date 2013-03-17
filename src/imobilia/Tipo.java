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
    EDIFICIO("EDIFICIO"),
    LOCAL("Local");
    
    
    private String tipo="";
    Tipo(String pTipo){
        this.tipo=pTipo;
    }
}
