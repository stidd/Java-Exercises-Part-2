
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author steventidd
 */
public class Planes {
    private ArrayList<Plane> planes;
    
    public Planes(){
        this.planes = new ArrayList<Plane>();
    }
    
    public void addPlane(String id, int capacity){
//        boolean toAdd = true;
//        for(Plane plane : this.planes){
//            if(plane.getID().equals(id)){
//                toAdd = false;
//            }
//        }
//        
//        if(toAdd){
//            planes.add(new Plane(id, capacity));
//        }else{
//            System.out.println("Invalid entry");
//        }
        
        planes.add(new Plane(id, capacity));

    }
    
    public Plane getPlane(String planeID){
        for(Plane plane : this.planes){
            if(plane.getID().equals(planeID)){
                return plane;
            }
        }
        
        return null;
    }
    
    public void printPlanes(){
        for(Plane plane : this.planes){
            System.out.println(plane);
        }
    }
    
    
}
