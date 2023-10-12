/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package busticketsystem;

/**
 *
 * @author Awon Haider
 */
public class Bus_Station {
    private String stationName;
    private String city;
    private String location;
    private String contactNo;

    // Constructor
    public Bus_Station(String stationName, String city, String location, String contactNo) {
        this.stationName = stationName;
        this.city = city;
        this.location = location;
        this.contactNo = contactNo;
    }

    // Getter for stationName
    public String getStationName() {
        return stationName;
    }

    // Setter for stationName
    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    // Getter for city
    public String getCity() {
        return city;
    }

    // Setter for city
    public void setCity(String city) {
        this.city = city;
    }

    // Getter for location
    public String getLocation() {
        return location;
    }

    // Setter for location
    public void setLocation(String location) {
        this.location = location;
    }

    // Getter for contactNo
    public String getContactNo() {
        return contactNo;
    }

    // Setter for contactNo
    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }
}


