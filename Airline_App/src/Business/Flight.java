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
public class Flight implements Comparable <Flight> {
    private static int count = 0;
    private int flightNumber;
    private String flightName;
    private String flightSource;
    private String flightDestination;
    private float flightPrice;
    private String seats;
    private Seats seatalloted;
    private int duration;
    private String timing;

    public String getTiming() {
        return timing;
    }
    

    public void setTiming(String timing) {
        this.timing = timing;
    }
    
    
    public Flight() {
        count++;
        flightNumber = count;
        seatalloted = new Seats();
    }

    public Seats getSeatalloted() {
        return seatalloted;
    }

    public void setSeatalloted(Seats seatalloted) {
        this.seatalloted = seatalloted;
    }
    
    
    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Flight.count = count;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getFlightName() {
        return flightName;
    }

    public void setFlightName(String flightName) {
        this.flightName = flightName;
    }

    public String getFlightSource() {
        return flightSource;
    }

    public void setFlightSource(String flightSource) {
        this.flightSource = flightSource;
    }

    public String getFlightDestination() {
        return flightDestination;
    }

    public void setFlightDestination(String flightDestination) {
        this.flightDestination = flightDestination;
    }

    public float getFlightPrice() {
        return flightPrice;
    }

    public void setFlightPrice(float flightPrice) {
        this.flightPrice = flightPrice;
    }

    public String getSeats() {
        return seats;
    }

    public void setSeats(String seats) {
        this.seats = seats;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
    
    
    
    @Override
    public String toString() {
        return flightName;
    }

    @Override
    public int compareTo(Flight o) {
       return Float.compare(this.getFlightPrice(), o.getFlightPrice()); //To change body of generated methods, choose Tools | Templates.
    }
}
