package src.L11_Recursion1;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(factorial(n));
        scn.close();
    }
    public static int factorial(int n){
        if(n==1){
            return 1;
        }
        /* int fnm = factorial(n-1);
        int fn = fnm*n;
        return fn; */
        return factorial(n-1) * n;
    }
}
