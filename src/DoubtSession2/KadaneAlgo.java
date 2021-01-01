package src.DoubtSession2;

public class KadaneAlgo {
    public static void main(String[] args) {
        int[] ar = {2,3,-6,1,2,3,-4,5,-10,6};
        System.out.println(kadane(ar));
    }
    public static int kadane(int[] ar){
        int sum = ar[0];
        int max = sum;
        for(int i = 1; i < ar.length; i++){
            sum = Math.max(sum+ar[i], ar[i]);
            if(sum > max){
                max = sum;
            }
        }
        return max;
    }
    public static int maxCircularSum(int[] ar){
        //case1
        int sumNotWrapping = kadane(ar);
        //case2
        int totalSum = 0;
        for(int i = 0; i < ar.length; i++){
            totalSum = ar[i] + totalSum;
            ar[i] = -ar[i];
        }
        int sumNCE = kadane(ar);
        int sumWrapping = totalSum - sumNCE;
        return Math.max(sumNotWrapping, sumWrapping);
    }
}
