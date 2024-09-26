import java.util.Arrays;
import java.util.Scanner;

public class AnagaramCheckingAlgorithm {
    public static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;

        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);

        return Arrays.equals(chars1, chars2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first word: ");
        String s1 = scanner.nextLine();
        System.out.print("Enter the second word: ");
        String s2 = scanner.nextLine();

        if (isAnagram(s1, s2)) {
            System.out.println(s1 + " and " + s2 + " are anagrams.");
        } else {
            System.out.println(s1 + " and " + s2 + " are not anagrams.");
        }
    }
}
