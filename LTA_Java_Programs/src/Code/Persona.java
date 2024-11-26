package Code;

public class Persona {
    private String Nombre;
    private String Ap_Paterno;
    private String Ap_Materno;
    private String Fecha_Nacimiento;
    private String Ci;
    private String Telefono;
    private String Email;
    private String Fecha_Registro;

    public Persona(String Nombre, String Apellido_Paterno, String Apellido_Materno, String Fecha_Nacimiento,
                   String Ci, String Telefono, String Email, String Fecha_Registro) {
        this.Nombre = Nombre;
        this.Ap_Paterno = Apellido_Paterno;
        this.Ap_Materno = Apellido_Materno;
        this.Fecha_Nacimiento = Fecha_Nacimiento;
        this.Ci = Ci;
        this.Telefono = Telefono;
        this.Email = Email;
        this.Fecha_Registro = Fecha_Registro;
    }

    public Persona() {
    }

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getAp_Paterno() {
		return Ap_Paterno;
	}

	public void setAp_Paterno(String ap_Paterno) {
		Ap_Paterno = ap_Paterno;
	}

	public String getAp_Materno() {
		return Ap_Materno;
	}

	public void setAp_Materno(String ap_Materno) {
		Ap_Materno = ap_Materno;
	}

	public String getFecha_Nacimiento() {
		return Fecha_Nacimiento;
	}

	public void setFecha_Nacimiento(String fecha_Nacimiento) {
		Fecha_Nacimiento = fecha_Nacimiento;
	}

	public String getCi() {
		return Ci;
	}

	public void setCi(String ci) {
		Ci = ci;
	}

	public String getTelefono() {
		return Telefono;
	}

	public void setTelefono(String telefono) {
		Telefono = telefono;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getFecha_Registro() {
		return Fecha_Registro;
	}

	public void setFecha_Registro(String fecha_Registro) {
		Fecha_Registro = fecha_Registro;
	}
}
