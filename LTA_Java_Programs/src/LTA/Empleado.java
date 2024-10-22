package LTA;

public class Empleado extends Persona {
    
    private double Sueldo;
    private String Direccion;
    private int Tiempo_experiencia;
    private String Detalles;


    public Empleado() {
        super();
    }
    public Empleado(String nombre, String ap_Materno, String ap_Paterno, String fecha_nacimiento, String cI,
            int telefono, String email, String fecha_registro, double sueldo, String direccion, int tiempo_experiencia,
            String detalles) {
        super(nombre, ap_Materno, ap_Paterno, fecha_nacimiento, cI, telefono, email, fecha_registro);
        Sueldo = sueldo;
        Direccion = direccion;
        Tiempo_experiencia = tiempo_experiencia;
        Detalles = detalles;
    }

    

}
