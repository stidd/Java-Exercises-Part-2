
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author steventidd
 */
public class VehicleRegister {
    
    private HashMap<RegistrationPlate, String> owners;
    
    public VehicleRegister(){
        this.owners = new HashMap<RegistrationPlate, String>();
    }
    
    
    public boolean add(RegistrationPlate plate, String owner){
        if(!owners.containsKey(plate)){
           owners.put(plate, owner);
           return true;
        }
        
        return false;
        
    }
    
    public String get(RegistrationPlate plate){
        if(this.owners.get(plate) == null){
            return null;
        }else{
            return this.owners.get(plate);
        }
        
    }
    
    public boolean delete(RegistrationPlate plate){
        if(this.owners.containsKey(plate)){
            this.owners.remove(plate);
            return true;
        }
        
        return false;
    }
    
    public void printRegistrationPlates(){
        for(RegistrationPlate plate : this.owners.keySet()){
            System.out.println(plate);
        }
    }
    
    public void printOwners(){
       ArrayList<String> ownersToPrint = new ArrayList<String>();
       
       for(RegistrationPlate plate : this.owners.keySet()){
           String owner = this.owners.get(plate);
           if(!ownersToPrint.contains(owner)){
               ownersToPrint.add(owner);
           }
       }
       
       for(String owner : ownersToPrint){
           System.out.println(owner);
       }
    }
    
    
}
