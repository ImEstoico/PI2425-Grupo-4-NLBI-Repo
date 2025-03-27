package tienda.Util.Console;

import tienda.Model.Articulos.*;
import tienda.Model.Catalogo.Material;
import tienda.Model.Clientes.Cliente;
import tienda.Model.Empleados.Departamento;
import tienda.Model.Empleados.Empleado;
import tienda.Model.Pedidos.LineaPedido;
import tienda.Model.Pedidos.Metodo_Pago;
import tienda.Model.Pedidos.Pedido;
import tienda.Util.Enums.TipoAccesorio;

import java.time.LocalDate;
import java.util.ArrayList;

public class ConsoleUtil {

    public static Zapato crearZapato() {
        Material material = ConsoleUtil.crearMaterial();
        return crearZapato(material);
    }

    public static Zapato crearZapato(Material material) {
        System.out.println("Creando zapatos...");
        String codigoArticulo = ConsoleReader.readString("Ingresa el codigo de articulo: ");
        String nombre = ConsoleReader.readString("Ingresa el nombre: ");
        float precio = ConsoleReader.readFloat("Ingresa el precio: ");
        String marca = ConsoleReader.readString("Ingresa la marca: ");
        String descripcion = ConsoleReader.readString("Descripcion: ");
        String imagen = ConsoleReader.readString("Imagen: ");
        boolean activo = ConsoleReader.readBoolean("Está activo?");
        String color = ConsoleReader.readString("Color: ");
        String estilo = ConsoleReader.readString("Estilo: ");
        boolean esPersonalizado = ConsoleReader.readBoolean("Es personalizado?");
        int tallaZapato = ConsoleReader.readInt("Ingresa la talla del zapato: ");
        String tipoSuela = ConsoleReader.readString("Ingresa el tipo de suela: ");

        return new Zapato(codigoArticulo, nombre, precio, marca, descripcion, imagen, activo, color, material, estilo,
                esPersonalizado, tallaZapato, tipoSuela, TipoAccesorio.zapato);
    }

    public static Bolso crearBolso() {
        Material material = ConsoleUtil.crearMaterial();
        return crearBolso(material);
    }

    public static Bolso crearBolso(Material material) {
        System.out.println("Creando bolso...");
        String codigoArticulo = ConsoleReader.readString("Ingresa el codigo de articulo: ");
        String nombre = ConsoleReader.readString("Ingresa el nombre: ");
        float precio = ConsoleReader.readFloat("Ingresa el precio: ");
        String marca = ConsoleReader.readString("Ingresa la marca: ");
        String descripcion = ConsoleReader.readString("Descripcion: ");
        String imagen = ConsoleReader.readString("Imagen: ");
        boolean activo = ConsoleReader.readBoolean("Está activo?");
        String color = ConsoleReader.readString("Color: ");
        String estilo = ConsoleReader.readString("Estilo: ");
        boolean esPersonalizado = ConsoleReader.readBoolean("Es personalizado?");
        String tipoCierre = ConsoleReader.readString("Ingresa el tipo de cierre: ");
        int capacidad = ConsoleReader.readInt("Ingresa la capacidad: ");

        return new Bolso(codigoArticulo, nombre, precio, marca, descripcion, imagen, activo, color, material, estilo,
                esPersonalizado, tipoCierre, capacidad,TipoAccesorio.bolso);
    }

    // Para crear una Camisa

    public static Camisa crearCamisa() {
        Material material = ConsoleUtil.crearMaterial();
        return crearCamisa(material);
    }

    public static Camisa crearCamisa(Material material) {
        System.out.println("Creando una Camisa...");
        String codigoArticulo = ConsoleReader.readString("Código del artículo: ");
        String nombre = ConsoleReader.readString("Nombre: ");
        float precio = ConsoleReader.readFloat("Precio: ");
        String marca = ConsoleReader.readString("Marca: ");
        String descripcion = ConsoleReader.readString("Descripción: ");
        String imagen = ConsoleReader.readString("Imagen: ");
        boolean activo = ConsoleReader.readBoolean("¿Esta activo?  ");
        String color = ConsoleReader.readString("Color: ");
        int talla = ConsoleReader.readInt("Talla: ");
        String tipoCierre = ConsoleReader.readString("Tipo de cierre: ");
        String tipoManga = ConsoleReader.readString("Tipo de manga: ");
        boolean esEstampada = ConsoleReader.readBoolean("¿Es estampada?");

        return new Camisa(codigoArticulo, nombre, precio, marca, descripcion, imagen, activo, color, material, talla,
                tipoCierre, tipoManga, esEstampada);
    }

    public static Chaqueta crearChaqueta() {
        Material material = ConsoleUtil.crearMaterial();
        return crearChaqueta(material);
    }

    // Para crear una Chaqueta
    public static Chaqueta crearChaqueta(Material material){
        System.out.println("Creando una Chaqueta...");
        String codigoArticulo = ConsoleReader.readString("Código del artículo: ");
        String nombre = ConsoleReader.readString("Nombre: ");
        float precio = ConsoleReader.readFloat("Precio: ");
        String marca = ConsoleReader.readString("Marca: ");
        String descripcion = ConsoleReader.readString("Descripción: ");
        String imagen = ConsoleReader.readString("Imagen: ");
        boolean activo = ConsoleReader.readBoolean("¿Activo?  ");
        String color = ConsoleReader.readString("Color: ");
        int talla = ConsoleReader.readInt("Talla: ");
        String tipoCierre = ConsoleReader.readString("Tipo de cierre: ");
        boolean impermeable = ConsoleReader.readBoolean("¿Es impermeable?  ");

        return new Chaqueta(codigoArticulo, nombre, precio, marca, descripcion, imagen,
                activo, color, material, talla, tipoCierre, impermeable);

    }

