/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

import java.util.Collection;

/**
 *
 * @author steventidd
 */
public class Barn {
    private BulkTank tank;
    
    public Barn(BulkTank tank){
        this.tank = tank;
    }
    
    public BulkTank getBulkTank(){
        return this.tank;
    }
    
    public void installMilkingRobot(MilkingRobot milkingRobot){
        milkingRobot.setBulkTank(this.tank);
    }
    
    public void takeCareOf(Cow cow){
        try{
            this.tank.addToTank(cow.milk());
        }catch(Exception e){
            throw new IllegalStateException("Milking Robot Not Hooked Up!");
        }
    }
    
    public void takeCareOf(Collection<Cow> cows ){
        try{
            for(Cow cow: cows){
                this.tank.addToTank(cow.milk());
            }
        }catch(Exception e){
            throw new IllegalStateException("Milking Robot Not Hooked Up!");
        }
        
    }
    
    @Override
    public String toString(){
        return this.tank.toString();
    }
    
}
