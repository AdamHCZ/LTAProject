package programas_java;

public class Persona {

    private String Nombre;
    private String Ap_Materno;
    private String Ap_Paterno;
    private String Fecha_nacimiento;
    private String CI;
    private int Telefono;
    private String Email;
    private String Fecha_registro;

    public Persona() {
    }
    
    public Persona(String nombre, String ap_Materno, String ap_Paterno, String fecha_nacimiento, String cI,
            int telefono, String email, String fecha_registro) {
        Nombre = nombre;
        Ap_Materno = ap_Materno;
        Ap_Paterno = ap_Paterno;
        Fecha_nacimiento = fecha_nacimiento;
        CI = cI;
        Telefono = telefono;
        Email = email;
        Fecha_registro = fecha_registro;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public String getAp_Materno() {
        return Ap_Materno;
    }
    public void setAp_Materno(String ap_Materno) {
        Ap_Materno = ap_Materno;
    }
    public String getAp_Paterno() {
        return Ap_Paterno;
    }
    public void setAp_Paterno(String ap_Paterno) {
        Ap_Paterno = ap_Paterno;
    }
    public String getFecha_nacimiento() {
        return Fecha_nacimiento;
    }
    public void setFecha_nacimiento(String fecha_nacimiento) {
        Fecha_nacimiento = fecha_nacimiento;
    }
    public String getCI() {
        return CI;
    }
    public void setCI(String cI) {
        CI = cI;
    }
    public int getTelefono() {
        return Telefono;
    }
    public void setTelefono(int telefono) {
        Telefono = telefono;
    }
    public String getEmail() {
        return Email;
    }
    public void setEmail(String email) {
        Email = email;
    }
    public String getFecha_registro() {
        return Fecha_registro;
    }
    public void setFecha_registro(String fecha_registro) {
        Fecha_registro = fecha_registro;
    }
    
}