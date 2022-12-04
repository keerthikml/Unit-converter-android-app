package com.example.unitconverterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView output;
    EditText EnterNum;
    Button miles;
    Button meters;
    Button kilometers;
    Button centimeters;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        output= findViewById(R.id.result);
        EnterNum= findViewById(R.id.input);
        miles=findViewById(R.id.miles);
        meters=findViewById(R.id.meters);
        kilometers=findViewById(R.id.kilometers);
        centimeters=findViewById(R.id.centimeters);


        miles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = EnterNum.getText().toString();
                int number = Integer.parseInt(num);
                double miles = (number/1.609);
                output.setText("value in miles:" + miles);

            }

        });

        meters.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = EnterNum.getText().toString();
                int number = Integer.parseInt(num);
                double meters = (number*1000);
                output.setText("value in meters:" + meters);

            }

        });

        centimeters.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = EnterNum.getText().toString();
                int number = Integer.parseInt(num);
                double centimeters = (number*100);
                output.setText("value in centimeters:" + centimeters);


            }

        });

        kilometers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = EnterNum.getText().toString();
                int number = Integer.parseInt(num);
                double kilometers = (number/1.609);
                output.setText("value in kilometers:" + kilometers);

            }

        });

    }


}