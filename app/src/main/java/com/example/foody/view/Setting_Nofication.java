package com.example.foody.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.ToggleButton;

import com.example.foody.R;

public class Setting_Nofication extends AppCompatActivity {
    ToggleButton toggleButton;
    RelativeLayout relativeLayout1, relativeLayout2, relativeLayout3;
    ImageView img1,img2,img3, imageView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting__nofication);
        toggleButton = findViewById(R.id.toggle);
        relativeLayout1 = findViewById(R.id.rl1);
        relativeLayout2 = findViewById(R.id.rl2);
        relativeLayout3 = findViewById(R.id.rl3);
        img1 = findViewById(R.id.image_social);
        img2 = findViewById(R.id.image_checkin);
        img3 = findViewById(R.id.image_dialy);
        toggleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (toggleButton.isChecked() == true){
                    relativeLayout1.setBackgroundColor(getResources().getColor(R.color.colorAccent));
                    img1.setImageDrawable(getResources().getDrawable(R.drawable.social1));
                    img2.setImageDrawable(getResources().getDrawable(R.drawable.checkin1));
                    img3.setImageDrawable(getResources().getDrawable(R.drawable.dialy1));
                    relativeLayout2.setBackgroundColor(getResources().getColor(R.color.colorAccent));
                    relativeLayout3.setBackgroundColor(getResources().getColor(R.color.colorAccent));
                }
                else {
                    relativeLayout1.setBackgroundColor(getResources().getColor(R.color.colorChuyen));
                    relativeLayout2.setBackgroundColor(getResources().getColor(R.color.colorChuyen));
                    relativeLayout3.setBackgroundColor(getResources().getColor(R.color.colorChuyen));
                    img1.setImageDrawable(getResources().getDrawable(R.drawable.social));
                    img2.setImageDrawable(getResources().getDrawable(R.drawable.checkin));
                    img3.setImageDrawable(getResources().getDrawable(R.drawable.dialy));
                }
            }
        });
        imageView1 = findViewById(R.id.chuyen1);
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Setting_Nofication.this, Social_setting_nofication.class);
                startActivity(i);
            }
        });
    }
}