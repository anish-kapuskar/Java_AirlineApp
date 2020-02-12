/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author sumedhtelang
 */
public class Airliner {
    private String airlinerName;
    private String airlinerType;
    private FlightDirectory flightDir;
    
    public Airliner() {
        flightDir = new FlightDirectory();
    }
    
    public Airliner(String airlinerName, String airlinerType){
        this.airlinerName = airlinerName;
        this.airlinerType = airlinerType;
    }
    
    public FlightDirectory getFlightDir() {
        return flightDir;
    }
  
    
    public String getAirlinerName() {
        return airlinerName;
    }

    public void setAirlinerName(String airlinerName) {
        this.airlinerName = airlinerName;
    }

    public String getAirlinerType() {
        return airlinerType;
    }

    public void setAirlinerType(String airlinerType) {
        this.airlinerType = airlinerType;
    }

    @Override
    public String toString() {
        return airlinerName;
    }
    
}
