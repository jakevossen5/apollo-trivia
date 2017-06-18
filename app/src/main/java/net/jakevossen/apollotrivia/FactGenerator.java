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
        //vars
        Facts facts = new Facts();
        ArrayList<String> answerList = new ArrayList<>();
        String question;
        int answerIndex;
        String explanation;
        String source;
        //generic question
        /*
        //new question
        answerList.clear();
        question = "";

        answerList.add("");
        answerList.add("");
        answerList.add("");
        answerList.add("");

        answerIndex = 0;
        explanation = "";
        source = "";

        facts.addFact(new Fact(question,answerList,answerIndex,explanation,source));

         */

        //new question
        question = "What year did humans first go to the moon?";

        answerList.add("1969");
        answerList.add("1977");
        answerList.add("1970");
        answerList.add("1982");

        answerIndex = 0;
        explanation = "The first humans on the moon was 1969.";
        source = "https://www.nasa.gov/mission_pages/apollo/missions/apollo11.html";

        facts.addFact(new Fact(question,answerList,answerIndex,explanation,source));

        //new question
        answerList.clear();

        question = "What were the first words spoken on the moon?";

        answerList.add("...one small step for a man, one giant leap for mankind");
        answerList.add("The pledge of allegiance");
        answerList.add("The preamble of the constitution");
        answerList.add("Not known, the radio data failed");

        answerIndex = 0;
        explanation = "\"...one small step for a man, one giant leap for mankind\" were the first words on the moon, spoken my Niel Armstrong. He claims he siad \"...one small step for a man, AND ONE giant leap for mankind\", but the radio did not pick up on it.";
        source = "https://www.nasa.gov/mission_pages/apollo/missions/apollo11.html";

        facts.addFact(new Fact(question,answerList,answerIndex,explanation,source));

        //new question
        answerList.clear();
        question = "What was the first Apollo Mission?";

        answerList.add("Apollo 1");
        answerList.add("Apollo 0");
        answerList.add("Apollo 11");
        answerList.add("Apollo 10");

        answerIndex = 0;
        explanation = "Apollo 1 was the first mission";
        source = "https://www.nasa.gov/mission_pages/apollo/missions/index.html";

        facts.addFact(new Fact(question,answerList,answerIndex,explanation,source));

        //new question
        answerList.clear();
        question = "When was the tragedy of the Apollo 1 mission?";

        answerList.add("Jan. 27, 1967");
        answerList.add("Jul. 14, 1966");
        answerList.add("Dec. 2, 1968");
        answerList.add("May 29, 1968");

        answerIndex = 0;
        explanation = "Jan. 27, 1967 was the day that a preflight test killed Virgil Grissom, Edward White, and Roger Chaffee";
        source = "https://www.nasa.gov/mission_pages/apollo/missions/apollo1.html";

        facts.addFact(new Fact(question,answerList,answerIndex,explanation,source));

        //new question
        answerList.clear();
        question = "What is the name of the rocket primarily used in the Apollo missions?";

        answerList.add("Saturn");
        answerList.add("Falcon");
        answerList.add("Atlas");
        answerList.add("Delta");

        answerIndex = 0;
        explanation = "Saturn were the rockets primarily used during the Apollo missions.";
        source = "https://www.nasa.gov/mission_pages/apollo/missions/apollo1.html";

        facts.addFact(new Fact(question,answerList,answerIndex,explanation,source));

        //new question
        answerList.clear();
        question = "What mission contained the first Saturn V launch?";

        answerList.add("Apollo 4");
        answerList.add("Apollo 1");
        answerList.add("Apollo 11");
        answerList.add("Apollo 10");

        answerIndex = 0;
        explanation = "Apollo 4 was the first to fly the Saturn V rocket";
        source = "https://www.nasa.gov/mission_pages/apollo/missions/apollo1.html";

        facts.addFact(new Fact(question,answerList,answerIndex,explanation,source));

        //new question
        answerList.clear();
        question = "What year was the first Saturn rocket launched?";

        answerList.add("1967");
        answerList.add("1963");
        answerList.add("1965");
        answerList.add("1969");

        answerIndex = 0;
        explanation = "1967 was the first time the Saturn V rocket flew";
        source = "https://www.nasa.gov/audience/forstudents/5-8/features/nasa-knows/what-was-the-saturn-v-58.html";

        facts.addFact(new Fact(question,answerList,answerIndex,explanation,source));

        //new question
        answerList.clear();
        question = "How heavy is the Saturn V rocket fully fueled?";

        answerList.add("2.8 million kilograms");
        answerList.add(".9 million kilograms");
        answerList.add("8.1 million kilograms");
        answerList.add("4.2 million kilograms");

        answerIndex = 0;
        explanation = "Fully fueled for liftoff, the Saturn V weighed 2.8 million kilograms (6.2 million pounds).";
        source = "https://www.nasa.gov/audience/forstudents/5-8/features/nasa-knows/what-was-the-saturn-v-58.html";

        facts.addFact(new Fact(question,answerList,answerIndex,explanation,source));

        //new question
        answerList.clear();
        question = "How tall is the Saturn V rocket?";

        answerList.add("111 meters");
        answerList.add("314 meters");
        answerList.add("72 meters");
        answerList.add("161 meters");

        answerIndex = 0;
        explanation = "The Saturn V rocket was 111 meters tall";
        source = "https://www.nasa.gov/audience/forstudents/5-8/features/nasa-knows/what-was-the-saturn-v-58.html";

        facts.addFact(new Fact(question,answerList,answerIndex,explanation,source));

        //new question
        answerList.clear();
        question = "How many elephants does the Saturn V rocket weigh when it is fully fueled?";

        answerList.add("400");
        answerList.add("120");
        answerList.add("1000");
        answerList.add("650");

        answerIndex = 0;
        explanation = "The Saturn V rocket weighed about 400 elephants when it was fueled for takeoff.";
        source = "https://www.nasa.gov/audience/forstudents/5-8/features/nasa-knows/what-was-the-saturn-v-58.html";

        facts.addFact(new Fact(question,answerList,answerIndex,explanation,source));

        //new question
        answerList.clear();
        question = "How many pounds of thrust did the Saturn V produce at launch?";

        answerList.add("34.5 million newtons");
        answerList.add("133.2 million newtons");
        answerList.add("12.8 million newtons");
        answerList.add("72.1 million newtons");

        answerIndex = 0;
        explanation = "The saturn V generated 34.5 million newtons(7.6 million pounds) of thrust at launch, which is more than 85 Hoover Dams.)";
        source = "https://www.nasa.gov/audience/forstudents/5-8/features/nasa-knows/what-was-the-saturn-v-58.html";

        facts.addFact(new Fact(question,answerList,answerIndex,explanation,source));

        return facts;
    }

}
