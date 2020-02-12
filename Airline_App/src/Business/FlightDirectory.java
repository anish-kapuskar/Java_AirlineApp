/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author sumedhtelang
 */
public class FlightDirectory {
    private ArrayList<Flight> flightDir;
    
    
    public FlightDirectory()
    {
        flightDir = new ArrayList<Flight>();
    }

    public ArrayList<Flight> getFlightDir() {
        return flightDir;
    }
    
    public Flight addFlight() {
        Flight f = new Flight();
        flightDir.add(f);
        return f;
    }
    
    public void removeFlight(Flight f) {
        flightDir.remove(f);
    }
    
    
    public Flight searchFlight(int id) {
        for(Flight f : flightDir) {
            if(f.getFlightNumber() == id) {
                return f;
            }
        }
        return null;
    }
}
