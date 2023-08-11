package com.example.exam_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioGroup rg;
    RadioButton rbM, rbF;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rg = findViewById(R.id.gender);
        rbM = findViewById(R.id.male);
        rbF = findViewById(R.id.female);
    }

    public void selectClicked(View v) {
        if(rbF.isChecked() == true) {
            Toast.makeText(getApplicationContext(), rbF.getText(), Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(getApplicationContext(), rbM.getText(), Toast.LENGTH_SHORT).show();
        }
    }
}