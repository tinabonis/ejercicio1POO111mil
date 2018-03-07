package pkg111mil_ruleta;

public class Main extends MetodosSteve {
    
    public static void main(String[] args) {
        char operacion;
        do{
            imprimir("Ingrese el codigo de la operacion:");
            operacion = tomarChar();
        }
        while(menuApuesta());
    }
    
    /**
     * Ofrece la posibilidad de jugar o salir
     * si inicia el juego toma la cantidad de dinero para 
     * cambiar por fichas(credito)
     * @return credito en cantidad de fichas.
     */
    public static int menuPrincipal(){
        return 0;
    }
    
    /**
     * Gestiona las opciones de apuestas y gira la ruleta.
     * Imprimir las siguientes opciones:
     * p -> apuestaPleno
     * d -> apuestaDoble
     * c -> apuestaCalle
     * e -> apuestaEsquina
     * l -> apuestaLinea
     * D -> apuestaDocena
     * M -> apuestaMitad
     * C -> apuestaColumna
     * P -> apuestaParImpar
     * o -> apuestaColor
     * @return 
     */
    public static boolean menuApuesta(){
        return false;
    }
    
    public static int girarRuleta(){
        return -1;
    }
    
    public static int[] apuestaPleno(int numero, int cantFichas){
        return null;
    }
    
    public static int[] apuestaDoble(int numero1, int numero2, int cantFichas){
        boolean parEsValido=false;
        int i=0;
        int[][] tablero = {{1,2,3,100},{0,2,4,100},{0,1,3,5},{0,2,6,100},{1,5,7,100},
                           {2,4,6,8},{3,5,9,100},{4,8,10,100},{5,7,9,11},{6,8,12,100},
                           {7,11,13,100},{8,10,12,14},{9,11,15,100},{10,14,16,100},{11,13,15,17},
                           {12,14,18,100},{13,17,19,100},{14,16,18,20},{15,17,21,100},
                           {16, 20, 22, 100},{17, 19, 21, 23},{18, 20, 24, 100},{19, 23, 25, 100},
                           {20, 22, 24, 26},{21, 23, 27, 100},{22, 26, 28, 100},{23, 25, 27, 29},
                           {24, 26, 30, 100},{25, 29, 31, 100},{26, 28, 30, 32},{27, 29, 33, 100},
                           {28, 32, 34, 100},{29, 31, 33, 35},{30, 32, 36, 100},{31, 35, 100, 100},
                           {32, 34, 36, 100},{35, 33, 100, 100}};
       
        int[] apuestas = new int [37];
        for(i=0; i<4; i++){
            if(numero2==tablero[numero1][i]){
                parEsValido=true;
                break;
            }
        }
        if(parEsValido){
            apuestas[numero1]=cantFichas*18;
            apuestas[numero2]=cantFichas*18;
            imprimir(apuestas[numero1] + apuestas[numero2]);
        }else{
            imprimir("El par no es valido");
        }
        return apuestas;
    }
    
    public static int[] apuestaEsquina(int esquina, int cantFichas){
        return null;
    }
    
    public static int[] apuestaCalle(int calle, int cantFichas){
        return null;
    }
    
    public static int[] apuestaLinea(int linea, int cantFichas){
        return null;
    }
    
    public static int[] apuestaDocena(int docena, int cantFichas){
        return null;
    }
    
    public static int[] apuestaMitad(int mitad, int cantFichas){
        return null;
    }
    
    public static int[] apuestaParImpar(boolean paridad, int cantFichas){
        return null;
    }
    
    public static int calculoGanancia(int[] apuestas, int nroSorteado){
        return 0;
    }
    
    public static void imprimirPanio(){
        
    }
}
