package src.L3_NS;

import java.util.Scanner;

public class RotationImpM2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int rot = scn.nextInt();

        int nod = 0;
        int temp = n;
        while (temp > 0) {
            nod++;
            temp /= 10;
        }
        rot = rot % nod;
        if (rot < 0) {
            rot = nod + rot;
        }

        int resNum = 0;
        int divisor = (int) Math.pow(10, rot);
        int right = n % divisor;
        int left = n / divisor;
        resNum = right * (int) Math.pow(10, nod - rot) + left;
        System.out.println(resNum);
        scn.close();
    }
}
