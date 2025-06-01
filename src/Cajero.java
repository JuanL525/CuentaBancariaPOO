public class Cajero extends Empleado {

    public Cajero(String nombre, String cedula, String direccion, String telefono, String usuario, String clave) {
        super(nombre, cedula, direccion, telefono, usuario, clave);
    }

    public void procesarRetiro(Cliente cliente, double monto) {
        System.out.println("Retiro procesado: $" + monto);
    }

    public void consultarSaldo(Cliente cliente) {
        System.out.println("Saldo disponible: $XXX");
    }

    public void procesarDeposito(Cliente cliente, double monto) {
        System.out.println("Depósito procesado: $" + monto);
    }

    @Override
    public void mostrarRol() {
        System.out.println("Soy un cajero.");
    }
}
