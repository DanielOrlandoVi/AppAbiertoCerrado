
package Modelo;

import Modelo.Animal;

public class Oso extends Animal implements Ursido{
    
    public Oso(String nombre, int id, String clasificacion){
        super(nombre, id, clasificacion);
    }
    
    @Override
    public String alimentarse(){
        return "Un oso se alimenta de peces y bayas";
    }
    
    @Override
    public String gruñir(){
        return "Un oso gruñe";
    }
}
