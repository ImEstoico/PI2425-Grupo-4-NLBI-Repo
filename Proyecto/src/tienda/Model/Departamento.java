package tienda.Model;

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
     public Departamento(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;

    }

}

