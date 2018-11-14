package com.example.monster_pc.somdosanimais;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener {

    private ImageView cao;
    private ImageView gato;
    private ImageView macaco;
    private ImageView porco;
    private ImageView vaca;
    private ImageView leao;
    private ImageView galinha;
    private ImageView pintinho;
    private ImageView pato;

    private MediaPlayer mediaPlayer; // Media Player para executar os audios

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        //Atribuicao -> Relacionando ImageViews com Elementos da interface (por ID)
        //Utilizando notacao matricial (i;j) para o ID dos botoes

        cao = (ImageView) findViewById(R.id.button_00);
        gato = (ImageView) findViewById(R.id.button_01);
        macaco = (ImageView) findViewById(R.id.button_02);
        porco = (ImageView) findViewById(R.id.button_10);
        vaca = (ImageView) findViewById(R.id.button_11);
        leao = (ImageView) findViewById(R.id.button_12);
        galinha = (ImageView) findViewById(R.id.button_20);
        pintinho = (ImageView) findViewById(R.id.button_21);
        pato = (ImageView) findViewById(R.id.button_22);


        //Set do Evento de Click

        cao.setOnClickListener(this);
        gato.setOnClickListener(this);
        macaco.setOnClickListener(this);
        porco.setOnClickListener(this);
        vaca.setOnClickListener(this);
        leao.setOnClickListener(this);
        galinha.setOnClickListener(this);
        pintinho.setOnClickListener(this);
        pato.setOnClickListener(this);

    }

    //Override do Metodo onClick, utilizando Switch para simplificar o codigo
    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.button_00:
                mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.cao);
                tocarSom();
                Toast.makeText(MainActivity.this,"Cachorro",Toast.LENGTH_SHORT).show();
                break;
            case R.id.button_01:
                mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.gato);
                tocarSom();
                Toast.makeText(MainActivity.this,"Gato",Toast.LENGTH_SHORT).show();
                break;
            case R.id.button_02:
                mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.macaco);
                tocarSom();
                Toast.makeText(MainActivity.this,"Macaco",Toast.LENGTH_SHORT).show();
                break;
            case R.id.button_10:
                mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.porco);
                tocarSom();
                Toast.makeText(MainActivity.this,"Porco",Toast.LENGTH_SHORT).show();
                break;
            case R.id.button_11:
                mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.vaca);
                tocarSom();
                Toast.makeText(MainActivity.this,"Vaca",Toast.LENGTH_SHORT).show();
                break;
            case R.id.button_12:
                mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.leao);
                tocarSom();
                Toast.makeText(MainActivity.this,"Leão",Toast.LENGTH_SHORT).show();
                break;
            case R.id.button_20:
                mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.galinha);
                tocarSom();
                Toast.makeText(MainActivity.this,"Galinha",Toast.LENGTH_SHORT).show();
                break;
            case R.id.button_21:
                mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.pintinho);
                tocarSom();
                Toast.makeText(MainActivity.this,"Pintinho",Toast.LENGTH_SHORT).show();
                break;
            case R.id.button_22:
                mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.pato);
                tocarSom();
                Toast.makeText(MainActivity.this,"Pato",Toast.LENGTH_SHORT).show();
                break;

        }
    }

    //Metodo para reproduzir os arquivos .mp3
    public void tocarSom() {
        if(mediaPlayer != null){
            mediaPlayer.start();
        }
    }

    //Override do metodo onDestroy() para liberar os recursos utilizados pelo Media Player
    @Override
    protected void onDestroy() {
        if(mediaPlayer != null){
            mediaPlayer.release();
            mediaPlayer = null; // Atribuindo null -> Liberar recursos
        }
        super.onDestroy();
    }
}
