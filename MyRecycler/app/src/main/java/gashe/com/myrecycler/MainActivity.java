package gashe.com.myrecycler;

import android.graphics.drawable.GradientDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<Libro> datos = new ArrayList<Libro>();
    private AdapterLibros adapterLibros;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Libro libro;

        for(int i = 0; i < 20; i++){
            libro = new Libro("Autor " + i, "Libro " +  i);
            datos.add(libro);
        }

        recyclerView = (RecyclerView) findViewById(R.id.myRecycler);
        adapterLibros = new AdapterLibros(datos);
        recyclerView.setAdapter(adapterLibros);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 3);

        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));

        recyclerView.setItemAnimator(new DefaultItemAnimator());

    }

    public void addElement(View v){
        Libro libro = new Libro("Autor " + datos.size(), "Libro " + datos.size());
        datos.add(5, libro);
        adapterLibros.notifyItemInserted(5);
    }

    public void deleteElement(View v){

        if(datos.size() > 0) {
            datos.remove(5);
            adapterLibros.notifyItemRemoved(5);
        }else{
            Toast.makeText(this, "inserta para eliminar", 1000).show();
        }
    }

}
