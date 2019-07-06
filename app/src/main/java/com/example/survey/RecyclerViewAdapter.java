package com.example.survey;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.TextView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.myViewHolder> {


    private Context mContext;
    private List<Question> mData;

    public RecyclerViewAdapter(Context mContext, List<Question> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view;
        LayoutInflater mInflator = LayoutInflater.from(mContext);
        view = mInflator.inflate(R.layout.card,viewGroup,false);
        return new myViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder myViewHolder, int i) {


        myViewHolder.question.setText(mData.get(i).getQuestion());
        myViewHolder.editText.setVisibility(View.GONE);
        myViewHolder.ratingBar.setVisibility(View.GONE);
        myViewHolder.seekBar.setProgress(mData.get(i).getSeekBar());
        myViewHolder.seekBarValue.setText(mData.get(i).getSeekbarValue());
        myViewHolder.radioGroup.setVisibility(View.GONE);
        myViewHolder.radioButton.setVisibility(View.GONE);



    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static  class myViewHolder extends RecyclerView.ViewHolder{

        int questionNumber;
        TextView question;
        RadioGroup radioGroup;
        RadioButton radioButton;
        SeekBar seekBar;
        TextView seekBarValue;
        RatingBar ratingBar;
        EditText editText;

        public myViewHolder(@NonNull View itemView) {
            super(itemView);

            question = itemView.findViewById(R.id.questions);
            radioGroup = itemView.findViewById(R.id.radio_group_1);
            radioButton = itemView.findViewById(R.id.rg1_rb1);
            seekBar = itemView.findViewById(R.id.seek_bar);
            seekBarValue = itemView.findViewById(R.id.seek_bar_value);
            ratingBar = itemView.findViewById(R.id.rating_bar);
            editText = itemView.findViewById(R.id.suggestions);


        }
    }




}
