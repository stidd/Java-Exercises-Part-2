/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author steventidd
 */

import java.util.Arrays;


public class Jump {
    // consists of a jump with a random distance between 60-120 and 5 judge scores
    private int jumpDistance;
    private int scores[];
    
    public Jump(){
        this.jumpDistance = (int)(Math.random() * ((120 - 60) + 1)) + 60;
        this.scores = new int[5];
    }
    
    public void judgeScores(){
        for(int i = 0; i < 5; i++){
            scores[i] = (int)(Math.random() * ((20 - 10) + 1)) + 10;
        }
    }
    
    public int getJumpDistance(){
        return this.jumpDistance;
    }
    
    public String printRawScores(){
        int[] arr = this.scores;
        return Arrays.toString(arr);
    }
    
    public int[] sortScoresAsc(){
        int copyofscores[] = new int[5];
        for(int i = 0; i < 5; i++){
            copyofscores[i] = this.scores[i];
        }
        Arrays.sort(copyofscores);
        return copyofscores;
    }
    
    public int jumpTotalScore(){
        int[] sortedScores = this.sortScoresAsc();
        int total = this.jumpDistance;
        for(int i = 1; i < sortedScores.length - 1; i++){
            total += sortedScores[i];
        }
        
        return total;
    }
    
    
    
}
