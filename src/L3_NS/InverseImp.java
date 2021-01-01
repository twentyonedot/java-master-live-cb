package src.L3_NS;

import java.util.Scanner;

public class InverseImp {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int ind = 1;
        int res = 0;
        while (n > 0) {
            int rem = n % 10;
            n /= 10;
            res = res + ind * (int) Math.pow(10, rem - 1);
            ind++;
        }
        System.out.println(res);
        scn.close();
    }
}
