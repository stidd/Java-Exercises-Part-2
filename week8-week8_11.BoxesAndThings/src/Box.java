
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author steventidd
 */


public class Box implements ToBeStored {
    private double maxWeight;
    private ArrayList<ToBeStored> box;
    
    public Box(double maxWeight){
        this.maxWeight = maxWeight;
        this.box = new ArrayList<ToBeStored>();
    }
    
    public void add(ToBeStored thing){
       //add to box as long as it doesnt exceed the max weight
       if((thing.weight() + this.weight()) <= this.maxWeight){
           box.add(thing);
       }
    }
    
    public double weight(){
        double weight = 0;
        for(ToBeStored thing : this.box){
            weight += thing.weight();
        }
        return weight;
    }
    
    public String toString(){
        return "Box: " + this.box.size() + " things, total weight " + this.weight() + " kg";
    }
    
    
    
    
}
