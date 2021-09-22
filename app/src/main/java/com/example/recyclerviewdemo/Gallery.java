package com.example.recyclerviewdemo;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class Gallery extends AppCompatActivity {
    private static final String TAG = "Gallery";

    private ImageView image;
    private TextView description;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);

        getIncomingIntent();

    }

    public void getIncomingIntent(){
        if ((getIntent().hasExtra("image_url")) && (getIntent().hasExtra("image_description"))){
            String imageUrl= getIntent().getStringExtra("image_url");
            String imageDescription= getIntent().getStringExtra("image_description");
            setImages(imageUrl, imageDescription);
        }

    }

    public void setImages(String url, String imageDescription){
        image= findViewById(R.id.gallery_imageId);
        description= findViewById(R.id.image_description);

        description.setText(imageDescription);
        Glide.with(this)
                .asBitmap()
                .load(url)
                .into(image);
    }

}
