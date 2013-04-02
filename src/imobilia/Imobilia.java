/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package imobilia;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author christopher
 */
public class Imobilia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        ArrayList<Propiedad> propiedades = new ArrayList<Propiedad>();
        ArrayList<Servicio> servicios = new ArrayList<Servicio>();


    }

    public static String MostrarCliente(ArrayList clientes) {
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
        return Salida;
    }

    private static int LlenarFecha(String Variable) {
        int vTemporal = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el " + Variable));
        return (vTemporal);
    }

    /**
     *
     */
    public void AgregarCliente(ArrayList clientes) {
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

    public void AgregarPropiedad(ArrayList clientes, ArrayList propiedades) {
        try {
            if (clientes.isEmpty()) {
                System.out.print("No Existen Clientes");
            } else {
                int nCodigoDePropiedad = Integer.parseInt(JOptionPane.showInputDialog("ingrese Coddigo de Propiedad"));
                String nDescripcion = JOptionPane.showInputDialog("ingrese Descripcion");
                int nProvincia = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero de la provincia:\n 1)San Jose\n 2)Alajuela\n 3) Cartago\n 4) heredia\n 5) guanacaste\n 6) Puntarenas\n 7) Limon"));
                String nCanton = JOptionPane.showInputDialog("ingrese Canton");
                int nTipo = Integer.parseInt(JOptionPane.showInputDialog("ingrese:\n 1) para lote\n 2) para bodega\n 3) para casa\n 4) para edificio\n 5) para local"));
                MostrarCliente(null);
                int nCcod = Integer.parseInt(JOptionPane.showInputDialog("ingrese el Codigo de Cliente"));
                Cliente nCliente = BuscarCliente(nCcod, null);
                int nProposito = Integer.parseInt(JOptionPane.showInputDialog("ingrese Proposito:\n 1) vender\n 2) alquilar\n 3) "));
                double nPrecio = Double.parseDouble(JOptionPane.showInputDialog("ingrese el valor de la propiedad"));
                MostrarServicios(null);
                int cantidad = Integer.parseInt("Ingrese la cantidad de servicios de la propiedad");
                ArrayList nServicios = new ArrayList();
                for (int i = 0; i < cantidad; i++) {
                    String sNombre = JOptionPane.showInputDialog("Ingrese el nombre exacto del servicio del servcio");
                    Servicio nServicio = BuscarServicios(sNombre, null);
                    nServicios.add(nServicio);
                }
                int nEstado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el estado de la propiedad:\n 1) alquilada\n 2) remodelando\n 3) vendida"));
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
                Propiedad propiedad1 = new Propiedad(nCodigoDePropiedad, nDescripcion, nProvincia, nCanton, nTipo, nCliente, nProposito, nPrecio, nServicios, nEstado, nTamanoDelTerreno, nTieneConstruccion, nTamanoConstruccion);
                propiedades.add(propiedad1);
            }
        } catch (Exception e) {
        }
    }

    public void AgregarServicio(ArrayList servicios) {
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

    public Servicio BuscarServicios(String nNombre, ArrayList servicios) {
        for (int i = 0; i < servicios.size(); i++) {
            Servicio servicio = (Servicio) servicios.get(i);
            if (servicio.getNombre().contains(nNombre)) {
                return servicio;
            }
        }
        return null;
    }

    public static String MostrarServicios(ArrayList servicios) {
        String Salida = "";
        for (int i = 0; i < servicios.size(); i++) {
            Servicio servicio = (Servicio) servicios.get(i);
            String n1 = servicio.getNombre();
            Salida += "\n" + n1;
        }
        JOptionPane.showMessageDialog(null, Salida);
        return Salida;
    }

    public static String ReporteXProvincia(Provincias pProvincia, ArrayList propiedades, String pCriteriousqueda) {
        String salida="";
        

        if (!propiedades.isEmpty()) {
            for (int i = 0; i < propiedades.size(); i++) {
                Propiedad property = (Propiedad) propiedades.get(i);
                switch (pProvincia) {
                    case SANJOSE:
                        if (property.getProvincia()==1) {
                            int ccod = property.getCodigoPropiedad();
                            salida += "la propiedad con el codigo " + ccod + " en la provincia San Jose";
                        }
                        break;
                    case ALAJUELA:
                        if (property.getProvincia()==2) {
                                                        int ccod = property.getCodigoPropiedad();
                            salida += "la propiedad con el codigo " + ccod + " en la provincia San Jose";

                        }
                        break;

                    case CARTAGO:
                        if (property.getProvincia()==3) {
                            int ccod = property.getCodigoPropiedad();
                            salida += "la propiedad con el codigo " + ccod + " en la provincia San Jose";

                        }
                        break;

                    case HEREDIA:
                        if (property.getProvincia()==4) {
                            int ccod = property.getCodigoPropiedad();
                            salida += "la propiedad con el codigo " + ccod + " en la provincia San Jose";

                        }
                        break;

                    case GUANACASTE:
                        if (property.getProvincia()==5) {
                            int ccod = property.getCodigoPropiedad();
                            salida += "la propiedad con el codigo " + ccod + " en la provincia San Jose";

                        }
                        break;
                    case PUNTARENAS:
                        if (property.getProvincia()==6) {
                            int ccod = property.getCodigoPropiedad();
                            salida += "la propiedad con el codigo " + ccod + " en la provincia San Jose";

                        }
                        break;
                    case LIMON:
                        if (property.getProvincia()==7) {
                            int ccod = property.getCodigoPropiedad();
                            salida += "la propiedad con el codigo " + ccod + " en la provincia San Jose";

                        }
                        break;

                }
            }
        }
        return salida;
    }
    public static String ReporteXPrecio(ArrayList propiedades){return null;}
    public static String OcupiedOrDesocupied(ArrayList propiedades){return null;}
    
}
