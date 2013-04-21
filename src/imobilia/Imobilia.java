/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package imobilia;

import java.util.ArrayList;
import java.util.EnumMap;
import javax.swing.JOptionPane;

/**
 *
 * @author christopher
 */
public class Imobilia {

    /**
     * @param args the command line arguments
     */
    
    
    
    
     public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }
   /* 
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        ArrayList<Propiedad> propiedades = new ArrayList<Propiedad>();
        ArrayList<Servicio> servicios = new ArrayList<Servicio>();
        int opc = 0;
        int opc1 = 0;
        while (opc != 5) {//Ciclo while para ejecución del programa
        try{
            //Presenta cuadro de diálogo de menus
            opc = Integer.parseInt(JOptionPane.showInputDialog("Menu de opciones ingrese\n 1) para ver las opciones de Clientes\n 2) ver las opciones de propiedades\n 3) ver las opciones de servicios\n 4) para opciones de reporteria\n 5) para salir"));
            switch (opc) {//Ciclo switch para menu de opciones
                case 1://
                    opc1 = 0;
                    while (opc1 != 3) {
                        opc1 = Integer.parseInt(JOptionPane.showInputDialog("Menu de Cliente ingrese\n 1) para ingresar un cliente\n 2) para ver los clientes\n 3) para salir"));
                        switch (opc1) {
                            case 1:
                                AgregarCliente(clientes);
                                break;
                            case 2:
                                if (!clientes.isEmpty()) {
                                    MostrarCliente(clientes);
                                } else {
                                    JOptionPane.showMessageDialog(null, "No Existen Clientes");
                                }
                                break;
                            case 3:
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Error al seleccionar opcion, vuelva a digitar por favor",
                                        "ERROR", JOptionPane.ERROR_MESSAGE);
                                break;

                        }
                    }
                    break;
                case 2://
                    opc1 = 0;
                    while (opc1 != 2) {
                        if(servicios.isEmpty()){JOptionPane.showMessageDialog(null, "no existen servicios asociados puede generar propiedades pero sin asociar servicios");
                        }
                        opc1 = Integer.parseInt(JOptionPane.showInputDialog("Menu de propiedades ingrese\n 1) para ingresar una propiedad nueva\n 2) para salir"));
                        switch (opc1) {
                            case 1:
                                if (!clientes.isEmpty()) {
                                    AgregarPropiedad(clientes, propiedades, servicios);
                                } else {
                                    JOptionPane.showMessageDialog(null, "Se necitan Clientes para poder agregar propiedades y no existen clientes por favor ingrese un cliente");
                                }

                                break;
                            case 2:
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Error al seleccionar opcion, vuelva a digitar por favor",
                                        "ERROR", JOptionPane.ERROR_MESSAGE);
                                break;
                        }
                    }
                    break;
                case 3://
                    opc1 = 0;
                    while (opc1 != 3) {
                        opc1 = Integer.parseInt(JOptionPane.showInputDialog("Menu de Servicios ingrese:\n 1) para agregar servicios\n 2) para ver servicios\n 3) para salir"));
                        switch (opc1) {
                            case 1:
                                AgregarServicio(servicios);
                                break;
                            case 2:
                                if (!servicios.isEmpty()) {
                                    MostrarServicios(servicios);
                                } else {
                                    JOptionPane.showMessageDialog(null, "No existen servicios");
                                }
                                break;
                            case 3:
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Error al seleccionar opcion, vuelva a digitar por favor",
                                        "ERROR", JOptionPane.ERROR_MESSAGE);
                                break;
                        }

                    }

                    break;
                case 4://
                    opc1 = 0;
                    while (opc1 != 5) {
                        opc1 = Integer.parseInt(JOptionPane.showInputDialog("Menu de Reporteria ingrese:\n 1) para un Reporte de propiedas alquiladas y su monto a pagar por servicios\n 2) para propiedades ocupadas\n 3) Reporte de propiedades por provincia\n 4) reporte de propiedades por rango de precio\n 5)para salir"));
                        switch (opc1) {
                            case 1:
                                ReporteMensual(clientes);
                                break;
                            case 2:
                                OcupiedOrDesocupied(propiedades);
                                break;
                            case 3:
                                ReporteXProvincia(propiedades);
                                break;
                            case 4:
                                ReporteXPrecio(propiedades);
                                break;
                            case 5:
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Error al seleccionar opcion, vuelva a digitar por favor",
                                        "ERROR", JOptionPane.ERROR_MESSAGE);
                                break;
                        }

                    }

                    break;

                case 5://En caso de ser la opcion seleccionada el 1 se dirige al método para salir del prg
                    JOptionPane.showMessageDialog(null, "Saliendo del programa",
                            "Salir", JOptionPane.INFORMATION_MESSAGE);
                    System.exit(0);
                    break;

                default://En caso de ser la opcion seleccionada erronea solicita nuevamente el numero.
                    JOptionPane.showMessageDialog(null, "Error al seleccionar opcion, vuelva a digitar por favor",
                            "ERROR", JOptionPane.ERROR_MESSAGE);
                    break;
            }
        
        }catch(Exception e){e.printStackTrace();}
        }


    }
*/
    public static void MostrarCliente(ArrayList clientes) {
        String Salida = "";
        for (int i = 0; i < clientes.size(); i++) {
            Cliente cliente1 = (Cliente) clientes.get(i);
            int c1 = cliente1.getcCod();
            String n1 = cliente1.getNombre();
            String n2 = cliente1.getApellido1();
            String n3 = cliente1.getApellido2();
            Salida += "\n" + "Nombre: " + n1 + " " + n2 + " " + n3 + " Codigo: " + c1;
        }
        JOptionPane.showMessageDialog(null, Salida);

    }

    private static int LlenarFecha(String Variable) {
        int vTemporal = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el " + Variable));
        return (vTemporal);
    }

    /**
     *
     */
    public static void AgregarCliente(ArrayList clientes) {
        try {
            String nNombre = JOptionPane.showInputDialog("ingrese nombre");
            String nApellido1 = JOptionPane.showInputDialog("ingrese apellido");
            String nApellido2 = JOptionPane.showInputDialog("ingrese segundo apellido");
            Long nCedula = Long.parseLong(JOptionPane.showInputDialog("ingrese cedula"));
            int nCCod;
            if (clientes.isEmpty()) {
                nCCod = 0;
            } else {
                nCCod = clientes.size();
            }//este codigo hay q verificarlo
            Fecha fecha1 = new Fecha(LlenarFecha("Mes de nacimiento"), LlenarFecha("Dia De Nacimiento"), LlenarFecha("Año"));
            long nTelefono = Long.parseLong(JOptionPane.showInputDialog("ingrese telefono"));
            String ndireccion = JOptionPane.showInputDialog("ingrese direccion");
            int nTipoCliente = Integer.parseInt(JOptionPane.showInputDialog("ingrese tipo cliente\n 1 para fisico\n 2 para juridico"));
            int nPeriodoPago = Integer.parseInt(JOptionPane.showInputDialog("ingrese periodo de pagos \n 1 para 30 dias\n 2 para 60 dias"));
            Cliente cliente1 = new Cliente(nCedula, nCCod, nNombre, nApellido1, nApellido2, fecha1, nTelefono, ndireccion, nTipoCliente, nPeriodoPago);
            clientes.add(cliente1);
        } catch (Exception e) {
            String toString = e.toString();
            System.out.println(toString);
        }

    }

    public static Cliente BuscarCliente(int nCCod, ArrayList clientes) {
        for (int i = 0; i < clientes.size(); i++) {
            Cliente usuario = (Cliente) clientes.get(i);
            if (String.valueOf(usuario.getcCod()).contains(String.valueOf(nCCod))) {
                return usuario;
            }
        }
        return null;
    }

    public static void AgregarPropiedad(ArrayList clientes, ArrayList propiedades, ArrayList servicios) {
        try {
            if (clientes.isEmpty()) {
                System.out.print("No Existen Clientes");
            } else {
                int nCodigoDePropiedad = Integer.parseInt(JOptionPane.showInputDialog("ingrese Codigo de Propiedad"));
                String nDescripcion = JOptionPane.showInputDialog("ingrese Descripcion");
                int nProvincia = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero de la provincia:\n 1)San Jose\n 2)Alajuela\n 3) Cartago\n 4) heredia\n 5) guanacaste\n 6) Puntarenas\n 7) Limon"));

                String nCanton = JOptionPane.showInputDialog("ingrese Canton");
                int nTipo = Integer.parseInt(JOptionPane.showInputDialog("ingrese:\n 1) para lote\n 2) para bodega\n 3) para casa\n 4) para edificio\n 5) para local"));
                MostrarCliente(clientes);
                int nCcod = Integer.parseInt(JOptionPane.showInputDialog("ingrese el Codigo de Cliente"));
                Cliente nCliente = BuscarCliente(nCcod, clientes);
                int nProposito = Integer.parseInt(JOptionPane.showInputDialog("ingrese Proposito:\n 1) vender\n 2) alquilar\n 3)eventos "));
                double nPrecio = Double.parseDouble(JOptionPane.showInputDialog("ingrese el valor de la propiedad"));
                if(!servicios.isEmpty()){
                MostrarServicios(servicios);
                Factura factura = new Factura();
                int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de servicios de la propiedad"));
                for (int i = 0; i < cantidad; i++) {
                    String sNombre = JOptionPane.showInputDialog("Ingrese el nombre exacto del servicio del servcio");
                    Servicio nServicio = BuscarServicios(sNombre, servicios);
                    factura.agregarServicio(nServicio);
                }
                nCliente.setFactura(factura);
                }
                else{JOptionPane.showMessageDialog(null,"no existen servicios");}
                int nEstado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el estado de la propiedad:\n 1)Desocupada 2)alquilada\n 3) remodelando\n 4) vendida\n"));
                double nTamanoDelTerreno = Double.parseDouble(JOptionPane.showInputDialog("ingrese Tamaño del terreno"));
                int nboolean = Integer.parseInt(JOptionPane.showInputDialog("ingrese:\n 1) si tiene construccion\n 2) si no tiene construccion"));
                double nTamanoConstruccion;
                boolean nTieneConstruccion;
                if (nboolean == 1) {
                    nTieneConstruccion = true;
                    nTamanoConstruccion = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el tamaño de la construccion"));
                } else {
                    nTieneConstruccion = false;
                    nTamanoConstruccion = 0.0;
                }
                
                Propiedad propiedad1 = new Propiedad(nCodigoDePropiedad, nDescripcion, Provincias(nProvincia), nCanton, Tipo(nTipo), nCliente, Proposito(nProposito), nPrecio, Estado(nEstado), nTamanoDelTerreno, nTieneConstruccion, nTamanoConstruccion);
                propiedades.add(propiedad1);
            }
        } catch (Exception e) {
        }
    }

    public static void AgregarServicio(ArrayList servicios) {
        try {
            String nNombre = JOptionPane.showInputDialog("Ingrese Nombre del Servicio");
            double nPrecioConsumo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Precio"));
            double nTarifaBasica = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Tarifa Basica"));
            String nProveedor = JOptionPane.showInputDialog("Ingrese nombre de  Proveedor");
            Servicio servicio1 = new Servicio(nNombre, nPrecioConsumo, nTarifaBasica, nProveedor);
            servicios.add(servicio1);
        } catch (Exception e) {
        }
    }

    public static Servicio BuscarServicios(String nNombre, ArrayList servicios) {
        for (int i = 0; i < servicios.size(); i++) {
            Servicio servicio = (Servicio) servicios.get(i);
            if (servicio.getNombre().contains(nNombre)) {
                return servicio;
            }
        }
        return null;
    }

    public static void MostrarServicios(ArrayList servicios) {
        String Salida = "";
        for (int i = 0; i < servicios.size(); i++) {
            Servicio servicio = (Servicio) servicios.get(i);
            String n1 = servicio.getNombre();
            Salida += "\n" + n1;
        }
        JOptionPane.showMessageDialog(null, Salida);
    }

    /* Metodos de reporteria */
    public static void ReporteMensual(ArrayList<Cliente> clientes){
        
        String s = "";
        
        if (!clientes.isEmpty())
        {
            for (int i = 0;i<clientes.size();i++)
            {
                
                for (Factura testing:clientes.get(i).getFacturasPorPagar())
                {
                   s+=clientes.get(i).getNombre()+" "+"debe pagar "+ testing.totalPorPagar()+" por los servicios que tienen asignados a sus propiedades\n";
                }
            }
            JOptionPane.showMessageDialog(null, s);
        }
    
    }
    
    public static void ReporteXProvincia(ArrayList propiedades) {
        String salida = "";


        if (!propiedades.isEmpty()) {
            for (int i = 0; i < propiedades.size(); i++) {
                Propiedad property = (Propiedad) propiedades.get(i);
                salida += "la propiedad con el codigo " + property.getCodigoPropiedad() + "esta  en la provincia" + property.getProvincia();
            JOptionPane.showMessageDialog(null, salida);
            }
        }
        else{JOptionPane.showMessageDialog(null, "no existen propiedades");
        }

    }

    public static void ReporteXPrecio(ArrayList<Propiedad> propiedades) {
        int precio_inicial=0;
        int precio_final=0;
        String s="Propiedades en el rango escogido:";
        try{
            precio_inicial = Integer.parseInt(JOptionPane.showInputDialog("ingrese precio minimo"));
            precio_final = Integer.parseInt(JOptionPane.showInputDialog("ingrese precio maximo"));
            for(int i=0;i<propiedades.size();i++)
            {
                if(propiedades.get(i).getPrecio()>precio_inicial && propiedades.get(i).getPrecio() < precio_final)
                {
                    s+=propiedades.get(i).getDescripcion()+"\n";
                }
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        JOptionPane.showMessageDialog(null, s);
    }

    public static void OcupiedOrDesocupied(ArrayList<Propiedad> propiedades) {
        String s="Propiedades:";
        for(int i=0;i<propiedades.size();i++)
        {
            if(propiedades.get(i).getEstado().equals(Estado.DESOCUPADA.getString())) 
            {
                s+=propiedades.get(i).getDescripcion()+": "+ propiedades.get(i).getEstado()+"\n";
            }
            else
            {
                    s+=propiedades.get(i).getDescripcion()+": "+"Ocupada\n";
            }
            JOptionPane.showMessageDialog(null, s);
        }
    
    }

    /* Metodos para los enums*/
    public static String Provincias(int i) {
        for (Provincias prov : Provincias.values()) {
            if (prov.getFromOrdinal(i) != null) {
                return prov.getFromOrdinal(i);
            }
        }
        return null;

    }

    public static String Estado(int i) {
        for (Estado est : Estado.values()) {
            if (est.getFromOrdinal(i) != null) {
                return est.getFromOrdinal(i);
            }
        }
        return null;

    }

    public static String Tipo(int i) {
        for (Tipo t : Tipo.values()) {
            if (t.getFromOrdinal(i) != null) {
                return t.getFromOrdinal(i);
            }
        }
        return null;

    }

    public static String Proposito(int i) {
        for (Proposito pro : Proposito.values()) {
            if (pro.getFromOrdinal(i) != null) {
                return pro.getFromOrdinal(i);
            }
        }
        return null;

    }
}
