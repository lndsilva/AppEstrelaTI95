package br.com.local.appestrelati95;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Splash_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_layout);

        //Criar um relógio interno do sistema, necessita
        // de um tempo para execução

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //Aqui dentro deverá ser inserido o processo que será aberto
                //neste caso será a janela de login
                startActivity(new Intent(getApplicationContext(),
                        Login_Activity.class));
                //fechando a janela de spash depois de abrir
                finish();
            }
        }, 3000);


    }
}