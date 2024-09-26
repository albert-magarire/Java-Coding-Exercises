import java.util.Random;

public class MyArray {
    //Creating a function to create and populate an array with random numbers
    public static int[] populate(int size){
        int[] array = new int[size];
        Random elements = new Random();
        for (int i = 0; i < size; i++){
            array[i] = elements.nextInt(100);
        }
        return array;
    }

    //Finding the minimum value in the array
    public static int minArray(int[] num){
        int minValue = num[0];
        for (int i = 1; i < num.length; i++){
            if (num[i] < minValue){
                minValue = num[i];
            }
        }
        return minValue;
    }

    //Finding the maximum value of the array
    public static int maxArray(int[] num){
        int maxValeu = num[0];
        for (int i = 1; i < num.length; i++){
            if (num[i] > maxValeu){
                maxValeu = num[i];
            }
        }
        return maxValeu;
    }

    //Function to calculate the average value of elements in an array
    public static int avgArray(int[] num) {
        int sum = 0;
        int avg = 0;
        for (int i = 0; i < num.length; i++) {
            sum += num[i];
            avg = sum / num.length;
        }
        return avg;
    }

    //Creating the array's deepCopy
    public static int[] deepCopy(int[] num) {
        int[] copy = new int[num.length];
        for (int i = 0; i < num.length; i++) {
            copy[i] = num[i];
        }
        return copy;
    }

    //Output all elements in the array
    public static void showArray(int[] num) {
        System.out.print("Array Elements: ");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println();
    }
}
