package src.L13_Recursion3;

import java.util.ArrayList;

public class KeypadCombination {
    public static void main(String[] args){
        System.out.println(keyComb("123"));
    }
    public static ArrayList<String> keyComb(String str){
        if(str.length() == 0){
            ArrayList<String> baseResult = new ArrayList<String>();
            baseResult.add("");
            return baseResult;
        }
        String keyCode = getCode(str.charAt(0));
        String restOfString = str.substring(1);
        ArrayList<String> recurResult = keyComb(restOfString);
        ArrayList<String> myResult = new ArrayList<String>();
        for(String val : recurResult){
            /* myResult.add(val);
            myResult.add(ch+val); */
            for(int i = 0; i <keyCode.length(); i++){
                myResult.add(keyCode.charAt(i)+val);
            }
            /* SubSequence ascii */
            /* myResult.add((int)(ch) + val); */
        }
        return myResult;
    }
    public static String getCode(char ch){
        if(ch == '1')
            return "abc";
        else if(ch == '2')
            return "def";
        else if(ch == '3')
            return "ghi";
        else if(ch == '4')
            return "jk";
        else if(ch == '5')
            return "lmno";
        else if(ch == '6')
            return "pqr";
        else if(ch == '7')
            return "stu";
        else if(ch == '8')
            return "vwx";
        else if(ch == '9')
            return "yz";
        else if(ch == '0')
            return "@#";
        else
            return "";
    }
}
