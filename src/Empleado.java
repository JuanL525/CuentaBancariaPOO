public abstract class Empleado extends Persona {
    protected String usuario;
    protected String clave;

    public Empleado(String nombre, String cedula, String direccion, String telefono, String usuario, String clave) {
        super(nombre, cedula, direccion, telefono);
        this.usuario = usuario;
        this.clave = clave;
    }

    public boolean autenticarEmpleado(String usuario, String clave) {
        return this.usuario.equals(usuario) && this.clave.equals(clave);
    }

    public void crearCuentaParaCliente(Cliente cliente, String tipo) {
        cliente.registrarCuenta(tipo);
    }

    public void modificarDatosCliente(Cliente cliente) {
        cliente.actualizarDatos("Nueva dirección", "099999999");
    }

    public void registrarPrestamo(Cliente cliente, double monto) {
        cliente.solicitarPrestamo(monto);
    }

    public void cerrarCuenta(Cliente cliente, Cuenta cuenta) {
        System.out.println("Cuenta cerrada.");
    }

    @Override
    public abstract void mostrarRol();
}
