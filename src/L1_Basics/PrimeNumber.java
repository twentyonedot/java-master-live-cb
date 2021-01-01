package src.L1_Basics;

public class PrimeNumber {
    public static void main(String[] args) {
        int n = 2;
        /*
         * int div = 1; int factors = 0; while (div <= n) { int rem = n % div; if (rem
         * == 0) { factors++; } div++; }
         *
         * if (factors == 2) { System.out.println("Nmber is Prime");
         *
         * } else { System.out.println("Number is not Prime"); }
         */
        int div = 2;
        int flag = 0;
        while (div < n) {
            if (n % div == 0) {
                System.out.println("Not a Prime");
                flag = 1;
                break;
            }
            div++;
        }
        if (flag == 1) {
            System.out.println("Not a Prime");
        } else {
            System.out.println("Prime");
        }
    }
}
