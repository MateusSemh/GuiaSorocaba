package com.example.tarefa2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

public class TelaRamal extends AppCompatActivity {

    // Declarando os botões
    Button btnMapa, btnSite, btnTelefone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_ramal);

        // Chamando os botões
        this.btnMapa = (Button) findViewById(R.id.btnVerMapaRamal);
        this.btnSite = (Button) findViewById(R.id.btnAbrirSiteRamal);
        this.btnTelefone = (Button) findViewById(R.id.btnTelefonarRamal);

        // Método para abrir no Mapa

        this.btnMapa.setOnClickListener(v -> {
            Uri gmmIntentUri =
                    Uri.parse("geo:0,0?q=R+Aparecida+1361");
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
            startActivity(mapIntent);

        });

        // Método para abrir site

        this.btnSite.setOnClickListener(v -> {
            Uri webpage = Uri.parse("http://ramal10.com.br");
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