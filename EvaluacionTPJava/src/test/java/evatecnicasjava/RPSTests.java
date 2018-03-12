/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evatecnicasjava;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import java.io.*;
import junit.framework.TestCase;


/**
 *
 * @author andresteve07
 */
@RunWith(Parameterized.class)
public class RPSTests extends TestCase{
    
    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {     
                 { 'r', 'r', 0 },{ 'p', 'p', 0 },{ 's', 's', 0 }
                ,{ 'r', 's', 1 },{ 'p', 'r', 1 },{ 's', 'p', 1 }
                ,{ 's', 'r', 2 },{ 'r', 's', 2 },{ 'p', 'r', 2 }
           });
    }
    private char jugada1, jugada2;
    private int resultadoEsperado;
    
    public RPSTests(char jugada1, char jugada2, int resultadoEsperado){
        this.jugada1 = jugada1;
        this.jugada2 = jugada2;
        this.resultadoEsperado = resultadoEsperado;
    }
    
    @Test
    public void testJugadas(){
        assertEquals(this.resultadoEsperado,  FuncionesEva.jugarPiedraPapelOTijera(this.jugada1, this.jugada2));
    }
}
