package net.jakevossen.apollotrivia;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * Created by Jake on 6/16/2017.
 */

public class Facts {

    private ArrayList<Fact> facts = new ArrayList<Fact>();
    private static int curIndex = 0;
    public Facts(){
        randomizeArray();
    }
    public void randomizeArray(){
        long seed = System.nanoTime();
        Collections.shuffle(facts, new Random(seed));
    }
    public void addFact(Fact fact){
        facts.add(fact);
    }
    public ArrayList<Fact> getFacts(){
        return facts;
    }
    public Fact getFact(int index){
        return facts.get(index);
    }
    public Fact getRandomFact(){
        if (curIndex < facts.size()){
            Fact fact = getFact(curIndex);
            curIndex++;
            return fact;
        }
        else {
            randomizeArray();
            curIndex = 0;
            curIndex++;
            return facts.get(0);
        }
    }
    //I am very ashamed of this, don't worry. It will take the facts and convert them to something I can add to my website version of the app
    public void jsonify(ArrayList facts) {
        String theString = "";
        ArrayList<String> arrOfStrings = new ArrayList<>();
        Log.d("TAG","does she work");
        Log.d("TAG",("the arraylist length is" + facts.size()));
        for (int i = 0; i < facts.size(); i++) {
            Fact curFact = (Fact) facts.get(i);
            theString = "{ \"question\":\"" + addEscapes(curFact.getQuestion()) + "\", \n";
            theString += "\"answers\":[ \"" + addEscapes(curFact.getAnswer0()) + "\", \"" + addEscapes(curFact.getAnswer1()) + "\", \"" + addEscapes(curFact.getAnswer2())+ "\", \"" + addEscapes(curFact.getAnswer3()) + "\"],\n";
            theString += "\"explanation\":\"" + addEscapes(curFact.getExplanation()) +"\",\n";
            theString += "\"source\":\"" + curFact.getSource() +"\"";
            //this is so it doesn't add a , at the end
            if (i == (facts.size()-1)){
                theString += "}" + "\n";
            }
            else {
                theString += "}," + "\n";
            }

            arrOfStrings.add(theString);
        }
        for (String str : arrOfStrings){
            Log.d("TAG", str);
        }

    }
    // Takes a string and returns a string with  a \ before the " to help with facts with quotes in them
    private String addEscapes(String str){
        String temp = "";
        char curChar = 'a';
        for (int i = 0; i < str.length(); i++){
            curChar = str.charAt(i);
            if (curChar == '\"'){
                temp = temp + "\\\"";
            }
            else{
                temp = temp + curChar;
            }
        }
        return temp;
    }
}
