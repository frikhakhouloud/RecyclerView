package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
RecyclerView rv;
String[] titre;
String[] soustitre;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv = findViewById(R.id.RecyclerV);
        titre = getResources().getStringArray(R.array.tit);
        soustitre = getResources().getStringArray(R.array.stit);
        ListAdapter ad;

        Integer[] img = {R.drawable.photo,R.drawable.photoo,
                R.drawable.photo,R.drawable.photoo};

        ad = new ListAdapter(MainActivity.this,titre,soustitre,img);
        rv.setLayoutManager(new LinearLayoutManager(this ));
        rv.setAdapter(ad);

    }
}