
import java.io.File;
import java.io.FileNotFoundException;
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
public class Printer {
    private String fileName;
    
    public Printer(String fileName) throws Exception{
        this.fileName = fileName;
    }
    
    public void printLinesWhichContain(String word) throws FileNotFoundException{
        File file = new File(this.fileName);
        
        Scanner reader = new Scanner(file);
        
        while(reader.hasNextLine()){
            String line = reader.nextLine();
            
           
            
            if(line.contains(word) || word.isEmpty()){
                System.out.println(line);
            }
        }
        
        reader.close();
        
        
    }
    
}
