/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package containers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author steventidd
 */
public class ContainerHistory {
    private List<Double> history;
    
    public ContainerHistory(){
        this.history = new ArrayList<Double>();
    }
    
    public void add(double situation){
        this.history.add(situation);
    }
    
    public void reset(){
        this.history.clear();
    }
    
    @Override
    public String toString(){
        return this.history.toString();
    }
    
    public double maxValue(){
        return Collections.max(history);
    }
    
    public double minValue(){
        return Collections.min(history);
    }
    
    public double average(){
        double sum = 0.0;
        for(double num : this.history){
            sum += num;
        }
        return sum / this.history.size();
    }
    
    public double greatestFluctuation(){
//        double startingAmt = this.history.get(0);
//        double result = 0;
//        if(this.history.size() < 1){
//            return 0.0;
//        }
//        
//        for(double num : this.history){
//            double difference = Math.abs(startingAmt) - Math.abs(num);
//            if(difference > result){
//                result = difference;
//            }
//        }
//        
//        return Math.abs(result);
        double maxFluctuation = 0;
        
        for (int i = 0; i < this.history.size()-1; i++) {
            double current = this.history.get(i) - this.history.get(i+1);
            current = Math.abs(current);
            
            if (current > maxFluctuation) {
                maxFluctuation = current;
            }
        }
        return maxFluctuation;
          
    }
    
    public double variance(){
        if(this.history.size() < 1){
            return 0.0;
        }
        
        double sqDiff = 0.0;
        for(double num : this.history){
            sqDiff += Math.pow(num - this.average(), 2);
        }
        
        return sqDiff / (this.history.size() - 1);
    }
}
