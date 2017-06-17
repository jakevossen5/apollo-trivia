package net.jakevossen.apollotrivia;

import android.os.Build;
import android.support.annotation.RequiresApi;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by Jake on 6/16/2017.
 */

public class Fact {
    private String question;
    private String[] answers;
    private String answer0;
    private String answer1;
    private String answer2;
    private String answer3;
    private int correctAnswerIndex;
    private String correctAnswer;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public Fact(String question, String[] answers, int correctAnswerIndex){
        this.question = question;
        this.answer0 = answers[0];
        this.answer1 = answers[1];
        this.answer2 = answers[2];
        this.answer3 = answers[3];
        this.answers = answers;
        this.correctAnswerIndex = correctAnswerIndex;
        this.correctAnswer = answers[correctAnswerIndex];
        randomize(answers);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    private void randomize(String arr[]) {
        Random rnd = ThreadLocalRandom.current();
        for (int i = arr.length - 1; i > 0; i--)
        {
            int index = rnd.nextInt(i + 1);
            // Simple swap
            String a = arr[index];
            arr[index] = arr[i];
            arr[i] = a;
        }
        for (int i = 0; i < arr.length; i++){
            if (arr[i].equals(correctAnswer)) {
                correctAnswerIndex = i;
            }
        }
    }

    public String getQuestion(){
        return question;
    }
    public String getAnswer0(){
        return answer0;
    }
    public String getAnswer1(){
        return answer1;
    }
    public String getAnswer2(){
        return answer2;
    }
    public String getAnswer3(){
        return answer3;
    }
    public String getAnswer(int index){
        return answers[index];
    }
    public String[] getAnswers(int index){
        return answers;
    }
    public String getCorrectAnswer(){
        return correctAnswer;
    }
    public int correctAnswerIndex(){
        return correctAnswerIndex;
    }
}
