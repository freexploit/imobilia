/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package imobilia;

/**
 *
 * @author christopher
 * Define propositos
 * 
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
    public String getFromOrdinal(int ordinal){
        if (this.ordinal()== ordinal)
        {return this.proposito;}
        else {return null;}
        
    }
    
}
