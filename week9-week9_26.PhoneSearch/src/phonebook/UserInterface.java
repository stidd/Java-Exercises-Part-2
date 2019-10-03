/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonebook;

import java.util.Scanner;

/**
 *
 * @author steventidd
 */
public class UserInterface {
    private Scanner reader = new Scanner(System.in);
    private PhoneBook phonebook = new PhoneBook();
    
    public UserInterface(){
        
    }
    
    public void start(){
        System.out.println("phone search");
        System.out.println("available operations:");
        System.out.println(" 1 add a number");
        System.out.println(" 2 search for a number");
        System.out.println(" 3 search for a person by phone number");
        System.out.println(" 4 add an address");
        System.out.println(" 5 search for personal information");
        System.out.println(" 6 delete personal information");
        System.out.println(" 7 filtered listing");
        System.out.println(" x quit");
        
        while(true){
            System.out.println("");
            System.out.print("command: ");
            String userInput = reader.nextLine();
            
            if(userInput.equals("1")){
                this.addNumberMethod();
            }else if(userInput.equals("2")){
                this.getNumberMethod();
            }else if(userInput.equals("3")){
                this.getNameByNumberMethod();
            }else if(userInput.equals("4")){
                this.addAddressHelper();
            }else if(userInput.equals("5")){
                this.getInfoHelper();
            }else if(userInput.equals("x")){
                break;
            }
            
            
            
            
        }

    }
    
    public void addNumberMethod(){
        System.out.println("whose number: ");
        String name = reader.nextLine();
        System.out.println("number: ");
        String phoneNumber = reader.nextLine();
        this.phonebook.addNumber(name, phoneNumber);
    }
    
    public void getNumberMethod(){
        System.out.println("whose number: ");
        String name = reader.nextLine();
        System.out.println(" " + this.phonebook.getNumberByName(name));
    }
    
    public void getNameByNumberMethod(){
        System.out.println("number: ");
        String number = reader.nextLine();
        System.out.println(this.phonebook.getNameByNumber(number));
    }
    
    public void addAddressHelper(){
        System.out.println("whose address: ");
        String name = reader.nextLine();
        System.out.println("street: ");
        String street = reader.nextLine();
        System.out.println("city: ");
        String city = reader.nextLine();
        this.phonebook.addAddress(name, street, city);
    }
    
    public void getInfoHelper(){
        System.out.println("whose information: ");
        String name = reader.nextLine();
        this.phonebook.getPersonalInfo(name);
    }
}
