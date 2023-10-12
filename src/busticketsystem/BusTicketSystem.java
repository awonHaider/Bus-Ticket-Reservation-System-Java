package busticketsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class BusTicketSystem {
    
    public static void main(String[] args) {
        ArrayList<Passenger> passengerList = new ArrayList<>();
        ArrayList<Bus> busList = new ArrayList<>();
        ArrayList<Bus_Station> stationList = new ArrayList<>();
        ArrayList<Driver> driverList = new ArrayList<>();
        ArrayList<Bus_Hostess> hostessList = new ArrayList<>();
        ArrayList<Route> routeList = new ArrayList<>();
        ArrayList<Schedule> scheduleList = new ArrayList<>();
        ArrayList<Ticket> ticketList = new ArrayList<>();
        ArrayList<Feedback> feedbackList = new ArrayList<>();
        
        System.out.println("Welcome to Bus Ticket Reservation System");
        
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        
        do {
            System.out.println("Sign In As:");
            System.out.println("1. Admin");
            System.out.println("2. Passenger");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int userType = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (userType) {
                case 1:
                    // Sign in as Admin
                    System.out.println("Enter your Name: ");
                    String adminName = scanner.nextLine();
                    
                    System.out.println("Enter your Age: ");
                    int adminAge = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
    
                    System.out.println("Enter your CNIC: ");
                    int adminCnic = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
    
                    System.out.println("Enter your Contact No: ");
                    String adminContact = scanner.nextLine();
                    
                    Admin a1 = new Admin(adminName, adminContact, adminCnic, adminAge);
                    System.out.println("Signed in as Admin...");
                    
                    int adminChoice;
                    do {
                        System.out.println("Admin Functions Menu");
                        System.out.println("1. Create Bus Driver");
                        System.out.println("2. Create Bus Hostess");
                        System.out.println("3. Create Bus Station");
                        System.out.println("4. Create Bus");
                        System.out.println("5. Create Route");
                        System.out.println("6. Create Schedule");
                        System.out.println("7. Back to Previous Menu");
                        System.out.print("Enter your choice: ");
                        adminChoice = scanner.nextInt();
                        scanner.nextLine(); // Consume the newline character
                        
                        switch (adminChoice) {
                            case 1:
                                a1.createDriver(driverList);
                                break;
                            
                            case 2:
                                a1.createBusHostess(hostessList);
                                break;
                            
                            case 3:
                                a1.createBusStation(stationList);
                                break;
                            
                            case 4:
                                a1.createBus(busList, driverList, hostessList);
                                break;
                            
                            case 5:
                                a1.createRoute(routeList, stationList);
                                break;
                            
                            case 6:
                                a1.createSchedule(scheduleList, busList, routeList);
                                break;
                            
                            case 7:
                                break; // Go back to the previous menu
                            
                            default:
                                System.out.println("Invalid choice. Please choose a valid option.");
                        }
                    } while (adminChoice != 7);
                    
                    break;
                
                case 2:
                    // Sign in as Passenger
                    System.out.println("Enter your Name: ");
                    String passName = scanner.nextLine();
                    
                    System.out.println("Enter your Age: ");
                    int passAge = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
    
                    System.out.println("Enter your Contact No: ");
                    String passContact = scanner.nextLine();
                    
                    Passenger p1 = new Passenger(passName, passAge, passContact);
                    passengerList.add(p1);
                    System.out.println("Signed in as Passenger...");
                    
                    int choice;
                    do {
                        System.out.println("Passenger Functions Menu");
                        System.out.println("1. Book a Ride");
                        System.out.println("2. Display Tickets");
                        System.out.println("3. Give Feedback");
                        System.out.println("4. Back to Previous Menu");
                        System.out.print("Enter your choice: ");
                        choice = scanner.nextInt();
                        scanner.nextLine(); // Consume the newline character
                        
                        switch (choice) {
                            case 1:
                                p1.bookRide(p1, ticketList, scheduleList, routeList);
                                break;
                            case 2:
                                p1.displayTickets(p1, ticketList);
                                break;
                            case 3:
                                p1.giveFeedback(p1, feedbackList, ticketList);
                                break;
                            case 4:
                                break; // Go back to the previous menu
                            default:
                                System.out.println("Invalid choice. Please choose a valid option.");
                        }
                    } while (choice != 4);
                    break;
                
                case 3:
                    exit = true;
                    break;
                
                default:
                    System.out.println("Invalid choice. Please select a valid user type.");
            }
        } while (!exit);

        // Close the scanner when done
        scanner.close();
    }
}



