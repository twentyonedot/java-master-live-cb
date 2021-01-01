package src.Practice;

public class BinarySearch {
    public static void main(String[] args){
        int[] ar = {1,2,3,4,5,6};
        System.out.println(binarySearch(ar, 0, 5, 0));
    }
    public static int binarySearch(int[]ar, int left, int right, int target){
        int mid = (left+right)/2;
        if(left >= right){
            return -1;
        }
        if(ar[mid] == target){
            return mid;
        }
        if(ar[mid] < target){
            left = mid+1;
            return binarySearch(ar, left, right, target);
        }
        else{
            right = mid-1;
            return binarySearch(ar, left, right, target);
        }
    }
}
