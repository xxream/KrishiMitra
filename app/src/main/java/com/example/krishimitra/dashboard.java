package com.example.krishimitra;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class dashboard extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<news> newsArrayList;
    myadapter myadapter;
    String[] newsHeading;
    int[] imageResourceId;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);

        newsArrayList = new ArrayList<news>();
        myadapter = new myadapter(this, newsArrayList);
        recyclerView.setAdapter(myadapter);

        newsHeading= new String[]{
                "I urge all my agitating farmer companions... return to your homes",
                "fields and to your families. Let's make a fresh start,",
                "On the contrary, union leaders say farmers will continue protesting until",
                "the government meets several other demands, including raising the",
                "minimum price of their produce, withdrawing legal action against",
                "some farmers, and paying compensation to the families of hundreds",
                "of farmers who have died as a result of the civil action.",
                "The farming laws aimed to loosen the rules around the sale",
                "pricing and storage of farm produce that protected farmers",
                "from an unfettered free market for decades"
        };

        imageResourceId = new int[]{
                R.drawable.a,
                R.drawable.b,
                R.drawable.c,
                R.drawable.d,
                R.drawable.e,
                R.drawable.f,
                R.drawable.g,
                R.drawable.h,
                R.drawable.i,
                R.drawable.j

        };
        getData();
    }

    private void getData() {
        for(int i=0; i<newsHeading.length;i++){
                news news= new news(newsHeading[i],imageResourceId[i]);
                newsArrayList.add(news);
        }
        myadapter.notifyDataSetChanged();
    }
}