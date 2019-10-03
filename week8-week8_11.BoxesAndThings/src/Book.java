/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author steventidd
 */
public class Book implements ToBeStored{
    private String writer;
    private String name;
    private double weight;
    
    public Book(String writer, String name, double weight){
        this.writer = writer;
        this.name = name;
        this.weight = weight;
    }
    
    public String getWriter(){
        return this.writer;
    }
    
    public String getName(){
        return this.name;
    }
    
    @Override
    public double weight(){
        return this.weight;
    }
 
    public String toString(){
        return getWriter() + ": " + getName();
    }
    
    
}
