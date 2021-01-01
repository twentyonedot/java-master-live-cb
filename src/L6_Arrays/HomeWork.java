package src.L6_Arrays;

public class HomeWork {
    public static void main(String[] args) {

    }
    public static int max(int[] ar){
        int max = ar[0];
        for(int i = 0; i < ar.length; i++){
            if(ar[i] > max){
                max = ar[i];
            }
        }
        return max;
    }
    public static int linearSearch(int[] ar, int item){
        for(int i = 0; i < ar.length; i++){
            if(ar[i] == item){
                return i;
            }
        }
        return -1;
    }
    /* public static int binarySearch(int[]ar, int item){

    } */
}
