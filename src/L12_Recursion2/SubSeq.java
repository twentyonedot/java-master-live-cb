package src.L12_Recursion2;

import java.util.ArrayList;

public class SubSeq {
    public static void main(String[] args) {
        System.out.println(subSequences("abc"));
    }
    public static ArrayList<String> subSequences(String str){
        if(str.length() == 0){
            ArrayList<String> baseResult = new ArrayList<String>();
            baseResult.add("");
            return baseResult;
        }
        char ch = str.charAt(0);
        String restOfString = str.substring(1);
        ArrayList<String> recurResult = subSequences(restOfString);
        ArrayList<String> myResult = new ArrayList<String>();
        for(String val : recurResult){
            myResult.add(val);
            myResult.add(ch+val);
            /* SubSequence ascii */
            /* myResult.add((int)(ch) + val); */
        }
        return myResult;
    }
}
