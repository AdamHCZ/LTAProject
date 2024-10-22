package LTA;

public class Malla {
    private String Fecha_evaluacion;
    private String Fecha_recuperatorio;
    private String Fecha_consulta;

    public Malla(String fecha_evaluacion, String fecha_recuperatorio, String fecha_consulta) {
        Fecha_evaluacion = fecha_evaluacion;
        Fecha_recuperatorio = fecha_recuperatorio;
        Fecha_consulta = fecha_consulta;
    }
    
    public String getFecha_evaluacion() {
        return Fecha_evaluacion;
    }
    public void setFecha_evaluacion(String fecha_evaluacion) {
        Fecha_evaluacion = fecha_evaluacion;
    }
    public String getFecha_recuperatorio() {
        return Fecha_recuperatorio;
    }
    public void setFecha_recuperatorio(String fecha_recuperatorio) {
        Fecha_recuperatorio = fecha_recuperatorio;
    }
    public String getFecha_consulta() {
        return Fecha_consulta;
    }
    public void setFecha_consulta(String fecha_consulta) {
        Fecha_consulta = fecha_consulta;
    }
}
