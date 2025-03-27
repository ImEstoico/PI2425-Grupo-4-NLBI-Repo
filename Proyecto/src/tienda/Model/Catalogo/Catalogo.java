package tienda.Model.Catalogo;

import tienda.Model.Articulos.*;

import java.util.ArrayList;
import java.util.Iterator;

public class Catalogo {
    private ArrayList<Articulo> articulo = new ArrayList<>();

    public Catalogo(ArrayList<Articulo> articulo) {
        this.articulo = articulo;
    }

    public Catalogo() {
        articulo = new ArrayList();
    }

    public ArrayList<Articulo> getArticulo() {
        return articulo;
    }

    public void setArticulo(ArrayList<Articulo> articulo) {
        this.articulo = articulo;
    }

    public void addArticulo(Articulo nuevo) {
        Articulo existente = getArticulo(nuevo.getCodigoArticulo());
        if (existente == null)
            articulo.add(nuevo);
        else
            System.out.println("Articulo duplicado");
    }

    public Articulo getArticulo(String id) {
        for (Articulo art : articulo) {
            if (art.getCodigoArticulo() == id)
                return art;
        }
        return null;
    }

    public boolean updateArticulo(Articulo nuevo) {
        Articulo existente = getArticulo(nuevo.getCodigoArticulo());
        if (existente != null) {
            existente.setNombre(nuevo.getNombre());
            return true;
        }
        System.out.println("Articulo no encontrado");
        return false;
    }

    public boolean deleteArticulo(String id) {
        boolean encontrado = false;
        Iterator<Articulo> iterador = articulo.iterator();
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
    public void Buscar_Codigo(ArrayList<Articulo> articulo) {
        this.articulo = articulo;
    }

    public boolean anadirCodigo(Articulo art) {
        boolean insertado = false;
        if (art != null) {
            insertado = articulo.add(art);
        }
        return insertado;
    }

    public Articulo BuscarCodigo(Articulo cod) {
        Articulo art = null, enc = null;
        boolean encontrado = false;
        Iterator<Articulo> iterator = articulo.iterator();
        while (iterator.hasNext() && !encontrado) {
            art = iterator.next();
            if (art.getCodigoArticulo() == cod.getCodigoArticulo()) {
                enc = art;
                encontrado = true;
            }
        }
        return enc;
    }

    public boolean borrarCodigo(Articulo cod) {
        boolean insertado = false;
        if (cod != null) {
            insertado = articulo.remove(cod);
        }
        return insertado;
    }

    // Apartado filtrar por Tipo

    public void Filtrar_Tipo(ArrayList<Articulo> filtrarTipo) {
        this.articulo = filtrarTipo;
    }

    public boolean anadirTipo(Articulo art) {
        boolean insertado = false;
        if (art != null) {
            insertado = articulo.add(art);
        }
        return insertado;
    }

    public Articulo BuscarTipo(Articulo tipo) {
        Articulo art = null, enc = null;
        boolean encontrado = false;
        Iterator<Articulo> iterator = articulo.iterator();
        while (iterator.hasNext() && !encontrado) {
            art = iterator.next();
            if (art.getDescripcion() == tipo.getDescripcion()) {
                enc = art;
                encontrado = true;
            }
        }
        return enc;
    }

    public boolean borrarTipo(Articulo art) {
        boolean insertado = false;
        if (art != null) {
            insertado = articulo.remove(art);
        }
        return insertado;
    }

    // Apartado filtrar por Material

    public boolean anadirFiltro(Articulo art) {
        boolean insertado = false;
        if (art != null) {
            insertado = articulo.add(art);
        }
        return insertado;
    }

    public Articulo BuscarMaterial(Articulo ma) {
        Articulo art = null, enc = null;
        boolean encontrado = false;
        Iterator<Articulo> iterator = articulo.iterator();
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
            insertado = articulo.remove(art);
        }
        return insertado;
    }

    // Apartado filtrar por Activación
    public boolean anadirActivacion(Articulo tip) {
        boolean insertado = false;
        if (tip != null) {
            insertado = articulo.add(tip);
        }
        return insertado;
    }

    public Articulo BuscarActivacion(Articulo act) {
        Articulo art = null, enc = null;
        boolean encontrado = false;
        Iterator<Articulo> iterator = articulo.iterator();
        while (iterator.hasNext() && !encontrado) {
            art = iterator.next();
            if (art.isActivo() == act.isActivo()) {
                enc = art;
                encontrado = true;
            }
        }
        return enc;
    }

    public boolean borrarActivacion(Articulo art) {
        boolean insertado = false;
        if (art != null) {
            insertado = articulo.remove(art);
        }
        return insertado;
    }
}

