package programas_java;

public class Estudiante extends Persona{
    
    private int Edad;
    private boolean Inscrito;    

    public Estudiante() {
        super();
    }

    public Estudiante(String nombre, String ap_Materno, String ap_Paterno, String fecha_nacimiento, String cI,
            int telefono, String email, String fecha_registro, int edad, boolean inscrito) {
        super(nombre, ap_Materno, ap_Paterno, fecha_nacimiento, cI, telefono, email, fecha_registro);
        Edad = edad;
        Inscrito = inscrito;
    }
    public int getEdad() {
        return Edad;
    }
    public void setEdad(int edad) {
        Edad = edad;
    }
    public boolean isInscrito() {
        return Inscrito;
    }
    public void setInscrito(boolean inscrito) {
        Inscrito = inscrito;
    }

}
