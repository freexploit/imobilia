/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package imobilia;

import imobilia.Servicio;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author christopher
 */
public class Factura {
    //Estado factura
    
    private boolean pagada= false;
    private ArrayList<Servicio> servicios = new ArrayList<Servicio>();
    private Date fecha_creacion = null;
    private Date fecha_vencimiento = null;
    
    public Factura(){
        //inicia las fechas 
        Calendar c = new GregorianCalendar();
        fecha_creacion = c.getTime();
        fecha_vencimiento = fecha_vencimiento();
        
    }
    
    //retorna un objecto Date con la fecha de vencimiento de la factura (final de mes)
    private  Date fecha_vencimiento()
    {
        Calendar c = new GregorianCalendar();
        c.getActualMaximum(Calendar.DAY_OF_MONTH);
               
         Date fv = c.getTime();
         return fv;
    }
    
    public void pagarFactura(){
        this.pagada=true;
    }
    public boolean esPagada(){
    
        return true;
    }
    
    public boolean agregarServicio(Servicio serv)
    {
        if (serv instanceof Servicio)
        {
            return servicios.add(serv);
        }
        else 
        {
            return false;
        }
        }
    
    public double totalPorPagar(){
        if(this.servicios.size()>0)
        {
            double porPagar=0.0;
            for(Servicio s : this.servicios)
            {
                porPagar+=s.getPrecioConsumo();
            }
            return porPagar;
        }
        else{
            return 0;
        }
            
    }
    

   

}
