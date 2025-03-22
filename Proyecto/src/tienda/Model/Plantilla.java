package tienda.Model;

import java.util.ArrayList;

public class Plantilla{


    private ArrayList<Empleado> empleados = new ArrayList();

//Contructor
    public Plantilla(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    public Plantilla() {
        empleados = new ArrayList();
    }

//Getter
    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }


//Setter
    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }


//CRUD: CREA,leer,actualizar y borrar

    public void  addEmpleado(Empleado nuevoEmpleado) {
        Empleado empleado = getEmpleado (nuevoEmpleado.getDni());
        if (empleado == null) {
            empleados.add(nuevoEmpleado);
        }
        else {
            System.out.println("Empleado ya existe");
        }

    }

    public Empleado getEmpleado(String dni) {
        for (Empleado empleado : empleados) {
            if(empleado.getDni() == empleado.getDni()){
                return empleado;
            }
        }
        return null;
    }

    public boolean updateEmpleado(Empleado nuevoempleado) {
        for (Empleado empleado : empleados) {
            if(empleado.getDni() == nuevoempleado.getDni()){
                empleado.setNombre(nuevoempleado.getNombre());
                return true;
            }
        }
        System.out.println("Empleado no encontrado");
        return false;
    }

    public boolean deleteEmpleado(int codigo) {
        for (Empleado empleado : empleados) {
            if(empleado.getDni() == empleado.getDni()){
                empleados.remove(empleado);
                return true;
            }
        }
        System.out.println("Empleado no encontrado");
        return false;
    }



//Metodos

    public void BuscarDniEmpleado(String dni) {
        for (Empleado empleado : empleados) {
            if(empleado.getDni() == dni){
                System.out.println(empleado);
            }
        }
    }

    public void FiltrarNombresEmpleado(String nombre, String apellidos) {
       ArrayList<Empleado> empleadosFiltrados = new ArrayList();
        for (Empleado empleado : empleados) {
            if(empleado.getNombre() == nombre && empleado.getApellidos() == apellidos){
                empleadosFiltrados.add(empleado);
            }
        }

    }

    public void FiltrarDepartamentoEmpleado(String departamento) {
        ArrayList<Empleado> empleadosFiltrados = new ArrayList();
        for (Empleado empleado : empleados) {
            if(empleado.getDepartamento().equals(departamento)){
                empleadosFiltrados.add(empleado);
            }
        }
    }

    public void FiltrarPrivilegiosEmpleado(boolean tienePrivilegios) {
        ArrayList<Empleado> empleadosFiltrados = new ArrayList();
        for (Empleado empleado : empleados) {
            if(empleado.tienePrivilegios() == tienePrivilegios){
                empleadosFiltrados.add(empleado);
            }
        }
    }

//ToString
    @Override
    public String toString() {
        return "Plantilla{" +
                "empleados=" + empleados +
                '}';
    }
}
