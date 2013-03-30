/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package imobilia;

/**
 *
 * @author christopher
 * Define tipos de bien raiz
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
}
