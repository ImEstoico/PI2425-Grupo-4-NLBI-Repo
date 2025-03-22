package tienda;

import tienda.Model.Catalogo;
import tienda.Model.Clientela;
import tienda.Model.Plantilla;
import tienda.Model.Venta;
import tienda.Util.ConsoleReader;

public class TiendaConsola {
    private static Plantilla plantilla = new Plantilla();
    private static Clientela clientela = new Clientela();
    private static Catalogo catalogo = new Catalogo();
    private static Venta ventas = new Venta();

    public static void main(String[] args) {
        while (true) {
            System.out.println("Menú Principal:");
            System.out.println("1. Submenú Plantillas");
            System.out.println("2. Submenú Clientela");
            System.out.println("3. Submenú Catálogo");
            System.out.println("4. Submenú Ventas (no implementado)");
            System.out.println("5. Salir");
            System.out.print("Selecciona una opción: ");

            int opcion = ConsoleReader.readInt();

            switch (opcion) {
                case 1:
                    menuPlantillas();
                    break;
                case 2:
                    menuClientela();
                    break;
                case 3:
                    menuCatalogo();
                    break;
                case 4:
                    System.out.println("Submenú Ventas no implementado.");
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    return;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }
        }
    }

    private static void menuPlantillas() {
        while (true) {
            System.out.println("\nSubmenú Plantillas:");
            System.out.println("1. Añadir empleado");
            System.out.println("2. Volver al menú principal");
            System.out.print("Selecciona una opción: ");

            int opcion = ConsoleReader.readInt();

            if (opcion == 1) {
                System.out.print("Introduce el nombre del empleado: ");
                String empleado = ConsoleReader.readString();
                plantilla.addEmpleado(empleado);
            } else if (opcion == 2) {
                return;
            } else {
                System.out.println("Opción no válida. Intenta de nuevo.");
            }
        }
    }

    private static void menuClientela() {
        while (true) {
            System.out.println("\nSubmenú Clientela:");
            System.out.println("1. Añadir cliente");
            System.out.println("2. Volver al menú principal");
            System.out.print("Selecciona una opción: ");

            int opcion = ConsoleReader.readInt();

            if (opcion == 1) {
                System.out.print("Introduce el nombre del cliente: ");
                String cliente = ConsoleReader.readString();
                clientela.addCliente(cliente);
            } else if (opcion == 2) {
                return;
            } else {
                System.out.println("Opción no válida. Intenta de nuevo.");
            }
        }
    }

    private static void menuCatalogo() {
        while (true) {
            System.out.println("\nSubmenú Catálogo:");
            System.out.println("1. Añadir artículo");
            System.out.println("2. Volver al menú principal");
            System.out.print("Selecciona una opción: ");

            int opcion = ConsoleReader.readInt();

            if (opcion == 1) {
                System.out.println("Selecciona el tipo de artículo:");
                System.out.println("1. Camisa");
                System.out.println("2. Chaqueta");
                // Puedes añadir más tipos de artículos aquí
                System.out.print("Selecciona una opción: ");
                int tipo = ConsoleReader.readInt();

                String articulo = "";
                switch (tipo) {
                    case 1:
                        articulo = "Camisa";
                        break;
                    case 2:
                        articulo = "Chaqueta";
                        break;
                    default:
                        System.out.println("Tipo no válido.");
                        continue;
                }
                catalogo.addArticulo(articulo);
            } else if (opcion == 2) {
                return;
            } else {
                System.out.println("Opción no válida. Intenta de nuevo.");
            }
        }
    }
}
