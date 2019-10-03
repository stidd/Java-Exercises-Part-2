/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author steventidd
 */
public class Calculator {
        private Reader reader;
        private int count;
    
    public Calculator(){
         this.reader = new Reader();
    }
    
    public void start() {
        while (true) {
            System.out.print("command: ");
            String command = reader.readString();
            
            if (command.equals("end")) {
                break;
            }

            if (command.equals("sum")) {
                sum();
                count++;
            } else if (command.equals("difference")) {
                difference();
                count++;
            } else if (command.equals("product")) {
                product();
                count++;
            }
        }

        statistics();
    }
    
    private void sum(){
        System.out.println("value1: ");
        int input1 = reader.readInteger();
        System.out.println("value2: ");
        int input2 = reader.readInteger();
        System.out.println("sum of the values " + (input1 + input2)); 
    } 
    
    private void difference(){
        System.out.println("value1: ");
        int input1 = reader.readInteger();
        System.out.println("value2: ");
        int input2 = reader.readInteger();
        System.out.println("difference of the values " + (input1 - input2));
    }
    
    private void product(){
        System.out.println("value1: ");
        int input1 = reader.readInteger();
        System.out.println("value2: ");
        int input2 = reader.readInteger();
        System.out.println("product of the values " + (input1 * input2));
    }
    
    private void statistics(){
        System.out.println("Calculations done " + this.count);
    }
}
