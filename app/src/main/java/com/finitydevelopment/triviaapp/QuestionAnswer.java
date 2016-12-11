package com.finitydevelopment.triviaapp;

/**
 * Created by finity on 11/7/2016.
 */
public class QuestionAnswer {

    private int questionID;
    private boolean isTrue;

    private int correctAnswer;

    private int answerA;
    private int answerB;
    private int answerC;
    private int answerD;

    public int getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(int correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public int getAnswerA() {
        return answerA;
    }

    public void setAnswerA(int answerA) {
        this.answerA = answerA;
    }

    public int getAnswerB() {
        return answerB;
    }

    public void setAnswerB(int answerB) {
        this.answerB = answerB;
    }

    public int getAnswerC() {
        return answerC;
    }

    public void setAnswerC(int answerC) {
        this.answerC = answerC;
    }

    public int getAnswerD() {
        return answerD;
    }

    public void setAnswerD(int answerD) {
        this.answerD = answerD;
    }

    public int getQuestionID() {
        return questionID;
    }

    public void setQuestionID(int questionID) {
        this.questionID = questionID;
    }

    public boolean isTrue() {
        return isTrue;
    }

    public void setTrue(boolean aTrue) {
        isTrue = aTrue;
    }

    public QuestionAnswer(int questionID, boolean isTrue) {
        this.questionID = questionID;
        this.isTrue = isTrue;

    }

    public QuestionAnswer(int questionID, int answerA, int answerB,
                          int answerC, int answerD, int correctAnswer) {

        this.questionID = questionID;
        this.answerA = answerA;
        this.answerB = answerB;
        this.answerC = answerC;
        this.answerD = answerD;
        this.correctAnswer = correctAnswer;

    }


}
