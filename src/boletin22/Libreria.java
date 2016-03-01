package boletin22;

import java.util.*;

/**
 *
 * @author ylagorebollar
 */
public class Libreria {
    ArrayList <Libros> libro= new ArrayList ();
    
    /**
     * Crea a libreria
     */
    public void crearLibreria(){
        Libros libro1=new Libros("aaa", "aaa aaa", 15.99, 5);
        Libros libro2=new Libros("bbb", "bbb bbb", 10.99, 3);
        Libros libro3=new Libros("ccc", "ccc ccc", 5.50, 8);
        libro.add(libro1);
        libro.add(libro2);
        libro.add(libro3);
    }
    /**
     * Visualiza os libros
     */
    public void verLibros(){
        for(int i=0;i<libro.size();i++)
        System.out.println(libro.get(i));
    }
    /**
     * Engade libros novos
     * @param l 
     */
    public void engadirLibros(Libros l){
        libro.add(l);    
    }
    /**
     * Elimina libros
     * @param b 
     */
    public void eliminarLibro(Libros b){
        libro.remove(b);
    }
    
    /**
    * Ordena os libros por titulo do libro
    */
    /*public void ordenarLibros(){
        Collections.sort(libro);
    }*/
    /**
     * Dado o título dun libro visualiza o seu prezo 
     */
    public void consultarPrezoLibro(){
        
    }
    /**
     * Busca libros dun autor
     */
    public void buscarLibroAutor(){
        
    }
    /**
     * Modifica o prezo dun libro determinado
     */
    public void modificarPrezoLibro(){
        
    }
    
}
