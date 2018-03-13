/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evatecnicasjava;

import junit.framework.TestCase;
import java.io.*;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author andresteve07
 */
public class FuncionesEvaTests extends TestCase{
    
    public FuncionesEvaTests() {
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
    
    public void testPlazoFijo(){
        assertEquals(120.0f, FuncionesEva.calculoGananciaPlazoFijo(100.0f, 12, 0.2f));
    }
    
    public void testIMC(){
        assertEquals(31.25f, FuncionesEva.indiceDeMasaCorporal(80.0f, 1.6f));
    }
    
    public void testEstadoNutri(){
        assertEquals(2, FuncionesEva.estadoNutricionalOMS(27.5f));
    }
    
    public void testEsBisiestoCuandoCutroyNoCienTrue(){
        assertEquals(true, FuncionesEva.esBisiesto(2016));
    }
    
    public void testEsBisiestoCuandoCutroyNoCienFalse(){
        assertEquals(false, FuncionesEva.esBisiesto(200));
    }
    
    public void testEsBisiestoCuandoCutroyNoCienFalse2(){
        assertEquals(false, FuncionesEva.esBisiesto(300));
    }
    
    public void testEsBisiestoCuandoCuatrocientos(){
        assertEquals(true, FuncionesEva.esBisiesto(400));
    }
    
    public void testEsBisiestoCuandoCuatrocientos2(){
        assertEquals(true, FuncionesEva.esBisiesto(800));
    }
}
