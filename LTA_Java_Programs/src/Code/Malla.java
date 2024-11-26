package Code;

public class Malla {
    private int Id_Malla;
    private int Evaluaciones;
    private String Fecha_recuperacion;
    private String Fecha_Consulta;

    public Malla(int Id_Malla, int Evaluaciones, String Fecha_Reserva, String Fecha_Consulta) {
        this.Id_Malla = Id_Malla;
        this.Evaluaciones = Evaluaciones;
        this.Fecha_recuperacion = Fecha_Reserva;
        this.Fecha_Consulta = Fecha_Consulta;
    }

    public Malla(int Evaluaciones, String Fecha_Reserva, String Fecha_Consulta) {
        this.Evaluaciones = Evaluaciones;
        this.Fecha_recuperacion = Fecha_Reserva;
        this.Fecha_Consulta = Fecha_Consulta;
    }

    public Malla() {
    }

	public int getId_Malla() {
		return Id_Malla;
	}

	public void setId_Malla(int id_Malla) {
		Id_Malla = id_Malla;
	}

	public int getEvaluaciones() {
		return Evaluaciones;
	}

	public void setEvaluaciones(int evaluaciones) {
		Evaluaciones = evaluaciones;
	}

	public String getFecha_recuperacion() {
		return Fecha_recuperacion;
	}

	public void setFecha_recuperacion(String fecha_Reserva) {
		Fecha_recuperacion = fecha_Reserva;
	}

	public String getFecha_Consulta() {
		return Fecha_Consulta;
	}

	public void setFecha_Consulta(String fecha_Consulta) {
		Fecha_Consulta = fecha_Consulta;
	}
}
