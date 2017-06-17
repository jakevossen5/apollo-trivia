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
        String source = "https://www.nasa.gov/mission_pages/apollo/missions/apollo1.html";
        ArrayList<String> answerList = new ArrayList<>();
        String question = "What year did humans first go to the moon?";
        answerList.add("1969");
        answerList.add("1977");
        answerList.add("1970");
        answerList.add("1982");

        int answerIndex = 0;
        String explanation = "The first humans on the moon was 1969";
        facts.addFact(new Fact(question,answerList,answerIndex,explanation));
        //fact template
        /*
        question = "";
        tempFacts[0] = "";
        tempFacts[1] = "";
        tempFacts[2] = "";
        tempFacts[3] = "";
        answerIndex = 0;
        explanation = "";
        facts.addFact(new Fact(question,tempFacts,answerIndex));
         */
        question = "What were the first words spoken on the moon?";
        answerList.clear();
        answerList.add("asd");
        answerList.add("fda");
        answerList.add("19asdf70");
        answerList.add("1asd982");
        answerIndex = 0;
        explanation = "asdf";
        facts.addFact(new Fact(question,answerList,answerIndex,explanation));
        return facts;
    }

}
