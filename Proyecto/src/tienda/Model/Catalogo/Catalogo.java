package tienda.Model.Catalogo;

import tienda.Model.Articulos.*;

import java.util.ArrayList;
import java.util.Iterator;

public class Catalogo {
    private ArrayList<Articulo> articulos = new ArrayList<>();

    public Catalogo(ArrayList<Articulo> articulo) {
        this.articulos = articulo;
    }

    public Catalogo() {
        articulos = new ArrayList();
    }

    public ArrayList<Articulo> getArticulo() {
        return articulos;
    }

    public void setArticulo(ArrayList<Articulo> articulo) {
        this.articulos = articulo;
    }

    public void addArticulo(Articulo nuevo) {
        Articulo existente = getArticulo(nuevo.getCodigoArticulo());
        if (existente == null)
            articulos.add(nuevo);
        else
            System.out.println("Articulo duplicado");
    }

    public Articulo getArticulo(String id) {
        for (Articulo art : articulos) {
            if (art.getCodigoArticulo() == id)
                return art;
        }
        return null;
    }

    public boolean updateArticulo(Articulo nuevo) {
        Articulo existente = getArticulo(nuevo.getCodigoArticulo());
        if (existente != null) {
            existente.setCodigoArticulo(nuevo.getCodigoArticulo());
            existente.setNombre(nuevo.getNombre());
            existente.setPrecio(nuevo.getPrecio());
            existente.setMarca(nuevo.getMarca());
            existente.setDescripcion(nuevo.getDescripcion());
            existente.setImagen(nuevo.getImagen());
            existente.setActivo(nuevo.isActivo());
            existente.setColor(nuevo.getColor());
            existente.setMaterial(nuevo.getMaterial());
            return true;
        }
        System.out.println("Articulo no encontrado");
        return false;
    }

    public boolean deleteArticulo(String id) {
        boolean encontrado = false;
        Iterator<Articulo> iterador = articulos.iterator();
        while (iterador.hasNext()) {
            Articulo art = iterador.next();
            if (art.getCodigoArticulo() == id) {
                iterador.remove();
                encontrado = true;
            }
        }
        if (!encontrado)
            System.out.println("Articulo no encontrado");
        return encontrado;
    }

    // Apartado Buscar por codigo
    public void Buscar_Codigo(String codigoArticulo) {
        for (Articulo art : articulos) {
            if (art.getCodigoArticulo().equals(codigoArticulo)) {
                System.out.println(art);
            }
        }
    }

    public Articulo BuscarCodigo(Articulo cod) {
        Articulo art = null, enc = null;
        boolean encontrado = false;
        Iterator<Articulo> iterator = articulos.iterator();
        while (iterator.hasNext() && !encontrado) {
            art = iterator.next();
            if (art.getCodigoArticulo().equals(cod.getCodigoArticulo())) {
                enc = art;
                encontrado = true;
            }
        }
        return enc;
    }

    public boolean borrarCodigo(String codigoArticulo) {
        boolean insertado = false;
        if (codigoArticulo != null) {
            insertado = articulos.remove(codigoArticulo);
        }
        return insertado;
    }

    // Apartado filtrar por Tipo

    public void Filtrar_Tipo(ArrayList<Articulo> filtrarTipo) {
        this.articulos = filtrarTipo;
    }

    public boolean anadirTipo(Articulo art) {
        boolean insertado = false;
        if (art != null) {
            insertado = articulos.add(art);
        }
        return insertado;
    }

    public Articulo BuscarTipo(Bolso bolso) {
        Articulo art = null, enc = null;
        boolean encontrado = false;
        Iterator<Articulo> iterator = articulos.iterator();
        while (iterator.hasNext() && !encontrado) {
            art = iterator.next();
            if (art.getDescripcion() == bolso.getDescripcion()) {
                enc = art;
                encontrado = true;
            }
        }
        return enc;
    }

    public boolean borrarTipo(Bolso bolso) {
        boolean insertado = false;
        if (bolso != null) {
            insertado = articulos.remove(bolso);
        }
        return insertado;
    }

    // Apartado filtrar por Material

    public boolean anadirFiltro(Articulo art) {
        boolean insertado = false;
        if (art != null) {
            insertado = articulos.add(art);
        }
        return insertado;
    }

    public Articulo BuscarMaterial(Articulo ma) {
        Articulo art = null, enc = null;
        boolean encontrado = false;
        Iterator<Articulo> iterator = articulos.iterator();
        while (iterator.hasNext() && !encontrado) {
            art = iterator.next();
            if (art.getDescripcion() == ma.getDescripcion()) {
                enc = art;
                encontrado = true;
            }
        }
        return enc;
    }

    public boolean borrarFiltro(Articulo art) {
        boolean insertado = false;
        if (art != null) {
            insertado = articulos.remove(art);
        }
        return insertado;
    }

    // Apartado filtrar por Activación
    public boolean anadirActivacion(Articulo tip) {
        boolean insertado = false;
        if (tip != null) {
            insertado = articulos.add(tip);
        }
        return insertado;
    }

    public Articulo BuscarActivacion(Articulo act) {
        Articulo art = null, enc = null;
        boolean encontrado = false;
        Iterator<Articulo> iterator = articulos.iterator();
        while (iterator.hasNext() && !encontrado) {
            art = iterator.next();
            if (art.isActivo() == act.isActivo()) {
                enc = art;
                encontrado = true;
            }
        }
        return enc;
    }

    //Este es el que nos pusiste de ejemplo, pero da errores.
//    public ArrayList buscarPorActivo(boolean activo) {
//        ArrayList sublista = new ArrayList<>();
//        Articulo art = null;
//        Iterator iterator = articulos.iterator();
//        while (iterator.hasNext() && !encontrado) {
//            art = iterator.next();
//            if (art.isActivo() == activo) {
//                sublista.add(art);
//            }
//        } return sublista;
//    }

    public boolean borrarActivacion(Articulo art) {
        boolean insertado = false;
        if (art != null) {
            insertado = articulos.remove(art);
        }
        return insertado;
    }
}

