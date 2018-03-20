/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import junit.framework.TestCase;

/**
 *
 * @author steve-urbit
 */
public class SensorTemperaturaTests extends TestCase{
    
    public SensorTemperaturaTests() {
        // we do not want the users to print something
        System.setOut(new PrintStream(new OutputStream() {
            @Override
            public void write(int b) throws IOException { }
        }));
        System.setErr(new PrintStream(new OutputStream() {
            @Override
            public void write(int b) throws IOException { }
        }));
    }
    //    public static float[] quitarMuestrasErroneas(float[] muestrasSensor)

    public void testTiempoEstabilizacion(){
        float[] muestras = {30.0f, 18.0f, 15.0f, 15.3f};
        assertEquals(6, SensorTemperatura.tiempoDeEstabilizacion(muestras, 15));
    }

        public void testQuitarMuestrasErroneas(){
            boolean ok=true;
        float[] muestras = {30.0f, 18.0f, 15.0f, 30.3f,50.0f, 10.0f, 30.0f};
        float[] resultadoEsperado= {30.0f, 18.0f, 15.0f, 30.0f};
        float[] resultadoObtenido=SensorTemperatura.quitarMuestrasErroneas(muestras);
            for (int i = 0; i < resultadoEsperado.length; i++) {
               if(resultadoEsperado[i]!=resultadoObtenido[i]){
                   ok=false;
               }     
            }
        assertEquals(ok,true);
    }

}
