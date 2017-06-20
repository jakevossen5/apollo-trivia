package net.jakevossen.apollotrivia;

import android.util.Log;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Jake on 6/16/2017.
 */

public class Facts {

    private ArrayList<Fact> facts = new ArrayList<Fact>();
    private ArrayList<Fact> usedFacts = new ArrayList<Fact>();
    public Facts(){

    }
    public void addFact(Fact fact){
        facts.add(fact);
    }
    public Fact getFact(int index){
        return facts.get(index);
    }
    public Fact getRandomFact(){
        Fact fact = facts.get((new Random()).nextInt(facts.size()));
        usedFacts.add(fact);
        facts.remove(fact);
        if(usedFacts.size() == 0){
            Log.d("TAG", "Reloading the used questions");
            for (int i = 0; i < usedFacts.size(); i++){
                facts.add(usedFacts.get(i));
            }
        }
        return fact;
    }
}
