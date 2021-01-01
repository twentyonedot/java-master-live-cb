package src.L3_NS;

import java.util.Scanner;

public class RotationImp {
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
        while (rot > 0) {
            int ld = n % 10;
            int rest = n / 10;
            resNum = ld * (int) Math.pow(10, nod - 1) + rest;
            n = resNum;
            rot--;
        }
        System.out.println(resNum);
        scn.close();
    }
}
