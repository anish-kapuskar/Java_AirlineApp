/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author sumedhtelang
 */
public class Seats {
    
    private Map<Integer, String> seatAllotment;
    
    public Seats()
    {
    seatAllotment = new HashMap<>();
    }
    
    public void populateHashMap(Integer i, String value)
    {
    seatAllotment.put(i, value);
    }

    public Map<Integer, String> getSeatAllotment() {
        return seatAllotment;
    }

    public void setSeatAllotment(Map<Integer, String> seatAllotment) {
        this.seatAllotment = seatAllotment;
    }
}
