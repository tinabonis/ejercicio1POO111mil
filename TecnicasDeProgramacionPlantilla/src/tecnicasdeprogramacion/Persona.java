/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tecnicasdeprogramacion;
import java.util.Random;

/**
 *
 * @author utku36
 */
public class Persona extends MetodosSteve {
    /**
     * CAMPOS
     */
    private String name;
    private String lastName;
    
    private int dni;
    private String pais;
    private Mascota mascota;
    
    /**
     * CONSTRUCTORES
     * @param name: No debe contener digitos.
     * @param lastName
     * @param dni
     * @param pais 
     */
    public Persona(String name, String lastName, int dni, String pais) {
        this.name = name;
        this.lastName = lastName;
        this.dni = dni;
        this.pais = pais;
    }

    public Persona() {
        name = "Tina";
        lastName = "Bonis";
        dni = 41153358;
        pais = "Argentina";
    }

    /**
     * METODOS DE RETORNO
     */
    public String getPais() {
        return pais;
    }   
    
    public String getName() {
        return name;
    }
    
    public int getDni() {
        return dni;
    }

    public String getLastName() {
        return lastName;
    }

    public Mascota getMascota() {
        return mascota;
    }
    
    public int elegirNum (int numero){
       Random numRandom = new Random();
       numRandom.nextInt(10);
        int numSelecc=0;
        numSelecc=numRandom.nextInt(10);
        
        
        
     return numSelecc;   
    }

    
    /**
     * METODOS DE DEFINICION 
     */
    public void setLastName(String lastName) {
        this.lastName = validar(lastName);
    }
    
    public void setDni(int dni) {
        this.dni = dni;
    }
    
    
    public void setName (String name){
       
        this.name = validar(name);
    }
    
    public void setPais(String pais){
        this.pais = pais;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }
    
    public void setPasearMascota(){;
       this.mascota= mascota;
    }
    
    /**
     * Otros metodos
     */
    public void pasearMascota () {
        
        
        imprimir( name + " está paseando a " + this.mascota.getNombre() );
    }
    
    private String validar (String nombrePropio){
        int i = 0;
        //48 57
        for(i = 0 ; i < nombrePropio.length(); i++) {
            if(nombrePropio.charAt(i) >= 48 && nombrePropio.charAt(i) <= 57) {
                nombrePropio = null;
                return nombrePropio;
            }
        }
                
           
        nombrePropio = nombrePropio.substring(0, 1).toUpperCase() + nombrePropio.substring(1);
        return nombrePropio;
    }
    
    
}

