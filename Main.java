import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);

    static Customer[] customers = new Customer[100];
    static Employee[] employees = new Employee[100];
    static Trip[] trips = new Trip[100];
    static Booking[] bookings = new Booking[100];
    static Person[] people = new Person[200];

    static int customerCount = 0;
    static int employeeCount = 0;
    static int tripCount = 0;
    static int bookingCount = 0;
    static int peopleCount = 0;

    public static void main(String[] args) {
        int choice;

        do {
            menu();
            System.out.print("Choose: ");
            choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    addCustomer();
                    break;
                case 2:
                    addEmployee();
                    break;
                case 3:
                    addTrip();
                    break;
                case 4:
                    makeBooking();
                    break;
                case 5:
                    displayCustomers();
                    break;
                case 6:
                    displayEmployees();
                    break;
                case 7:
                    displayTrips();
                    break;
                case 8:
                    displayBookings();
                    break;
                case 9:
                    searchCustomer();
                    break;
                case 10:
                    searchTrip();
                    break;
                case 11:
                    displayPeople();
                    break;
                case 0:
                    System.out.println("Program ended.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 0);
    }

    static void menu() {
        System.out.println("\n===== Trip Management System =====");
        System.out.println("1. Add Customer");
        System.out.println("2. Add Employee");
        System.out.println("3. Add Trip");
        System.out.println("4. Make Booking");
        System.out.println("5. Display Customers");
        System.out.println("6. Display Employees");
        System.out.println("7. Display Trips");
        System.out.println("8. Display Bookings");
        System.out.println("9. Search Customer");
        System.out.println("10. Search Trip");
        System.out.println("11. Display People (Polymorphism)");
        System.out.println("0. Exit");
    }

    static void addCustomer() {
        System.out.println("\n--- Add Customer ---");

        System.out.print("Customer ID: ");
        int id = input.nextInt();
        input.nextLine();

        if (findCustomer(id) != null) {
            System.out.println("Customer ID already exists.");
            return;
        }

        System.out.print("Name: ");
        String name = input.nextLine();

        System.out.print("Phone: ");
        String phone = input.nextLine();

        System.out.print("Customer type: ");
        String type = input.nextLine();

        Customer customer = new Customer(id, name, phone, type);

        customers[customerCount] = customer;
        customerCount++;

        people[peopleCount] = customer;
        peopleCount++;

        System.out.println("Customer added.");
    }

    static void addEmployee() {
        System.out.println("\n--- Add Employee ---");

        System.out.print("Name: ");
        String name = input.nextLine();

        System.out.print("Phone: ");
        String phone = input.nextLine();

        System.out.print("Job title: ");
        String job = input.nextLine();

        Employee employee = new Employee(name, phone, job);

        employees[employeeCount] = employee;
        employeeCount++;

        people[peopleCount] = employee;
        peopleCount++;

        System.out.println("Employee added.");
    }

    static void addTrip() {
        System.out.println("\n--- Add Trip ---");

        System.out.print("Trip ID: ");
        int id = input.nextInt();
        input.nextLine();

        if (findTrip(id) != null) {
            System.out.println("Trip ID already exists.");
            return;
        }

        System.out.print("Trip name: ");
        String name = input.nextLine();

        System.out.print("Location: ");
        String location = input.nextLine();

        System.out.print("Date: ");
        String date = input.nextLine();

        System.out.print("Price: ");
        double price = input.nextDouble();
        input.nextLine();

        Trip trip = new Trip(id, name, location, date, price);

        trips[tripCount] = trip;
        tripCount++;

        System.out.println("Trip added.");
    }

    static void makeBooking() {
        if (customerCount == 0 || tripCount == 0) {
            System.out.println("Add a customer and a trip first.");
            return;
        }

        System.out.println("\n--- Make Booking ---");

        System.out.print("Customer ID: ");
        int customerId = input.nextInt();
        input.nextLine();

        Customer customer = findCustomer(customerId);

        if (customer == null) {
            System.out.println("Customer not found.");
            return;
        }

        System.out.print("Trip ID: ");
        int tripId = input.nextInt();
        input.nextLine();

        Trip trip = findTrip(tripId);

        if (trip == null) {
            System.out.println("Trip not found.");
            return;
        }

        System.out.print("Quantity: ");
        int quantity = input.nextInt();
        input.nextLine();

        if (quantity <= 0) {
            System.out.println("Quantity must be greater than zero.");
            return;
        }

        Booking booking = new Booking(customer, trip, quantity);

        bookings[bookingCount] = booking;
        bookingCount++;

        System.out.println("Booking created successfully.");
        booking.displayInfo();
    }

    static void displayCustomers() {
        System.out.println("\n--- Customers ---");

        for (int i = 0; i < customerCount; i++) {
            customers[i].displayInfo();
        }
    }

    static void displayEmployees() {
        System.out.println("\n--- Employees ---");

        for (int i = 0; i < employeeCount; i++) {
            employees[i].displayInfo();
        }
    }

    static void displayTrips() {
        System.out.println("\n--- Trips ---");

        for (int i = 0; i < tripCount; i++) {
            trips[i].displayInfo();
        }
    }

    static void displayBookings() {
        System.out.println("\n--- Bookings ---");

        for (int i = 0; i < bookingCount; i++) {
            bookings[i].displayInfo();
        }
    }

    static void searchCustomer() {
        System.out.println("\n--- Search Customer ---");

        System.out.print("Customer ID: ");
        int id = input.nextInt();
        input.nextLine();

        Customer customer = findCustomer(id);

        if (customer == null) {
            System.out.println("Customer not found.");
        } else {
            customer.displayInfo();
        }
    }

    static void searchTrip() {
        System.out.println("\n--- Search Trip ---");

        System.out.print("Trip ID: ");
        int id = input.nextInt();
        input.nextLine();

        Trip trip = findTrip(id);

        if (trip == null) {
            System.out.println("Trip not found.");
        } else {
            trip.displayInfo();
        }
    }

    static Customer findCustomer(int id) {
        for (int i = 0; i < customerCount; i++) {
            if (customers[i].getCustomerId() == id) {
                return customers[i];
            }
        }

        return null;
    }

    static Trip findTrip(int id) {
        for (int i = 0; i < tripCount; i++) {
            if (trips[i].getTripId() == id) {
                return trips[i];
            }
        }

        return null;
    }

    static void displayPeople() {
        System.out.println("\n--- People (Polymorphism) ---");

        for (int i = 0; i < peopleCount; i++) {
            people[i].displayInfo();
        }
    }
}
