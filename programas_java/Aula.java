package programas_java;

public class Aula {
    private String Nombre;
    private int Capacidad;

    public Aula(String nombre, int capacidad) {
        Nombre = nombre;
        Capacidad = capacidad;
    }
    
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public int getCapacidad() {
        return Capacidad;
    }
    public void setCapacidad(int capacidad) {
        Capacidad = capacidad;
    }

    
}
