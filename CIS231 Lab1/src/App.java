import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //Creating an array tp store pet information and  a scanner object to take the users's input on their pet's information
        ArrayList<Pet> pets = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String choice; //I will use choice variable to see if user wants to add another pet

        do {
            // Asking user to enter the name of the pet
            System.out.print("Enter Pet's Name: ");
            String name = scanner.nextLine();

            // Making sure the pet's age is a positive value
            int age = -1;
            while (age <= 0) {
                System.out.print("Enter Pet's Age: ");
                if (scanner.hasNextInt()) {
                    age = scanner.nextInt();
                    if (age <= 0) {
                        System.out.println("Invalid age! Please try again.");
                    }
                } else {
                    System.out.println("Invalid input. Please enter a valid integer for age.");
                    scanner.next(); // Discard the invalid input
                }
            }

            // Making sure the adoption cost is a positive value
            double cost = -1;
            while (cost <= 0) {
                System.out.print("Enter Pet's Adoption Cost: ");
                if (scanner.hasNextDouble()) {
                    cost = scanner.nextDouble();
                    if (cost <= 0) {
                        System.out.println("Invalid adoption cost! Please try again.");
                    }
                } else {
                    System.out.println("Invalid input. Please enter a valid number for adoption cost.");
                    scanner.next(); 
                }
            }
            scanner.nextLine(); 

            // Creating a new pet object/instance and adding it to the array list
            pets.add(new Pet(name, age, cost));

            // Ask use if they want to add another pet
            System.out.print("Do you want to add another pet? (y/n): ");
            choice = scanner.nextLine();
        } while (choice.equalsIgnoreCase("y")); //used ignore case to accept either Y or y

        // Print out all the pets from the array
        for (Pet pet : pets) {
            System.out.println(pet);
        }

        scanner.close();
    }
}
