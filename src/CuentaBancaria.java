public class CuentaBancaria {
    public String numeroCuenta;
    public String nombreTitular;
    private double saldo;
    String moneda;

    public void depositar(double cantidad) {
        saldo += cantidad;
    }

    private boolean retirar(double cantidad) {
        boolean ok = false;
        if (cantidad <= saldo) {
            saldo -= cantidad;
            ok = true;
        }
        return ok;
    }
}
