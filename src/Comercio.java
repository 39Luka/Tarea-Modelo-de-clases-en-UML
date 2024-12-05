public class Comercio {
    public String nombreComercio;
    String direccion;
    double ingresosAnuales;
    private String claveRegistro;

    protected int registrarVenta(float cantidad) {
        ingresosAnuales += cantidad;
        return (int) (Math.random() * 1000);
    }

    private String consultarClave() {
        return claveRegistro;
    }
}
