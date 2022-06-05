package com.example.kidsgame;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class MyViewAdapter extends ArrayAdapter<learnigcomponent> {
    public MyViewAdapter(@NonNull Context context,

                         ArrayList<learnigcomponent> learnigcomponentArrayList) {
        super(context, 0, learnigcomponentArrayList);
    }
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        learnigcomponent lc = getItem(position);
        convertView = LayoutInflater.from(getContext()).

                inflate(R.layout.learning_component_view, parent, false);
        TextView textViewGroup = convertView.findViewById(R.id.textView6);
        TextView textViewDescription = convertView.findViewById(R.id.textView7);
        ImageView imageView = convertView.findViewById(R.id.imageView2);
        textViewGroup.setText(lc.group);
        textViewDescription.setText(lc.description);
        imageView.setImageResource(lc.imageID);
        return convertView;
    }

}

