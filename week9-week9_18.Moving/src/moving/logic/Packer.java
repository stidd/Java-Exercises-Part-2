/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package moving.logic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import moving.domain.Box;
import moving.domain.Item;
import moving.domain.Thing;


/**
 *
 * @author steventidd
 */
public class Packer {
    private int boxesVolume;
    
    
    public Packer(int boxesVolume){
        this.boxesVolume = boxesVolume;
    }
    
    
    
    public List<Box> packThings(List<Thing> things){
        //converts the Item objects into an ArrayList type Item
//       ArrayList<Item> temp = new ArrayList<Item>();
//       for(Thing thing : things){
//           temp.add((Item) thing);
//       }
//       
       //Collections.sort(things);
       
       List<Box> boxes = new ArrayList<Box>();
       
       Box box = new Box(this.boxesVolume);

       for(Thing thing : things){
           boolean fit = box.addThing(thing);
           
           if(!fit){
               boxes.add(box);
               box = new Box(this.boxesVolume);
               box.addThing(thing);
           }
       }
       
       boxes.add(box);
       
       return boxes;
       
    }
    
    
    
    
}
