
package ejercicios;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import junit.framework.TestCase;

public class ConArregloDeCaracteresTests extends TestCase{
    
    public ConArregloDeCaracteresTests() {
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

    public void testCantidadDePalabras(){
            char[] oracion = {'A', ' ', 'E', ' ', 'I'};
            assertEquals(3,ConArregloDeCaracteres.cantidadPalabras(oracion));
    }
    /*
    public void testCantidadDePalabrasEspacioInicial(){
            char[] oracion = {' ','A', ' ', 'E', ' ', 'I'};
            assertEquals(3,ConArregloDeCaracteres.cantidadPalabras(oracion));
    }
    
    public void testCantidadDePalabrasEspacioFinal(){
            char[] oracion = {'A', ' ', 'E', ' ', 'I', ' '};
            assertEquals(3,ConArregloDeCaracteres.cantidadPalabras(oracion));
    }
    
    public void testCantidadDePalabrasEspaciosVarios(){
            char[] oracion = {'A', ' ', ' ', 'E', ' ',' ', 'I'};
            assertEquals(3,ConArregloDeCaracteres.cantidadPalabras(oracion));
    }
    */
    
    
    public void testPassword8LetrasOnly(){
            char[] pass = {'a','b','c','a','b','c','z','y'};
            assertTrue(!ConArregloDeCaracteres.validarPassword(pass));
    }

    public void testPassword8CharsFalse(){
            char[] pass = {'a','b','c','a','b','c'};
            assertTrue(!ConArregloDeCaracteres.validarPassword(pass));
    }

    public void testPasswordLetrasYArroba(){
            char[] pass = {'a','b','c','@','b','c','z','y'};
            assertTrue(!ConArregloDeCaracteres.validarPassword(pass));
    }

    public void testPasswordLetrasYNUmerosArroba(){
            char[] pass = {'a','b','c','@','1','2','z','y'};
            assertTrue(!ConArregloDeCaracteres.validarPassword(pass));
    }

    public void testPasswordValido(){
            char[] pass = {'a','b','c','1','2','c','z','y'};
            assertTrue(ConArregloDeCaracteres.validarPassword(pass));
    }
}
