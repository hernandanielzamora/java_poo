package principal;

import java.util.Scanner;
import modelo.domicilio.Ciudad;
import modelo.domicilio.Domicilio;
import modelo.persona.Vendedor;
import modelo.persona.quiniela.Sucursal;
import repositorio.RepositorioQuiniela;

/**
 *
 * @author NCAULA208
 */
public class Principal {

    public static void main(String[] args) {
        menuPrincipal();
    }

    private static void menuPrincipal() {
        Scanner scanner = new Scanner(System.in);
        int opMenu;

        do {
            System.out.println("=================== Sistema de Quiniela =====================");
            System.out.println("Ingrese una opción del menú");
            System.out.println("1 Consultar Vendedores");
            System.out.println("2 Consultar Clientes");
            System.out.println("3 Consultar Apuestas");
            System.out.println("4 Salir");
            opMenu = scanner.nextInt();

            switch (opMenu) {
                case 1:
                    subMenuAbmVendedor();
                    break;
                case 2:
                    subMenuAbmCliente();
                    break;
                case 3:
                    subMenuAbmApuestas();
                    break;
                case 4:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida, intente nuevamente.");
                    break;
            }
        } while (opMenu != 4);
    }

    private static void subMenuAbmVendedor() {
        Scanner scanner = new Scanner(System.in);
        int opMenu;

        do {
            System.out.println("=================== Menú Vendedores =====================");
            System.out.println("1 Alta de Vendedor");
            System.out.println("2 Eliminar Vendedor");
            System.out.println("3 Modificar Vendedor");
            System.out.println("4 Atrás");
            opMenu = scanner.nextInt();

            switch (opMenu) {
                case 1:
                    itemAltaSubMenuAbmVendedor();
                    break;
                case 2:
                    eliminarVendedor();
                    break;
                case 3:
                    modificarVendedor();
                    break;
                case 4:
                    System.out.println("Volviendo al menú principal...");
                    break;
                default:
                    System.out.println("Opción no válida, intente nuevamente.");
                    break;
            }
        } while (opMenu != 4);
    }

    private static void subMenuAbmCliente() {
        Scanner scanner = new Scanner(System.in);
        int opMenu;

        do {
            System.out.println("=================== Menú Clientes =====================");
            System.out.println("1 Alta de Cliente");
            System.out.println("2 Eliminar Cliente");
            System.out.println("3 Modificar Cliente");
            System.out.println("4 Atrás");
            opMenu = scanner.nextInt();

            switch (opMenu) {
                case 1:
                    altaCliente();
                    break;
                case 2:
                    eliminarCliente();
                    break;
                case 3:
                    modificarCliente();
                    break;
                case 4:
                    System.out.println("Volviendo al menú principal...");
                    break;
                default:
                    System.out.println("Opción no válida, intente nuevamente.");
                    break;
            }
        } while (opMenu != 4);
    }

    private static void subMenuAbmApuestas() {
        Scanner scanner = new Scanner(System.in);
        int opMenu;

        do {
            System.out.println("=================== Menú Apuestas =====================");
            System.out.println("1 Consultar Apuestas");
            System.out.println("2 Realizar Apuesta");
            System.out.println("3 Cancelar Apuesta");
            System.out.println("4 Atrás");
            opMenu = scanner.nextInt();

            switch (opMenu) {
                case 1:
                    consultarApuestas();
                    break;
                case 2:
                    realizarApuesta();
                    break;
                case 3:
                    cancelarApuesta();
                    break;
                case 4:
                    System.out.println("Volviendo al menú principal...");
                    break;
                default:
                    System.out.println("Opción no válida, intente nuevamente.");
                    break;
            }
        } while (opMenu != 4);
    }

    // Funciones relacionadas a los vendedores
    private static void itemAltaSubMenuAbmVendedor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el cuit vendedor");
        String cuit = scanner.nextLine();
        System.out.println("Ingrese el nombre del vendedor");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese el apellido del vendedor");
        String apellido = scanner.nextLine();
        System.out.println("Ingrese el dni del vendedor");
        int dni = scanner.nextInt();
        System.out.println("Crear domicilio");
        Domicilio domi = crearDomicilio();
        Sucursal sucursal = seleccionarSucursal();
        Vendedor vendedor = new Vendedor(cuit, sucursal, nombre, apellido, dni, domi);
        System.out.println("Vendedor creado: " + vendedor);
    }

    private static void eliminarVendedor() {
        System.out.println("Funcionalidad para eliminar vendedor no implementada.");
    }

    private static void modificarVendedor() {
        System.out.println("Funcionalidad para modificar vendedor no implementada.");
    }

    // Funciones relacionadas a los clientes
    private static void altaCliente() {
        System.out.println("Funcionalidad para alta de cliente no implementada.");
    }

    private static void eliminarCliente() {
        System.out.println("Funcionalidad para eliminar cliente no implementada.");
    }

    private static void modificarCliente() {
        System.out.println("Funcionalidad para modificar cliente no implementada.");
    }

    // Funciones relacionadas a las apuestas
    private static void consultarApuestas() {
        System.out.println("Funcionalidad para consultar apuestas no implementada.");
    }

    private static void realizarApuesta() {
        System.out.println("Funcionalidad para realizar apuesta no implementada.");
    }

    private static void cancelarApuesta() {
        System.out.println("Funcionalidad para cancelar apuesta no implementada.");
    }

    // Funciones auxiliares
    private static Domicilio crearDomicilio() {
        Scanner scanDomicilio = new Scanner(System.in);
        seleccionarCiudad();
        Ciudad ciudad = RepositorioQuiniela.ciudades[scanDomicilio.nextInt()];
        System.out.println("Ingrese nombre de la calle");
        String calle = scanDomicilio.nextLine();
        System.out.println("Ingrese número de la calle");
        int nro = scanDomicilio.nextInt();
        return new Domicilio(ciudad, calle, nro);
    }

    private static void seleccionarCiudad() {
        System.out.println("=========== Listado de ciudades ================");
        for (int i = 0; i < RepositorioQuiniela.ciudades.length; i++) {
            System.out.println((i + 1) + " Ciudad: " + RepositorioQuiniela.ciudades[i].getNombre());
        }
    }

    private static Sucursal seleccionarSucursal() {
        // Simulación para selección de sucursal
        System.out.println("Funcionalidad para seleccionar sucursal no implementada.");
        return null;
    }
}
