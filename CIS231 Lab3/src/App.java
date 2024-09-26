import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        // Read the data.csv file and create a new array lis for output values after processing
        ArrayList<String> inputList = MyFile.readFile("data.csv");
        ArrayList<String> outputList = new ArrayList<>();

        //Check if the inputList is not empty and remove the first header line
        if (!inputList.isEmpty()){
            String header = inputList.get(0); // Get the header line
            outputList.add(header); // Add the header to the outputList
            inputList.remove(0);
        }

        // Going through all the values in the file and changiing each line into a object
        for (int i = 0; i < inputList.size(); i++) {
            String line = inputList.get(i);
            String[] parts = line.split(",");
        
            if (parts.length != 6) { //I put this block of code to make sure we read the same number of fields as those in the file, and if we have any missing, an error is thrown!
                System.err.println("Error: Invalid input format. Expected 6 fields, found " + parts.length + " in line: " + line);
                continue;
            }

            try {
                // Parsing all data from CSV
                int empId = Integer.parseInt(parts[0].trim());
                String lastName = parts[1].trim();
                String firstName = parts[2].trim();
                double taxPercent = Double.parseDouble(parts[3].trim());
                double hoursWorked = Double.parseDouble(parts[4].trim());
                double hourlyWage = Double.parseDouble(parts[5].trim());

                // CReating the default template for all Employee objects
                Employee employee = new Employee(empId, lastName, firstName, taxPercent, hoursWorked, hourlyWage);

                // Add the output of Employee's toString method to outputList
                outputList.add(employee.toString());

            } catch (NumberFormatException e) { //Here I tried to make sure the program throws exceptions if data types parsed are wrong
                System.err.println("Error: Unable to parse numerical values in line: " + line);
            } catch (IllegalArgumentException e) {
                System.err.println("Error: Invalid data - " + e.getMessage());
            }
        }

        // CReate report.csv if it does not exist, if exists just write to it
        MyFile.writeFile("report.csv", outputList);
    }
}
