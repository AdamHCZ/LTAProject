public class Tipo_empleo {
    private String Nombre_empleo;\
    private int Nivel;

    public Tipo_empleo(String nombre_empleo, int nivel) {
        Nombre_empleo = nombre_empleo;
        Nivel = nivel;
    }

    public String getNombre_empleo() {
        return Nombre_empleo;
    }

    public void setNombre_empleo(String nombre_empleo) {
        Nombre_empleo = nombre_empleo;
    }

    public int getNivel() {
        return Nivel;
    }

    public void setNivel(int nivel) {
        Nivel = nivel;
    }
}
