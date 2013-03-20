/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package imobilia;

/**
 *
 * @author aleon
 */
public enum TipoCliente {
    /**
     *
     */
    Fisico ("Fisico"),
    juridico ("Bodega");

   
   private String tipoCliente="";
    TipoCliente(String pTipoCliente){
        this.tipoCliente=pTipoCliente; 
}
}
