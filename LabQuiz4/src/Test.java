public class Test {
    public static void main(String[] args) {
        int n = 4;
        int sum = 0;
        int term = -1;

        for (int i=0; i<n; i++){
            sum += term;
            term += 4;

            System.out.print(term + " ");
        }
    }

}
