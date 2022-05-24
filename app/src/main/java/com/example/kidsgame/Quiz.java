package com.example.kidsgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Quiz extends AppCompatActivity {
    private String grass = "aceimnorsuvwxz";
    private String sky = "bdfhklt";
    private String root = "gjpqy";
    private String Selected;
    private char alphabet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_quiz);
        Button[] Options = new Button[3];
        Options[0] = findViewById(R.id.button2);
        Options[1] = findViewById(R.id.button3);
        Options[2] = findViewById(R.id.button4);
        Button End = findViewById(R.id.button5);
        TextView Quest = findViewById(R.id.textView4);
        TextView Answer = findViewById(R.id.textView5);
        //final String[] Selected = {null};
        End.setOnClickListener(new View.OnClickListener (){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(Quiz.this, MainActivity.class);
                startActivity(intent);
            }
        });
        for (Button option:Options) {
                option.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Selected =  option.getText().toString();

                }
            });
        }

        for(int i = 0; i < 100; i++){
            alphabet = randomCharGenerator();
            Quest.setText(String.valueOf(alphabet));

        }


    }
    protected boolean resultCalculator(char alphabet, String selected){
        return false;
    }
    protected char randomCharGenerator(){
        int randomNo = (int) ((Math.random() * 26)  + 1);
        char alphabet = (char)(96 + randomNo);
        return alphabet;
    }


}