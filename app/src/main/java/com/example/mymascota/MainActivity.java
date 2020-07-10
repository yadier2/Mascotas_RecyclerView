package com.example.mymascota;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
        import androidx.recyclerview.widget.RecyclerView;

        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.TextView;

        import java.util.ArrayList;
        import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView  recyclerViewMascota;
    private MyAdaptador   adaptadorMascota;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar miActionBar = (Toolbar) findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);

        recyclerViewMascota=(RecyclerView)findViewById(R.id.recyclerMascota);
        recyclerViewMascota.setLayoutManager(new LinearLayoutManager(this));

        adaptadorMascota=new MyAdaptador(obtenerCantantes());
        recyclerViewMascota.setAdapter(adaptadorMascota);

    }
    public List<MacotaModelo> obtenerCantantes(){
        List<MacotaModelo> mascota= new ArrayList<>();
        mascota.add(new MacotaModelo("Conejo",0,R.drawable.conejo));
        mascota.add(new MacotaModelo("Gato",0,R.drawable.gato));
        mascota.add(new MacotaModelo("Hamster",0,R.drawable.hamster));
        mascota.add(new MacotaModelo("Loro",0,R.drawable.loro));
        mascota.add(new MacotaModelo("Perro",0,R.drawable.perro));
        mascota.add(new MacotaModelo("Pez",0,R.drawable.pez));
        mascota.add(new MacotaModelo("Perro",0,R.drawable.perro2));
        mascota.add(new MacotaModelo("Pez",0,R.drawable.pez2));



        return mascota;
    }

    public void irMascotasFavoritas(View v) {
        Intent intent = new Intent(this, MascotasFavoritas.class);
        startActivity(intent);
    }

}