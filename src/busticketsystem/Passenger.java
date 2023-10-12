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
public class Passenger {

    private String name;
    private int age;
    private String contactInfo;

    public Passenger(String name, int age, String contactInfo) {
        this.name = name;
        this.age = age;
        this.contactInfo = contactInfo;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }

    // Getter for contactInfo
    public String getContactInfo() {
        return contactInfo;
    }

    // Setter for contactInfo
    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public void bookRide(Passenger p1, ArrayList<Ticket> ticketList, ArrayList<Schedule> scheduleList, ArrayList<Route> routeList) {
        Scanner scanner = new Scanner(System.in);

        // Check if there are routes available
        if (routeList.isEmpty()) {
            System.out.println("No routes available. Please create routes first.");
            return;
        }

        // Display available routes
        System.out.println("Available Routes:");
        for (int i = 0; i < routeList.size(); i++) {
            System.out.println((i + 1) + ". " + routeList.get(i).getSource().getStationName() + " to " + routeList.get(i).getDestination().getStationName());
        }

        //Select Route
        System.out.print("Select a Route: ");
        int selectedRouteIndex = scanner.nextInt();

        // Check if the selected route index is valid - need to remove
        if (selectedRouteIndex < 1 || selectedRouteIndex > routeList.size()) {
            System.out.println("Invalid route selection.");
            return;
        }

        Route selectedRoute = routeList.get(selectedRouteIndex - 1);

        // Display schedules for the selected route
        System.out.println("Schedules for " + selectedRoute.getSource().getStationName() + " to " + selectedRoute.getDestination().getStationName() + ":");

        //Show schedual based on Route
        for (int i = 0; i < scheduleList.size(); i++) {
            if (scheduleList.get(i).getRoute().equals(selectedRoute)) {
                System.out.println("Schedule ID: " + (i + 1) + ", Bus No: " + scheduleList.get(i).getBus().getBusNumber() + ", Departure Time: " + scheduleList.get(i).getDepartureTime() + ", Arrival Time: " + scheduleList.get(i).getArrivalTime());
            }
        }

//        Selecting Schedule
        System.out.print("Select a Schedule by Schedule ID: ");
        int selectedScheduleId = scanner.nextInt();
        selectedScheduleId--;

        // Get Selected Schedule
        Schedule selectedSchedule = scheduleList.get(selectedScheduleId);

        if (selectedSchedule == null) {
            System.out.println("Invalid schedule selection.");
            return;
        }

        int ticketPrice = 0; // Initialize the ticket price

        System.out.println("Please select your class:");
        System.out.println("1. Business Class");
        System.out.println("2. Economy Class");
        System.out.println("3. First Class");

        int classChoice = scanner.nextInt();

        switch (classChoice) {
            case 1:
                ticketPrice = 2500;
                break;
            case 2:
                ticketPrice = 1200;
                break;
            case 3:
                ticketPrice = 1800;
                break;
            default:
                System.out.println("Invalid class choice.");
                break;
        }

        int seatNum = ticketList.size() + 1;

        // Create a new Ticket object
        Ticket ticket = new Ticket(p1, selectedSchedule, seatNum, ticketPrice);

        // Add the ticket to the ticketList
        ticketList.add(ticket);

        System.out.println("**************************************************");
        System.out.println("                BUS TICKET DETAILS              ");
        System.out.println("**************************************************");
        System.out.println("Passenger: " + ticket.getPassenger().getName());
        System.out.println("Bus Number: " + ticket.getSchedule().getBus().getBusNumber());
        System.out.println("Route: " + ticket.getSchedule().getRoute().getSource().getStationName() + " to " + ticket.getSchedule().getRoute().getDestination().getStationName());
        System.out.println("Schedule: " + ticket.getSchedule().getDepartureTime() + " to " + ticket.getSchedule().getArrivalTime());
        System.out.println("Seat Number: " + ticket.getSeatNumber());
        System.out.println("Price: RS." + ticket.getPrice());
        System.out.println("**************************************************");
    }

    public void giveFeedback(Passenger passenger, ArrayList<Feedback> feedbackList, ArrayList<Ticket> ticketList) {
        // Display all tickets based on the passenger
        System.out.println("Your Tickets:");
        for (int i = 0; i < ticketList.size(); i++) {
            Ticket ticket = ticketList.get(i);
            if (ticket.getPassenger().equals(passenger)) {
                System.out.println(i + 1 + ". Bus Number: " + ticket.getSchedule().getBus().getBusNumber() + ", Route: " + ticket.getSchedule().getRoute().getSource().getStationName() + " to " + ticket.getSchedule().getRoute().getDestination().getStationName());
            }
        }

        // Check if there are no tickets for the passenger
        if (ticketList.isEmpty()) {
            System.out.println("No tickets found. Book a ride first.");
            return;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Select a ticket to provide feedback (enter the number): ");
        int selectedTicketIndex = scanner.nextInt() - 1;

        // Check if the selected ticket index is valid
        if (selectedTicketIndex < 0 || selectedTicketIndex >= ticketList.size()) {
            System.out.println("Invalid ticket selection.");
            return;
        }

        System.out.print("Enter the number of stars (1-5): ");
        int noOfStars = scanner.nextInt();
        scanner.nextInt(); // Consume the newline character

        System.out.print("Enter your comment: ");
        String comment = scanner.nextLine();

        // Get the selected ticket
        Ticket selectedTicket = ticketList.get(selectedTicketIndex);

        // Create a feedback object using the Feedback constructor
        Feedback feedback = new Feedback(passenger, noOfStars, selectedTicket, comment);

        // Add the feedback to the feedback list
        feedbackList.add(feedback);
        System.out.println("Feedback submitted successfully.");
    }
   
    public void displayTickets(Passenger passenger, ArrayList<Ticket> ticketList) {
        System.out.println("Tickets for Passenger: " + passenger.getName());
        int ticketCounter = 1;

        for (Ticket ticket : ticketList) {
            if (ticket.getPassenger().equals(passenger)) {
                Schedule schedule = ticket.getSchedule();
                Route route = schedule.getRoute();

                System.out.println("Ticket " + ticketCounter + ":");
                System.out.println("Bus Number: " + schedule.getBus().getBusNumber());
                System.out.println("Route: " + route.getSource().getStationName() + " to " + route.getDestination().getStationName());
                System.out.println("Seat Number: " + ticket.getSeatNumber());
                System.out.println("Price: " + ticket.getPrice());
                System.out.println("-----");
                ticketCounter++;
            }
        }

        if (ticketCounter == 1) {
            System.out.println("No tickets found for Passenger: " + passenger.getName());
        }
    }

}
