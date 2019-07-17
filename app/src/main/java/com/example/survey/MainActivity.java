package com.example.survey;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.LinearSmoothScroller;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Question> questionList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView myRV = findViewById(R.id.recycler_view);
        questionList = new ArrayList<>();
        questionList.add(new Question("Question 1", R.id.smile_rating, 0, 0));
        questionList.add(new Question("Question 2", R.id.smile_rating, 0, 0));
        questionList.add(new Question("Question 3", 0, R.id.rating_bar, 0));
        questionList.add(new Question("Question 4", 0, 0, R.id.suggestions));
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this,questionList);
        myRV.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        myRV.setAdapter(myAdapter);


    }


}
