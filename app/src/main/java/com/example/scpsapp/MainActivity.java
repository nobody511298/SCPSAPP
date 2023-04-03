package com.example.scpsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_entrar = (Button) findViewById(R.id.btn_entrar); //chama o botao nop main ?
        btn_entrar.setOnClickListener(new View.OnClickListener() { //quando o botao é apertado
            @Override
            public void onClick(View view) { //quando clicar no botao
                Intent tela_login = new Intent(MainActivity.this, TelaLogin.class); //cria uma intent da telalogin
                startActivity(tela_login);// inicia a telalogin

            }
        });
    }

}