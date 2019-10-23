package com.example.actividad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    private EditText et1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = (EditText) findViewById(R.id.editText);
    }

    public void acercaDe(View view){
        Intent i = new Intent(this, AcercaDe.class);
        i.putExtra("nombre", et1.getText().toString());
        startActivity(i);

    }

    public void navegador(View view){
        Intent i = new Intent(this,navegador.class);
        i.putExtra("url", et1.getText().toString());
        startActivity(i);

    }

}
