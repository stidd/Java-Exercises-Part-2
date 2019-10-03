/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author steventidd
 */
import java.util.ArrayList;

public class Suitcase {
    private int weightLimit;
    private ArrayList<Thing> things;
    
    
    public Suitcase(int weightLimit){
        this.weightLimit = weightLimit;
        this.things = new ArrayList<Thing>();
    }
    
    public void addThing(Thing thing){
        int totalWeightNow = this.totalWeight();
               
        if((totalWeightNow + thing.getWeight()) <= this.weightLimit){
            things.add(thing);
        }
    }
    
    public void printThings(){
        for(Thing thing : this.things){
            System.out.println(thing.toString());
        }
    }
    
    public int totalWeight(){
        int totalWeight = 0;
        
        for(Thing eachThing : this.things){
            totalWeight += eachThing.getWeight();
        }
        
        return totalWeight;
    }
    
    public Thing heaviestThing(){
        if(things.size() <= 0){
            return null;
        }
        
        Thing heaviest = things.get(0);
        for(Thing thing : this.things){
            if(thing.getWeight() > heaviest.getWeight()){
                heaviest = thing;
            }
        }
        
        return heaviest;
    }
    
    public String toString(){
        int totalWeightNow = this.totalWeight();
        
        if(things.size() <= 0){
            return "empty (" + totalWeightNow + " kg)";
        }
        if(things.size() == 1){
            return things.size() + " thing " + "(" + totalWeightNow + " kg)";
        }
        
        return things.size() + " things " + "(" + totalWeightNow + " kg)";
       
    }
}
