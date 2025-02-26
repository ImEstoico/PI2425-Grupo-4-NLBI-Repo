package Clases.sin.Composiciones;

public class Material {

    private int codigo;
    private String denominacion;

    //Contructor
    public Material(int codigo, String denominacion) {
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
