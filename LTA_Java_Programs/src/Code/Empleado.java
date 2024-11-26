package Code;

public class Empleado extends Persona {
    private int Id_empleado;
    private double Sueldo;
    private String Ubicacion;
    private String Experiencia;
    private String Detalles;
    private int Tipo_Empleo_Id;

    public Empleado(int Empleado_Id, String Nombre, String Apellido_Paterno, String Apellido_Materno,
                    String Fecha_Nacimiento, String Ci, String Telefono, String Email, String Fecha_Registro,
                    double Sueldo, String Ubicacion, String Experiencia, String Detalles, int Tipo_Empleo_Id) {
        super(Nombre, Apellido_Paterno, Apellido_Materno, Fecha_Nacimiento, Ci, Telefono, Email, Fecha_Registro);
        this.Id_empleado = Empleado_Id;
        this.Sueldo = Sueldo;
        this.Ubicacion = Ubicacion;
        this.Experiencia = Experiencia;
        this.Detalles = Detalles;
        this.Tipo_Empleo_Id = Tipo_Empleo_Id;
    }

    public Empleado(String Nombre, String Apellido_Paterno, String Apellido_Materno, String Fecha_Nacimiento,
                    String Ci, String Telefono, String Email, String Fecha_Registro, double Sueldo, String Ubicacion,
                    String Experiencia, String Detalles, int Tipo_Empleo_Id) {
        super(Nombre, Apellido_Paterno, Apellido_Materno, Fecha_Nacimiento, Ci, Telefono, Email, Fecha_Registro);
        this.Sueldo = Sueldo;
        this.Ubicacion = Ubicacion;
        this.Experiencia = Experiencia;
        this.Detalles = Detalles;
        this.Tipo_Empleo_Id = Tipo_Empleo_Id;
    }

    public Empleado() {
    }

	public double getSueldo() {
		return Sueldo;
	}

	public void setSueldo(double sueldo) {
		Sueldo = sueldo;
	}

	public String getUbicacion() {
		return Ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		Ubicacion = ubicacion;
	}

	public String getExperiencia() {
		return Experiencia;
	}

	public void setExperiencia(String experiencia) {
		Experiencia = experiencia;
	}

	public String getDetalles() {
		return Detalles;
	}

	public void setDetalles(String detalles) {
		Detalles = detalles;
	}

	public int getTipo_Empleo_Id() {
		return Tipo_Empleo_Id;
	}

	public void setTipo_Empleo_Id(int tipo_Empleo_Id) {
		Tipo_Empleo_Id = tipo_Empleo_Id;
	}

	public int getId_empleado() {
		return Id_empleado;
	}

	public void setId_empleado(int empleado_Id) {
		Id_empleado = empleado_Id;
	}
}
