/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author steventidd
 */
public class Flight {
    private Plane plane;
    private String departCode;
    private String destinCode;
    
    public Flight(Plane plane, String departCode, String destinCode){
        this.plane = plane;
        this.departCode = departCode;
        this.destinCode = destinCode;
    }
    
    public Plane getPlane(){
        return this.plane;
    }
    
    public String getDepartCode(){
        return this.departCode;
    }
    
    public String getDestinCode(){
        return this.destinCode;
    }
    
    
    public String toString(){
        return plane.getID() + " (" + plane.getCapacity() + " ppl)" + " (" + this.departCode + "-" + this.destinCode + ")";
    }
    
}
