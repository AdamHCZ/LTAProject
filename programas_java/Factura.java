package programas_java;

public class Factura {

    private String Razon_social;
    private String Fecha_emision;
    private String Detalle_factura;

    
    public Factura(String razon_social, String fecha_emision, String detalle_factura) {
        Razon_social = razon_social;
        Fecha_emision = fecha_emision;
        Detalle_factura = detalle_factura;
    }


    public String getRazon_social() {
        return Razon_social;
    }


    public void setRazon_social(String razon_social) {
        Razon_social = razon_social;
    }


    public String getFecha_emision() {
        return Fecha_emision;
    }


    public void setFecha_emision(String fecha_emision) {
        Fecha_emision = fecha_emision;
    }


    public String getDetalle_factura() {
        return Detalle_factura;
    }


    public void setDetalle_factura(String detalle_factura) {
        Detalle_factura = detalle_factura;
    }
    
}
