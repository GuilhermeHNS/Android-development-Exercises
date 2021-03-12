package com.example.calculadora_imc;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calcularOnClick(View v){
        EditText txtALtura = findViewById(R.id.txtAltura);
        EditText txtPeso = findViewById(R.id.txtPeso);

        double peso = Double.parseDouble(txtPeso.getText().toString());
        int altura = Integer.parseInt(txtALtura.getText().toString());
        double imc = peso / Math.pow(altura, 2);

        if(imc < 17){
            Toast.makeText(this, "Teste", Toast.LENGTH_LONG).show();
        }
        else if(imc > 24){
            Toast.makeText(this, "Teste", Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(this, "Teste", Toast.LENGTH_LONG).show();
        }
    }

}