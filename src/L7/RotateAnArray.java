package src.L7;

public class RotateAnArray {
    public static void main(String[] args) {
        int[] ar = {10,20,30,40,50,60};
        int rot = 2;
        int[]res = rotate(ar, rot);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }
    public static int[] rotate(int[]ar, int rot){
        rot = rot%ar.length;
        if(rot < 0){
            rot = ar.length+rot;
        }
        while(rot > 0){
            int temp = ar[ar.length-1];
            for(int i = ar.length-1; i > 0; i--){
                ar[i] = ar[i-1];
            }
            ar[0]=temp;
            rot--;
        }
        return ar;
    }
}
