package com.example.android.assignment_84;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Defining ArrayList of AndroidVersion objects
        ArrayList<AndroidVersion>androidVersionDetail = new ArrayList<>();
        androidVersionDetail.add(new AndroidVersion("Donut", "1.6", R.drawable.donut));
        androidVersionDetail.add(new AndroidVersion("Eclair", "2.0-2.1", R.drawable.eclair));
        androidVersionDetail.add(new AndroidVersion("Froyo", "2.2-2.2.3", R.drawable.froyo));
        androidVersionDetail.add(new AndroidVersion("GingerBread", "2.3-2.3.7", R.drawable.gingerbread));
        androidVersionDetail.add(new AndroidVersion("Honeycomb", "3.0-3.2.6", R.drawable.honeycomb));
        androidVersionDetail.add(new AndroidVersion("Ice Cream Sandwich", "4.0-4.0.4", R.drawable.icecream));
        androidVersionDetail.add(new AndroidVersion("Jelly Bean", "4.1-4.3.1", R.drawable.jellybean));
        androidVersionDetail.add(new AndroidVersion("KitKat", "4.4-4.4.4", R.drawable.kitkat));
        androidVersionDetail.add(new AndroidVersion("Lollipop", "5.0-5.1.1", R.drawable.lollipop));
        androidVersionDetail.add(new AndroidVersion("Marshmallow", "6.0-6.0.1", R.drawable.marshmallow));
        androidVersionDetail.add(new AndroidVersion("Nougat", "7.0",R.drawable.nougat));


        GridView gridView = (GridView)findViewById(R.id.items_grid_view);
        // Creating Custom adapter object
        AndroidVersionAdapter androidVersionAdapter = new AndroidVersionAdapter(this,androidVersionDetail);
        // Setting adapter to the GridView
        gridView.setAdapter(androidVersionAdapter);

    }
}
