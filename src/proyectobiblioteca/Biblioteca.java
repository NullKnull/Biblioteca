package proyectobiblioteca;

import java.util.ArrayList;

/**
 * Representa una biblioteca que almacena y gestiona una colección de libros.
 * Permite agregar, buscar, eliminar y consultar libros por autor.
 * 
 * @author NullKnull
 * @version 1.0
 */
public class Biblioteca {

    /**
     * Lista que almacena los libros de la biblioteca.
     */
    private ArrayList<Libro> libros;

    /**
     * Crea una biblioteca vacía.
     */
    public Biblioteca() {
        libros = new ArrayList<>();
    }

    /**
     * Busca un libro por su título.
     *
     * @param titulo Título del libro a buscar.
     * @return El libro encontrado o null si no existe.
     */
    public Libro buscarLibro(String titulo) {
        if (titulo == null) {
            return null;
        }

        for (Libro l : libros) {
            if (titulo.equals(l.getTitulo())) {
                return l;
            }
        }
        return null;
    }

    /**
     * Agrega un libro a la biblioteca si no existe otro con el mismo título.
     *
     * @param libro Libro que se desea agregar.
     * @return true si el libro fue agregado; false en caso contrario.
     */
    public boolean agregar(Libro libro) {
        if (libro == null) {
            return false;
        }

        if (buscarLibro(libro.getTitulo()) == null) {
            libros.add(libro);
            return true;
        }

        return false;
    }

    /**
     * Elimina todos los libros cuyo título coincida con el indicado.
     *
     * @param titulo Título del libro a eliminar.
     * @return Cantidad de libros eliminados.
     */
    public int eliminarLibro(String titulo) {
        if (titulo == null) {
            return 0;
        }

        int eliminados = 0;

        for (int i = 0; i < libros.size(); i++) {
            if (titulo.equals(libros.get(i).getTitulo())) {
                libros.remove(i);
                i--;
                eliminados++;
            }
        }

        return eliminados;
    }

    /**
     * Muestra los títulos de todos los libros almacenados en la biblioteca.
     *
     * @return Cadena con los títulos de los libros, uno por línea.
     */
    public String mostrarLibros() {
        String resultado = "";

        for (Libro l : libros) {
            resultado += l.getTitulo() + "\n";
        }

        return resultado;
    }

    /**
     * Obtiene todos los libros escritos por un autor determinado.
     *
     * @param autor Nombre del autor.
     * @return Lista de libros del autor indicado.
     */
    public ArrayList<Libro> librosDeAutor(String autor) {
        if (autor == null) {
            return null;
        }

        ArrayList<Libro> resultado = new ArrayList<>();

        for (Libro l : libros) {
            if (autor.equals(l.getAutor().getNombre())) {
                resultado.add(l);
            }
        }

        return resultado;
    }
}