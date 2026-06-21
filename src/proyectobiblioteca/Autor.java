package proyectobiblioteca;

/**
 * Representa a un autor de libros.
 * Almacena información básica como nombre, nacionalidad y edad.
 * 
 * @author TuNombre
 * @version 1.0
 */
public class Autor {

    /**
     * Nombre del autor.
     */
    private String nombre;

    /**
     * Nacionalidad del autor.
     */
    private String nacionalidad;

    /**
     * Edad del autor.
     */
    private int edad;

    /**
     * Crea un autor indicando nombre, nacionalidad y edad.
     *
     * @param nombre Nombre del autor.
     * @param nacionalidad Nacionalidad del autor.
     * @param edad Edad del autor.
     */
    public Autor(String nombre, String nacionalidad, int edad) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.edad = edad;
    }

    /**
     * Crea un autor indicando nombre y nacionalidad.
     * La edad se inicializa en 0.
     *
     * @param nombre Nombre del autor.
     * @param nacionalidad Nacionalidad del autor.
     */
    public Autor(String nombre, String nacionalidad) {
        this(nombre, nacionalidad, 0);
    }

    /**
     * Crea un autor indicando nombre y edad.
     * La nacionalidad se establece como "Desconocida".
     *
     * @param nombre Nombre del autor.
     * @param edad Edad del autor.
     */
    public Autor(String nombre, int edad) {
        this(nombre, "Desconocida", edad);
    }

    /**
     * Crea un autor con valores predeterminados.
     */
    public Autor() {
        this("Desconocido", "Desconocida", 0);
    }

    /**
     * Modifica el nombre del autor.
     *
     * @param nombre Nuevo nombre del autor.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Modifica la nacionalidad del autor.
     *
     * @param nacionalidad Nueva nacionalidad del autor.
     */
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    /**
     * Modifica la edad del autor.
     *
     * @param edad Nueva edad del autor.
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Obtiene el nombre del autor.
     *
     * @return Nombre del autor.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene la nacionalidad del autor.
     *
     * @return Nacionalidad del autor.
     */
    public String getNacionalidad() {
        return nacionalidad;
    }

    /**
     * Obtiene la edad del autor.
     *
     * @return Edad del autor.
     */
    public int getEdad() {
        return edad;
    }
}