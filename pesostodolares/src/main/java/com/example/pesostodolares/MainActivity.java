package com.example.pesostodolares;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText inputPesos;
    private TextView tvDolares;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btnConvertir_us = (Button) findViewById(R.id.btn_convertir_us);
        Button btnConvertir = (Button) findViewById(R.id.btn_convertir);
        inputPesos = (EditText) findViewById(R.id.Input_pesos);
        tvDolares = (TextView) findViewById(R.id.tv_dolares);

        btnConvertir.setOnClickListener(this);
        btnConvertir_us.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        log("Le dio click");




        if(view.getId()== R.id.btn_convertir) {
            if (inputPesos.getText() != null) {
                String pesos = inputPesos.getText().toString();
                log(pesos);
                double pesosDouble = Double.parseDouble(pesos);
                double dollar = pesosDouble * 18.5894;
                tvDolares.setText("$" + dollar);
            } else {
                Toast.makeText(this, "No hagas eso", Toast.LENGTH_LONG).show();
            }
        }else{
            if (tvDolares.getText() != null) {
                String dolar = tvDolares.getText().toString();
                log(dolar);
                double dolarDouble = Double.parseDouble(dolar);
                double pesos = dolarDouble / 18.5894;
                inputPesos.setText("$" + pesos);
            } else {
                Toast.makeText(this, "No hagas eso", Toast.LENGTH_LONG).show();
            }
            }


        }



    public void log(String content) {
        Log.i("mylog", content);
    }
}

