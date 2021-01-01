package src.L11_Recursion1;
import java.util.Scanner;
public class ArrayPrint {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] ar = new int[n];
        for(int i = 0; i < n; i++){
            ar[i] = scn.nextInt();
        }
        arrayPrint(ar, 0);
        reverseArrayPrint(ar,0);
        scn.close();
    }
    public static void arrayPrint(int[] ar, int i){
        if(i == ar.length){
            return;
        }
        System.out.println(ar[i]);
        arrayPrint(ar, i+1);
    }public static void reverseArrayPrint(int[] ar, int i){
        if(i == ar.length){
            return;
        }
        reverseArrayPrint(ar, i+1);
        System.out.println(ar[i]);
    }
}
