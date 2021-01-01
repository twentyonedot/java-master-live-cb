package src.L11_Recursion1;
import java.util.Scanner;



public class AllOcurHW {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] ar = new int[n];
        for(int i = 0; i < n; i++){
            ar[i] = scn.nextInt();
        }
        int ele = scn.nextInt();
        int[] res = allOcur(ar, ele, 0, 0);
        for(int i = 0; i < res.length; i++){
            System.out.println(res[i]);
        }
        scn.close();
    }
    public static int[] allOcur(int[] ar, int ele, int idx, int count){
        /* if(idx == ar.length){
            return new int[count];
        }
        if(ele == ar[idx]){
            count++;
        }
        int res[] = allOcur(ar, ele, idx+1, count);
        if(count >=1){
            res[count-1] = idx;
        }
        return res; */
        if(idx == ar.length){
            int[] baseRes = new int[count];
            return baseRes;
        }
        if(ar[idx] == ele){
            int[] recurResult = allOcur(ar, ele, idx+1, count+1);
            recurResult[count] = idx;
            return recurResult;
        }
        else{
            int[] recurResult = allOcur(ar, ele, idx+1, count);
            return recurResult;
        }
    }
}
