package com.example.survey;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.TextView;

import com.hsalf.smilerating.BaseRating;
import com.hsalf.smilerating.SmileRating;

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
    public void onBindViewHolder(@NonNull final myViewHolder myViewHolder, int i) {

//        myViewHolder.smileRating.setNormalColor(Color.GREEN);



        if(i==0) {
//            final myViewHolder df=myViewHolder;
            myViewHolder.question.setText(String.valueOf(mData.get(i).getQuestion()));
            myViewHolder.smileRating.setVisibility(View.VISIBLE);
            myViewHolder.editText.setVisibility(View.GONE);
            myViewHolder.ratingBar.setVisibility(View.GONE);

            @BaseRating.Smiley int smiley = myViewHolder.smileRating.getSelectedSmile();
            myViewHolder.smileRating.setOnSmileySelectionListener(new SmileRating.OnSmileySelectionListener() {
                @Override
                public void onSmileySelected(@BaseRating.Smiley int smiley, boolean reselected) {
                    // reselected is false when user selects different smiley that previously selected one
                    // true when the same smiley is selected.
                    // Except if it first time, then the value will be false.
                    switch (smiley) {
                        case SmileRating.BAD:
//                            myViewHolder.smileRating.setPlaceholderBackgroundColor(Color.GREEN);
                            break;
                        case SmileRating.GOOD:

                            break;
                        case SmileRating.GREAT:
//                            df.smileRating.setNormalColor(Color.GREEN);
                            break;
                        case SmileRating.OKAY:

                            break;
                        case SmileRating.TERRIBLE:

                            break;
                    }
                }
            });
            myViewHolder.smileRating.setOnRatingSelectedListener(new SmileRating.OnRatingSelectedListener() {
                @Override
                public void onRatingSelected(int level, boolean reselected) {
                    // level is from 1 to 5 (0 when none selected)
                    // reselected is false when user selects different smiley that previously selected one
                    // true when the same smiley is selected.
                    // Except if it first time, then the value will be false.
                }
            });

        }
        if (i == 1) {
//            final myViewHolder df=myViewHolder;
            myViewHolder.question.setText(String.valueOf(mData.get(i).getQuestion()));
            myViewHolder.smileRating.setVisibility(View.VISIBLE);
            myViewHolder.editText.setVisibility(View.GONE);
            myViewHolder.ratingBar.setVisibility(View.GONE);

            @BaseRating.Smiley int smiley = myViewHolder.smileRating.getSelectedSmile();
            myViewHolder.smileRating.setOnSmileySelectionListener(new SmileRating.OnSmileySelectionListener() {
                @Override
                public void onSmileySelected(@BaseRating.Smiley int smiley, boolean reselected) {
                    // reselected is false when user selects different smiley that previously selected one
                    // true when the same smiley is selected.
                    // Except if it first time, then the value will be false.
                    switch (smiley) {
                        case SmileRating.BAD:
//                            myViewHolder.smileRating.setPlaceholderBackgroundColor(Color.GREEN);
                            break;
                        case SmileRating.GOOD:

                            break;
                        case SmileRating.GREAT:
//                            df.smileRating.setNormalColor(Color.GREEN);
                            break;
                        case SmileRating.OKAY:

                            break;
                        case SmileRating.TERRIBLE:

                            break;
                    }
                }
            });
            myViewHolder.smileRating.setOnRatingSelectedListener(new SmileRating.OnRatingSelectedListener() {
                @Override
                public void onRatingSelected(int level, boolean reselected) {
                    // level is from 1 to 5 (0 when none selected)
                    // reselected is false when user selects different smiley that previously selected one
                    // true when the same smiley is selected.
                    // Except if it first time, then the value will be false.
                }
            });

        }
        if (i == 2) {

            myViewHolder.question.setText(String.valueOf(mData.get(i).getQuestion()));
            myViewHolder.smileRating.setVisibility(View.GONE);
            myViewHolder.editText.setVisibility(View.GONE);
            myViewHolder.ratingBar.setVisibility(View.VISIBLE);


        }
        if (i == 3) {

            myViewHolder.question.setText(String.valueOf(mData.get(i).getQuestion()));
            myViewHolder.smileRating.setVisibility(View.GONE);
            myViewHolder.editText.setVisibility(View.VISIBLE);
            myViewHolder.ratingBar.setVisibility(View.GONE);
        }

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static  class myViewHolder extends RecyclerView.ViewHolder{

        int questionNumber;
        TextView question;
        SeekBar seekBar;
        TextView seekBarValue;
        RatingBar ratingBar;
        EditText editText;
        SmileRating smileRating;

        public myViewHolder(@NonNull View itemView) {
            super(itemView);

            question = itemView.findViewById(R.id.questions);
            smileRating = itemView.findViewById(R.id.smile_rating);
            ratingBar = itemView.findViewById(R.id.rating_bar);
            editText = itemView.findViewById(R.id.suggestions);


        }
    }




}
