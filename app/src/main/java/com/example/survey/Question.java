package com.example.survey;

public class Question {

    private int questionNumber;
    private String question;
    private String[] options = new String[5];
    private int seekbarValue;
    private int seekBar;
    private  int ratingBar;
    private int editText;

    public Question() {
    }

    public Question(int questionNumber, String question, String[] options, int seekbarValue, int seekBar, int ratingBar, int editText) {
        this.questionNumber = questionNumber;
        this.question = question;
        this.options = options;
        this.seekbarValue = seekbarValue;
        this.seekBar = seekBar;
        this.ratingBar = ratingBar;
        this.editText = editText;
    }

    public int getQuestionNumber() {
        return questionNumber;
    }

    public void setQuestionNumber(int questionNumber) {
        this.questionNumber = questionNumber;
    }

    public String getQuestion() {
        return question;
    }

    public String[] getOptions() {
        return options;
    }

    public int getSeekbarValue() {
        return seekbarValue;
    }

    public int getSeekBar() {
        return seekBar;
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

    public void setOptions(String[] options) {
        this.options = options;
    }

    public void setSeekbarValue(int seekbarValue) {
        this.seekbarValue = seekbarValue;
    }

    public void setSeekBar(int seekBar) {
        this.seekBar = seekBar;
    }

    public void setRatingBar(int ratingBar) {
        this.ratingBar = ratingBar;
    }

    public void setEditText(int editText) {
        this.editText = editText;
    }
}
