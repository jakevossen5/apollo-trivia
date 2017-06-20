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
}
