package com.example.tarefa2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    // Declarando os componentes
    ImageButton btnImgBlackout, btnImgGelato, btnImgRamal;
    Button btnBlackout, btnGelato, btnRamal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Chamando os botões de img e os Saiba Mais
        this.btnBlackout = (Button) findViewById(R.id.btnBlackout);
        this.btnImgBlackout = (ImageButton) findViewById(R.id.btnImgBlackout);

        this.btnGelato = (Button) findViewById(R.id.btnGelato);
        this.btnImgGelato = (ImageButton) findViewById(R.id.btnImgGelato);

        this.btnRamal = (Button) findViewById(R.id.btnRamal);
        this.btnImgRamal = (ImageButton) findViewById(R.id.btnImgRamal);

        // Fazendo a chamada para ir às determinadas telas
        this.setIntent(this.btnBlackout, TelaBlackout.class);
        this.setIntentImg(this.btnImgBlackout, TelaBlackout.class);

        this.setIntent(this.btnGelato, TelaGelato.class);
        this.setIntentImg(this.btnImgGelato, TelaGelato.class);

        this.setIntent(this.btnRamal, TelaRamal.class);
        this.setIntentImg(this.btnImgRamal, TelaRamal.class);

    }

    // Método do botãoImg para chamar as outras telas
    private void setIntentImg(ImageButton imageButton, Class viewClass) {
        imageButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, viewClass);
            startActivity(intent);
        });
    }

    // Método do botão Saiba Mais para chamar as outras telas
    private void setIntent(Button Button, Class viewClass) {
        Button.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, viewClass);
            startActivity(intent);
        });
    }

}