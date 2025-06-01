public class JefeAgencia extends Empleado {

    public JefeAgencia(String nombre, String cedula, String direccion, String telefono, String usuario, String clave) {
        super(nombre, cedula, direccion, telefono, usuario, clave);
    }

    public boolean aprobarPrestamo(Cliente cliente, double monto) {
        System.out.println("Préstamo aprobado por $" + monto);
        return true;
    }

    public void generarReporteOperaciones() {
        System.out.println("Generando reporte de operaciones...");
    }

    public void evaluarEmpleado(Empleado empleado) {
        System.out.println("Evaluando desempeño de: " + empleado.nombre);
    }

    @Override
    public void mostrarRol() {
        System.out.println("Soy el jefe de agencia.");
    }
}
