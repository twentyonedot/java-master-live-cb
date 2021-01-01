package src.L11_Recursion1;
import java.util.Scanner;
public class NthFibo {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(fibo(n));
        scn.close();
    }
    public static int fibo(int n){
        if(n == 0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        /* int sp1 = fibo(n-1);
        int sp2 = fibo(n-2);
        int bp = sp1+sp2;
        return bp; */
        return fibo(n-1)+fibo(n-2);
    }
}
