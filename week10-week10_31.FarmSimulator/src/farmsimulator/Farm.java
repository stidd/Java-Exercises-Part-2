/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author steventidd
 */
public class Farm implements Alive{
    private String owner;
    private Barn barn;
    private List<Cow> cows = new ArrayList<Cow>();
    
    
    public Farm(String owner, Barn barn){
        this.owner = owner;
        this.barn = barn;
    }
    
    public String getOwner(){
        return this.owner;
    }
    
    public void addCow(Cow cow){
        this.cows.add(cow);
    }
    
    
    @Override
    public void liveHour(){
        for(Cow cow: this.cows){
            cow.liveHour();
        }
    }
    
    public void manageCows(){
        this.barn.takeCareOf(this.cows);
    }
    
    public void installMilkingRobot(MilkingRobot robot){
        this.barn.installMilkingRobot(robot);
    }
    
    public String animalList(){
        String output = "";
        
        if(this.cows.size() < 1){
            return output += "No cows.";
        }
        
        output += "Animals: ";
        output += "\n";
        for(Cow cow: this.cows){
            output += "        " + cow + "\n";
        }
        
        return output;
        
    }
    
    public String toString(){
        return "Farm owner: " + this.owner + "\n" + "Barn bulk tank: " + this.barn.getBulkTank() + "\n" + this.animalList();
    }
    
}
