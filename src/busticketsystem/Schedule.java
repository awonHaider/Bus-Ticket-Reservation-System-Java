/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package busticketsystem;

/**
 *
 * @author Awon Haider
 */
public class Schedule {
    private Bus bus;
    private Route route;
    private String departureTime;
    private String arrivalTime;

    // Constructor
    public Schedule(Bus bus, Route route, String departureTime, String arrivalTime) {
        this.bus = bus;
        this.route = route;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
    }

    // Getter for bus
    public Bus getBus() {
        return bus;
    }

    // Setter for bus
    public void setBus(Bus bus) {
        this.bus = bus;
    }

    // Getter for route
    public Route getRoute() {
        return route;
    }

    // Setter for route
    public void setRoute(Route route) {
        this.route = route;
    }

    // Getter for departureTime
    public String getDepartureTime() {
        return departureTime;
    }

    // Setter for departureTime
    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    // Getter for arrivalTime
    public String getArrivalTime() {
        return arrivalTime;
    }

    // Setter for arrivalTime
    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }
}

