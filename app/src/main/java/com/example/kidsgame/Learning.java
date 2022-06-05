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
        letterArrayList.add(new learnigcomponent("Grass", "The letter is written in middle two lines",  R.drawable.a));
        letterArrayList.add(new learnigcomponent("Sky", "The letter is written in top three lines", R.drawable.b));
        letterArrayList.add(new learnigcomponent("Grass", "The letter is written in middle two lines", R.drawable.c));
        letterArrayList.add(new learnigcomponent("Sky", "The letter is written in top three lines", R.drawable.d));
        letterArrayList.add(new learnigcomponent("Grass", "The letter is written in middle two lines", R.drawable.e));
        letterArrayList.add(new learnigcomponent("Sky", "The letter is written in top three lines", R.drawable.f));
        letterArrayList.add(new learnigcomponent("Root", "The letter is written in bottom three lines", R.drawable.g));
        letterArrayList.add(new learnigcomponent("Sky", "The letter is written in top three lines", R.drawable.h));
        letterArrayList.add(new learnigcomponent("Grass", "The letter is written in middle two lines", R.drawable.i));
        letterArrayList.add(new learnigcomponent("Root", "The letter is written in bottom three lines", R.drawable.j));
        letterArrayList.add(new learnigcomponent("Sky", "The letter is written in top three lines", R.drawable.k));
        letterArrayList.add(new learnigcomponent("Sky", "The letter is written in top three lines", R.drawable.l));
        letterArrayList.add(new learnigcomponent("Grass", "The letter is written in middle two lines", R.drawable.m));
        letterArrayList.add(new learnigcomponent("Grass", "The letter is written in middle two lines", R.drawable.n));
        letterArrayList.add(new learnigcomponent("Grass", "The letter is written in middle two lines", R.drawable.o));
        letterArrayList.add(new learnigcomponent("Root", "The letter is written in bottom three lines", R.drawable.p));
        letterArrayList.add(new learnigcomponent("Root", "The letter is written in bottom three lines", R.drawable.q));
        letterArrayList.add(new learnigcomponent("Grass", "The letter is written in middle two lines", R.drawable.r));
        letterArrayList.add(new learnigcomponent("Grass", "The letter is written in middle two lines", R.drawable.s));
        letterArrayList.add(new learnigcomponent("Sky", "The letter is written in top three lines", R.drawable.t));
        letterArrayList.add(new learnigcomponent("Grass", "The letter is written in middle two lines", R.drawable.u));
        letterArrayList.add(new learnigcomponent("Grass", "The letter is written in middle two lines", R.drawable.v));
        letterArrayList.add(new learnigcomponent("Grass", "The letter is written in middle two lines", R.drawable.w));
        letterArrayList.add(new learnigcomponent("Grass", "The letter is written in middle two lines", R.drawable.x));
        letterArrayList.add(new learnigcomponent("Root", "The letter is written in bottom three lines", R.drawable.y));
        letterArrayList.add(new learnigcomponent("Grass", "The letter is written in middle two lines", R.drawable.z));



        MyViewAdapter adapter = new MyViewAdapter(this, letterArrayList);
        ListView listView = findViewById(R.id.listview);
        listView.setAdapter(adapter);
    }
}