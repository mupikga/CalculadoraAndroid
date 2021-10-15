package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button b0;
    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button b5;
    Button b6;
    Button b7;
    Button b8;
    Button b9;
    Button bsuma;
    Button bresta;
    Button bmult;
    Button bdiv;
    Button bclear;

    TextView resultat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultat =findViewById(R.id.resultat);
        resultat.setText("Hola!");

        b0 = (Button)findViewById(R.id.b0);
        b0.setOnClickListener(this);
        b1 = findViewById(R.id.b1);
        b1.setOnClickListener(this);
        b2 = findViewById(R.id.b2);
        b2.setOnClickListener(this);
        b3 = findViewById(R.id.b3);
        b3.setOnClickListener(this);
        b4 = findViewById(R.id.b4);
        b4.setOnClickListener(this);
        b5 = findViewById(R.id.b5);
        b5.setOnClickListener(this);
        b6 = findViewById(R.id.b6);
        b6.setOnClickListener(this);
        b7 = findViewById(R.id.b7);
        b7.setOnClickListener(this);
        b8 = findViewById(R.id.b8);
        b8.setOnClickListener(this);
        b9 = findViewById(R.id.b9);
        b9.setOnClickListener(this);
        bsuma = findViewById(R.id.bsuma);
        bsuma.setOnClickListener(this);
        bresta = findViewById(R.id.bresta);
        bresta.setOnClickListener(this);
        bmult = findViewById(R.id.bmult);
        bmult.setOnClickListener(this);
        bdiv = findViewById(R.id.bdiv);
        bdiv.setOnClickListener(this);
        bclear = findViewById(R.id.bclear);
        bclear.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        TextView resultat =(TextView) findViewById(R.id.resultat);
        int btn = v.getId();
        try{
            switch (btn){
                case R.id.b0:
                    resultat.setText("0");
                    break;
                case R.id.b1:
                    resultat.setText("1");
                    break;
                case R.id.b2:
                    resultat.setText("2");
                    break;
                case R.id.b3:
                    resultat.setText("3");
                    break;
                case R.id.b4:
                    resultat.setText("4");
                    break;
                case R.id.b5:
                    resultat.setText("5");
                    break;
                case R.id.b6:
                    resultat.setText("6");
                    break;
                case R.id.b7:
                    resultat.setText("7");
                    break;
                case R.id.b8:
                    resultat.setText("8");
                    break;
                case R.id.b9:
                    resultat.setText("9");
                    break;
                case R.id.bsuma:
                    resultat.setText("+");
                    break;
                case R.id.bresta:
                    resultat.setText("-");
                    break;
                case R.id.bmult:
                    resultat.setText("*");
                    break;
                case R.id.bdiv:
                    resultat.setText("/");
                    break;
                case R.id.bclear:
                    resultat.setText("");
                    break;
                case R.id.big:
                    resultat.setText("=");
                    break;
                default:
                    break;
            }

        }catch (Exception e){
            resultat.setText("ERROR");
        }
    }
}