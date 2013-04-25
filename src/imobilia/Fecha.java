package imobilia;

import java.io.Serializable;

public class Fecha implements Serializable {

    private int mes = 0;  // 1-12
    private int dia = 0;    // 1-31 con base en el mes
    private int anio = 0;   // cualquier año

    // Se debe incluir constructor default
    public Fecha() {
    }

    // constructor no default: llama a comprobarMes para confirmar el valor 
    // apropiado de mes; llama a comprobarDia para confirmar el valor apropiado 
    //de dia 
    public Fecha(int elMes, int elDia, int elAnio) {
        mes = comprobarMes(elMes);   // validar mes
        anio = elAnio;                               // debe usted validar 					     // el anio
        dia = comprobarDia(elDia);       // validar día

        System.out.println("Constructor de objeto Fecha para la fecha " + aStringFecha());

    } // fin del constructor de Fecha

    // método utilitario para confirmar el valor apropiado 
    // del mes
    private int comprobarMes(int mesPrueba) {
        if (mesPrueba > 0 && mesPrueba <= 12) // valida mes
        {
            return mesPrueba;
        } else { // mes es inválido
            System.out.println("Mes inválido (" + mesPrueba
                    + ") se establece en 1.");
            return 1;  // mantener el objeto en estado consistente
        }
    } // fin del método comprobarMes

    // método utilitario para confirmar valor apropiado de
    // día, con base en mes y anio
    private int comprobarDia(int diaPrueba) {
        int diasPorMes[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // comprobar si el dia está dentro del rango del mes
        if (diaPrueba > 0 && diaPrueba
                <= diasPorMes[ mes]) {
            return diaPrueba;
        }

        // comprobar si es año bisiesto
        if (mes == 2 && diaPrueba == 29
                && (anio % 400 == 0
                || (anio % 4 == 0 && anio % 100 != 0))) {
            return diaPrueba;
        }

        System.out.println("Día inválido (" + diaPrueba + ") se establece en 1.");
        return 1;
        // mantener el objeto en estado consistente

    } // fin del método comprobarDia
    // devolver un String de la forma mes/día/año
    public String aStringFecha() {
        return mes + "/" + dia + "/" + anio;
    }
    
    public String getFecha() {
        return Integer.toString(mes) + "/" + Integer.toString(dia) + "/" + Integer.toString(anio);
    } 
} // fin de la clase Fecha