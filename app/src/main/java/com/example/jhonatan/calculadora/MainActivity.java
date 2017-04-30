package com.example.jhonatan.calculadora;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //declaro variables

    TextView texto1;
    TextView texto2;
    Button boton1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // texteando
        texto1 =(TextView) findViewById(R.id.view1);
        texto2 =(TextView) findViewById(R.id.view2);

        boton1 = (Button) findViewById(R.id.buttoningresar);

        //llamo el metodo
        boton1.setOnClickListener(this);

    }

    //metodo para pasar a la segunda vista

    @Override
    public void onClick(View view) {

        //este es el intento de pasar
        Intent dos = new Intent(this, operaciones.class);
        startActivity(dos);

    }
}
