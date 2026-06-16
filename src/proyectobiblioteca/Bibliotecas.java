package proyectobiblioteca;
public class Bibliotecas {
    
    //Atributos
     private Libro[] libros;
     
     //Constructor
     public Bibliotecas(int tamaño){
         libros = new Libro[tamaño];
     }
     
     
     public boolean agregar(Libro libro){
         if(libro == null){
             return false;
         }
         
         for(int i = 0; i < libros.length; i++){
             if(libros[i] == null){
                 libros[i] = libro;
                 return true;
             }
         }
         return false;
     }
     

     
     
     public Libro buscar(String titulo){
         if(titulo == null){
             return null;
         }
         
         for(int i = 0; i < libros.length; i++){
             if(libros[i] != null){
                if(titulo.equals(libros[i].getTitulo())){
                 return libros[i];
                }
             }
         }
         return null;
     }
     
     public String mostrar(Libro[] buscar){
         if(buscar == null){
             return "";
         }
         String resultado = "";
         
         for(int i = 0; i < libros.length; i++){
             if(libros[i] != null){
                 resultado += libros[i].getTitulo() + "\n";
             }
         }
         return resultado;
     }
     
     
}
