package proyectobiblioteca;

import java.util.ArrayList;

public class Biblioteca {
    
    //Atributos
    private ArrayList<Libro> libros;
    
    
    //Constructores
    public Biblioteca(){
        libros = new ArrayList<>();
    }
    
    
    //metodos
    
    public boolean agregar(Libro libro){
        if(libro == null){
            return false;
        }
        if(buscarLibro(libro.getTitulo()) == null){
            libros.add(libro);
            return true;
        }
        return false;
    }
    
    
    public int eliminarLibro(String nombre){
        if(nombre == null){
            return 0;
        }
        
        int eliminados = 0;
        
        for(int i = 0; i < libros.size(); i++){
            if(nombre.equals(libros.get(i).getTitulo())){
                libros.remove(i);
                i--;
                eliminados++;
            }
        }
        return eliminados;
    }
    
    public Libro buscarLibro(String titulo){
        if(titulo == null){
            return null;
        }
        
        for(Libro l : libros){
            if(titulo.equals(l.getTitulo())){
                return l;
            }
        }
        return null;
    }
    
    public String mostrarLibros(){
        String resultado = "";
        
        for(Libro l : libros){
        resultado += l.getTitulo() + "\n";
        }
        return resultado;
    }

    public ArrayList<Libro> librosDeAutor(String autor){
        if(autor == null){
            return null;
        }
        
        ArrayList<Libro> resultado = new ArrayList<>();
        
        for(Libro l : libros){
            if(autor.equals(l.getAutor().getNombre())){
                resultado.add(l);
            }
        }
        return resultado;
    }
}
