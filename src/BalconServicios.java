public class BalconServicios extends Empleado {

    public BalconServicios(String nombre, String cedula, String direccion, String telefono, String usuario, String clave) {
        super(nombre, cedula, direccion, telefono, usuario, clave);
    }

    public Cliente registrarNuevoCliente() {
        return new Cliente("Nuevo Cliente", "000000", "Calle X", "098888888");
    }

    public void actualizarDatosCliente(Cliente cliente) {
        cliente.actualizarDatos("Dirección nueva", "099999999");
    }

    @Override
    public void mostrarRol() {
        System.out.println("Soy personal de balcón de servicios.");
    }
}
