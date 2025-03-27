package tienda.Util.File;

import com.fasterxml.jackson.databind.ObjectMapper;
import tienda.Model.Articulos.Articulo;
import tienda.Model.Clientes.*;
import tienda.Model.Empleados.Departamento;
import tienda.Model.Empleados.Empleado;
import tienda.Model.Pedidos.*;

import java.io.*;
import java.util.List;

public class FileUtil  {

    // Serializar un solo objeto (binario)
    public static void serializarObjeto(Object objeto, String filePath) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            oos.writeObject(objeto);
            System.out.println("Objeto serializado correctamente en binario.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Deserializar un objeto desde binario
    public static <T> T deserializarObjeto(String filePath, Class<T> clase) {
        T objeto = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            objeto = clase.cast(ois.readObject());
            System.out.println("Objeto deserializado correctamente desde binario.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return objeto;
    }

    // Serializar Listas de Objetos en Binario **

    // Serializar una lista de objetos (binario)
    public static void serializarListaObjetos(List<?> objetos, String filePath) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            oos.writeObject(objetos);
            System.out.println("Lista de objetos serializada correctamente en binario.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Deserializar una lista de objetos desde binario
    public static <T> List<T> deserializarListaObjetos(String filePath, Class<T> clase) {
        List<T> objetos = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            objetos = (List<T>) ois.readObject();
            System.out.println("Lista de objetos deserializada correctamente desde binario.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return objetos;
    }

    // Serializar Clientes en JSON
    public static void guardarClientesEnJson(List<Cliente> clientes, String filePath) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.writeValue(new File(filePath), clientes);
            System.out.println("Lista de clientes guardada correctamente en JSON.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Leer una lista de clientes desde JSON
    public static List<Cliente> leerClientesDesdeJson(String filePath) {
        List<Cliente> clientes = null;
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            clientes = objectMapper.readValue(new File(filePath),
                    objectMapper.getTypeFactory().constructCollectionType(List.class, Cliente.class));
            System.out.println("Lista de clientes leída correctamente desde JSON.");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return clientes;
    }

    // Serializar Métodos de Pago en JSON
    public static void guardarMetodosPagoEnJson(List<Metodo_Pago> metodosPago, String filePath) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.writeValue(new File(filePath), metodosPago);
            System.out.println("Lista de métodos de pago guardada correctamente en JSON.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Leer una lista de Metodo_Pago desde JSON
    public static List<Metodo_Pago> leerMetodosPagoDesdeJson(String filePath) {
        List<Metodo_Pago> metodosPago = null;
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            metodosPago = objectMapper.readValue(new File(filePath),
                    objectMapper.getTypeFactory().constructCollectionType(List.class, Metodo_Pago.class));
            System.out.println("Lista de métodos de pago leída correctamente desde JSON.");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return metodosPago;
    }

    //Serializar Articulos en JSON
    public static void guardarArticulosEnJson(List<Articulo> articulos, String filePath) {
        try (FileWriter writer = new FileWriter(filePath)) {

            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.enableDefaultTyping();//Sirve para habilitar la deserializacion en las jerarquias

            //Escribe la lista de articulos con sus subclases
            objectMapper.writeValue(writer, articulos);

        } catch (IOException e) {
            System.out.println("Error al guardar los artículos en el archivo JSON.");
            e.printStackTrace();
        }
    }

    // Métodos para leer Artículos desde un archivo JSON
    public static List<Articulo> leerArticulosDesdeJson(String filePath) {
        try (FileReader reader = new FileReader(filePath)) {

            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.enableDefaultTyping();//Sirve para habilitar la deserializacion en las jerarquias

            //Esta parte es la que lee y lo concierte en una lista
            List<Articulo> articulos = objectMapper.readValue(new File(filePath),
                    objectMapper.getTypeFactory().constructCollectionType(List.class, Articulo.class));
            return articulos;

        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    // Serializar Empleados en JSON
    public static List<Empleado> guardarEmpleadosEnJson (List<Empleado> empleados, String filePath) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.writeValue(new File(filePath), empleados);
            System.out.println("Lista de empleados guardada correctamente en JSON.");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return empleados;
    }

    public static List<Empleado> leerEmpleadosDesdeJson (String filePath) {
    List <Empleado> empleados = null;
    ObjectMapper objectMapper = new ObjectMapper();
        try {
            empleados = objectMapper.readValue(new File(filePath),
                    objectMapper.getTypeFactory().constructCollectionType(List.class, Empleado.class));
            System.out.println("Lista de empleados leída correctamente desde JSON.");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return empleados;
    }

    //Serializar Departamentos en JSON
    public static void guardarDepartamentosEnJson(List<Departamento> departamentos, String filePath) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.writeValue(new File(filePath), departamentos);
            System.out.println("Lista de departamentos guardada correctamente en JSON.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Leer una lista de Departamentos desde JSON
    public static List<Departamento> leerDepartamentosDesdeJson(String filePath) {
        List<Departamento> departamentos = null;
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            departamentos = objectMapper.readValue(new File(filePath),
                    objectMapper.getTypeFactory().constructCollectionType(List.class, Departamento.class));
            System.out.println("Lista de departamentos leída correctamente desde JSON.");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return departamentos;
    }
}