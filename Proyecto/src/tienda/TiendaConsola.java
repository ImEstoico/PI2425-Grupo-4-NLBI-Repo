package tienda;

import tienda.Model.Articulos.Articulo;
import tienda.Model.Catalogo.Catalogo;
import tienda.Model.Clientes.Cliente;
import tienda.Model.Clientes.Clientela;
import tienda.Model.Empleados.Empleado;
import tienda.Model.Empleados.Plantilla;
import tienda.Model.Ventas.Venta;
import tienda.Util.Console.ConsoleReader;
import tienda.Util.Console.ConsoleUtil;
import tienda.Util.File.FileUtil;
import tienda.dao.*;

import java.util.List;

public class TiendaConsola {
    private static Plantilla plantilla = new Plantilla();
    private static Clientela clientela = new Clientela();
    private static Catalogo catalogo = new Catalogo();
    private static Venta ventas = new Venta();

    private static final String filePath = "objeto.bin";
    private static final String filePathClientela = "clientes.json";
    private static final String filePathPlantilla = "empleados.json";
    private static final String filePathCatalogo = "articulos.json";

    public static void main(String[] args) {
        while (true) {
            //inicio opcional (depende como vaya siguiendo el programa)
            System.out.println("╭───────────────────────────────────────────────────────────.★..─╮");
            System.out.println("   _____                          _   _    _                 _ ");
            System.out.println("  / ____|                        | | | |  | |               | |");
            System.out.println(" | (___   ___  ___ ___  _ __   __| | | |__| | __ _ _ __   __| |");
            System.out.println("  \\___ \\ / _ \\/ __/ _ \\| '_ \\ / _` | |  __  |/ _` | '_ \\ / _` |");
            System.out.println("  ____) |  __/ (_| (_) | | | | (_| | | |  | | (_| | | | | (_| |");
            System.out.println(" |_____/ \\___|\\___\\___/|_| |_|\\__,_| |_|  |_|\\" +
                    "__,_|_| |_|\\" +
                    "__,_|");
            System.out.println("╰─..★.───────────────────────────────────────────────────────────╯ \n");

            System.out.println("Menú Principal:");
            System.out.println("1. Submenú Plantillas");
            System.out.println("2. Submenú Clientela");
            System.out.println("3. Submenú Catálogo");
            System.out.println("4. Submenú Ventas (no implementado)");
            System.out.println("5. Serializar objeto");
            System.out.println("6. Deserializar objeto");
            System.out.println("7. Serializar lista de objetos");
            System.out.println("8. Deserializar lista de objetos");
            System.out.println("9. Guardar lista de objetos en JSON");
            System.out.println("10. Leer lista de objetos en JSON");
            System.out.println("11. Salir");
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
                    System.out.println("Elige el objeto a serializar:");
                    System.out.println("1. Plantilla");
                    System.out.println("2. Clientela");
                    System.out.println("3. Catálogo");
                    int opcionSerializar = ConsoleReader.readInt();
                    switch (opcionSerializar) {
                        case 1:
                            FileUtil.serializarObjeto(plantilla, "objeto.bin");
                            break;
                        case 2:
                            FileUtil.serializarObjeto(clientela, "objeto.bin");
                            break;
                        case 3:
                            FileUtil.serializarObjeto(catalogo, "objeto.bin");
                            break;
                        default:
                            System.out.println("Opción no válida. Intenta de nuevo.");
                    }
                    break;
                case 6:
                    System.out.println("Elige el objeto a deserializar:");
                    System.out.println("1. Plantilla");
                    System.out.println("2. Clientela");
                    System.out.println("3. Catálogo");
                    int opcionDeserializar = ConsoleReader.readInt();
                    switch (opcionDeserializar) {
                        case 1:
                            plantilla = FileUtil.deserializarObjeto("objeto.bin", Plantilla.class);
                            break;
                        case 2:
                            clientela = FileUtil.deserializarObjeto("objeto.bin",Clientela.class );
                            break;
                        case 3:
                            catalogo = FileUtil.deserializarObjeto("objeto.bin", Catalogo.class);
                            break;
                        default:
                            System.out.println("Opción no válida. Intenta de nuevo.");
                    }
                    break;
                case 7:
                    System.out.println("Elige la lista a serializar:");
                    System.out.println("1. Plantilla");
                    System.out.println("2. Clientela");
                    System.out.println("3. Catálogo");
                    int opcionSerializarLista = ConsoleReader.readInt();
                    switch (opcionSerializarLista) {
                        case 1:
                            FileUtil.serializarListaObjetos(plantilla.getEmpleados(), "objeto.bin");
                            break;
                        case 2:
                            FileUtil.serializarListaObjetos(clientela.getClientes(), "objeto.bin");
                            break;
                        case 3:
                            FileUtil.serializarListaObjetos(catalogo.getArticulo(), "objeto.bin");
                            break;
                        default:
                            System.out.println("Opción no válida. Intenta de nuevo.");
                    }
                    break;
                case 8:
                    System.out.println("Elige la lista a deserializar:");
                    System.out.println("1. Plantilla");
                    System.out.println("2. Clientela");
                    System.out.println("3. Catálogo");
                    int opcionDeserializarLista = ConsoleReader.readInt();
                    switch (opcionDeserializarLista) {
                        case 1:
                            List<Plantilla> listaEmpleados = FileUtil.deserializarListaObjetos("objeto.bin", Plantilla.class);
                            break;
                        case 2:
                            List<Clientela> listaClientes = FileUtil.deserializarListaObjetos("objeto.bin", Clientela.class);
                            break;
                        case 3:
                            List<Catalogo> listaArticulos = FileUtil.deserializarListaObjetos("objeto.bin", Catalogo.class);
                            break;
                    }
                    break;
                case  9:
                    System.out.println("Elige el objeto a serializar en JSON:");
                    System.out.println("1. Clientes");
                    System.out.println("2. Articulos");
                    System.out.println("3. Empleados");
                    int opcionSerializarJson = ConsoleReader.readInt();
                    switch (opcionSerializarJson) {
                        case 1:
                            FileUtil.guardarClientesEnJson(clientela, "clientes.json");
                            break;
                        case 2:
                            FileUtil.guardarArticulosEnJson(catalogo, "articulos.json");
                            break;
                        case 3:
                            FileUtil.guardarEmpleadosEnJson(plantilla, "empleados.json");
                            break;
                    }
                    break;
                case 10:
                    System.out.println("Elige el objeto a deserializar en JSON:");
                    System.out.println("1. Clientes");
                    System.out.println("2. Articulos");
                    System.out.println("3. Empleados");
                    int opcionDeserializarJson = ConsoleReader.readInt();
                    switch (opcionDeserializarJson) {
                        case 1:
                            FileUtil.leerClientesDesdeJson("clientes.json");
                            FileUtil.leerMetodosPagoDesdeJson("clientes.json");
                            break;
                        case 2:
                            FileUtil.leerArticulosDesdeJson("articulos.json");
                            break;
                        case 3:
                            FileUtil.leerEmpleadosDesdeJson("empleados.json");
                            FileUtil.leerDepartamentosDesdeJson("empleados.json");
                            break;
                    }
                    break;
                case 11:
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
            System.out.println("2. Listar empleados");
            System.out.println("3.Buscar empleado por DNI");
            System.out.println("4. Validar contraseña de empleado");
            System.out.println("5. Volver al menú principal");
            System.out.print("Selecciona una opción: ");

            EmpleadoDAO empleadoDAO = new EmpleadoDAO();
            int opcion = ConsoleReader.readInt();

            switch (opcion) {
                case 1:
                    System.out.print("Introduce el nombre del empleado: ");
                    Empleado empleado = ConsoleUtil.crearEmpleado();
                    plantilla.addEmpleado(empleado);
                    break;
                case 2:
                    empleadoDAO.obtenerTodos();
                    break;
                case 3:
                    empleadoDAO.ObtenerEmpleadoPorDNI("DNI");
                    break;
                case 4:
                    empleadoDAO.autenticarEmpleado("Email", "pass");
                case 5:
                    return;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }
        }
    }

