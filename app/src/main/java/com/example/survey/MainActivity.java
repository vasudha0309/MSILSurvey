package com.example.survey;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.LinearSmoothScroller;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.survey.R.drawable;

import java.util.ArrayList;
import java.util.List;

import static com.example.survey.R.drawable.btn_bg1;

public class MainActivity extends AppCompatActivity {

    List<Question> questionList;
    public static int count = 0;
    public static Button submitButton;

    @SuppressLint("NewApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        submitButton = findViewById(R.id.submit_button);
        RecyclerView myRV = findViewById(R.id.recycler_view);
        questionList = new ArrayList<>();
        questionList.add(new Question("Question 1", R.id.smile_rating, 0, 0));
        questionList.add(new Question("Question 2", R.id.smile_rating, 0, 0));
        questionList.add(new Question("Question 3", 0, R.id.rating_bar, 0));
        questionList.add(new Question("Question 4", 0, 0, R.id.suggestions));
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this, questionList);
        myRV.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        myRV.setAdapter(myAdapter);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (count < 5)
                    Toast.makeText(MainActivity.this, "Fill all responses", Toast.LENGTH_SHORT).show();
//                else
//                {
//
//                }
            }
        });


    }

    @SuppressLint("NewApi")
    public static void changeButton() {
        if (count == 5)
            submitButton.setBackgroundResource(R.drawable.btn_bg1);

    }



}
