
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author steventidd
 */
public class RingingCentre {
    private Map<Bird, List<String>> recordings;
    
    public RingingCentre(){
        this.recordings = new HashMap<Bird, List<String>>();
    }
    
    public void observe(Bird bird, String place){
        if(!this.recordings.containsKey(bird)){
            this.recordings.put(bird, new ArrayList<String>());
        }
        
        this.recordings.get(bird).add(place);

    }
    
    public void observations(Bird bird){
//        Bird result = null;
//        for(Bird entry : this.recordings.keySet()){
//            if(bird.equals(entry)){
//                result = entry;
//            }
//        }
//        
//        if(result == null){
//            System.out.println(bird + " observations: 0");
//        }else{
//            System.out.println(result + " observations: " + this.recordings.get(bird).size() + "\n" + this.printObservations(this.recordings.get(bird)));
//        }
   
          if(!this.recordings.containsKey(bird)){
              System.out.println(bird + " observations: 0");
              return;
          }
          
          System.out.println(bird + " observations: " + this.recordings.get(bird).size());
          for(String recording : this.recordings.get(bird)){
              System.out.println(recording);
          }
        
    }
    
//    public String printObservations(List sightings){
//        ArrayList<String> temp = (ArrayList) sightings;
//        String result = "";
//        for(String sighting : temp){
//            result += sighting + " \n";
//        }
//        return result;
//    }
    
}
