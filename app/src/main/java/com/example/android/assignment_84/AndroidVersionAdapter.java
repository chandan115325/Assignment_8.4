package com.example.android.assignment_84;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by CHANDAN on 6/10/2017.
 */

public class AndroidVersionAdapter extends ArrayAdapter<AndroidVersion> {
    /**
     * Constructor to initialize context and ArrayList of AndroidVersion objects
     * @param context
     * @param arrayListAndroid
     */
    public AndroidVersionAdapter(@NonNull Context context, ArrayList<AndroidVersion>arrayListAndroid) {
        super(context,0, arrayListAndroid);
    }

    /**
     * Getting View to display the text and images in grid
     * @param position
     * @param convertView
     * @param parent
     * @return
     */
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
       // If convertView is null then inflate the items_grid layout
        if(convertView == null)
        {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.items_grid,parent,false);
        }
        //Getting the AndroidVersion at this position
        AndroidVersion currentAndroidVersion = getItem(position);
        // Getting and setting the images into ImageView
        ImageView androidImage = (ImageView)convertView.findViewById(R.id.list_item_icon);
         androidImage.setImageResource(currentAndroidVersion.getmImageResourceId());
        // Getting and setting the androidName into TextView
        TextView androidName = (TextView)convertView.findViewById(R.id.version_name);
        androidName.setText(currentAndroidVersion.getmAndroidName());
        // Getting and setting the androidVersion into TextView
        TextView androidVersion = (TextView)convertView.findViewById(R.id.version_number);
        androidVersion.setText(currentAndroidVersion.getmAndroidVersion());



        return convertView;
    }
}
