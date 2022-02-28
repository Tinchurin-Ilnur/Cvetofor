package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RelativeLayout main_view = (RelativeLayout) findViewById(R.id.main_view);

        Button redButton = (Button) findViewById(R.id.red_button);
        Button yellowButton = (Button) findViewById(R.id.yellow_button);
        Button greenButton = (Button) findViewById(R.id.green_button);

        redButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                main_view.setBackgroundColor(getResources().getColor(R.color.redColor));
            }
        });
        yellowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                main_view.setBackgroundColor(getResources().getColor(R.color.yellowColor));
            }
        });
        greenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                main_view.setBackgroundColor(getResources().getColor(R.color.greenColor));
            }
        });
    }
}