package tienda.Model.Empleados;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Departamento  {

    private int codigo;
    private String nombre;


    //Getter
    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    //setter
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Crear departamento

    @JsonCreator
    public Departamento(@JsonProperty("codigo") int codigo,@JsonProperty("nombre") String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }
}