/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package imobilia;

/**
 *
 * @author aleon
 */
public enum Provincias {

    SANJOSE("San Jose"),
    ALAJUELA("Alajuela"),
    CARTAGO("Cartago"),
    HEREDIA("Heredia"),
    GUANACASTE("Guanacaste"),
    PUNTARENAS("Puntarenas"),
    LIMON("Limon");
    
        private String Provincias="";
    Provincias(String Provincias){
        this.Provincias=Provincias;
    }
        public String getFromOrdinal(int ordinal){
        if (this.ordinal()== ordinal)
        {return this.Provincias;}
        else {return null;}
        
    }

}
