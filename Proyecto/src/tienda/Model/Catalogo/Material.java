package tienda.Model.Catalogo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Material {

    private int codigo;
    private String denominacion;

    //Contructor

    @JsonCreator
    public Material(@JsonProperty("codigo") int codigo,@JsonProperty("denominacion") String denominacion) {
        this.codigo = codigo;
        this.denominacion = denominacion;
    }


    //Getter
    public int getCodigo() {
        return codigo;
    }

    public String getDenominacion() {
        return denominacion;
    }

    //setter
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }
}
