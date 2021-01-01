package src.L14_Recursion4;

import java.util.ArrayList;

public class ClimbingStairs {
    public static void main(String[] args) {

    }
    public static ArrayList<String> climbingStairs(int curr, int end){
        if(curr == end){
            ArrayList<String> br = new ArrayList<>();
            br.add("");
            return br;
        }
        ArrayList<String> rr1 =  climbingStairs(curr+1, end);
        if(curr+2 <= end){ArrayList<String> rr2 = climbingStairs(curr+2, end);}
        if(curr+3 <= end){ArrayList<String> rr3 = climbingStairs(curr+3, end);}

        ArrayList<String> mr = new ArrayList<String>();
        for(String val : rr1){
            mr.add(1 + val);
        }
        for(String val : rr2){
            mr.add(2 + val);
        }
        for(String val : rr3){
            mr.add(3 + val);
        }
        return mr;
    }
}
