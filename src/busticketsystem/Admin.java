/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package busticketsystem;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Awon Haider
 */
public class Admin extends Employee {

    public Admin(String name, String phoneNumber, int cnic, int age) {
        super(name, phoneNumber, cnic, age);

    }

    public void createDriver(ArrayList<Driver> driverList) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Creating a Driver...");
        System.out.print("Enter Driver Name: ");
        String driverName = scanner.nextLine();

        System.out.print("Enter Driver Phone Number: ");
        String driverPhoneNumber = scanner.nextLine();

        System.out.print("Enter Driver CNIC: ");
        int driverCnic = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter Driver Age: ");
        int driverAge = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        Driver driver = new Driver(driverName, driverPhoneNumber, driverCnic, driverAge);
        driverList.add(driver);

        System.out.print("Bus Driver Created and Added to System! ");
    }

    public void createBusHostess(ArrayList<Bus_Hostess> hostessList) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Creating a Bus Hostess...");
        System.out.print("Enter Hostess Name: ");
        String hostessName = scanner.nextLine();

        System.out.print("Enter Hostess Phone Number: ");
        String hostessPhoneNumber = scanner.nextLine();

        System.out.print("Enter Hostess CNIC: ");
        int hostessCnic = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter Hostess Age: ");
        int hostessAge = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        Bus_Hostess hostess = new Bus_Hostess(hostessName, hostessPhoneNumber, hostessCnic, hostessAge);
        hostessList.add(hostess);

        System.out.print("Bus Hostess Created and Added to System! ");

    }

    public void createBusStation(ArrayList<Bus_Station> stationList) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Creating a Bus Station...");
        Scanner s1 = new Scanner(System.in);
        Scanner s2 = new Scanner(System.in);

        System.out.println("Enter Station Name: ");
        String stationName = s1.nextLine();

        System.out.println("Enter City: ");
        String city = s1.nextLine();

        System.out.println("Enter Location: ");
        String location = s1.nextLine();

        System.out.println("Enter Contact No: ");
        String contactNo = s2.nextLine();

        Bus_Station busStation = new Bus_Station(stationName, city, location, contactNo);
        stationList.add(busStation);

        System.out.print("Bus Station Created and Added to System! ");
    }

    public void createBus(ArrayList<Bus> busList, ArrayList<Driver> driverList, ArrayList<Bus_Hostess> hostessList) {
        Scanner scanner = new Scanner(System.in);

        if (driverList.isEmpty() || hostessList.isEmpty()) {
            System.out.println("Please create at least one driver and one bus hostess before creating a bus.");
            return;
        }

        System.out.println("Creating a Bus...");
        System.out.print("Enter Bus Number: ");
        String busNumber = scanner.nextLine();

        // Prompt admin to select a driver
        System.out.println("Select a Driver:");

        for (int i = 0; i < driverList.size(); i++) {
            System.out.println((i + 1) + ". " + driverList.get(i).getName());
        }

        int selectedDriverIndex = scanner.nextInt() - 1;

        // Prompt admin to select a bus hostess
        System.out.println("Select a Bus Hostess:");

        for (int i = 0; i < hostessList.size(); i++) {
            System.out.println((i + 1) + ". " + hostessList.get(i).getName());
        }

        int selectedHostessIndex = scanner.nextInt() - 1;

        Bus bus = new Bus(busNumber);
        bus.setDriver(driverList.get(selectedDriverIndex));
        bus.setBusHostess(hostessList.get(selectedHostessIndex));
        busList.add(bus);

        System.out.println("Bus Created and Added to System!");
    }

    public void createRoute(ArrayList<Route> routeList, ArrayList<Bus_Station> stationList) {
        Scanner scanner = new Scanner(System.in);

        if (stationList.isEmpty()|| stationList.size() < 2) {
            System.out.println("Please create at least two bus stations before creating a route.");
            return;
        }

        System.out.println("Creating a Route...");

        // Prompt admin to select a source Bus Station
        System.out.println("Select the Source Bus Station:");

        for (int i = 0; i < stationList.size(); i++) {
            System.out.println((i + 1) + ". " + stationList.get(i).getStationName());
        }

        int sourceIndex = scanner.nextInt() - 1;

        // Prompt admin to select a destination Bus Station
        System.out.println("Select the Destination Bus Station:");

        for (int i = 0; i < stationList.size(); i++) {
            System.out.println((i + 1) + ". " + stationList.get(i).getStationName());
        }

        int destinationIndex = scanner.nextInt() - 1;

        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter Distance: ");
        String distance = scanner.nextLine();

        Route route = new Route(stationList.get(sourceIndex), stationList.get(destinationIndex), distance);
        routeList.add(route);

        System.out.println("Route Created and Added to System!");
    }

    public void createSchedule(ArrayList<Schedule> scheduleList, ArrayList<Bus> busList, ArrayList<Route> routeList) {
        Scanner scanner = new Scanner(System.in);

        if (busList.isEmpty() || routeList.isEmpty()) {
            System.out.println("Please create at least one bus and one route before creating a schedule.");
            return;
        }

        System.out.println("Creating a Schedule...");

        // Prompt admin to select a Bus
        System.out.println("Select a Bus for the Schedule:");

        for (int i = 0; i < busList.size(); i++) {
            System.out.println((i + 1) + ". " + busList.get(i).getBusNumber());
        }

        int busIndex = scanner.nextInt() - 1;

        // Prompt admin to select a Route
        System.out.println("Select a Route for the Schedule:");

        for (int i = 0; i < routeList.size(); i++) {
            System.out.println((i + 1) + ". " + routeList.get(i).getSource().getStationName() + " to " + routeList.get(i).getDestination().getStationName());
        }

        int routeIndex = scanner.nextInt() - 1;

        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter Departure Time: ");
        String departureTime = scanner.nextLine();

        System.out.print("Enter Arrival Time: ");
        String arrivalTime = scanner.nextLine();

        Schedule schedule = new Schedule(busList.get(busIndex), routeList.get(routeIndex), departureTime, arrivalTime);
        scheduleList.add(schedule);

        System.out.println("Bus Schedule Created and Added to System!");
    }

}
