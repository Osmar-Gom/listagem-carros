package com.example.listagem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements CarroAdapterRecyclerView.OnItemClickListener {
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        CarroDao carroDao =new CarroDao();
        CarroAdapterRecyclerView padapterRV= new CarroAdapterRecyclerView(this,
                R.layout.carro_item,
                carroDao.getAllCarros(),
                this
                );

        recyclerView.setAdapter(padapterRV);

    }

    @Override
    public void onItemClick(Carro carro) {
        Intent intent = new Intent(this, CarroDetalheActivity.class);
        intent.putExtra("descricao", carro.descricao);
        startActivity(intent);
    }
}