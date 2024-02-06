
package Modelo;

import java.util.ArrayList;
import java.util.List;


public class Zoologico {
    private String nombrezoo = "Vida Salvaje";
    private List<String> animales;
    
    //En esta lista se guardan los animales
    public Zoologico() {
        this.animales = new ArrayList<>();
    }
    
    public String getNombreZoo(){
        return nombrezoo;
    }
    
    public void agregarAnimal(String animal) {
        this.animales.add(animal);
    }

    public List<String> getAnimales() {
        return animales;
    }
        
}
