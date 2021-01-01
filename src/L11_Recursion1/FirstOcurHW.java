package src.L11_Recursion1;
import java.util.Scanner;

public class FirstOcurHW {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] ar = new int[n];
        for(int i = 0; i < n; i++){
            ar[i] = scn.nextInt();
        }
        int ele = scn.nextInt();
        System.out.println(firstOcur(ar, ele, 0));
        scn.close();
    }
    public static int firstOcur(int[] ar, int ele, int idx){
        if(idx == ar.length){
            return -1;
        }
        if(ar[idx] == ele){
            return idx;
        }
        return firstOcur(ar, ele, idx+1);
    }
}
