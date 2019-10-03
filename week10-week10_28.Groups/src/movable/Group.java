/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movable;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author steventidd
 */
public class Group implements Movable{
    private List<Movable> things = new ArrayList<Movable>();
    
    
    public void addToGroup(Movable movable){
        things.add(movable);
    }
    
    @Override
    public String toString(){
       String result = "";
       for(Movable movable : this.things){
           result += movable.toString() + " \n";
       }
       return result;
    }
    
    @Override
    public void move(int dx, int dy){
        // move each organism of the group
        for(Movable movable : this.things){
            movable.move(dx, dy);
        }
    }
}
