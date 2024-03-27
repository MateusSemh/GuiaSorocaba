package com.example.tarefa2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

public class TelaBlackout extends AppCompatActivity {

    // Declarando os botões
    Button btnMapa, btnSite, btnTelefone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_blackout);

        // Chamando os botões
        this.btnMapa = (Button) findViewById(R.id.btnVerMapa);
        this.btnSite = (Button) findViewById(R.id.btnAbrirSite);
        this.btnTelefone = (Button) findViewById(R.id.btnTelefonar);

        // Método para abrir no Mapa

        this.btnMapa.setOnClickListener(v -> {
            Uri gmmIntentUri =
                    Uri.parse("geo:0,0?q=Rua+Pedro+Acquati+26");
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
            startActivity(mapIntent);

        });

        // Método para abrir site

        this.btnSite.setOnClickListener(v -> {
            Uri webpage = Uri.parse("https://www.ifood.com.br/delivery/sorocaba-sp/blackout-unidade-pda-jardim-brasilandia/9cd3ff25-13f9-4f39-9445-9f2d543b28ff?utm_medium=share");
            Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
            startActivity(intent);
        });

        // Método para telefonar
        this.btnTelefone.setOnClickListener(v1 -> {
            Uri uri = Uri.parse("tel:15998385882"); // coloquei o meu telefone
            Intent intent = new Intent(Intent.ACTION_DIAL,uri);
            startActivity(intent);
            });


    }
}