/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package busticketsystem;

/**
 *
 * @author Awon Haider
 */
public class Employee {
    private String name;
    private String phoneNumber;
    private int empID;
    private int age;

    // Constructor
    public Employee(String name, String phoneNumber, int empID, int age) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.empID = empID;
        this.age = age;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getEmpid() {
        return empID;
    }

    public void setEmpid(int empID) {
        this.empID = empID;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

