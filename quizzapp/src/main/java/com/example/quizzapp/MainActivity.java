package com.example.quizzapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    EditText username;
    Button btn_ingresar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username=(EditText) findViewById(R.id.username);
        btn_ingresar= (Button) findViewById(R.id.btn_ingresar);
        btn_ingresar.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        String text= username.getText().toString();

        if (text.isEmpty()){
            Toast.makeText(this, "Tienes que ingresar un usuario", Toast.LENGTH_SHORT).show();;
        } else{
            Log.i("myLog", text);
            Intent intent= new Intent(this, StartQuizActivity.class);
            startActivity (intent);




        }

    }
}
