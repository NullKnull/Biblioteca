package proyectobiblioteca;

public class Libro {
    
    //Atributos
    private String titulo;
    private int paginas;
    private Autor autor;
    
    
    //Constructores
    public Libro(String titulo, int paginas, Autor autor){
        this.titulo = titulo;
        this.paginas = paginas;
        this.autor = autor;
    }
    
    public Libro(String titulo, int paginas){
        this(titulo, paginas, new Autor());
    }
    
    public Libro(String titulo){
        this(titulo, 0, new Autor());
    }
    
    
    //Setters
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public void setPaginas(int paginas){
        this.paginas = paginas;
    }
    
    public void setAutor(Autor autor){
        this.autor = autor;
    }
    
    
    //Getters
    public String getTitulo(){
        return titulo;
    }
    
    public int getPaginas(){
        return paginas;
    }
    
    public Autor getAutor(){
        return autor;
    }
}
