package src.L11_Recursion1;
import java.util.Scanner;

public class LastOcurHW {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] ar = new int[n];
        for(int i = 0; i < n; i++){
            ar[i] = scn.nextInt();
        }
        int ele = scn.nextInt();
        System.out.println(lastOcur(ar, ele, 0));
        scn.close();
    }
    public static int lastOcur(int[] ar, int ele, int idx){
        if(idx == ar.length){
            return -1;
        }
        int result = lastOcur(ar, ele, idx+1);
        if(ar[idx] == ele){
            return Math.max(result, idx);
        }
        return result;

    }
}
