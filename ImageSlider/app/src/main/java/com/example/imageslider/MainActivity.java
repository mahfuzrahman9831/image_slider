package com.example.imageslider;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;
    Button button;
    Bitmap bitmap;
    int[] images = {R.drawable.thaddaeus,R.drawable.roland,R.drawable.nathan,R.drawable.benjamin,R.drawable.alex};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.ViewPagerId);
        button = findViewById(R.id.buttonId);

        Adapter_View_Pager adapter_view_pager = new Adapter_View_Pager(this);

        viewPager.setAdapter(adapter_view_pager);


    }

    

    public void setWallpaper(View view) {



    }
}