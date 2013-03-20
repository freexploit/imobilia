/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package imobilia;

/**
 *
 * @author christopher
 */
public enum Proposito {
    
    VENDER("Vender"),
    ALQUILAR("Alquilar"),
    EVENTOS("Eventos");
    
    private String proposito="";
    Proposito(String pProposito)
    {
        this.proposito=pProposito;
    }
    
}
