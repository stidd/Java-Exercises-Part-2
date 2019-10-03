/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonebook;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author steventidd
 */
public class Person {
    private String name;
    private String address;
    private List<String> numbers = new ArrayList<String>();
    
    
    public Person(String name){
        this.name = name;
 
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getAddress(){
        return this.address;
    }
    
    public List<String> getNumber(){ 
       return this.numbers;
    }
    
    public void updateNumber(String number){
        this.numbers.add(number);
    }
    
    public void updateAddress(String street, String city){
        this.address = street + " " + city;
    }
    
    
    
    
    
    
}
