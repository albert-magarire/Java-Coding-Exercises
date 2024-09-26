public class App {
    public static void main(String[] args) throws Exception {
        double x = 16.00;
        double answer = MyMath.sqrRoot(x);
        System.out.println("Square Root of " + x + " is " + answer);

        int y = 16;
        System.out.println(y + " is a prime number: True or False ?" + MyMath.isPrime(y));
    }
}
