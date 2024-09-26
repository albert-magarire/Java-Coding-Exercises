public class MyMath {
    public static double sqrRoot(double num){
        //define initial lower limit
        double sqrRoot1 = 1;
        //define initial upper limit
        double sqrRoot2 = num/sqrRoot1;
        // difference (absolute, because we never know which one is bigger)between those 2 limts
        double diff = Math.abs(sqrRoot2 - sqrRoot1);

        //Getting the mean of the two numbers and iterating the whole process
        while (diff > 0.001){
            sqrRoot1 = (sqrRoot2 + sqrRoot1)/2;
            sqrRoot2 = num/sqrRoot1;
            diff = Math.abs(sqrRoot2 - sqrRoot1);
        }

        return sqrRoot1;
    }

    public static boolean isPrime(int num){
        if(num <= 2){
            return true;
        }
        else{
           int rem = num % 2;
           int div = 3;
           while(rem != 0 && div <= num/2){
            rem = num % div;
            div += 2;
            }

            return rem != 0;
            // if (rem == 0){
            //     return false;
            // }else{
            //     return true;
            // }
        }
    }
}
