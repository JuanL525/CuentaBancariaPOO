import java.util.ArrayList;

public class Cliente extends Persona {
    private ArrayList<Cuenta> cuentas = new ArrayList<>();
    private ArrayList<TarjetaCredito> tarjetas = new ArrayList<>();

    public Cliente(String nombre, String cedula, String direccion, String telefono) {
        super(nombre, cedula, direccion, telefono);
    }

    public boolean ingresarAlSistema() {
        return true;
    }

    public void registrarCuenta(String tipo) {
        Cuenta cuenta = new Cuenta(tipo);
        cuentas.add(cuenta);
        System.out.println("Cuenta " + tipo + " registrada.");
    }

    public void solicitarPrestamo(double monto) {
        System.out.println("Préstamo solicitado: $" + monto);
    }

    public void agregarTarjetaCredito(TarjetaCredito tarjeta) {
        tarjetas.add(tarjeta);
        System.out.println("Tarjeta agregada.");
    }

    public void verResumenFinanciero() {
        System.out.println("Resumen de Cuentas:");
        for (Cuenta c : cuentas) {
            System.out.println("- " + c.getTipo());
        }
        System.out.println("Cantidad de tarjetas: " + tarjetas.size());
    }

    @Override
    public void mostrarRol() {
        System.out.println("Soy un cliente.");
    }
}
