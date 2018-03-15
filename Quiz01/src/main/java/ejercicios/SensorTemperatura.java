
package ejercicios;

/**
 *
 * @author steve-urbit
 */
public class SensorTemperatura {
    /**
     * Un sensor de temperatura realiza una medicion cada 2 minutos.
     * Con el objetivo de determinar cuanto tiempo tarda un sistema de
     * refrigeracion de presicion en alcanzar la temperatura deseada.
     * Esta funcion calcula la cantidad de minutos que le lleva al sistema
     * alcanzar la temperatura deseada con una tolerancia de 0.25˚C.
     * 
     * @param muestrasSensor arreglo de las muestras tomadas por el sensor.
     * @param temperaturaDeseada en ˚C.
     * @return cantidad de minutos 
     */
    public static int tiempoDeEstabilizacion(float[] muestrasSensor, float temperaturaDeseada){
        return -1;
    }
    
    /**
     * En ciertas ocaciones el sensor produce algunas muestras erroneas.
     * Que resultan estar a mas de 5˚C por encima o por debajo del promedio de 
     * las ultimas 3 muestras anteriores
     * Esta funcion elimina tales muestras erroneas.
     * 
     * @param muestrasSensor en 5˚C.
     * @return arreglo SIN muestras erroneas.
     * 
     */
    public static float[] quitarMuestrasErroneas(float[] muestrasSensor){
        return null;
    }
}
