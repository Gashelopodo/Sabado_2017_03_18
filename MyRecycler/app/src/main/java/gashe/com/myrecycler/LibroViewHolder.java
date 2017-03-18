package gashe.com.myrecycler;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by cice on 18/3/17.
 */

public class LibroViewHolder extends RecyclerView.ViewHolder {

    private TextView box_autor;
    private TextView box_titulo;

    public LibroViewHolder(View itemView) {
        super(itemView);
        //TODO setear atributos
        box_titulo = (TextView) itemView.findViewById(R.id.myTituloLibro);
        box_autor = (TextView) itemView.findViewById(R.id.myAutorLibro);
    }

    public void cargarLibroEnHolder(Libro libro){
        this.box_titulo.setText(libro.getTitulo());
        this.box_autor.setText(libro.getAutor());
    }
}
