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
public class AirlinerCompany {
    private ArrayList<Airliner> airDir;
    
    public AirlinerCompany() {
        airDir = new ArrayList<Airliner>();
        
        //Airliner airliner1 = new Airliner("American Airlines", "Commercial");
        //Airliner airliner2 = new Airliner("jetBlue", "Commercial");
        //Airliner airliner3 = new Airliner("Delta Airlines", "Commercial");
        //Airliner airliner4 = new Airliner("Indigo", "Commercial");        
        
        //airDir.add(airliner1);
        //airDir.add(airliner2);
        //airDir.add(airliner3);
        //airDir.add(airliner4);
    }

    public ArrayList<Airliner> getAirDir() {
        return airDir;
    }
    
    public Airliner addAirliner() {
        Airliner s = new Airliner();
        airDir.add(s);
        return s;
    }
    
    public void removeAirliner(Airliner a) {
        airDir.remove(a);
    }
    
    public Airliner searchAirliner(String keyWord) {
        for(Airliner a : airDir) {
            if(keyWord.equals(a.getAirlinerName())) {
                return a;
            }
        }
        return null;
    }
    
}
