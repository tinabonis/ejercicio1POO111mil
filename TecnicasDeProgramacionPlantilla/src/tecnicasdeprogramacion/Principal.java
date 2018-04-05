package tecnicasdeprogramacion;

import java.util.Random;
import java.util.Scanner;

public class Principal extends MetodosSteve{
    
    public static void main(String[] args) {
        
       Persona persona1 = new Persona();
       persona1.setName("juan");
       Mascota mascota1 = new Mascota("Toby", "Perro");
       persona1.setMascota(mascota1);
       
       
       imprimir("La mascota de "+persona1.getName()+" se llama "+persona1.getMascota().getNombre());

       persona1.pasearMascota();
       
       imprimir("El numero elegido por "+ persona1.getName() +" es "+persona1.elegirNum(10));
       
       
       
//imprimir(persona1.getMascota().getNombre());
       
    }
    
    /**
	 * ESTA FUNCION GENERA E IMPRIME UNA CANTIDAD DE NUMEROS ALEATORIOS SIN REPETIR, DEFINIDA POR PARAMETRO
	 * @param numero: Debe ser mayor que cero.
	 */
    public static void random (int numero) {
    
        /*
        VARIABLES
        */
    	int Max = 1000;
    	int arreglo[] = new int[Max];
        int i = 0;
        int temp = 0;
        int contador = 0;
        	
        // GENERACION DE ARREGLO
        for (i = 0 ; i < numero ; i++) {
        	arreglo[i] = 0;
        }
            
   
        // CICLO: ALMACENA LOS ELEMENTOS RANDOM EN EL ARREGLO
        for (i = 0 ; i < numero ; i++) {
                    
        // CICLO: REPITE LA GENERACION DE NUMEROS ALEATORIOS PARA EL ARREGLO
        // ITERA LA OPERACION HASTA ENCONTRAR UN NUMERO ALEATORIO QUE NO SE ENCUENTRE EN EL ARREGLO
        	do {
        		temp = numRandom(numero);
                if ( comprobar(temp, arreglo, numero) == -1 ) {
                	arreglo[i] = temp;
                    contador = 1;
                }
                else {
                	contador = 0;
                }
            } while (contador != 1);
                    
        }
    
            
        // IMPRESION DE LOS NUMEROS RANDOM
	    for (i = 0 ; i < numero ; i++) {
	    	System.out.print(arreglo[i] + " - ");
	    }
      
    }
    
    

	/**
	* ESTA FUNCION COMPRUEBA SI UN VALOR EXISTE O NO DENTRO DE UN ARREGLO
	* DEVUELVE -1 EN CASO DE QUE NO EXISTA, Y 0(CERO) EN CASO CONTRARIO
	* @param numero
	* @param arreglo
	* @param dimension
	* @return
	*/
	public static int comprobar (int numero, int arreglo[], int dimension) {
		/*
	 	* VARIABLES
		*/
		int i = 0;
		int contador = -1;
		        
		/*
		* CICLO: COMPARA CADA ELEMENTO DEL ARREGLO CON EL NUMERO PARAMETRO
		*/
		for (i = 0 ; i < dimension ; i++ ) {
			if (arreglo[i] == numero ) {
				contador = 0;
		    }
		}
		
		return contador;
	}
	    
	 
	 
	 
	 
	/**
	 * ESTA FUNCION DEVUELVE UN NUMERO RANDOM ENTRE 1 Y EL NUMERO PARAMETRO
	 * @param numIngresado
	 * @return
	 */
	public static int numRandom (int numIngresado) {
		int aleatorio = 0;
		Random nuevo = new Random();
		aleatorio = nuevo.nextInt(numIngresado) + 1;
		return (aleatorio);
	}
	
	

	
	 /**
	 * ESTA FUNCION SE ENCARGA DE VALIDAR NUMEROS.
	 * VERIFICA QUE EL NUMERO SE ENCUENTRE DENTRO DE CIERTO RANGO AL LLAMAR LA FUNCION
	 * * @param minimo: Es especificado al llamar a la función como primer parametro.
	 * @param maximo: Es especificado al llamar a la función como segundo parametro.
	 * @param peticion: Es la informacion del rango de validacion del numero.
	 * @author Agustin, Jose Luis.
	 * @return
	 */

	public static int validarNumero(int minimo, int maximo, String peticion) {
		/*
		 * INFO ADICIONAL:
		 * El contador i itera para analizar cada elemento de la cadena.
		 * El contador j almacena el numero de caracters validos, es decir que son numeros segun codigo ascii
		 * El contador h valida un signo negativo, valida las condiciones que debe poseer. 
		 */
		// VARIABLES
		Scanner scan = new Scanner(System.in);
		String cadena = "";
		int i = 0;
		int j = 0;
		int h = 0;
		int numero = 0;
		int valorAscii = 0;
			        
		// CICLO: EVALUA QUE EL NUMERO ESTE DENTRO DE UN RANGO PERMITIDO
		do {
			    	
			// CICLO: VERIFICA QUE CADA CARACTER DEL VALOR INGRESADO SEA UN NUMERO 
			do {	
				System.out.println (peticion);
			    cadena = scan.next();
			        
			    // CICLO: EVALUA CADA CODIGO ASCII DE CADA CARACTER DE LA CADENA INGRESADA
			    for (i = 0 ; i < cadena.length() ; i++) {
			    	valorAscii = (int) cadena.charAt(i);

			        if (valorAscii > 47 && valorAscii < 58) {
			        	j++;
			        }
			        
			        else if (i == 0 && h == 0 && valorAscii == 45) {
			        	j++;
			        	h++;
			        }
			        
			        else {
			        	System.out.println("Lo que ingreso no es correcto, ingrese un numero");
			            cadena = scan.next();
			            i = -1;
			            j = 0;
			            h = 0;
			        }
			    }
			} while (j != cadena.length());
			numero = Integer.parseInt(cadena);
			j = 0;
			h = 0;
		} while (numero < minimo || numero > maximo);
		
		return numero;
		
	}

}
