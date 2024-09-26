import java.util.Scanner;

public class CheckSorted {
    public static boolean isSorted(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            if (list[i] > list[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter list: ");
        int length = scanner.nextInt();
        int[] list = new int[length];
        for (int i = 0; i < length; i++) {
            list[i] = scanner.nextInt();
        }

        boolean sorted = isSorted(list);
        if (sorted) {
            System.out.println("The list is already sorted.");
        } else {
            System.out.println("The list is not sorted.");
        }

        scanner.close();
    }
}
