package com.example.listviewwithjsondata;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DecodeFormat;


public class Main2Activity extends AppCompatActivity {

    ImageView imageView;
    TextView hero_name;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        imageView = (ImageView)findViewById(R.id.imageView);
        hero_name = (TextView)findViewById(R.id.textView);
        hero_name.setText(getIntent().getStringExtra("name"));
        Glide.with(this).load(getIntent().getStringExtra("image")).format(DecodeFormat.PREFER_ARGB_8888).placeholder(R.drawable.image_placeholder).into(imageView);

    }
}
