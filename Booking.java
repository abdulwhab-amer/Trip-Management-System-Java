public class Booking {
    private Customer customer;
    private Trip trip;
    private int quantity;

    public Booking(Customer customer, Trip trip, int quantity) {
        this.customer = customer;
        this.trip = trip;
        this.quantity = quantity;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Trip getTrip() {
        return trip;
    }

    public void setTrip(Trip trip) {
        this.trip = trip;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return trip.getPrice() * quantity;
    }

    public void displayInfo() {
        System.out.println("Customer: " + customer.getName());
        System.out.println("Trip: " + trip.getTripName());
        System.out.println("Quantity: " + quantity);
        System.out.println("Total price: " + getTotalPrice());
        System.out.println("----------------------");
    }
}
