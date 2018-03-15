
package ejercicios;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import junit.framework.TestCase;

public class OperacionesArreglosTests extends TestCase{
    public OperacionesArreglosTests() {
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
	
    public void testRemoverElemento(){
        int[] arregloOrig = new int[]{1,2,3,1,2,3};
        int[] arregloModif = OperacionesArreglos.removerElemento(arregloOrig, 2);
        boolean existe = false;

        for (int i = 0; i < arregloModif.length; i++) {
            if(arregloModif[i]==2){
                existe = true;
                break;
            }
        }
        assertTrue(arregloModif.length == 4 && !existe);
    }
    
    /*
    public void testRemoverElementoCuandoArregloNoContieneElemento(){
        int[] arregloOrig = new int[]{1,2,3,1,2,3};
        int[] arregloModif = OperacionesArreglos.removerElemento(arregloOrig, 5);
        
    }
    */
}
