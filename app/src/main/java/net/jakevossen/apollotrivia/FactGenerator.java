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
        String tempFacts[] = {"answer0","answer1","answer2","answer3"};
        facts.addFact(new Fact("question",tempFacts,1));
        //String tempFacts[] = {"answer0","answer1","answer2","answer3"};
        facts.addFact(new Fact("question1",tempFacts,1));
        return facts;
    }

}
