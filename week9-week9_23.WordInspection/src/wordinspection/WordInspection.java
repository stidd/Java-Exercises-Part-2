/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordinspection;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author steventidd
 */
public class WordInspection {
    private File file;
    
    
    public WordInspection(File file){
        this.file = file;
    }
    
    public int wordCount(){
        try{
            Scanner reader = new Scanner(this.file, "UTF-8");
            
            int numOfWords = 0;
            while(reader.hasNextLine()){
                String line = reader.nextLine();
                numOfWords++;
            }
            
            return numOfWords;
            
        }catch(FileNotFoundException e){
            return -1;
        }
    }
    
    public List<String> wordsContainingZ() throws Exception{
            Scanner reader = new Scanner(this.file, "UTF-8");
            
            List<String> wordsWithZ = new ArrayList<String>();
            
            while(reader.hasNextLine()){
                String word = reader.nextLine();
                if(word.contains("z")){
                    wordsWithZ.add(word);
                }
            }
            
            return wordsWithZ;
       
    }
    
    public List<String> wordsEndingInL() throws Exception{
        Scanner reader = new Scanner(this.file, "UTF-8");
        
        List<String> lastCharL = new ArrayList<String>();
        
        while(reader.hasNextLine()){
            String word = reader.nextLine();
            if(word.endsWith("l")){
                lastCharL.add(word);
            }
        }
        
        return lastCharL;
    }
    
    public List<String> palindromes() throws Exception{
        Scanner reader = new Scanner(this.file, "UTF-8");
        
        List<String> palins = new ArrayList<String>();
        
        while(reader.hasNextLine()){
            String word = reader.nextLine();
            String wordReversed = "";
            for(int i = word.length() - 1; i >= 0 ; i--){
                wordReversed += word.charAt(i);
            }
            
            if(word.equals(wordReversed)){
                palins.add(word);
            }
        }
        
        return palins;
    }
    
    public List<String> wordsWhichContainAllVowels() throws Exception{
        Scanner reader = new Scanner(this.file, "UTF-8");
        
        List<String> allVowelWords = new ArrayList<String>();
        
      
        while(reader.hasNextLine()){
            String word = reader.nextLine();
            if (word.contains("a") && word.contains("e") && word.contains("i")
                    && word.contains("o") && word.contains("u") && word.contains("y")
                    && word.contains("ä") && word.contains("ö")) {
                allVowelWords.add(word);
            }
           
        }
        
        return allVowelWords;
    }
    
    
    
    
}
