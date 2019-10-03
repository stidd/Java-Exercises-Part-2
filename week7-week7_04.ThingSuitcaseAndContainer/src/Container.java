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

public class Container {
    private int maxWeight;
    private ArrayList<Suitcase> box;
    
    public Container(int maxWeight){
        this.maxWeight = maxWeight;
        this.box = new ArrayList<Suitcase>();
    }
    
    public void addSuitcase(Suitcase suitcase){
        if((suitcase.totalWeight() + this.totalBoxWeight()) <= this.maxWeight){
            this.box.add(suitcase);
        }
    }
    
    public int totalBoxWeight(){
        int totalWeight = 0;
        for(Suitcase suitcase : this.box){
            totalWeight += suitcase.totalWeight();
        }
        
        return totalWeight;
    }
    
    public void printThings(){
        
        for(Suitcase suitcase : this.box){
            suitcase.printThings();
        }
    }
    
    public String toString(){
        return this.box.size() + " suitcases ( " + this.totalBoxWeight() + " kg)";
    }
}
