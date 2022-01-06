package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, bsuma, bresta, bmult, bdiv, bclear, big, btan, bsin, bcos;
    Double[] num = new Double[3];
    Double resultat;
    TextView num1, num2;
    boolean suma, resta, mult, div, tan, sin, cos = false;

    Boolean op;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 =findViewById(R.id.num1);
        num1.setText("");
        num2 =findViewById(R.id.num2);
        num2.setText("");

        b0 = (Button) findViewById(R.id.b0);
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
        btan = findViewById(R.id.btan);
        btan.setOnClickListener(this);
        bsin = findViewById(R.id.bsin);
        bsin.setOnClickListener(this);
        bcos = findViewById(R.id.bcos);
        bcos.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int btn = v.getId();
        String text = num1.getText().toString();
        try{
            switch (btn){
                case R.id.b0:
                    num1.setText(text+"0");
                    break;
                case R.id.b1:
                    num1.setText(text+"1");
                    break;
                case R.id.b2:
                    num1.setText(text+"2");
                    break;
                case R.id.b3:
                    num1.setText(text+"3");
                    break;
                case R.id.b4:
                    num1.setText(text+"4");
                    break;
                case R.id.b5:
                    num1.setText(text+"5");
                    break;
                case R.id.b6:
                    num1.setText(text+"6");
                    break;
                case R.id.b7:
                    num1.setText(text+"7");
                    break;
                case R.id.b8:
                    num1.setText(text+"8");
                    break;
                case R.id.b9:
                    num1.setText(text+"9");
                    break;
                case R.id.bsuma:
                    suma=true;
                    num[0]=Double.parseDouble(text);
                    num2.setText(String.valueOf(text+"+"));
                    num1.setText("");

                    break;
                case R.id.bresta:
                    resta=true;
                    num[0]=Double.parseDouble(text);
                    num2.setText(String.valueOf(text+"-"));
                    num1.setText("");

                    break;
                case R.id.bmult:
                    mult=true;
                    num[0]=Double.parseDouble(text);
                    num2.setText(String.valueOf(text+"x"));
                    num1.setText("");

                    break;
                case R.id.bdiv:
                    div=true;
                    num[0]=Double.parseDouble(text);
                    num2.setText(String.valueOf(text+"/"));
                    num1.setText("");

                    break;
                case R.id.bsin:
                    num[0]=Double.parseDouble(text);
                    resultat = Math.sin(num[0]*Math.PI/180);
                    num1.setText(String.valueOf("sin("+num[0]+") = " + resultat));
                    break;
                case R.id.bcos:
                    num[0]=Double.parseDouble(text);
                    resultat = Math.cos(num[0]*Math.PI/180);
                    num1.setText(String.valueOf("cos("+num[0]+") = " + resultat));
                    break;
                case R.id.btan:
                    num[0]=Double.parseDouble(text);
                    resultat = Math.tan(num[0]*Math.PI/180);
                    num1.setText(String.valueOf("tan("+num[0]+") = " + resultat));
                    break;
                case R.id.bclear:
                    num1.setText("");
                    num2.setText("");

                    break;
                case R.id.big:
                    num[1]=Double.parseDouble(text);
                    if(suma== true){
                        num1.setText(String.valueOf(num[0]));
                        num2.setText(String.valueOf(num[1]));

                        //num2.setText(String.valueOf(num[0] +  " + " +num[1]));
                        resultat=num[0]+num[1];
                        //num1.setText(String.valueOf(resultat));
                        suma=false;
                    }
                    if (resta == true){
                        num2.setText(String.valueOf(num[0] + " - " + num[1]));
                        resultat=num[0]-num[1];
                        num1.setText(String.valueOf(resultat));
                        resta=false;
                    }
                    if (mult == true){
                        num2.setText(String.valueOf(num[0] + " * " + num[1]));
                        resultat=num[0]*num[1];
                        num1.setText(String.valueOf(resultat));
                        mult=false;
                    }
                    if (div == true){
                        num2.setText(String.valueOf(num[0] + " / " + num[1]));
                        resultat=num[0]/num[1];
                        num1.setText(String.valueOf(resultat));
                        div=false;
                    }

                    break;
                default:
                    break;
            }

        }catch (Exception e){
            num1.setText("ERROR");
        }
    }
}