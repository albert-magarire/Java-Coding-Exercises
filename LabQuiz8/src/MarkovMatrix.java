import java.util.Scanner;

public class MarkovMatrix {

    public static boolean isMarkovMatrix(double[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] <= 0) {
                    return false;
                }
            }
        }

        for (int j = 0; j < m[0].length; j++) {
            double sum = 0;
            for (int i = 0; i < m.length; i++) {
                sum += m[i][j];
            }
            if (sum != 1) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a 3-by-3 matrix row by row:");
        double[][] matrix = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = scanner.nextDouble();
            }
        }

        if (isMarkovMatrix(matrix)) {
            System.out.println("Result: It is a Markov Matrix");
        } else {
            System.out.println("Result: It is not a Markov Matrix");
        }
    }
}
