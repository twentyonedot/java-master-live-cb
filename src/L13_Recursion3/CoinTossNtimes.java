package src.L13_Recursion3;

import java.util.ArrayList;

public class CoinTossNtimes {
    public static void main(String[] args) {
        System.out.println(coinToss(3));
    }
    public static ArrayList<String> coinToss(int n){
        if(n == 0){
            ArrayList<String> tr = new ArrayList<String>();
            tr.add("");
            return tr;
        }
        ArrayList<String> res = coinToss(n-1);
        ArrayList<String> cacheResult = new ArrayList<String>();
        for(String val : res){
            cacheResult.add('h' + val);
            cacheResult.add('t' + val);
        }
        return cacheResult;
    }
}
