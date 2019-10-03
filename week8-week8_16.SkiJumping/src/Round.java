//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//
///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//
///**
// *
// * @author steventidd
// */
//public class Round{
//    private List<Jumper> jumpers;
//    private int roundNumber;
//    
//    public Round(int roundNumber){
//        this.roundNumber = roundNumber;
//        this.jumpers = new ArrayList<Jumper>();
//    }
//    
//    public void addJumpers(String name){
//        this.jumpers.add(new Jumper(name));
//    }
//    
//    public int getRoundNumber(){
//        return this.roundNumber;
//    }
//    
//    public void invokeRound(){
//        
//        // Calculate results
//        // display results
//        
//        // makes a jump for each jumper on the list
//        
//        
//        if(this.roundNumber == 1){
//          for(Jumper jumper : this.jumpers){
//               Jump jump = new Jump();
//               jump.judgeScores();
//               jumper.addJump(jump);
//          }
//               
//            
//        }
//        
//        if(this.roundNumber > 1){
//            this.sort();
//            
//            for(Jumper person : this.jumpers){
//                Jump newJump = new Jump();
//                newJump.judgeScores();
//                person.addJump(newJump);
//            }
//        }
//        
//        // if we have Jumpers sort the Jumpers by scores and the person with the least amount of points will jump first and so on
//        // modify the sort interface to account for sorting by jumper total scores
//     
//        
//        // print round 
//        System.out.println("Round " + this.roundNumber);
//        // jumping order
//        System.out.println("Jumping order: ");
//        
//        for(Jumper jumper : this.jumpers){
//            System.out.println((this.jumpers.indexOf(jumper) + 1) + ". " + jumper);
//        }
//        
//        //Results of round
//        this.printRoundResults();
//        
//
//   
//    }
//    
//    // compare jumper to a jumper and sort according to points
//    public void sort(){
//        Collections.sort(this.jumpers);
//    }
//    
//    public void printRoundResults(){
//        System.out.println(" ");
//        System.out.println("Results of round " + this.roundNumber);
//        
//        for(Jumper jumper : this.jumpers){
//            System.out.println(jumper.getName());
//            System.out.println("length: " + jumper.getJumps().get(this.roundNumber - 1).getJumpDistance());
//            System.out.println("judge votes: " + jumper.getJumps().get(this.roundNumber - 1).printRawScores());
//        }
//        
//        
//    }
//   
//}
