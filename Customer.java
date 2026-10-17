public class Customer extends Person {
    private int customerId;
    private String customerType;

    public Customer(int customerId, String name, String phone, String customerType) {
        super(name, phone);
        this.customerId = customerId;
        this.customerType = customerType;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    @Override
    public void displayInfo() {
        System.out.println("Customer ID: " + customerId);
        System.out.println("Name: " + getName());
        System.out.println("Phone: " + getPhone());
        System.out.println("Type: " + customerType);
        System.out.println("----------------------");
    }
}
