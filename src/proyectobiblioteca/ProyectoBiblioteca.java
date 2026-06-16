package proyectobiblioteca;

import java.util.ArrayList;

public class ProyectoBiblioteca {

    public static void main(String[] args) {
        
        Autor stephen = new Autor("Stephen King", 60);
        
        Biblioteca terror = new Biblioteca();
        
        terror.agregar(new Libro("Carrie", 158));
        terror.agregar(new Libro("Eso"));
        
        System.out.println(terror.mostrarLibros());
        

        
        Libro encontrado;
        encontrado = terror.buscarLibro("Carrie");
        if(encontrado != null){
            encontrado.getAutor().setNombre("Stephen");
        }

    }
}
