/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package busticketsystem;

/**
 *
 * @author Awon Haider
 */
public class Ticket {
    private Passenger passenger;
    private Schedule schedule;
    private int price = 1000;
    private int seatNumber = 0;

    // Constructor
    public Ticket(Passenger passenger, Schedule schedule, int seatNumber, int price) {
        this.passenger = passenger;
        this.schedule = schedule;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    // Getter for passenger
    public Passenger getPassenger() {
        return passenger;
    }

    // Setter for passenger
    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    // Getter for schedule
    public Schedule getSchedule() {
        return schedule;
    }

    // Setter for schedule
    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    // Getter for price
    public int getPrice() {
        return price;
    }

    // Setter for price
    public void setPrice(int price) {
        this.price = price;
    }
    
    public int getSeatNumber() {
    return seatNumber;
}

public void setSeatNumber(int seatNumber) {
    this.seatNumber = seatNumber;
}










    
}


