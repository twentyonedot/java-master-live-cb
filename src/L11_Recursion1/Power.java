package src.L11_Recursion1;
import java.util.Scanner;
public class Power {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
        System.out.println(power(x,n));
        scn.close();
    }
    public static int power(int x, int n){
        if(n == 0){
            return 1;
        }
        /* int pm1 = power(x, n-1);
        int p = pm1 * x;
        return p; */
        return power(x,n-1)*x;
    }
}
