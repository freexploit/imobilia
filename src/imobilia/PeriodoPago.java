/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package imobilia;

/**
 *
 * @author aleon
 */
public enum PeriodoPago {
    
    Dias1 ("30 dias"),
    Dias2 ("60 dias");
     
    private String periodoPago="";
    PeriodoPago(String pTipoCliente){
        this.periodoPago=pTipoCliente; 
}
    
    
}
