
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author steventidd
 */
public class JumpingSimulation {
    private Scanner reader;
    private Rounds rounds;
    
    
    public JumpingSimulation(){
        this.reader = new Scanner(System.in);
        this.rounds = new Rounds();
        
    }
    
    
    
    public void start(){
        System.out.println("Kumpula ski jumping week");
        System.out.println("");
        System.out.println("Write the names of the participants one at a time; an empty string brings you to the jumping phase.");
        
        while(true){
            System.out.println("  Participant name: ");
            String userInput = reader.nextLine();
            
            if(userInput.equals("")){
                // begin tournament
                System.out.println("The tournament begins!");
                
                while(true){
                    System.out.println("");
                    System.out.println("Write \"jump\" to jump; otherwise you quit: ");
                    String input = reader.nextLine();
                    if(input.equals("jump")){
                         rounds.invokeRoundOfJumps();
                         //print result of round
                         System.out.println("");
                         System.out.println("Round " + rounds.getRoundNumber());
                         System.out.println("");
                         System.out.println("Jumping order: ");
                         this.printRoundResults();
                    }else{
                        // print tournament results
                        System.out.println("");
                        System.out.println("Thanks!");
                        this.printTournamentResults();
                        break;
                    }
                }
                //breaks out of the entire program after printing tournie results
                break;
            }else{
                  this.rounds.addJumpers(userInput);
            }
           
        }

    }
    
    public void printRoundResults(){
        if(rounds.getRoundNumber() == 1){
            rounds.getJumpingOrder();
            System.out.println("");
            //print results of round
            System.out.println("Results of round 1");
            
            for(Jumper jumper : this.rounds.getJumpers()){
                System.out.println("  " + jumper.getName());
                System.out.println("    length: " + jumper.getJumps().get(0).getJumpDistance());
                System.out.println("    judge votes: " + jumper.getJumps().get(0).printRawScores());
            }
            
        }
        
        if(rounds.getRoundNumber() > 1){
            rounds.getJumpingOrder();
            System.out.println("");
            //print results of round
            System.out.println("Results of round " + rounds.getRoundNumber());
           
            for(Jumper jumper : this.rounds.getJumpers()){
                System.out.println("  " + jumper.getName());
                System.out.println("    length: " + jumper.getJumps().get(rounds.getRoundNumber() - 1).getJumpDistance());
                System.out.println("    judge votes: " + jumper.getJumps().get(rounds.getRoundNumber() - 1).printRawScores());
            }
        }
    }
    
    public void printTournamentResults(){
        System.out.println("");
        System.out.println("Tournament results: ");
        System.out.println("Position    Name");
        rounds.getFinalResults();
        
        
    }
    
}
