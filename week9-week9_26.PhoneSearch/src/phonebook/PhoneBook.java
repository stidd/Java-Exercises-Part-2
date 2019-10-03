/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonebook;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author steventidd
 */
public class PhoneBook {
   private Map<String, Person> phonebook = createMap();
      
   private static Map<String, Person> createMap(){
       Map<String,Person> phonebook = new HashMap<String, Person>();
       phonebook.put("pekka", new Person("pekka"));
       phonebook.put("jukka", new Person("jukka"));
       phonebook.put("mikko", new Person("mikko"));
       
       return phonebook;
   }
    
   public void addNumber(String name, String number){
       this.phonebook.get(name).updateNumber(number);
   }
   
   public String getNumberByName(String name){
       if(!this.phonebook.containsKey(name)){
           return "not found";
       }
       return this.phonebook.get(name).getNumber().toString();
   }
   
   public String getNameByNumber(String number){
       for(Person person : this.phonebook.values()){
           if(person.getNumber().contains(number)){
               return person.getName();
           }
       }
       
       return "not found";
   }
   
   public void addAddress(String name, String street, String city){
       this.phonebook.get(name).updateAddress(street, city);
   }
   
   public void getPersonalInfo(String name){
       System.out.println(" address: " + this.phonebook.get(name).getAddress());
       System.out.println(" phone numbers: " + this.getNumberByName(name));
   }
    
}
