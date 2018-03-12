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
    
    
}
