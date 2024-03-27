package com.example.tarefa2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

public class TelaGelato extends AppCompatActivity {

    // Declarando os botões
    Button btnMapa, btnSite, btnTelefone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_gelato);

        // Chamando os botões
        this.btnMapa = (Button) findViewById(R.id.btnVerMapaGelato);
        this.btnSite = (Button) findViewById(R.id.btnAbrirSiteGelato);
        this.btnTelefone = (Button) findViewById(R.id.btnTelefonarGelato);

        // Método para abrir no Mapa

        this.btnMapa.setOnClickListener(v -> {
            Uri gmmIntentUri =
                    Uri.parse("geo:0,0?q=Avenida+Professora+Izoraida+Marques+Peres+401");
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
            startActivity(mapIntent);

        });

        // Método para abrir site

        this.btnSite.setOnClickListener(v -> {
            Uri webpage = Uri.parse("https://www.purogelato.com.br/sorocaba");
            Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
            startActivity(intent);
        });

        // Método para telefonar
        this.btnTelefone.setOnClickListener(v1 -> {
            Uri uri = Uri.parse("tel:15998385882"); //coloquei o meu telefone
            Intent intent = new Intent(Intent.ACTION_DIAL,uri);
            startActivity(intent);
        });


    }
}