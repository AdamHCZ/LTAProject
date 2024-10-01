package programas_java;

public class Curso {

    private String Nombre_curso;
    private String Aula;
    private int Horario;
    private int capacidad;
    private String fecha_inicio;
    private String fecha_final;
    private String Docente;
    private String Plataforma;


    public String getNombre_curso() {
        return Nombre_curso;
    }
    public void setNombre_curso(String nombre_curso) {
        Nombre_curso = nombre_curso;
    }
    public String getAula() {
        return Aula;
    }
    public void setAula(String aula) {
        Aula = aula;
    }
    public int getHorario() {
        return Horario;
    }
    public void setHorario(int horario) {
        Horario = horario;
    }
    public int getCapacidad() {
        return capacidad;
    }
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    public String getFecha_inicio() {
        return fecha_inicio;
    }
    public void setFecha_inicio(String fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }
    public String getFecha_final() {
        return fecha_final;
    }
    public void setFecha_final(String fecha_final) {
        this.fecha_final = fecha_final;
    }
    public String getDocente() {
        return Docente;
    }
    public void setDocente(String docente) {
        Docente = docente;
    }
    public String getPlataforma() {
        return Plataforma;
    }
    public void setPlataforma(String plataforma) {
        Plataforma = plataforma;
    }

    
    
}
