package gashe.com.myrecycler;

/**
 * Created by cice on 18/3/17.
 */

public class Libro {

    private String autor;
    private String titulo;

    public Libro(String autor, String titulo) {
        this.autor = autor;
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
