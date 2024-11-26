package Code;

public class Temario {
    private int Id_Temario;
    private String Area;
    private String Tema;
    private String Capitulos;

    public Temario(int Id_Temario, String Area, String Tema, String Capitulos) {
        this.Id_Temario = Id_Temario;
        this.Area = Area;
        this.Tema = Tema;
        this.Capitulos = Capitulos;
    }

    public Temario(String Area, String Tema, String Capitulos) {
        this.Area = Area;
        this.Tema = Tema;
        this.Capitulos = Capitulos;
    }
    
    public Temario() {
    	
    }

	public int getId_Temario() {
		return Id_Temario;
	}

	public void setId_Temario(int id_Temario) {
		Id_Temario = id_Temario;
	}

	public String getArea() {
		return Area;
	}

	public void setArea(String area) {
		Area = area;
	}

	public String getTema() {
		return Tema;
	}

	public void setTema(String tema) {
		Tema = tema;
	}

	public String getCapitulos() {
		return Capitulos;
	}

	public void setCapitulos(String capitulos) {
		Capitulos = capitulos;
	}
}
   
