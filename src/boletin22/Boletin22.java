package boletin22;

/**
 *
 * @author ylagorebollar
 */
public class Boletin22 {
    public static void main(String[] args) {
       Libreria l=new Libreria();
       l.crearLibreria();
       l.verLibros();
       l.engadirLibros(null);
       l.verLibros();
       l.eliminarLibro(null);
       l.verLibros();
    }
    
}
