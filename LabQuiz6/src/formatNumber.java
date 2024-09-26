import java.util.Scanner;

public class formatNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an Integer: ");
        int number = scanner.nextInt();

        System.out.print("Enter the width: ");
        int width = scanner.nextInt();

        String formattedNumber = format(number, width);
        System.out.println("Formatted number: " + formattedNumber);

        scanner.close();
    }

    public static String format(int number, int width) {
        String formattedNumber = String.format("%0" + width + "d", number);
        if (formattedNumber.length() > width) {
            return String.valueOf(number);
        } else {
            return formattedNumber;
        }
    }
}