    public static Pantalon crearPantalon() {
        Material material = ConsoleUtil.crearMaterial();
        return crearPantalon(material);
    }

    // Para crear un Pantalón
    public static Pantalon crearPantalon(Material material) {
        System.out.println("Creando un Pantalón...");
        String codigoArticulo = ConsoleReader.readString("Código del artículo: ");
        String nombre = ConsoleReader.readString("Nombre: ");
        float precio = ConsoleReader.readFloat("Precio: ");
        String marca = ConsoleReader.readString("Marca: ");
        String descripcion = ConsoleReader.readString("Descripción: ");
        String imagen = ConsoleReader.readString("Imagen: ");
        boolean activo = ConsoleReader.readBoolean("¿Activo? ");
        String color = ConsoleReader.readString("Color: ");
        int talla = ConsoleReader.readInt("Talla: ");
        String tipoCierre = ConsoleReader.readString("Tipo de cierre: ");

        boolean tieneBolsillo = ConsoleReader.readBoolean("¿Tiene bolsillo?  ");
        String tipoPantalon = ConsoleReader.readString("Tipo de pantalón: ");

        return new Pantalon(codigoArticulo, nombre, precio, marca, descripcion, imagen,
                activo, color, material, talla, tipoCierre, tieneBolsillo, tipoPantalon);
    }

    public static Metodo_Pago crearMetodoPago(){
        System.out.println("Creando metodo de pago...");
        int codigo = ConsoleReader.readInt("Código del método de pago: ");
        String descripcion = ConsoleReader.readString("Descripcion: ");

        return new Metodo_Pago(codigo, descripcion);
    }

    public static Cliente crearCliente() {
        Metodo_Pago metodoPago = ConsoleUtil.crearMetodoPago();
        return crearCliente(metodoPago);
    }

    public static Cliente crearCliente(Metodo_Pago metodoPago) {
        System.out.println("Creando un cliente...");
        String dni = ConsoleReader.readString("DNI: ");
        String nombre = ConsoleReader.readString("Nombre: ");
        String apellidos = ConsoleReader.readString("Apellidos: ");
        int telefono = ConsoleReader.readInt("Telefono: ");
        String direccion = ConsoleReader.readString("Direccion: ");
        String email = ConsoleReader.readString("Email: ");
        boolean activo = ConsoleReader.readBoolean("Activo? ");
        String pass = ConsoleReader.readString("Contraseña: ");
        LocalDate f_nacimiento = ConsoleReader.readDate("Fecha de nacimiento (yyyy-MM-dd: ");
        int numeroPedidos = ConsoleReader.readInt("Numero de Pedidos: ");
        boolean tieneTarjetaFidelizacion = ConsoleReader.readBoolean("Tiene tarjeta de fidelizacion?  ");
        String direccionEnvio = ConsoleReader.readString("Direccion envio: ");

        return new Cliente(dni, apellidos, nombre, telefono, direccion, email, activo, pass, f_nacimiento, numeroPedidos,
                tieneTarjetaFidelizacion, direccionEnvio, metodoPago, new ArrayList<Pedido>());
    }

    //Para crear Empleado
    public static Empleado crearEmpleado() {
        Departamento departamento = ConsoleUtil.crearDepartamento();
        return crearEmpleado(departamento);
    }

    public static Empleado crearEmpleado(Departamento departamento) {
        System.out.println("Creando un empleado...");
        String dni = ConsoleReader.readString("DNI: ");
        String nombre = ConsoleReader.readString("Nombre: ");
        String apellidos = ConsoleReader.readString("Apellidos: ");
        int telefono = ConsoleReader.readInt("Telefono: ");
        String direccion = ConsoleReader.readString("Direccion: ");
        String email = ConsoleReader.readString("Email: ");
        boolean activo = ConsoleReader.readBoolean("Activo? ");
        String pass = ConsoleReader.readString("Contraseña: ");
        LocalDate f_nacimiento = ConsoleReader.readDate("Fecha de nacimiento (yyyy-MM-dd: ");
        boolean tienePrivilegios = ConsoleReader.readBoolean("Tiene Privilegios? :");

        return new Empleado(dni, apellidos, nombre, telefono, direccion, email,
                            activo, pass, f_nacimiento, tienePrivilegios, departamento);
    }

    //Metodo para crear de la clase material
    public  static Material crearMaterial(){
        System.out.println("Creando un Material...");
        int codigo = ConsoleReader.readInt("Codigo del material: ");
        String denominacion =  ConsoleReader.readString("Denominacio: ");

        return new Material(codigo,denominacion);

    }

    //Metodo para crear de la clase LineaPedido
    public  static LineaPedido crearLineaPedido(){
        System.out.println("Creando una Linea de pedido...");
        Articulo articulo = ConsoleUtil.crearBolso();
        int num_pedido =  ConsoleReader.readInt("Número del pedido: ");

        return new LineaPedido(num_pedido, articulo);
    }

    //Metodo para crear de la clase Departamento
    public static Departamento crearDepartamento(){
        System.out.println("Creando un Departamento...");
        int codigo = ConsoleReader.readInt("Codigo del Departamento: ");
        String nombre =  ConsoleReader.readString("nombre del Departamento:: ");

        return new Departamento(codigo,nombre);
    }
}
