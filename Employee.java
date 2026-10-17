public class Employee extends Person {
    private String jobTitle;

    public Employee(String name, String phone, String jobTitle) {
        super(name, phone);
        this.jobTitle = jobTitle;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @Override
    public void displayInfo() {
        System.out.println("Employee");
        System.out.println("Name: " + getName());
        System.out.println("Phone: " + getPhone());
        System.out.println("Job title: " + jobTitle);
        System.out.println("----------------------");
    }
}
