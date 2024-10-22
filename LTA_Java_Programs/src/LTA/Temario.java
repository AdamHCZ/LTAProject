package LTA;

public class Temario {
    private String Area;
    private String Tema;
    private int Capitulos;
    
    public Temario(String area, String tema, int capitulos) {
        Area = area;
        Tema = tema;
        Capitulos = capitulos;
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
    public int getCapitulos() {
        return Capitulos;
    }
    public void setCapitulos(int capitulos) {
        Capitulos = capitulos;
    }
    
}