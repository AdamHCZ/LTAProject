package Code;

public class Horario {
	private int Id_horario;
	private int Hora_id;
	private int Aula_id;
	private int Curso_id;
	
	public Horario() {
		
	}
	
	public Horario(int hora_id, int aula_id, int curso_id) {
		Hora_id = hora_id;
		Aula_id = aula_id;
		Curso_id = curso_id;
	}
	
	public Horario(int id_horario, int hora_id, int aula_id, int curso_id) {
		Id_horario = id_horario;
		Hora_id = hora_id;
		Aula_id = aula_id;
		Curso_id = curso_id;
	}
	public int getId_horario() {
		return Id_horario;
	}
	public void setId_horario(int id_horario) {
		Id_horario = id_horario;
	}
	public int getHora_id() {
		return Hora_id;
	}
	public void setHora_id(int hora_id) {
		Hora_id = hora_id;
	}
	public int getAula_id() {
		return Aula_id;
	}
	public void setAula_id(int aula_id) {
		Aula_id = aula_id;
	}
	public int getCurso_id() {
		return Curso_id;
	}
	public void setCurso_id(int curso_id) {
		Curso_id = curso_id;
	}
	
}