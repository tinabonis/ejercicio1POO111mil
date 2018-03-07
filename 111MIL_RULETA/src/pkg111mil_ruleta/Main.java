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
    
    public static int[] apuestaDoble(int numero, int cantFichas){
        return null;
    }
    
    public static int[] apuestaEsquina(int esquina, int cantFichas){
        return null;
    }
    
    /**
     * esta funcion sirve para apostar calles en ruleta.
     * @param calle valor admisible: 1 a 12
     * @param cantFichas
     * @return 
     */
    public static int[] apuestaCalle(int calle, int cantFichas){
        
        int i = 0;
        int apuestas[] = new int[37];
        
      
        int contadorNum[] = new int[12];
        contadorNum[1] = 0;
        for (i = 2 ; i < 12 ; i++) {
            contadorNum[i] = 2*(i - 1);
        }
        
        for (i = calle + contadorNum[calle] ; i <= (calle + contadorNum[calle] + 2) ; i++ ) {
            apuestas[i] = (12 * cantFichas);
        }
        
        return apuestas;
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
