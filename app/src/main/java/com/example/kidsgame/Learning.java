package com.example.kidsgame;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


public class Learning extends AppCompatActivity {


    ListView listView;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learning);
        ArrayList<learnigcomponent> letterArrayList = new ArrayList<learnigcomponent>();
        letterArrayList.add(new learnigcomponent("Grass", "wotever",  R.drawable.a));
        letterArrayList.add(new learnigcomponent("Sky", "Beta", R.drawable.b));
        letterArrayList.add(new learnigcomponent("Grass", "Alpha", R.drawable.c));
        letterArrayList.add(new learnigcomponent("Sky", "Beta", R.drawable.d));
        MyViewAdapter adapter = new MyViewAdapter(this, letterArrayList);
        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(adapter);
    }
}