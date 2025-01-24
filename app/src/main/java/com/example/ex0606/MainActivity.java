package com.example.ex0606;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button btn;
    ImageView imageV;
    int randomNum;
    Random rnd = new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);
        imageV = findViewById(R.id.imageV);
    }

    public void clicked(View view)
    {
        randomNum = rnd.nextInt(3-1+1)+1;
        btn.setText("The number that was rolled is-> " + randomNum);
        switch (randomNum)
        {
            case 1:
                imageV.setImageResource(R.drawable.image1);
                break;
            case 2:
                imageV.setImageResource(R.drawable.image2);
                break;
            case 3:
                imageV.setImageResource(R.drawable.image3);
                break;
        }
    }
}