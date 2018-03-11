package pkg111mil_ruleta;

public class Main extends MetodosSteve {
    
    public static void main(String[] args) {
        char operacion;
        int fichas;
        do{
            imprimir("Ingrese el codigo de la operacion, j para jugar o s para jugar un sola vez");
            operacion = tomarChar();
            fichas=menuPrincipal();
            
        }
        while(menuApuesta(operacion,fichas)==true);
        girarRuleta();
    }
    
    /**
     * Ofrece la posibilidad de jugar o salir
     * si inicia el juego toma la cantidad de dinero para 
     * cambiar por fichas(credito)
     * @return credito en cantidad de fichas.
     */
    public static int menuPrincipal(){
        int fichas;
        char jugada;
        int fichasJuego, numeroJuego, numerojuego2;
        imprimir("ingresar dinero a apostar:");
        fichas=tomarInt();
        imprimir("ingrese la apuesta q desea hacer:");
        imprimir("p- para apuesta pleno:");
        imprimir("d- para apuesta doble:");
        imprimir("c- para apuesta calle:");
        imprimir("e- para apuesta esquina:");
        imprimir("l- para apuesta linea:");
        imprimir("D- para apuesta docena:");
        imprimir("M- para apuesta mitad:");
        imprimir("C- para apuesta columna:");
        imprimir("P- para apuesta par impar");
        jugada=tomarChar();
        if(jugada=='p'){
            do{
                imprimir("ingrese cantidad de fichas a apostar:");
                fichasJuego=tomarInt();
            }while(fichasJuego<=0 || fichasJuego>fichas);
        
            fichas=fichas-fichasJuego;
            do{
                imprimir("ingrese numero a jugar:");
                numeroJuego=tomarInt();
            }while(numeroJuego<=0 || numeroJuego>36 );
            apuestaPleno(numeroJuego, fichasJuego);
        }else if(jugada=='d'){
            do{
                imprimir("ingrese cantidad de fichas a apostar:");
                fichasJuego=tomarInt();
            }while(fichasJuego<=0 || fichasJuego>fichas);
            fichas=fichas-fichasJuego;
            do{
            imprimir("ingrese numero a jugar:");
            numeroJuego=tomarInt();
            }while(numeroJuego<=0 || numeroJuego>36 );
            do{
                imprimir("ingrese el 2 numero a jugar:");
                numerojuego2=tomarInt(); 
            }while(numerojuego2<=0 || numerojuego2>36 && numerojuego2==numeroJuego);
            apuestaDoble(numeroJuego, numerojuego2, fichasJuego);
        
        }else if(jugada=='c'){
            do{
            imprimir("ingrese cantidad de fichas a apostar:");
            fichasJuego=tomarInt();
            }while(fichasJuego<=0 || fichasJuego>fichas);
            fichas=fichas-fichasJuego;
            do{
                imprimir("ingrese numero de calle a jugar:");
                numeroJuego=tomarInt();
            }while(numeroJuego<1 || numeroJuego>12);
            apuestaCalle(numeroJuego, fichasJuego);
        }else if(jugada=='e'){
             do{
                imprimir("ingrese cantidad de fichas a apostar:");
                fichasJuego=tomarInt();
            }while(fichasJuego<=0 || fichasJuego>fichas);
            fichas=fichas-fichasJuego;
            do{
                imprimir("ingrese numero de esquina a jugar:");
                numeroJuego=tomarInt();
            }while(numeroJuego<1 || numeroJuego>14);
            apuestaEsquina(numeroJuego, fichasJuego);
        }else if(jugada=='l'){
            do{
                imprimir("ingrese cantidad de fichas a apostar:");
                fichasJuego=tomarInt();
            }while(fichasJuego<=0 || fichasJuego>fichas);
            fichas=fichas-fichasJuego;
            do{
                imprimir("ingrese numero de linea a jugar:");
                numeroJuego=tomarInt();
            }while(numeroJuego<1 || numeroJuego>11);
            apuestaLinea(numeroJuego, fichasJuego);
        }else if(jugada=='D'){
            do{
                imprimir("ingrese cantidad de fichas a apostar:");
                fichasJuego=tomarInt();
            }while(fichasJuego<=0 || fichasJuego>fichas);
            fichas=fichas-fichasJuego;
            do{
                imprimir("ingrese numero de docena a jugar:");
                numeroJuego=tomarInt();
            }while(numeroJuego<1 || numeroJuego>3);
            apuestaDocena(numeroJuego, fichasJuego);
        }else if(jugada=='M'){
            do{
                imprimir("ingrese cantidad de fichas a apostar:");
                fichasJuego=tomarInt();
            }while(fichasJuego<=0 || fichasJuego>fichas);
            fichas=fichas-fichasJuego;
            do{
                imprimir("ingrese numero de mitad a jugar:");
                numeroJuego=tomarInt();
            }while(numeroJuego<1 || numeroJuego>2);
            apuestaMitad(numeroJuego, fichasJuego);
        }else if(jugada=='C'){
            do{
                imprimir("ingrese cantidad de fichas a apostar:");
                fichasJuego=tomarInt();
            }while(fichasJuego<=0 || fichasJuego>fichas);
            fichas=fichas-fichasJuego;
            do{
                imprimir("ingrese numero de columna a jugar:");
                numeroJuego=tomarInt();
            }while(numeroJuego<1 || numeroJuego>3);
            apuestaColumna(numeroJuego, fichasJuego);
        }else if(jugada=='P'){
            do{
                imprimir("ingrese cantidad de fichas a apostar:");
                fichasJuego=tomarInt();
            }while(fichasJuego<=0 || fichasJuego>fichas);
            fichas=fichas-fichasJuego;
            do{
                imprimir("ingrese numero de juego 1 para impar o 2 para par:");
                numeroJuego=tomarInt();
            }while(numeroJuego<1 || numeroJuego>2);
            if(numeroJuego==1){
                apuestaParImpar(true, fichasJuego);
            }else{
                apuestaParImpar(false, fichasJuego);
            }
        }
        return fichas;
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
     * @return 
     */
    public static boolean menuApuesta(char cadena,int fichas ){ 
        while(cadena!='j'&&cadena!='s'){
            imprimir("opcion erronea ingrese j para jugar o s para salir:");
            cadena=tomarChar();
        }
        if(cadena=='j'&& fichas>0){
            return true;
        }else{
           return false;
        
        }
 
        
    }
    
    public static int girarRuleta(){
        return -1;
    }
    
    public static int[] apuestaPleno(int numero, int cantFichas){
        return null;
    }
    
    public static int[] apuestaDoble(int numero1, int numero2, int cantFichas){
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
    public static int[] apuestaColumna(int columna, int cantFichas){
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
