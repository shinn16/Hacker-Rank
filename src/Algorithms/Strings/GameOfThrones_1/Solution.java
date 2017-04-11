package Algorithms.Strings.GameOfThrones_1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * A class for Solution
 *
 * @author Brandon Duke
 * @version 4/10/17
 */
public class Solution {

    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        String s = myScan.nextLine();
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        String ans;

        for(int i=0; i<s.length(); i++){
            char curr = s.charAt(i);
            if(map.containsKey(curr)){
                int value = map.get(curr);
                map.put(curr, value+1);
            }
            else{
                map.put(curr, 1);
            }
        }

        int count = 0;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            int value = entry.getValue();
            if(value%2 != 0){
                count++;
            }
        }
        if(count > 1){
            ans = "NO";
        }
        else ans= "YES";

        System.out.println(ans);
    }
}
