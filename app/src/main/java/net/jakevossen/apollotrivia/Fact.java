package net.jakevossen.apollotrivia;

import android.os.Build;
import android.support.annotation.RequiresApi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * Created by Jake on 6/16/2017.
 */


public class Fact {
    private String question;
    private ArrayList<String> answers = new ArrayList<String>();
    private String correctAnswer;
    private String explanation;
    private String source;
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public Fact(String question, ArrayList<String> answersIn, String explanation, String source){
        this.question = question;
        this.answers.add(answersIn.get(0));
        this.answers.add(answersIn.get(1));
        this.answers.add(answersIn.get(2));
        this.answers.add(answersIn.get(3));
        this.correctAnswer = answers.get(0);
        this.explanation = explanation;
        this.source = source;
        randomize(answers);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    private void randomize(ArrayList<String> arr) {
        long seed = System.nanoTime();
        Collections.shuffle(arr, new Random(seed));
    }

    public String getQuestion(){
        return question;
    }
    public String getAnswer0(){
        return answers.get(0);
    }
    public String getAnswer1(){
        return answers.get(1);
    }
    public String getAnswer2(){
        return answers.get(2);
    }
    public String getAnswer3(){
        return answers.get(3);
    }
    public String getAnswer(int index){
        return answers.get(index);
    }
    public ArrayList<String> getAnswers(int index){
        return answers;
    }
    public String getCorrectAnswer(){
        return correctAnswer;
    }
    public String getExplanation() {
        return explanation;
    }
    public String getSource() {
        return source;
    }
}
