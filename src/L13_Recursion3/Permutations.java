package src.L13_Recursion3;

import java.util.ArrayList;

public class Permutations {
    public static void main(String[] args) {
        System.out.println(stringPermutation("abc"));
    }
    public static ArrayList<String> stringPermutation(String str){
        if(str.length() == 0){
            ArrayList<String> finalResult = new ArrayList<>();
            finalResult.add("");
            return finalResult;
        }
        char ch = str.charAt(0);
        String remStr = str.substring(1);
        ArrayList<String> rr = stringPermutation(remStr);
        ArrayList<String> al = new ArrayList<String>();
        for(String val : rr){
            for(int i = 0; i <= val.length(); i++){
                String res = val.substring(0, i) + ch + val.substring(i);
                System.out.println(res + "->");
                al.add(res);
            }
        }
        return al;
    }
}
