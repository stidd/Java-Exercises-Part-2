
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author steventidd
 */
public class Hand implements Comparable<Hand>{
    private List<Card> hand;
    
    public Hand(){
        this.hand = new ArrayList<Card>();
    }
    
    public void add(Card card){
        hand.add(card);
    }
    
    public void print(){
        for(Card card : this.hand){
            System.out.println(card);
        }
    }
    
    public int getHandValue(){
        int sum = 0;
        for(Card card : this.hand){
            sum += card.getValue();
        }
        
        return sum;
    }
    
    public void sortAgainstSuit(){
        Collections.sort(this.hand, new SortAgainstSuitAndValue());
    }
    
    public void sort(){
        Collections.sort(this.hand);
    }
    
    @Override
    public int compareTo(Hand other){
        return this.getHandValue() - other.getHandValue();
    }
}