//package busticketsystem;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class BusTicketSystem {
//    
//    public static void main(String[] args) {
//        
//        ArrayList<Passenger> passengerList = new ArrayList<>();
//        ArrayList<Bus> busList = new ArrayList<>();
//        ArrayList<Bus_Station> stationList = new ArrayList<>();
//        ArrayList<Driver> driverList = new ArrayList<>();
//        ArrayList<Bus_Hostess> hostessList = new ArrayList<>();
//        ArrayList<Route> routeList = new ArrayList<>();
//        ArrayList<Schedule> scheduleList = new ArrayList<>();
//        ArrayList<Ticket> ticketList = new ArrayList<>();
//        ArrayList<Feedback> feedbackList = new ArrayList<>();
//        
//        System.out.println("Welcome to Bus Ticket Reservation System");
//        
//        System.out.println("Sign In As:");
//        System.out.println("1. Admin");
//        System.out.println("2. Passenger");
//        
//        System.out.print("Enter your choice: ");
//        Scanner scanner = new Scanner(System.in);
//        int userType = scanner.nextInt();
//        
//        switch (userType) {
//            case 1:
//                // Sign in as Admin
//                Scanner s1 = new Scanner(System.in);
//                
//                System.out.println("Enter your Name: ");
//                String adminName = s1.nextLine();
//                
//                System.out.println("Enter your Age: ");
//                int adminAge = scanner.nextInt();
//                scanner.nextLine(); // Consume the newline character
//
//                System.out.println("Enter your CNIC: ");
//                int adminCnic = scanner.nextInt();
//                scanner.nextLine(); // Consume the newline character
//
//                System.out.println("Enter your Contact No: ");
//                String adminContact = s1.nextLine();
//                
//                Admin a1 = new Admin(adminName, adminContact, adminCnic, adminAge);
//
////                adminList.add(a1);
//                System.out.println("Signed in as Admin...");
//                
//                System.out.println("Admin Functions Menu");
//                System.out.println("1. Create Bus Driver");
//                System.out.println("2. Create Bus Hostess");
//                System.out.println("3. Create Bus Station");
//                System.out.println("4. Create Bus");
//                System.out.println("5. Create Route");
//                System.out.println("6. Create Schedule");
//                
//                System.out.print("Enter your choice: ");
//                int adminChoice = scanner.nextInt();
//                
//                switch (adminChoice) {
//                    case 1:
//                        // Implement Create Bus Driver functionality
//                        a1.createDriver(driverList);
//                        break;
//                    
//                    case 2:
//                        // Implement Create Bus Hostess functionality
//                        a1.createBusHostess(hostessList);
//                        break;
//                    
//                    case 3:
//                        // Implement Create Station functionality
//                        a1.createBusStation(stationList);
//                        break;
//                    
//                    case 4:
//                        // Implement Create Bus functionality
//                        a1.createBus(busList, driverList, hostessList);
//                        break;
//                    
//                    case 5:
//                        // Implement Create Route functionality
//                        a1.createRoute(routeList, stationList);
//                        break;
//                    
//                    case 6:
//                        // Implement Create Schedule functionality
//                        a1.createSchedule(scheduleList, busList, routeList);
//                        break;
//                    
//                    default:
//                        System.out.println("Invalid choice. Please choose a valid option.");
//                        break;
//                    
//                }
//                
//                break;
//            
//            case 2:
//                // Sign in as Passenger
//                Scanner s3 = new Scanner(System.in);
//                
//                System.out.println("Enter your Name: ");
//                String passName = s3.nextLine();
//                
//                System.out.println("Enter your Age: ");
//                int passAge = scanner.nextInt();
//                scanner.nextLine(); // Consume the newline character
//
//                System.out.println("Enter your Contact No: ");
//                String passContact = s3.nextLine();
//                
//                Passenger p1 = new Passenger(passName, passAge, passContact);
//                
//                passengerList.add(p1);
//                System.out.println("Signed in as Passenger...");
//                
//                System.out.println("Passenger Functions Menu");
//                System.out.println("Customer Functions Menu");
//                System.out.println("1. Book a Ride");
//                System.out.println("2. Display Tickets");
//                System.out.println("3. Give Feedback");
//                System.out.println("4. Exit");
//                
//                System.out.print("Enter your choice: ");
//                int choice = scanner.nextInt();
//                
//                switch (choice) {
//                    case 1:
//                        p1.bookRide(p1, ticketList, scheduleList, routeList);
//                        break;
//                    case 2:
//                        p1.displayTickets(p1, ticketList);
//                        break;
//                    case 3:
//                        p1.giveFeedback(p1, feedbackList, ticketList);
//                        break;
//                    case 4:
//                        System.out.println("Exiting customer menu.");
//                        break;
//                    default:
//                        System.out.println("Invalid choice. Please choose a valid option.");
//                }
//                break;
//            
//            default:
//                System.out.println("Invalid choice. Please select a valid user type.");
//                break;
//        }
//
//        // Close the scanner when done
//        scanner.close();
//    }
//}
