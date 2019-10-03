/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author steventidd
 */
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;



public class Flights{
    // make each unique plane have the aiblity to have an arrayList of multiple flights
    //private HashMap<String, Flight> flights;
    private HashMap<String, ArrayList<Flight>> flights;
    public Flights(){
        //this.flights = new HashMap<String, Flight>();
        this.flights = new HashMap<String, ArrayList<Flight>>();
    }
    
    public void addFlight(Plane plane, String departCode, String destinCode){
//       if(this.flights.containsKey(plane.getID())){
//           System.out.println("Invalid entry");
//       }else{
//           this.flights.put(plane.getID(), new Flight(plane, departCode, destinCode));
//       }
       
       if(this.flights.containsKey(plane.getID())){
           //update the flight arraylist
           flights.get(plane.getID()).add(new Flight(plane, departCode, destinCode));
           
       }else{
           //make a new flight 
           ArrayList<Flight> addFlight = new ArrayList<Flight>();
           addFlight.add(new Flight(plane, departCode, destinCode));
           this.flights.put(plane.getID(), addFlight);
       }
        

        
       
    }
    
    public void printFlights(){
       System.out.println("");
//       for(String key : this.flights.keySet()){
//           System.out.println(this.flights.get(key));
//       }
       
        for(Map.Entry<String, ArrayList<Flight>> entry : flights.entrySet()){
            String key = entry.getKey();
            ArrayList<Flight> value = entry.getValue();
            
            for(Flight flight : value){
                System.out.println(flight);
            }
            
            
        }



    }
    
}
