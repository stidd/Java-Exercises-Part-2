/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.domain;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author steventidd
 */
public class Box implements Thing{
    private int maximumCapacity;
    private List<Thing> things;
    
    public Box(int maximumCapacity){
        this.maximumCapacity = maximumCapacity;
        this.things = new ArrayList<Thing>();
    }
    
    public boolean addThing(Thing thing){
        if((getVolume() + thing.getVolume()) > this.maximumCapacity){
            return false;
        }else{
            things.add(thing);
            return true;
        }
    }
    
    @Override
    public int getVolume(){
        //return current volume of all the things in the box
        int total = 0;
        for(Thing thing : this.things){
            total += thing.getVolume();
        }
        return total;
    }
}
