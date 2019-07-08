package com.example.survey;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Question> questionList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        questionList = new ArrayList<>();
        String[] option = {"op1","op2","op3","op4","op5"};

        questionList.add(new Question(1,"Question 1",R.id.smile_rating,0,0));
        questionList.add(new Question(2,"Question 2",R.id.smile_rating,0,0));
        questionList.add(new Question(3,"Question 3",0,R.id.rating_bar,0));
        questionList.add(new Question(4,"Question 4",0,0,R.id.suggestions));

        RecyclerView myRV = findViewById(R.id.recycler_view);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this,questionList);
        myRV.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false){
                @Override
                public boolean canScrollHorizontally() {
                    return false;
                }
        });
        myRV.setAdapter(myAdapter);

    }
}
