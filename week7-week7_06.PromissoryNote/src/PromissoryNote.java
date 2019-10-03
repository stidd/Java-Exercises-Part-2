/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author steventidd
 */
import java.util.HashMap;
import java.util.ArrayList;

public class PromissoryNote {
    private HashMap<String, Double> notes;
    
    
    public PromissoryNote(){
        this.notes = new HashMap<String, Double>();
    }
    
    public void setLoan(String toWhom, double value){
        String name = toWhom.toLowerCase().trim();
        this.notes.put(name, value);
    }
    
    public double howMuchIsTheDebt(String whose){
        String name = whose.toLowerCase().trim();
        
        if(this.notes.containsKey(name)){
            return this.notes.get(name);
        }
        
        return 0;
    }
    
}
