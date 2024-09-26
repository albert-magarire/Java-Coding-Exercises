public class Employee {
    private int empId;
    private String lastName;
    private String firstName;
    private double taxPercent;
    private double hoursWorked;
    private double hourlyWage;

    // Creating my constructor for the Employee class
    public Employee(int empId, String lastName, String firstName, double taxPercent, double hoursWorked, double hourlyWage) {
        // I tried to put in a series of different data validation methods and throw exceptions if error is found
        if (empId <= 0) {
            throw new IllegalArgumentException("Employee ID must be a positive integer.");
        }
        if (lastName == null || lastName.isEmpty()) {
            throw new IllegalArgumentException("Last name cannot be empty.");
        }
        if (firstName == null || firstName.isEmpty()) {
            throw new IllegalArgumentException("First name cannot be empty.");
        }
        if (taxPercent < 0 || taxPercent > 100) {
            throw new IllegalArgumentException("Tax percent must be between 0 and 100.");
        }
        if (hoursWorked < 0) {
            throw new IllegalArgumentException("Hours worked cannot be negative.");
        }
        if (hourlyWage < 0) {
            throw new IllegalArgumentException("Hourly wage cannot be negative.");
        }

        // After all data validation, now I set the values of all my variables
        this.empId = empId;
        this.lastName = lastName;
        this.firstName = firstName;
        this.taxPercent = taxPercent;
        this.hoursWorked = hoursWorked;
        this.hourlyWage = hourlyWage;
    }

    // Finding the total amount earned per week before taxes
    public double calculateGrossPay() {
        return hoursWorked * hourlyWage;
    }

    // Calculating the tax to reduce based on the tax percent value
    public double calculateTaxAmount() {
        return calculateGrossPay() * (taxPercent / 100);
    }

    // Subtracting taxes from gross pay to find net pay
    public double calculateNetPay() {
        return calculateGrossPay() - calculateTaxAmount();
    }

    // an ovverride and to string method to format my output
    @Override
    public String toString() {
        return empId + "," + lastName + "," + firstName + "," +
               String.format("%.2f", calculateGrossPay()) + "," +
               String.format("%.2f", calculateTaxAmount()) + "," +
               String.format("%.2f", calculateNetPay());
    }
}
