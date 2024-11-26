package Code;

public class Curso {
	
	private int Id_curso;
	private String Paralelo;
    private double Costo;
    private String Formato;
    private int Cupos;
    private String Gestion;
    private int Docente_id;//id de trabajador con el nombre de docente
    private int Duracion;//Horas academicas
    private int Plan_curricular_id;
    
    public Curso() {

    }
    
    public Curso(int id_curso, String paralelo, double costo, String formato, int cupos, String gestion,
            int docente, int duracion, int plan_curricular_id) {
    	Id_curso = id_curso;
        Paralelo = paralelo;
        Costo = costo;
        Formato = formato;
        Cupos = cupos;
        Gestion = gestion;
        Docente_id = docente;
        Duracion = duracion;
        Plan_curricular_id = plan_curricular_id;
    }
    
    public Curso(String paralelo, double costo, String formato, int cupos, String gestion,
            int docente, int duracion, int plan_curricular_id) {
        Paralelo = paralelo;
        Costo = costo;
        Formato = formato;
        Cupos = cupos;
        Gestion = gestion;
        Docente_id = docente;
        Duracion = duracion;
        Plan_curricular_id = plan_curricular_id;
    }

    public int getId_curso() {
		return Id_curso;
    }
	public void setId_curso(int id_curso) {
		Id_curso = id_curso;
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
    public int getDocente_id() {
        return Docente_id;
    }
    public void setDocente_id(int docente) {
        Docente_id = docente;
    }
    public int getDuracion() {
        return Duracion;
    }
    public void setDuracion(int duracion) {
        Duracion = duracion;
    }
	public int getPlan_curricular_id() {
		return Plan_curricular_id;
	}
	public void setPlan_curricular_id(int plan_curricular_id) {
		Plan_curricular_id = plan_curricular_id;
	}
    
    
}
