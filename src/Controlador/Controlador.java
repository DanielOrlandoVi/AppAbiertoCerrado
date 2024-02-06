
package Controlador;
import Modelo.Leon;
import Modelo.Zoologico;
import Vista.ObtenerDatos;

public class Controlador {

    public static void main(String[] args) {
        
        Zoologico zoo = new Zoologico();
        
        System.out.println("Bienvenido al sistema de inventario de animales del zoologico: " + zoo.getNombreZoo());
        
        ObtenerDatos datos = new ObtenerDatos(zoo);
        datos.obtenerDatos(); // Llama al método obtenerDatos() para comenzar a obtener los datos del usuario.
        
        
        System.out.println("Animales en el zoológico: ");
        
        //Imprime los animales del zoologico
        for (String animal : zoo.getAnimales()) {
            System.out.println(animal);
        }
       
        
    }
    
}
