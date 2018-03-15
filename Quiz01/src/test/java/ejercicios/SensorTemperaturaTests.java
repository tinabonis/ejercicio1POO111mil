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
    
    public void testTiempoEstabilizacion(){
        float[] muestras = {30.0f, 18.0f, 15.0f, 15.3f};
        assertEquals(6, SensorTemperatura.tiempoDeEstabilizacion(muestras, 15));
    }
}
