package LTA;

public class Hora {
    private String Dia;
    private String Hora_entrada;
    private String HOra_salida;

    public Hora(String dia, String hora_entrada, String hOra_salida) {
        Dia = dia;
        Hora_entrada = hora_entrada;
        HOra_salida = hOra_salida;
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
    public String getHOra_salida() {
        return HOra_salida;
    }
    public void setHOra_salida(String hOra_salida) {
        HOra_salida = hOra_salida;
    }
}
