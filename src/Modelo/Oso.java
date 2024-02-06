
package Modelo;

import Modelo.Animal;

public class Oso extends Animal implements Ursidos{
    
    public Oso(String nombre, int id, String clasificacion){
        super(nombre, id, clasificacion);
    }
    
    @Override
    public void alimentarse(){
        System.out.println("Un oso se alimenta de peces y bayas");
    }
    
    @Override
    public void gruñir(){
        System.out.println("Un oso gruñe");
    }
}
