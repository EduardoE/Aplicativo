package com.ufpb.eduardo.guialegal;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity implements Runnable{
    private static final long DELAY = 4000;  //Tempo que a tela Splash ficara exibida na tela (4 segundos)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Handler handler = new Handler();       // Classe que contém o metodo postDelayed, que aguarda um tempo para realizar uma ação

        handler.postDelayed(this, DELAY);       //passamos uma Runnable, que é a propria classe e o tempo para o metodo executar o metodo run
    }

    @Override
    public void run() {
        Intent i = new Intent(this, MainActivity.class);      //classe usada para troca de Activity
        startActivity(i);                             // metodo para iniciar uma activity, passando o intent i,que fara a troca para MainActivity
        finish();                                  //Finaliza o SplashActivity
    }
}
