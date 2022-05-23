package com.example.kidsgame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Quiz extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        Button[] Options = new Button[3];
        Options[0] = findViewById(R.id.button2);
        Options[1] = findViewById(R.id.button3);
        Options[2] = findViewById(R.id.button4);
        TextView Quest = findViewById(R.id.textView4);
        TextView Answer = findViewById(R.id.textView5);



    }
    protected char randomCharGenerator(){
        int randomNo = (int) ((Math.random() * 26)  + 1);
        char alphabet = (char)(96 + randomNo);
        return alphabet;
    }


}