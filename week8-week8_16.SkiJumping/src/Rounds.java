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
import java.util.Collections;
import java.util.List;



public class Rounds {
    private List<Jumper> jumpers;
    private int roundNumber;
    
    public Rounds(){
        this.jumpers = new ArrayList<Jumper>();
        this.roundNumber = 0;
    }
    
    public int getRoundNumber(){
        return this.roundNumber;
    }
    
    public void addJumpers(String name){
        this.jumpers.add(new Jumper(name));
    }
    
    public List<Jumper> getJumpers(){
        return this.jumpers;
    }
    
    public void getJumpingOrder(){
        if(this.roundNumber == 1){
            int order = 1;
            for(Jumper jumper : this.jumpers){
                System.out.println("  " + order + ". " + jumper.getName() + " (" + 0 + " points)");
                order++;
            }
        }
        
        if(this.roundNumber > 1){
             int order = 1;
            for(Jumper jumper : this.jumpers){
                System.out.println("  " + order + ". " + jumper.getName() + " (" + jumper.getTotalPoints() + " points)");
                order++;
            }
        }
       
    }
    
    public void invokeRoundOfJumps(){
        //increase the round  (starts at 0)
        this.roundNumber++;
        
        if(this.roundNumber == 1){
            for(Jumper jumper : this.jumpers){
                jumper.addJump();
            }
        }
        
        if(this.roundNumber > 1){
            this.sort();
            for(Jumper jumper : this.jumpers){
                jumper.addJump();
            }
        }
        
    }
    
    public void getFinalResults(){
        this.reverse();
        
        this.printOfFinalResults();
        
    }
    
    public void printOfFinalResults(){
        int order = 1;
        for(Jumper jumper : this.jumpers){
            System.out.println(order + "           " + jumper.getName() + " (" + jumper.getTotalPoints() + " points)");
            order++;
            List<Jump> jumpersJump = jumper.getJumps();
            String outputJumps = "            jump lengths: ";
            for(Jump jump : jumpersJump){
                outputJumps += jump.getJumpDistance() + " m, ";
            }
            String finalOutput = outputJumps.replaceAll(", $", "");
            System.out.println(finalOutput);
        }
    }
    
    
    
    public void sort(){
        Collections.sort(this.jumpers);
    }
    
    // need to reverse the order to print most points first and all their jump lengths
    public void reverse(){
        Collections.sort(this.jumpers, new ReverseSort());
    }
    
    
}
