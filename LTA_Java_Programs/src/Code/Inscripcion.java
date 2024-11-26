package Code;

public class Inscripcion {
    private int Id_Inscripcion;
    private int Curso_Id;
    private int Horario_Id;
    private int Estudiante_Id;


    public Inscripcion(int Id_Inscripcion, int Curso_Id, int Horario_Id, int Estudiante_Id) {
        this.Id_Inscripcion = Id_Inscripcion;
        this.Curso_Id = Curso_Id;
        this.Horario_Id = Horario_Id;
        this.Estudiante_Id = Estudiante_Id;
    }

    public Inscripcion(int Curso_Id, int Horario_Id, int Estudiante_Id) {
        this.Curso_Id = Curso_Id;
        this.Horario_Id = Horario_Id;
        this.Estudiante_Id = Estudiante_Id;
    }

    public Inscripcion() {
    }


	public int getId_Inscripcion() {
		return Id_Inscripcion;
	}


	public void setId_Inscripcion(int id_Inscripcion) {
		Id_Inscripcion = id_Inscripcion;
	}


	public int getCurso_Id() {
		return Curso_Id;
	}


	public void setCurso_Id(int curso_Id) {
		Curso_Id = curso_Id;
	}


	public int getHorario_Id() {
		return Horario_Id;
	}


	public void setHorario_Id(int horario_Id) {
		Horario_Id = horario_Id;
	}


	public int getEstudiante_Id() {
		return Estudiante_Id;
	}


	public void setEstudiante_Id(int estudiante_Id) {
		Estudiante_Id = estudiante_Id;
	}
}
