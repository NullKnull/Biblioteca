package proyectobiblioteca;

/**
 * Representa un libro dentro de la biblioteca.
 * Almacena información básica como título, número de páginas y autor.
 * 
 * @author TuNombre
 * @version 1.0
 */
public class Libro {

    /**
     * Título del libro.
     */
    private String titulo;

    /**
     * Número de páginas del libro.
     */
    private int paginas;

    /**
     * Autor del libro.
     */
    private Autor autor;

    /**
     * Crea un libro indicando título, número de páginas y autor.
     *
     * @param titulo Título del libro.
     * @param paginas Número de páginas del libro.
     * @param autor Autor del libro.
     */
    public Libro(String titulo, int paginas, Autor autor) {
        this.titulo = titulo;
        this.paginas = paginas;
        this.autor = autor;
    }

    /**
     * Crea un libro indicando título y número de páginas.
     * El autor se inicializa con valores predeterminados.
     *
     * @param titulo Título del libro.
     * @param paginas Número de páginas del libro.
     */
    public Libro(String titulo, int paginas) {
        this(titulo, paginas, new Autor());
    }

    /**
     * Crea un libro indicando únicamente el título.
     * El número de páginas se inicializa en 0 y el autor con valores predeterminados.
     *
     * @param titulo Título del libro.
     */
    public Libro(String titulo) {
        this(titulo, 0, new Autor());
    }

    /**
     * Modifica el título del libro.
     *
     * @param titulo Nuevo título del libro.
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Modifica el número de páginas del libro.
     *
     * @param paginas Nuevo número de páginas del libro.
     */
    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    /**
     * Modifica el autor del libro.
     *
     * @param autor Nuevo autor del libro.
     */
    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    /**
     * Obtiene el título del libro.
     *
     * @return Título del libro.
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Obtiene el número de páginas del libro.
     *
     * @return Número de páginas del libro.
     */
    public int getPaginas() {
        return paginas;
    }

    /**
     * Obtiene el autor del libro.
     *
     * @return Autor del libro.
     */
    public Autor getAutor() {
        return autor;
    }
}