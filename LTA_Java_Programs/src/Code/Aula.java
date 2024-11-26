package Code;

public class Aula {
	private int Id_aula;
    private String Nombre_aula;
    private int Capacidad;
    private boolean Disponibilidad;

    public Aula() {
		super();
	}
    
    public Aula(int id_aula, String nombre, int capacidad, boolean disponibilidad) {
		super();
		Id_aula = id_aula;
		Nombre_aula = nombre;
		Capacidad = capacidad;
		Disponibilidad = disponibilidad;
	}

    public Aula(String nombre, int capacidad, boolean disponibilidad) {
		super();
		Nombre_aula = nombre;
		Capacidad = capacidad;
		Disponibilidad = disponibilidad;
	}

	public String getNombre_aula() {
        return Nombre_aula;
    }
    public void setNombre_aula(String nombre) {
        Nombre_aula = nombre;
    }
    public int getCapacidad() {
        return Capacidad;
    }
    public void setCapacidad(int capacidad) {
        Capacidad = capacidad;
    }

	public int getId_aula() {
		return Id_aula;
	}

	public void setId_aula(int id_aula) {
		Id_aula = id_aula;
	}

	public boolean getDisponibilidad() {
		return Disponibilidad;
	}

	public void setDisponibilidad(boolean disponibilidad) {
		Disponibilidad = disponibilidad;
	}
    
}
