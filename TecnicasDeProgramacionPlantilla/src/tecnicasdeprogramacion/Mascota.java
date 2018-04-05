/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tecnicasdeprogramacion;

/**
 *
 * @author utku36
 */
public class Mascota extends MetodosSteve {
    
    /**
     * CAMPOS
     */
    private String animal;
    private String nombre;

    public Mascota() {
        this.nombre = "Toby";
        this.animal = "Perro";
    }
    
    public Mascota (String nombre, String animal){
        this.nombre = nombre;
        this.animal = animal;
    }

    public String getNombre() {
        return nombre;
    }
    
    
    public void ladrar (){
        imprimir ("Guau!");
    }
    
    
}
