package com.example.e_speaking;

public class QuestionModel {
    private String question, option1, option2, option3;
    private int correctAnsNo;

    public QuestionModel(String question, String option1, String option2, String option3, int correctAnsNo){
        this.question = question;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.correctAnsNo = correctAnsNo;

    }

    public String getQuestion() {
        return question;
    }

    public String getOption1() {
        return option1;
    }

    public String getOption2() {
        return option2;
    }

    public String getOption3() {
        return option3;
    }

    public int getCorrectAnsNo() {
        return correctAnsNo;
    }
}
