
package Modelo;


public abstract class Animal {
    private String nombre;
    private int id;
    private String clasificacion;
    
    public Animal(String nombre, int id, String clasificacion){
        this.nombre = nombre;
        this.id = id;
        this.clasificacion = clasificacion;
    }
    //Todos los animales se alimentan, pero todos no de lo mismo
    public abstract void alimentarse();
    
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getId(){
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getClasificacion(){
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }
    
    
}
