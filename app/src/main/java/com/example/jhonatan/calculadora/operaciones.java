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

    float total =0;

    RadioGroup radioGroup;

    TextView mostrarR;
    TextView resultadorrr;

    Button regresar;

    String sumando, restando, multiplicando, dividiendo;

    float  sumar, restar ,multiplicar, dividir;
    //valida
    float totalSuma, totalResta, totalMultiplicacion,totalDivision;

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

        Intent mandar = new Intent(this,Resultados.class);

        if  (totalSuma != 0 & totalResta != 0 & totalMultiplicacion != 0 & totalDivision != 0)

        {
            sumando = String.valueOf(sumar);
            mandar.putExtra("sum",sumar +"");

            restando = String.valueOf(restar);
            mandar.putExtra("res",restar +"");

            multiplicando =  String.valueOf(multiplicar);
            mandar.putExtra("mult",multiplicar +"");

            dividiendo = String.valueOf(dividir);
            mandar.putExtra("divi",dividir +"");


            startActivity(mandar);
        }

        else Toast.makeText(getApplicationContext(),"haga todas las operaciones",Toast.LENGTH_SHORT).show();
        return;


    }

    public void botones() {



        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {

                val1 = Float.parseFloat(uno.getText().toString());
                val2 = Float.parseFloat(segundo.getText().toString());




                switch (checkedId) {


                    case R.id.radioButton1:

                        total = val1 + val2;

                        sumar= total;

                        totalSuma = total;

                        resultadorrr.setText(String.valueOf(total));

                        Toast.makeText(getApplication(),"suma",Toast.LENGTH_SHORT).show();
                        return;


                    case R.id.radioButton2:

                        total = val1 - val2;

                        restar = total;

                        totalResta = total;


                        resultadorrr.setText(String.valueOf(total));

                        Toast.makeText(getApplication(),"resta",Toast.LENGTH_SHORT).show();
                        return;




                    case R.id.radioButton3:

                        total = val1 * val2;

                        multiplicar = total;

                        totalMultiplicacion = total;

                        resultadorrr.setText(String.valueOf(total));

                        Toast.makeText(getApplication(),"multiplicacion",Toast.LENGTH_SHORT).show();
                        return;



                    case R.id.radioButton4:

                        total = val1 / val2;

                        dividir = total;

                        totalDivision = total;

                        resultadorrr.setText(String.valueOf(total));

                        Toast.makeText(getApplication(),"division",Toast.LENGTH_SHORT).show();
                        return;

                    default:

                        break;


                }


            }
        });
    }


    //
}
