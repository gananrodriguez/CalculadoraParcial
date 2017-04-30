package com.example.jhonatan.calculadora;

import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class operaciones extends AppCompatActivity implements View.OnClickListener {

    TextView vista3;
    TextView vista4;

    EditText uno, segundo;
    float val1;
    float val2;

    RadioGroup radioGroup;

    TextView mostrarR;
    TextView resultadorrr;

    Button regresar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operaciones);


        vista3 = (TextView) findViewById(R.id.view3);
        vista4 = (TextView) findViewById(R.id.view4);

        uno =(EditText) findViewById(R.id.valor1);
        segundo =(EditText) findViewById(R.id.valor2);

        radioGroup = (RadioGroup) findViewById(R.id.grupoR);

        mostrarR  = (TextView) findViewById(R.id.view5);

        resultadorrr = (TextView) findViewById(R.id.resultado);

        regresar = (Button)findViewById(R.id.button);

        regresar.setOnClickListener(this);

        this.botones();

    }


    //Metodo para regresar a la primer vista
    @Override
    public void onClick(View view) {

        Intent retorno = new Intent(this,MainActivity.class);
        startActivity(retorno);
    }

    public void botones() {



        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {

                val1 = Integer.parseInt(uno.getText().toString());
                val2 = Integer.parseInt(segundo.getText().toString());

                float total =0;
                switch (checkedId) {



                    case R.id.radioButton1:

                        total = val1 + val2;

                        Toast.makeText(getApplicationContext(),"Suma",Toast.LENGTH_SHORT).show();
                        break;


                    case R.id.radioButton2:

                        total = val1 - val2;

                        Toast.makeText(getApplicationContext(),"Resta",Toast.LENGTH_SHORT).show();
                        break;


                    case R.id.radioButton3:

                        total = val1 * val2;

                        Toast.makeText(getApplicationContext(),"Multiplicacion",Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.radioButton4:

                        total = val1 / val2;

                        Toast.makeText(getApplicationContext(),"Division",Toast.LENGTH_SHORT).show();
                        break;

                    default:

                        break;

                    
                }

                    resultadorrr.setText(String.valueOf(total));
            }
        });
    }


    //
}
