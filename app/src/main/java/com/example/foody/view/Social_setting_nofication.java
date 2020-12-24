package com.example.foody.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.ToggleButton;

import com.example.foody.R;

public class Social_setting_nofication extends AppCompatActivity {
    ToggleButton toggleButton1, toggleButton2,toggleButton;
    TextView textView1, textView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_social_setting_nofication);
        toggleButton = findViewById(R.id.toggle1);
        toggleButton1 = findViewById(R.id.toggle2);
        toggleButton2 = findViewById(R.id.toggle3);
        textView1 = findViewById(R.id.text_setting1);
        textView2 = findViewById(R.id.text_setting2);
        toggleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (toggleButton.isChecked() == true){
                    toggleButton1.setChecked(true);
                }
                if (toggleButton.isChecked()==true && toggleButton1.isChecked() ==true){
                    toggleButton2.setChecked(false);
                }
                if (toggleButton1.isChecked() ==false){
                    toggleButton2.setChecked(true);
                }
                if (toggleButton.isChecked()==false){
                    toggleButton1.setChecked(false);
                    toggleButton2.setChecked(false);
                }
            }
        });
    }
}