/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package busticketsystem;

/**
 *
 * @author Awon Haider
 */
public class Route {
    private Bus_Station source;
    private Bus_Station destination;
    private String distance;

    // Constructor
    public Route(Bus_Station source, Bus_Station destination, String distance) {
        this.source = source;
        this.destination = destination;
        this.distance = distance;
    }

    // Getter for source
    public Bus_Station getSource() {
        return source;
    }

    // Setter for source
    public void setSource(Bus_Station source) {
        this.source = source;
    }

    // Getter for destination
    public Bus_Station getDestination() {
        return destination;
    }

    // Setter for destination
    public void setDestination(Bus_Station destination) {
        this.destination = destination;
    }

    // Getter for distance
    public String getDistance() {
        return distance;
    }

    // Setter for distance
    public void setDistance(String distance) {
        this.distance = distance;
    }
}

