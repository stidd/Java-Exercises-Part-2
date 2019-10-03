/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author steventidd
 */
public class AverageSensor implements Sensor{
    private List<Sensor> manySensors;
    private List<Integer> allReadings;
    
    public AverageSensor(){
        this.manySensors = new ArrayList<Sensor>();
        this.allReadings = new ArrayList<Integer>();
    }
    
    public void addSensor(Sensor additional){
        manySensors.add(additional);
    }
    
    public boolean isOn(){
        
        for(Sensor sensor : this.manySensors){
            if(sensor.isOn() == false){
                return false;
            }
        }
        
        return true;
    }
    
    @Override
    public void on(){
        for(Sensor sensor : this.manySensors){
            sensor.on();
        }
    }
    
    @Override
    public void off(){
        for(Sensor sensor : this.manySensors){
            sensor.off();
        }
    }
    
    @Override
    public int measure(){
        if(this.isOn() == false){
            throw new IllegalStateException("Average Sensor is off!");
        }
        
        if(this.manySensors.size() < 1){
            throw new IllegalStateException("No Sensors to check!");
        }
        
        int total = 0;
        for(Sensor sensor : this.manySensors){
            total += sensor.measure();
        }
        
        int avgMeasure = total / this.manySensors.size();
        this.allReadings.add(avgMeasure);
        
        return avgMeasure;
    }
    
    public List<Integer> readings(){
        return allReadings;
    }
}
