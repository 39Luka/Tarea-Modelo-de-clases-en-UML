public class Usuario {
    public String email;
    public String nombre;
    int nivelDeAcceso;
    private String contrasenya;

    private boolean realizarPago(double monto) {
        return true;
    }

    private void cambiarContrasenya(String nueva) {
        contrasenya = nueva;
    }
}
