
package Modelo;

import Modelo.Felino;
import Modelo.Animal;


public class Leon extends Animal implements Felino{
    
    public Leon(String nombre, int id, String clasificacion){
        super(nombre, id, clasificacion);
    }   
    
    
    @Override 
    public String alimentarse(){
        return "El leon se alimenta de carne";
    }
    
    @Override
    public String ronronear(){
        return "Un leon ronronea";
    }
}
