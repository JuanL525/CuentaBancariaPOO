import java.util.Scanner;

public class BancoApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Objetos simulados
        Cliente cliente = new Cliente("Carlos", "123456789", "Quito", "099999999");
        Cajero cajero = new Cajero("Luis", "111111111", "Guayaquil", "098888888", "cajero1", "1234");
        BalconServicios balcon = new BalconServicios("Ana", "222222222", "Cuenca", "097777777", "balcon1", "abcd");
        JefeAgencia jefe = new JefeAgencia("Marta", "333333333", "Loja", "096666666", "jefe1", "admin");

        int opcionPrincipal;

        do {
            System.out.println("\n--- MENÚ PRINCIPAL ---");
            System.out.println("1. Ingresar como Cliente");
            System.out.println("2. Ingresar como Empleado");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcionPrincipal = scanner.nextInt();

            switch (opcionPrincipal) {
                case 1 -> {
                    int opcionCliente;
                    do {
                        System.out.println("\n--- MENÚ CLIENTE ---");
                        System.out.println("1. Abrir cuenta");
                        System.out.println("2. Ver saldo (simulado)");
                        System.out.println("3. Solicitar préstamo");
                        System.out.println("0. Volver al menú principal");
                        System.out.print("Opción: ");
                        opcionCliente = scanner.nextInt();
                        scanner.nextLine(); // Limpiar buffer

                        switch (opcionCliente) {
                            case 1 -> {
                                System.out.print("Ingrese tipo de cuenta: ");
                                String tipo = scanner.nextLine();
                                cliente.registrarCuenta(tipo);
                            }
                            case 2 -> cliente.verResumenFinanciero();
                            case 3 -> {
                                System.out.print("Ingrese monto del préstamo: ");
                                double monto = scanner.nextDouble();
                                cliente.solicitarPrestamo(monto);
                            }
                            case 0 -> System.out.println("Regresando al menú principal...");
                            default -> System.out.println("Opción inválida.");
                        }
                    } while (opcionCliente != 0);
                }

                case 2 -> {
                    int tipoEmpleado;
                    do {
                        System.out.println("\n--- TIPO DE EMPLEADO ---");
                        System.out.println("1. Cajero");
                        System.out.println("2. Balcón de Servicios");
                        System.out.println("3. Jefe de Agencia");
                        System.out.println("0. Volver al menú principal");
                        System.out.print("Seleccione una opción: ");
                        tipoEmpleado = scanner.nextInt();

                        switch (tipoEmpleado) {
                            case 1 -> {
                                int opcCajero;
                                do {
                                    System.out.println("\n--- MENÚ CAJERO ---");
                                    System.out.println("1. Procesar retiro");
                                    System.out.println("2. Procesar depósito");
                                    System.out.println("3. Consultar saldo");
                                    System.out.println("0. Volver");
                                    System.out.print("Opción: ");
                                    opcCajero = scanner.nextInt();

                                    switch (opcCajero) {
                                        case 1 -> {
                                            System.out.print("Monto a retirar: ");
                                            double monto = scanner.nextDouble();
                                            cajero.procesarRetiro(cliente, monto);
                                        }
                                        case 2 -> {
                                            System.out.print("Monto a depositar: ");
                                            double monto = scanner.nextDouble();
                                            cajero.procesarDeposito(cliente, monto);
                                        }
                                        case 3 -> cajero.consultarSaldo(cliente);
                                        case 0 -> System.out.println("Volviendo...");
                                        default -> System.out.println("Opción inválida.");
                                    }
                                } while (opcCajero != 0);
                            }

                            case 2 -> {
                                int opcBalcon;
                                do {
                                    System.out.println("\n--- MENÚ BALCÓN DE SERVICIOS ---");
                                    System.out.println("1. Registrar nuevo cliente");
                                    System.out.println("2. Actualizar datos cliente");
                                    System.out.println("0. Volver");
                                    System.out.print("Opción: ");
                                    opcBalcon = scanner.nextInt();

                                    switch (opcBalcon) {
                                        case 1 -> {
                                            Cliente nuevo = balcon.registrarNuevoCliente();
                                            System.out.println("Registrado: " + nuevo.nombre);
                                        }
                                        case 2 -> balcon.actualizarDatosCliente(cliente);
                                        case 0 -> System.out.println("Volviendo...");
                                        default -> System.out.println("Opción inválida.");
                                    }
                                } while (opcBalcon != 0);
                            }

                            case 3 -> {
                                int opcJefe;
                                do {
                                    System.out.println("\n--- MENÚ JEFE DE AGENCIA ---");
                                    System.out.println("1. Aprobar préstamo");
                                    System.out.println("2. Generar reporte de operaciones");
                                    System.out.println("3. Evaluar empleado");
                                    System.out.println("0. Volver");
                                    System.out.print("Opción: ");
                                    opcJefe = scanner.nextInt();
                                    scanner.nextLine(); // limpiar buffer

                                    switch (opcJefe) {
                                        case 1 -> {
                                            System.out.print("Monto del préstamo: ");
                                            double monto = scanner.nextDouble();
                                            jefe.aprobarPrestamo(cliente, monto);
                                        }
                                        case 2 -> jefe.generarReporteOperaciones();
                                        case 3 -> jefe.evaluarEmpleado(cajero);  // ejemplo
                                        case 0 -> System.out.println("Volviendo...");
                                        default -> System.out.println("Opción inválida.");
                                    }
                                } while (opcJefe != 0);
                            }

                            case 0 -> System.out.println("Volviendo al menú principal...");
                            default -> System.out.println("Opción inválida.");
                        }

                    } while (tipoEmpleado != 0);
                }

                case 0 -> System.out.println("¡Gracias por usar el sistema!");
                default -> System.out.println("Opción no válida.");
            }

        } while (opcionPrincipal != 0);

        scanner.close();
    }
}

