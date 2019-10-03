/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author steventidd
 */
import java.util.Scanner;

public class AirportPanel {
    private Scanner reader;
    private Flights flights;
    private Planes planes;
    
            
    public AirportPanel(){
        this.reader = new Scanner(System.in);
        this.flights = new Flights();
        this.planes = new Planes();
    }
    
    public void start(){
        System.out.println("Airport panel");
        System.out.println("-------------------");
        System.out.println(" ");
        
        while(true){
            System.out.println("Choose operation: ");
            System.out.println("[1] Add airplane");
            System.out.println("[2] Add flight");
            System.out.println("[x] Exit");
            String input = this.reader.nextLine();
            
            if(input.equals("1")){
                System.out.println("Give plane ID: ");
                String planeID = this.reader.nextLine();
                System.out.println("Give plane capacity: ");
                int planeCapacity = Integer.parseInt(this.reader.nextLine());
                
                this.planes.addPlane(planeID, planeCapacity);
                
            }else if(input.equals("2")){
                System.out.println("Give plane ID: ");
                String planeID = this.reader.nextLine();
                System.out.println("Give departure airport code: ");
                String departCode = this.reader.nextLine();
                System.out.println("Give destination airport code: ");
                String destinCode = this.reader.nextLine();
                
                this.flights.addFlight(this.planes.getPlane(planeID), departCode, destinCode);
            }else if(input.equals("x")){
                break;
            } 
        }
       
        //------------------------------------------------------------------
        System.out.println("Flight service");
        System.out.println("-------------------");
        
        while(true){
            System.out.println("Choose operation: ");
            System.out.println("[1] Print planes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print plane info");
            System.out.println("[x] Quit");
            String input = this.reader.nextLine();
            
            if(input.equals("1")){
                planes.printPlanes();
            }else if(input.equals("2")){
                flights.printFlights();
            }else if(input.equals("3")){
                System.out.println("Give plane ID: ");
                String input2 = this.reader.nextLine();
                System.out.println(planes.getPlane(input2));
            }else if(input.equals("x")){
                break;
            }
            
            
        }
    }
    
  
}
