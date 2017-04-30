package com.example.jhonatan.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Resultados extends AppCompatActivity {

    String sum, res, mult ,divi;

    TextView toSum, toRes, toMult, toDivi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultados);

        toSum = (TextView) findViewById(R.id.resSuma);
        toRes = (TextView) findViewById(R.id.resResta);
        toMult = (TextView) findViewById(R.id.resMultiplicacion);
        toDivi = (TextView) findViewById(R.id.resDivision);

        sum = getIntent().getStringExtra("sum");
        res = getIntent().getStringExtra("res");
        mult = getIntent().getStringExtra("mult");
        divi = getIntent().getStringExtra("divi");

        toSum.setText(String.valueOf(sum));
        toRes.setText(String.valueOf(res));
        toMult.setText(String.valueOf(mult));
        toDivi.setText(String.valueOf(divi));;

    }
}
