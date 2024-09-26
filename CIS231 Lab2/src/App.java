import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Created a scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        //Prompt user to enter the size ofthe array they want
        System.out.println("Enter the number of eements in your array(array size) ");
        int size = scanner.nextInt();

        //You forgot to put in input validation for the size of the array!!
        while (size > 0){

        //Call the populate method to arrange the array when user enters values
        int[] array = MyArray.populate(size);

        //Use showArray method to display the values contained
        System.out.print("The Original ");
        MyArray.showArray(array);

        //Calling the other functions for minimum, maximum, and average value
        int min = MyArray.minArray(array); 
        int max = MyArray.maxArray(array); 
        int avg = MyArray.avgArray(array);

        //Printing out the values returned by the above methods
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
        System.out.println("Average value: " + avg);

        //Call the deepCopy method and also display the deep copy of the array
        int[] deepCopyArray = MyArray.deepCopy(array);
        System.out.print("The Deep Copy ");
        MyArray.showArray(deepCopyArray);

        scanner.close();
       } 
    }
}
