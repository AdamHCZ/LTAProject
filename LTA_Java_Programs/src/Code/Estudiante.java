package Code;

public class Estudiante extends Persona {
    private int Id_estudiante;
    private int Edad;
    private boolean Inscrito;

    public Estudiante(int Estudiante_Id, String Nombre, String Apellido_Paterno, String Apellido_Materno,
                      String Fecha_Nacimiento, String Ci, String Telefono, String Email, String Fecha_Registro, int Edad, boolean Inscrito) {
        super(Nombre, Apellido_Paterno, Apellido_Materno, Fecha_Nacimiento, Ci, Telefono, Email, Fecha_Registro);
        this.Id_estudiante = Estudiante_Id;
        this.Edad = Edad;
        this.Inscrito = Inscrito;
    }

    public Estudiante(String Nombre, String Apellido_Paterno, String Apellido_Materno, String Fecha_Nacimiento,
                      String Ci, String Telefono, String Email, String Fecha_Registro, int Edad, boolean Inscrito) {
        super(Nombre, Apellido_Paterno, Apellido_Materno, Fecha_Nacimiento, Ci, Telefono, Email, Fecha_Registro);
        this.Edad = Edad;
        this.Inscrito = Inscrito;
    }

    public Estudiante() {
    }

	public int getEdad() {
		return Edad;
	}

	public void setEdad(int edad) {
		Edad = edad;
	}

	public boolean getInscrito() {
		return Inscrito;
	}

	public void setInscrito(boolean inscrito) {
		Inscrito = inscrito;
	}

	public int getiId_estudiante() {
		return Id_estudiante;
	}

	public void setId_estudiante(int estudiante_Id) {
		Id_estudiante = estudiante_Id;
	}
}
