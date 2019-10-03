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

public class Dictionary {
    private HashMap<String, String> words;
    
    public Dictionary(){
        this.words = new HashMap<String, String>();
    }
    
    public String translate(String word){
        if(this.words.containsKey(word)){
            return this.words.get(word);
        }
        
        return null;
    }
    
    public void add(String word, String translation){
        words.put(word, translation);
    }
    
    public int amountOfWords(){
        return this.words.size();
    }
    
    public ArrayList<String> translationList(){
        ArrayList<String> list = new ArrayList<String>();
        
        for(String key : this.words.keySet()){
            list.add(key + " = " + this.words.get(key));
        }
        
        return list;
    }
    
    
}