    private static void menuClientela() {
        while (true) {
            System.out.println("\nSubmenú Clientela:");
            System.out.println("1. Añadir cliente");
            System.out.println("2. Listar clientes");
            System.out.println("3. Buscar cliente por DNI");
            System.out.println("4. Validar contraseña de cliente");
            System.out.println("5. Listar pedidos de un cliente");
            System.out.println("6. Volver al menú principal");
            System.out.print("Selecciona una opción: ");

            ClienteDAO ClienteDAO = new ClienteDAO();
            int opcion = ConsoleReader.readInt();

            switch (opcion) {
                case 1:
                    System.out.print("Introduce el nombre del cliente: ");
                    Cliente cliente = ConsoleUtil.crearCliente();
                    clientela.addCliente(cliente);
                    break;
                case 2:
                    ClienteDAO.obtenerTodosClientes();
                    break;
                case 3:
                    ClienteDAO.obtenerPorDNI("DNI");
                    break;
                case 4:
                    ClienteDAO.autenticarCliente("Email", "pass");
                    break;
                case 5:
                    PedidoDAO.obtenerPedidosPorCliente("DNI");
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }
        }
    }

    private static void menuCatalogo() {
        while (true) {
            System.out.println("\nSubmenú Catálogo:");
            System.out.println("1. Añadir artículo");
            System.out.println("2. Listar artículos");
            System.out.println("3. Listar ropa por tipo");
            System.out.println("4. Listar accesorios por tipo");
            System.out.println("5. Buscar artículo por codigo");
            System.out.println("6. Volver al menú principal");
            System.out.print("Selecciona una opción: ");

            ArticuloDAO articuloDAO = new ArticuloDAO();
            RopaDAO ropaDAO = new RopaDAO();
            AccesorioDAO accesorioDAO = new AccesorioDAO();
            int opcion = ConsoleReader.readInt();

            switch (opcion) {
                case 1:
                    System.out.print("Selecciona el tipo de artículo: ");
                    System.out.println("1. Camisa");
                    System.out.println("2. Chaqueta");
                    System.out.println("3. Pantalón");
                    System.out.println("4. Zapato");
                    System.out.println("5. Bolso");
                    System.out.print("Selecciona una opción: ");
                    int tipo = ConsoleReader.readInt();
                    Articulo articulo = null;
                    switch (tipo) {
                        case 1:
                            articulo = ConsoleUtil.crearCamisa();
                            break;
                        case 2:
                            articulo = ConsoleUtil.crearChaqueta();
                            break;
                        case 3:
                            articulo = ConsoleUtil.crearPantalon();
                            break;
                        case 4:
                            articulo = ConsoleUtil.crearZapato();
                            break;
                        case 5:
                            articulo = ConsoleUtil.crearBolso();
                            break;
                        default:
                            System.out.println("Tipo no válido.");
                            continue;
                    }
                    catalogo.addArticulo(articulo);
                    break;
                case 2:
                    articuloDAO.obtenerTodos();
                    break;
                case 3:
                    ropaDAO.obtenerPorId(1);
                    break;
                case 4:
                    accesorioDAO.obtenerPorId(1);
                    break;
                case 5:
                    articuloDAO.obtenerPorId(1);
                case 6:
                    return;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }
        }
    }
}