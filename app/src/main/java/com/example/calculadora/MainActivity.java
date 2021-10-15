package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, bsuma, bresta, bmult, bdiv, bclear, big;
    double op1 =-1.0, op2 = -1.0;
    TextView resultat;
    boolean suma, resta, mult, div = false;

    Boolean op;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultat =findViewById(R.id.resultat);
        resultat.setText("Hola!");

        b0 = findViewById(R.id.b0);
        //b0 = (Button)findViewById(R.id.b0);
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
        big = findViewById(R.id.big);
        big.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        TextView resultat =(TextView) findViewById(R.id.resultat);
        int btn = v.getId();
        int res=0;
        try{
            switch (btn){
                case R.id.b0:
                    resultat.setText("0");
                    if (op1==-1)
                        op1=0;
                    else op2=0;
                    break;
                case R.id.b1:
                    resultat.setText("1");
                    if (op1==-1)
                        op1=1;
                    else op2=1;
                    break;
                case R.id.b2:
                    resultat.setText("2");
                    if (op1==-1)
                        op1=2;
                    else op2=2;
                    break;
                case R.id.b3:
                    resultat.setText("3");
                    if (op1==-1)
                        op1=3;
                    else op2=3;
                    break;
                case R.id.b4:
                    resultat.setText("4");
                    if (op1==-1)
                        op1=4;
                    else op2=4;
                    break;
                case R.id.b5:
                    resultat.setText("5");
                    if (op1==-1)
                        op1=5;
                    else op2=5;
                    break;
                case R.id.b6:
                    resultat.setText("6");
                    if (op1==-1)
                        op1=6;
                    else op2=6;
                    break;
                case R.id.b7:
                    resultat.setText("7");
                    if (op1==-1)
                        op1=7;
                    else op2=7;
                    break;
                case R.id.b8:
                    resultat.setText("8");
                    if (op1==-1)
                        op1=8;
                    else op2=8;
                    break;
                case R.id.b9:
                    resultat.setText("9");
                    if (op1==-1)
                        op1=9;
                    else op2=9;
                    break;
                case R.id.bsuma:
                    resultat.setText("+");
                    suma=true;
                    break;
                case R.id.bresta:
                    resultat.setText("-");
                    resta=true;
                    break;
                case R.id.bmult:
                    resultat.setText("*");
                    mult=true;
                    break;
                case R.id.bdiv:
                    resultat.setText("/");
                    div=true;
                    break;
                case R.id.bclear:
                    resultat.setText("Hola!");
                    op1=-1;
                    op2=-1;
                    break;
                case R.id.big:
                    if(suma== true){
                        if (op1 != -1 && op2!=-1)
                        {
                            double resfinal = op1+op2;
                            resultat.setText("" + resfinal);
                        }
                        else
                            resultat.setText("Error");
                        suma=false;
                    }
                    if (resta == true){
                        if (op1 != -1 && op2!=-1)
                        {
                            double resfinal = op1-op2;
                            resultat.setText(""+resfinal);
                        }
                        else
                            resultat.setText("Error");
                        resta=false;
                    }
                    if (mult == true){
                        if (op1 != -1 && op2!=-1)
                        {
                            double resfinal = op2*op1;
                            resultat.setText(""+resfinal);
                        }
                        else
                            resultat.setText("Error");
                        mult=false;
                    }
                    if (div == true){
                        if (op1 != -1 && op2!=-1 && op2!=0)
                        {
                            double resfinal = op1/op2;
                            resultat.setText(""+resfinal);
                        }
                        else
                            resultat.setText("Error");
                        div=false;
                    }
                    op1=-1;
                    op2=-2;
                    break;
                default:
                    break;
            }

        }catch (Exception e){
            resultat.setText("ERROR");
        }
    }
}