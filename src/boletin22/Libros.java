package boletin22;

/**
 * Informacion dos libros
 * @author ylagorebollar
 */
public class Libros {
    private String nomeLibro, autor;
    private double prezo;
    private int unidades;

    public Libros() {
    }

    public Libros(String nomeLibro, String autor, double prezo, int unidades) {
        this.nomeLibro = nomeLibro;
        this.autor = autor;
        this.prezo = prezo;
        this.unidades = unidades;
    }

    public String getNomeLibro() {
        return nomeLibro;
    }

    public void setNomeLibro(String nomeLibro) {
        this.nomeLibro = nomeLibro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPrezo() {
        return prezo;
    }

    public void setPrezo(float prezo) {
        this.prezo = prezo;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }
    
    
    
}
