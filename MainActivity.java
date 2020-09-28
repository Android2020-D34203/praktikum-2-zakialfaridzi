package com.example.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("Kalkulator - Zaki (6701184045)");

        final EditText num1 =findViewById(R.id.textNum1);
        final EditText num2 =findViewById(R.id.textNum2);
        final EditText operator = findViewById(R.id.operasi);

        final Button hitung = findViewById(R.id.hitung);
        final Button reset = findViewById(R.id.reset);

        final TextView result = findViewById(R.id.hasil);

        hitung.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                final int valueAngka1=Integer.parseInt(num1.getText().toString());
                final int valueAngka2=Integer.parseInt(num2.getText().toString());
                final String valueOperator = operator.getText().toString();


                Integer answer=0;
                String valoperator="";


                if(valueOperator.equals("+")){
                    answer = valueAngka1+valueAngka2;
                    result.setText(answer.toString());
                }else if(valueOperator.equals("-")){
                    answer=valueAngka1-valueAngka2;
                    result.setText(answer.toString());
                }else if(valueOperator.equals("*")){
                    answer=valueAngka1*valueAngka2;
                    result.setText(answer.toString());
                }else if(valueOperator.equals("/")) {
                    answer = valueAngka1 / valueAngka2;
                    result.setText(answer.toString());
                }else if(!valueOperator.equals("+")){
                    valoperator = "OPERASI ARITMATIK TIDAK SESUAI";
                    result.setText(valoperator);
                }else if(!valueOperator.equals("-")){
                    valoperator = "OPERASI ARITMATIK TIDAK SESUAI";
                    result.setText(valoperator);
                }else if(!valueOperator.equals("*")){
                    valoperator = "OPERASI ARITMATIK TIDAK SESUAI";
                    result.setText(valoperator);
                }else if(!valueOperator.equals("/")){
                    valoperator = "OPERASI ARITMATIK TIDAK SESUAI";
                    result.setText(valoperator);
                }
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1.setText(null);
                num2.setText(null);
            }
        });

    }
}