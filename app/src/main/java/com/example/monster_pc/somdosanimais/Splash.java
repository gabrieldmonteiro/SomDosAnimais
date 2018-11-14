package com.example.monster_pc.somdosanimais;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        final Intent intent = new Intent(this, MainActivity.class); // Criacao obj Intent

        //Delay - Splash Screen
        Runnable r = new Runnable() {
            @Override
            public void run() {
                startActivity(intent);
            }
        };

        Handler h = new Handler();
        // Runnable sera executado apos o delay
        h.postDelayed(r, 3000); // Delay de 3 segundos


    }
}

