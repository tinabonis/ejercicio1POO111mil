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
    
    public static int[] apuestaCalle(int calle, int cantFichas){
        return null;
    }
    
    public static int[] apuestaLinea(int linea, int cantFichas){
        return null;
    }
    
    public static int[] apuestaDocena(int docena, int cantFichas){
        return null;
    }
    
    /**
     * Esta funciopn sirve para calcular las ganacias para una apuesta de mitad.
     * @param mitad
     * @param cantFichas
     * @return 
     */
    public static int[] apuestaMitad(int mitad, int cantFichas){
        int [] tablero=new int[37];
        int mitad1=1;
        int mitad2=2;
        if (mitad==1||mitad==2 ){ 
               
            if(mitad==mitad1){
            for(int i = 1; i <19 ; i++){
                tablero[i]=cantFichas*2;
            }
            }
            else if(mitad==mitad2){
                 for(int i = 19; i <37 ; i++){
                tablero[i]=cantFichas*2;
            }              
        }
        for (int i = 0; i < 37; i++) {
                imprimir(i+ " "+ tablero[i]);  
                }
    }
         else{
             imprimir("mitad incorrecta ");
            }
    return tablero;
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
