/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizarreglos;

/**
 *
 * @author steve-urbit
 */
public class Ahorcado {
    public static char[] resultadoJugada(char[] palabraOriginal, char letra){
        char[] resultadoJugada = new char[palabraOriginal.length];
        for(int indice=0; indice<resultadoJugada.length; indice++){
            resultadoJugada[indice]='_';
            if(palabraOriginal[indice]==letra){
                resultadoJugada[indice]=letra;
            }
        } 
        return resultadoJugada;
    }
    public static boolean validarJugada(char[] jugadasAnteriores, char[] nuevaJugada){
        for(int i=0; i<jugadasAnteriores.length; i++){
            if(jugadasAnteriores[i]=='_'&&nuevaJugada[i]!='_'){
                return true;
                
            }
        }
        return false;
    }
}
