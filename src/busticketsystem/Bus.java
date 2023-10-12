/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package busticketsystem;

/**
 *
 * @author Awon Haider
 */
public class Bus {
    private String busNumber;
    private Driver driver;
    private Bus_Hostess busHostess;

    // Constructor
    public Bus(String busNumber) {
        this.busNumber = busNumber;
    }

    // Getter for busNumber
    public String getBusNumber() {
        return busNumber;
    }

    // Setter for busNumber
    public void setBusNumber(String busNumber) {
        this.busNumber = busNumber;
    }

    // Getter for driver
    public Driver getDriver() {
        return driver;
    }

    // Setter for driver
    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    // Getter for busHostess
    public Bus_Hostess getBusHostess() {
        return busHostess;
    }

    // Setter for busHostess
    public void setBusHostess(Bus_Hostess busHostess) {
        this.busHostess = busHostess;
    }
}

