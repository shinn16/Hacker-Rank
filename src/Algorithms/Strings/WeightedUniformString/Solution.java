package Algorithms.Strings.WeightedUniformString;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * A class for Solution
 *
 * @author Brandon Duke
 * @version 4/9/17
 */
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();

        Set<Integer> uniSet = new HashSet<Integer>();
        int num = 1;
        for(int i=0;i<s.length();i++){
            uniSet.add((s.charAt(i)-'a'+1) * num);
            if((i+1)!=s.length()){
                if(s.charAt(i) != s.charAt(i+1)){
                    num=1;
                }else{
                    num++;
                }
            }
        }
        int n = in.nextInt();
        for(int a0 = 0; a0 < n; a0++){
            int x = in.nextInt();
            // your code goes here
            System.out.println(uniSet.contains(x) ? "Yes" : "No");
        }
    }
}