/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

import java.util.Random;

/**
 *
 * @author steventidd
 */
public class Cow implements Milkable, Alive {
    private String name;
    private double milkInUdders;
    private int udderCapacity = new Random().nextInt(26) + 15;
    private static final String[] NAMES = new String[]{
        "Anu", "Arpa", "Essi", "Heluna", "Hely",
        "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
        "Jaana", "Jami", "Jatta", "Laku", "Liekki",
        "Mainikki", "Mella", "Mimmi", "Naatti",
        "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
        "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};
    
    public Cow(){
        this.name = NAMES[new Random().nextInt(NAMES.length)];
    }
    
    public Cow(String name){
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
    
    public double getCapacity(){
        return this.udderCapacity;
    }
    
    public double getAmount(){
        return this.milkInUdders;
    }
    
    @Override
    public void liveHour(){
        double simulate = Math.random() * 1.3 + 0.7;
        if((this.milkInUdders + simulate) > this.udderCapacity){
            this.milkInUdders = this.udderCapacity;
        }else{
            this.milkInUdders += simulate;
        }
        
    }
    
    @Override
    public double milk(){
        double temp = this.milkInUdders;
        this.milkInUdders = 0;
        return temp;
    }
    
    
    
    @Override
    public String toString(){
        return this.name + " " + Math.ceil(this.milkInUdders) + "/" + Math.ceil(this.udderCapacity); 
    }
    
    
    
    
    
    
    
}
