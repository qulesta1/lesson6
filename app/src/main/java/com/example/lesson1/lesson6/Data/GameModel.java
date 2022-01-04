package com.example.lesson1.lesson6.Data;

import java.io.Serializable;

public class GameModel  implements Serializable  {
    private String level;
    private  String qiuz;
    private  String answerOne;
    private  String answerTwo;
    private  String answerThree;
    private  String answerFour;
    private  String answerCorrect;

    public GameModel(String level, String qiuz, String answerOne, String answerTwo, String answerThree, String answerFour, String answerCorrect) {
        this.level = level;
        this.qiuz = qiuz;
        this.answerOne = answerOne;
        this.answerTwo = answerTwo;
        this.answerThree = answerThree;
        this.answerFour = answerFour;
        this.answerCorrect = answerCorrect;
    }

    public String getLevel() {
        return level;
    }

    public String getQiuz() {
        return qiuz;
    }

    public String getAnswerOne() {
        return answerOne;
    }

    public String getAnswerTwo() {
        return answerTwo;
    }

    public String getAnswerThree() {
        return answerThree;
    }

    public String getAnswerFour() {
        return answerFour;
    }

    public String getAnswerCorrect() {
        return answerCorrect;
    }
}
