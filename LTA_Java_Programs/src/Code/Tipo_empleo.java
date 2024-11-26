package Code;

public class Tipo_empleo {
    private int Id_Tipo_Empleo;
    private String Nombre;
    private int Nivel;

    public Tipo_empleo(int Id_Tipo_Empleo, String Nombre, int Nivel) {
        this.Id_Tipo_Empleo = Id_Tipo_Empleo;
        this.Nombre = Nombre;
        this.Nivel = Nivel;
    }

    public Tipo_empleo(String Nombre, int Nivel) {
        this.Nombre = Nombre;
        this.Nivel = Nivel;
    }

    public Tipo_empleo() {
    }

	public int getId_Tipo_Empleo() {
		return Id_Tipo_Empleo;
	}

	public void setId_Tipo_Empleo(int id_Tipo_Empleo) {
		Id_Tipo_Empleo = id_Tipo_Empleo;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public int getNivel() {
		return Nivel;
	}

	public void setNivel(int nivel) {
		Nivel = nivel;
	}
}
