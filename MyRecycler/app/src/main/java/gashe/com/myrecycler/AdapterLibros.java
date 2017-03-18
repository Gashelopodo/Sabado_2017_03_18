package gashe.com.myrecycler;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by cice on 18/3/17.
 */

public class AdapterLibros extends RecyclerView.Adapter<LibroViewHolder> {

    private ArrayList<Libro> datos;

    public AdapterLibros(ArrayList<Libro> datos) {
        this.datos = datos;
    }

    @Override
    public LibroViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LibroViewHolder libroViewHolder = null;
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View viewItem = layoutInflater.inflate(R.layout.layaout_libro_item, parent, false);
        libroViewHolder = new LibroViewHolder(viewItem);

        return libroViewHolder;
    }

    @Override
    public void onBindViewHolder(LibroViewHolder holder, int position) {
        Libro libro = datos.get(position);
        holder.cargarLibroEnHolder(libro);
    }

    @Override
    public int getItemCount() {
        return datos.size();
    }
}
