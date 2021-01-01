package src.L11_Recursion1;
import java.util.Scanner;

public class MaxInArrayHW {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] ar = new int[n];
        for(int i = 0; i < n; i++){
            ar[i] = scn.nextInt();
        }
        System.out.println(maxInArray(ar, 1));
        scn.close();
    }
    public static int maxInArray(int[] ar, int idx){
        if(idx == ar.length-1){
            return ar[idx];
        }
        int maxTillNow = maxInArray(ar, idx+1);
        int maxTotal = Math.max(maxTillNow, ar[idx]);
        return maxTotal;
    }
}
