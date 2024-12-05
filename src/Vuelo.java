public class Vuelo {
    public String codigoVuelo;
    public String aerolinea;
    protected int asientosDisponibles;
    String ruta;

    protected boolean reservarAsiento(int numero) {
        boolean ok = false;
        if (numero <= asientosDisponibles) {
            asientosDisponibles -= numero;
            ok = true;
        }
        return ok;
    }

    protected void modificarRuta(String nuevaRuta) {
        ruta = nuevaRuta;
    }
}
