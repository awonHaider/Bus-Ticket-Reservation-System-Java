/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package busticketsystem;

/**
 *
 * @author Awon Haider
 */

public class Feedback {
    
    private Passenger passenger;
    private int noOfStars;
    private Ticket ticket;
    private String comment;

    // Constructor
    public Feedback(Passenger passenger, int noOfStars, Ticket ticket, String comment) {
        this.noOfStars = noOfStars;
        this.ticket = ticket;
        this.comment = comment;
        this.passenger = passenger;
    }

    // Getter for passenger


    // Setter for passenger


    // Getter for noOfStars
    public int getNoOfStars() {
        return noOfStars;
    }

    // Setter for noOfStars
    public void setNoOfStars(int noOfStars) {
        this.noOfStars = noOfStars;
    }

    // Getter for ticket
    public Ticket getTicket() {
        return ticket;
    }

    // Setter for ticket
    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    // Getter for comment
    public String getComment() {
        return comment;
    }

    // Setter for comment
    public void setComment(String comment) {
        this.comment = comment;
    }
}
