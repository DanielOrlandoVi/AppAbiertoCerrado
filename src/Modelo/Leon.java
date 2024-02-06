
package Modelo;

import Modelo.Felino;
import Modelo.Animal;


public class Leon extends Animal implements Felino{
    
    public Leon(String nombre, int id, String clasificacion){
        super(nombre, id, clasificacion);
    }   
    
    
    @Override 
    public void alimentarse(){
        System.out.println("El leon se alimenta de carne");
    }
    
    @Override
    public void ronronear(){
        System.out.println("Un leon ronronea");
    }
}
