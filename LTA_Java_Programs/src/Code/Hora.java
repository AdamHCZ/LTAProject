package Code;

public class Hora {
	private int Id_hora;
    private String Dia;
    private String Hora_entrada;
    private String Hora_fin;

    public Hora() {
		
	}

	public Hora(int horaID, String dia, String hora_entrada, String hora_fin) {
		super();
		Id_hora = horaID;
		Dia = dia;
		Hora_entrada = hora_entrada;
		Hora_fin = hora_fin;
	}

	public Hora(String dia, String hora_entrada, String hora_fin) {
        Dia = dia;
        Hora_entrada = hora_entrada;
        Hora_fin = hora_fin;
    }

    public int getHoraID() {
		return Id_hora;
	}
	public void setHoraID(int horaID) {
		Id_hora = horaID;
	}
	public String getDia() {
        return Dia;
    }
    public void setDia(String dia) {
        Dia = dia;
    }
    public String getHora_entrada() {
        return Hora_entrada;
    }
    public void setHora_entrada(String hora_entrada) {
        Hora_entrada = hora_entrada;
    }
    public String getHora_fin() {
        return Hora_fin;
    }
    public void setHora_fin(String hora_fin) {
        Hora_fin = hora_fin;
    }
}
