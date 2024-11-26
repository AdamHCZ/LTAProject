package Code;

public class Factura {
    private int Id_Factura;
    private String Nombre;
    private String Ci;
    private int Inscripcion_Id;

    public Factura(int Id_Factura, String Nombre, String Ci, int Inscripcion_Id) {
        this.Id_Factura = Id_Factura;
        this.Nombre = Nombre;
        this.Ci = Ci;
        this.Inscripcion_Id = Inscripcion_Id;
    }

    public Factura(String Nombre, String Ci, int Inscripcion_Id) {
        this.Nombre = Nombre;
        this.Ci = Ci;
        this.Inscripcion_Id = Inscripcion_Id;
    }

    public Factura() {
    }

	public int getId_Factura() {
		return Id_Factura;
	}

	public void setId_Factura(int id_Factura) {
		Id_Factura = id_Factura;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getCi() {
		return Ci;
	}

	public void setCi(String ci) {
		Ci = ci;
	}

	public int getInscripcion_Id() {
		return Inscripcion_Id;
	}

	public void setInscripcion_Id(int inscripcion_Id) {
		Inscripcion_Id = inscripcion_Id;
	}
}
