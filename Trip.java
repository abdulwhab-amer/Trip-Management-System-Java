public class Trip {
    private int tripId;
    private String tripName;
    private String location;
    private String date;
    private double price;

    public Trip(int tripId, String tripName, String location, String date, double price) {
        this.tripId = tripId;
        this.tripName = tripName;
        this.location = location;
        this.date = date;
        this.price = price;
    }

    public int getTripId() {
        return tripId;
    }

    public void setTripId(int tripId) {
        this.tripId = tripId;
    }

    public String getTripName() {
        return tripName;
    }

    public void setTripName(String tripName) {
        this.tripName = tripName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void displayInfo() {
        System.out.println("Trip ID: " + tripId);
        System.out.println("Trip name: " + tripName);
        System.out.println("Location: " + location);
        System.out.println("Date: " + date);
        System.out.println("Price: " + price);
        System.out.println("----------------------");
    }
}
