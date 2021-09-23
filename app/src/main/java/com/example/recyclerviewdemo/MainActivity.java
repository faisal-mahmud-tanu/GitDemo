package com.example.recyclerviewdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    //vars
    private ArrayList<String> mNames= new ArrayList<>();
    private ArrayList<String> mImageUrls= new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: started");

        initImageBitmaps();

    }

    // these are the static resources
<<<<<<< HEAD
    // setting images titles
=======


>>>>>>> develop
    private void initImageBitmaps(){
        Log.d(TAG, "initImageBitmaps: preparing bitmaps");

        //https://i.redd.it/oj15jevewwf61.png
        //https://i.redd.it/zyuov8cunxf61.jpg
        //https://i.redd.it/zhfuqf1qsvd61.jpg

        mImageUrls.add("https://i.redd.it/oj15jevewwf61.png");
        mNames.add("de Ja Vu");

        mImageUrls.add("https://i.redd.it/zyuov8cunxf61.jpg");
        mNames.add("Galaxy circle ");

        mImageUrls.add("https://i.redd.it/zhfuqf1qsvd61.jpg");
        mNames.add("Girl in hat");

        mImageUrls.add("https://i.redd.it/oj15jevewwf61.png");
        mNames.add("de Ja Vu");

        mImageUrls.add("https://i.redd.it/zyuov8cunxf61.jpg");
        mNames.add("Galaxy");

        mImageUrls.add("https://i.redd.it/zhfuqf1qsvd61.jpg");
        mNames.add("Girl");

        mImageUrls.add("https://i.redd.it/oj15jevewwf61.png");
        mNames.add("de Ja Vu");

        mImageUrls.add("https://i.redd.it/zyuov8cunxf61.jpg");
        mNames.add("Galaxy");

        mImageUrls.add("https://i.redd.it/zhfuqf1qsvd61.jpg");
        mNames.add("Girl");

        mImageUrls.add("https://i.redd.it/oj15jevewwf61.png");
        mNames.add("de Ja Vu");

        mImageUrls.add("https://i.redd.it/zyuov8cunxf61.jpg");
        mNames.add("Galaxy");

        mImageUrls.add("https://i.redd.it/zhfuqf1qsvd61.jpg");
        mNames.add("Girl");

        initRecyclerView();
    }

    private void initRecyclerView(){
        Log.d(TAG, "initRecyclerView: initRecyclerview");
        RecyclerView recyclerView= findViewById(R.id.recyclerView);
        RecyclerViewAdapter adapter= new RecyclerViewAdapter(this, mImageUrls, mNames);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
