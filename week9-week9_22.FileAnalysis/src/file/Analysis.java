/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author steventidd
 */
public class Analysis {
    private File file;
    
    
    public Analysis(File file){
        this.file = file;
        
    }
    
    public int lines() throws Exception{
        // returns number of lines in the file
        Scanner reader = new Scanner(this.file);
        
        int numOfLines = 0;
        while(reader.hasNextLine()){
            reader.nextLine();
            numOfLines++;
        }
        
        reader.close();
        
        return numOfLines;
        
    }
    
    public int characters() throws Exception{
        // returns number of characters in the file
        Scanner reader = new Scanner(this.file);
        
        int numOfChars = 0;
        
        while(reader.hasNextLine()){
            String line = reader.nextLine();
            char[] characters = line.toCharArray();
            numOfChars += characters.length;
        }
        
        reader.close();
        
        return numOfChars + this.lines();
    }
}
