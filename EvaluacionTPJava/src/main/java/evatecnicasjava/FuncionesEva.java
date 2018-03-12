/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evatecnicasjava;

/**
 *
 * @author steve-urbit
 */
public class FuncionesEva {
    /**
     * Resuelve una jugada de piedra papel o tijeras
     * las jugadas se codifican en un solo caracter (rock, paper, scissors):
     * 'r' -> piedra
     * 'p' -> papel
     * 's' -> tijera
     * @param jugada1 jugada realizada por el jugador nro. 1
     * @param jugada2 jugada realizada por el jugador nro. 2
     * @return devuelve 1 (uno) si gana la primer jugada, 
     * devuelve 2 (dos) si gana la segunda jugada,
     * devuelve 0 (cero) si hay en empate.
     */
    public static int jugarPiedraPapelOTijera(char jugada1, char jugada2){
        return 0;
    }
    
    /**
     * Calcula la ganancia obtenida por un plazo fijo
     * @param montoInicial valor del dinero utilizado para conformar el plazo fijo.
     * @param cantidadMeses duración del plazo fijo en cantidad de meses.
     * @param tasaInteresAnual interes anual ofrecido por el banco.
     * @return valor del dinero obtenido como ganancia al finalizar el plazo fijo.
     */
    public static float calculoGananciaPlazoFijo(
            float montoInicial, 
            int cantidadMeses,
            float tasaInteresAnual){
        return -1.0f;
    }
    
    /**
     * Calcula el índice de masa corporal de una persona en base a su peso y altura.
     * Tener en cuenta las unidades de medida.
     * @param pesoEnKg peso de la persona en kilogramos.
     * @param alturaEnMts altura de la persona en metros.
     * @return indice de masa corporal.
     */
    public static float indiceDeMasaCorporal(float pesoEnKg, float alturaEnMts){
        return -1.0f;
    }
    
    /**
     * Calcula el nivel de obesidad
     * 0 -> Bajo Peso
     * 1 -> Normal
     * 2 -> Sobrepeso
     * 3 -> Obesidad
     * @param indiceDeMasaCorporal
     * @return 
     */
    public static int estadoNutricionalOMS(float indiceDeMasaCorporal){
        return -1;
    }
    
    /**
     * Valida si un año es bisiesto. 
     * @param anio
     * @return
     */
    public static boolean esBisiesto(int anio){
        return false;
    }
}
