package com.example.shehani.airaware;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class sensorDetails extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sensor_details);

        Button btn1 = (Button)findViewById(R.id.btnTemp);
        Button btn2 = (Button)findViewById(R.id.btnHumidity);
        Button btn3 = (Button)findViewById(R.id.btngas);
        Button btn4 = (Button)findViewById(R.id.btnco);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1 = new Intent(sensorDetails.this , TemperaturePage.class);
                startActivity(int1);
            }
        });


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int2 = new Intent(sensorDetails.this , humidityPage.class);
                startActivity(int2);
            }
        });


        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int3 = new Intent(sensorDetails.this , gasPage.class);
                startActivity(int3);
            }
        });


        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int4 = new Intent(sensorDetails.this , coPage.class);
                startActivity(int4);
            }
        });
    }
}