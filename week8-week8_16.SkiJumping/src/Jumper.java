
import java.util.ArrayList;
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
public class Jumper implements Comparable<Jumper>{
    private String name;
    private List<Jump> jumps;
   
    
    
    public Jumper(String name){
        this.name = name;
        this.jumps = new ArrayList<Jump>();
       
    }
    
    public String getName(){
        return this.name;
    }
    
    public List<Jump> getJumps(){
        List<Jump> arr = this.jumps;
        return arr;
    }
    
    public int getTotalPoints(){
        int total = 0;
        for(Jump jump : this.jumps){
            total += jump.jumpTotalScore();
        }
        
        return total;
    }
    
    public void addJump(){
        Jump jump = new Jump();
        jump.judgeScores();
        this.jumps.add(jump);
        
    }
    
  
    
    @Override
    public String toString(){
        return this.name + " (" + this.getTotalPoints() + ")";
    }
    
    
    @Override
    public int compareTo(Jumper jumper){
       return this.getTotalPoints() - jumper.getTotalPoints();
    }
    
}
