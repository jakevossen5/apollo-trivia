package net.jakevossen.apollotrivia;

import android.net.Uri;
import android.os.Build;
import android.support.annotation.RequiresApi;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jake on 6/16/2017.
 */
public class FactGenerator {
    InputStream inputStream;

    public FactGenerator(){ };
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public Facts genFacts(){
        Facts facts = new Facts();
        ArrayList<String> answerList = new ArrayList<>();
        //new question
        String question = "What year did humans first go to the moon?";

        answerList.add("1969");
        answerList.add("1977");
        answerList.add("1970");
        answerList.add("1982");

        int answerIndex = 0;
        String explanation = "The first humans on the moon was 1969.";
        String source = "https://www.nasa.gov/mission_pages/apollo/missions/apollo11.html";

        facts.addFact(new Fact(question,answerList,answerIndex,explanation,source));

        //new question
        answerList.clear();

        question = "What were the first words spoken on the moon?";

        answerList.add("...one small step for a man, one giant leap for mankind");
        answerList.add("The pledge of alegence");
        answerList.add("The preamble of the constitution");
        answerList.add("Not known, the radio data failed");

        answerIndex = 0;
        explanation = "\"...one small step for a man, one giant leap for mankind\" were the first words on the moon, spoken my Niel Armstrong. He claims he siad \"...one small step for a man, AND ONE giant leap for mankind\", but the radio did not pick up on it.";
        source = "https://www.nasa.gov/mission_pages/apollo/missions/apollo11.html";

        facts.addFact(new Fact(question,answerList,answerIndex,explanation,source));

        //new question


        return facts;
    }

}
