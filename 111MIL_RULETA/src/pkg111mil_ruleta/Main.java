package pkg111mil_ruleta;

import java.util.Random;

public class Main extends MetodosSteve {
    
    public static void main(String[] args) {
        char operacion;
        do{
            imprimirPanio();
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
        Random rn = new Random();
        int bola = rn.nextInt(37);
        return bola;
    }
    
    public static int[] apuestaPleno(int numero, int cantFichas){
       int [] arregloPleno = new int[37];
        for (int i=0;i<37;i++){
            if(numero==0){
                arregloPleno[0]=cantFichas*36;
            }
            else{
            if(numero==i){
                arregloPleno[i]=cantFichas*36;
            }
            }        
        }
        return arregloPleno;
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
    
    public static int[] apuestaMitad(int mitad, int cantFichas){
        return null;
    }
    
    public static int[] apuestaParImpar(boolean paridad, int cantFichas){
        int [] arregloParImpar = new int [37];
            
        if(paridad==true){
                for (int j = 1; j < 37; j++) {
                    if(j%2==0){
                        arregloParImpar[j]=cantFichas*2;
                    }
                    else {
                         arregloParImpar[j]=0;
                    }
                    
                }
            }
        else{
              for (int j = 1; j < 37; j++) {
                    if(j%2==1){
                        arregloParImpar[j]=cantFichas*2;
                    }
                    else {
                         arregloParImpar[j]=0;
                    }
        }
        }
        return arregloParImpar;
    
    }
    public static int calculoGanancia(int[] apuestas, int nroSorteado){
        return 0;
    }
    
    public static void imprimirPanio(){
                imprimir ("|    " + " 0 " + "   |");
                imprimir ("------------");
                imprimir ("| 1|" + "| 2|" + "| 3|");
                imprimir ("------------");
                imprimir ("| 4|" + "| 5|" + "| 6|");
                imprimir ("------------");
                imprimir ("| 7|" + "| 8|" + "| 9|");
                imprimir ("------------");
                imprimir ("|10|" + "|11|" + "|12|");
                imprimir ("------------");
                imprimir ("|13|" + "|14|" + "|15|");
                imprimir ("------------");
                imprimir ("|16|" + "|17|" + "|18|");
                imprimir ("------------");
                imprimir ("|19|" + "|20|" + "|21|");
                imprimir ("------------");
                imprimir ("|22|" + "|23|" + "|24|");
                imprimir ("------------");
                imprimir ("|25|" + "|26|" + "|27|");
                imprimir ("------------");
                imprimir ("|28|" + "|29|" + "|30|");
                imprimir ("------------");
                imprimir ("|31|" + "|32|" + "|33|");
                imprimir ("------------");
                imprimir ("|34|" + "|35|" + "|36|");
                imprimir ("------------");
               
                
                
     
    }
}
