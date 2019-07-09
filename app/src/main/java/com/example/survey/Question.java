package com.example.survey;

public class Question {

    private int questionNumber;
    private String question;
    private int smileRatingBar;
    private  int ratingBar;
    private int editText;

    public Question() {
    }

    public Question(int questionNumber, String question, int smileRatingBar, int ratingBar, int editText) {
        this.questionNumber = questionNumber;
        this.question = question;
        this.smileRatingBar = smileRatingBar;
        this.ratingBar = ratingBar;
        this.editText = editText;
    }

    public int getQuestionNumber() {
        return questionNumber;
    }


    public String getQuestion() {
        return question;
    }

    public int getSmileRatingBar() {
        return smileRatingBar;
    }

    public void setSmileRatingBar(int smileRatingBar) {
        this.smileRatingBar = smileRatingBar;
    }

    public int getRatingBar() {
        return ratingBar;
    }

    public int getEditText() {
        return editText;
    }

    public void setQuestion(String question) {
        this.question = question;
    }


    public void setRatingBar(int ratingBar) {
        this.ratingBar = ratingBar;
    }

    public void setEditText(int editText) {
        this.editText = editText;
    }
}
