
package Vista;
import Modelo.Zoologico;
import Modelo.Leon;
import Modelo.Oso;
import Modelo.Zoologico;
import java.util.Scanner;

public class ObtenerDatos {
    private Scanner scanner;
    private Zoologico zoologico;

    public ObtenerDatos(Zoologico zoologico) {
        this.scanner = new Scanner(System.in);
        this.zoologico = zoologico;
    }

    public void obtenerDatos() {
        int opcion;
        
        do {
        System.out.println("Bienvenido al sistema de inventario de animales del zoologico: ");    
        System.out.println("Por favor, elige una opción:");
        System.out.println("1. Anadir leon");
        System.out.println("2. Anadir oso");
        System.out.println("3. Salir");
        
        opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                zoologico.agregarAnimal("Leon");
                break;
            case 2:
                zoologico.agregarAnimal("Oso");
                break;
            case 3:
                System.out.println("El numero de animales en el zoologico es: " + zoologico.getAnimales().size());
                break;
            default:
                System.out.println("Opcion no válida. Por favor, elige una opción del 1 al 3.");
                break;
        }
    } while (opcion != 3);
    }
}
