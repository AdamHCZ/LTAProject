package LTA;

public class Curso {

    private String Nombre_curso;
    private String Paralelo;
    private double Costo;
    private String Formato;
    private int Cupos;
    private String Gestion;
    private String Docente;
    private int Duracion;

    public Curso(String nombre_curso, String paralelo, double costo, String formato, int cupos, String gestion,
            String docente, int duracion) {
        Nombre_curso = nombre_curso;
        Paralelo = paralelo;
        Costo = costo;
        Formato = formato;
        Cupos = cupos;
        Gestion = gestion;
        Docente = docente;
        Duracion = duracion;
    }
    public String getNombre_curso() {
        return Nombre_curso;
    }
    public void setNombre_curso(String nombre_curso) {
        Nombre_curso = nombre_curso;
    }
    public String getParalelo() {
        return Paralelo;
    }
    public void setParalelo(String paralelo) {
        Paralelo = paralelo;
    }
    public double getCosto() {
        return Costo;
    }
    public void setCosto(double costo) {
        Costo = costo;
    }
    public String getFormato() {
        return Formato;
    }
    public void setFormato(String formato) {
        Formato = formato;
    }
    public int getCupos() {
        return Cupos;
    }
    public void setCupos(int cupos) {
        Cupos = cupos;
    }
    public String getGestion() {
        return Gestion;
    }
    public void setGestion(String gestion) {
        Gestion = gestion;
    }
    public String getDocente() {
        return Docente;
    }
    public void setDocente(String docente) {
        Docente = docente;
    }
    public int getDuracion() {
        return Duracion;
    }
    public void setDuracion(int duracion) {
        Duracion = duracion;
    }

    
    
}
