package net.jakevossen.apollotrivia;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Jake on 6/16/2017.
 */

public class Facts {

    private ArrayList<Fact> facts = new ArrayList<Fact>();
    public Facts(){

    }
    public void addFact(Fact fact){
        facts.add(fact);
    }
    public Fact getFact(int index){
        return facts.get(index);
    }
    public Fact getRandomFact(){
        return facts.get((new Random()).nextInt(facts.size()));
    }
}
