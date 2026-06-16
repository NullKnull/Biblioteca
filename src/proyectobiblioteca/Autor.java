package proyectobiblioteca;

public class Autor {
    
    //Atributos Autor
    private String nombre;
    private String nacionalidad;
    private int edad;
    
    //Constructores
    public Autor(String nombre, String nacionalidad, int edad){
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.edad = edad;
    }
    
    public Autor(String nombre, String nacionalidad){
        this(nombre, nacionalidad, 0);
    }
    
    public Autor(String nombre, int edad){
        this(nombre, "Desconocida", edad);
    }
    
    public Autor(){
        this("Desconocido", "Desconocida", 0);
    }
    
    
    //Setters
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setNacionalidad(String nacionalidad){
        this.nacionalidad = nacionalidad;
    }
    
    public void setEdad(int edad){
        this.edad = edad;
    }
    
    
    //Getters
    public String getNombre(){
        return nombre;
    }
    
    public String getNacionalidad(){
        return nacionalidad;
    }
    
    public int getEdad(){
        return edad;
    }
}
