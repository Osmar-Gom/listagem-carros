package com.example.listagem;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CarroDetalheActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carro_detalhe);
        String descricaoCarro = getIntent().getStringExtra("descricao");
        TextView textViewCarroDescricao = findViewById(R.id.textViewCarroNome);
        textViewCarroDescricao.setText(descricaoCarro);
    }
}