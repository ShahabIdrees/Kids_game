package com.example.kidsgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Quiz extends AppCompatActivity {
    private String grass = "aceimnorsuvwxz";
    private String sky = "bdfhklt";
    private String root = "gjpqy";
    protected String Selected;
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


        for(int i = 0; i < 100; i++){
            alphabet = randomCharGenerator();
            Quest.setText(String.valueOf(alphabet));
            for (Button option:Options) {
                option.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        Selected =  option.getText().toString();


                        String Result = resultCalculator(alphabet);
                        if(Result.contentEquals(Selected)){
                            Answer.setText("TRUE");
                            if(Selected.contentEquals("SKY")) {
                                Options[0].setBackgroundColor(Color.GREEN);
                            }
                            else if(Selected.contentEquals("GRASS")) {
                                Options[1].setBackgroundColor(Color.GREEN);
                            }
                            else if(Selected.contentEquals("ROOT")) {
                                 Options[2].setBackgroundColor(Color.GREEN);
                            }
                        }
                        else{
                            if(Result.contentEquals("SKY")) {
                                Options[0].setBackgroundColor(Color.GREEN);
                            }
                            else if(Result.contentEquals("GRASS")) {
                                Options[1].setBackgroundColor(Color.GREEN);
                            }
                            else if(Result.contentEquals("ROOT")) {
                                Options[2].setBackgroundColor(Color.GREEN);
                            }
                            if(Selected.contentEquals("SKY")) {
                                Options[0].setBackgroundColor(Color.RED);

                            }
                            else if(Selected.contentEquals("GRASS")) {
                                Options[1].setBackgroundColor(Color.RED);
                            }
                            else if(Selected.contentEquals("ROOT")) {
                                Options[2].setBackgroundColor(Color.RED);
                            }
                            Answer.setText("FALSE");
                        }
                    }
                });
                for (Button temp:Options){
                    temp.setBackgroundColor(-16720385);
                }
                Answer.setText("____");
                continue;
            }



        }
    }

    protected String resultCalculator(char alphabet){
        if(root.contains(String.valueOf(alphabet))){
            return "ROOT";
        }
        else if(sky.contains(String.valueOf(alphabet))){
            return "SKY";
        }
        else if(grass.contains(String.valueOf(alphabet))){
            return "GRASS";
        }
        return null;
    }

    protected char randomCharGenerator(){
        int randomNo = (int) ((Math.random() * 26)  + 1);
        char alphabet = (char)(96 + randomNo);
        return alphabet;
    }

}