package Algorithms.Strings.StringConstruction;

import java.util.HashSet;
import java.util.Scanner;

/**
 * A class for Solution
 *
 * @author Brandon Duke
 * @version 4/10/17
 */
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int a0 = 0; a0 < n; a0++){
            String s = in.next();
            HashSet<Character> hs=new HashSet<Character>();
            for(int i=0;i<s.length();i++){
                hs.add(s.charAt(i));
            }
            //finding distinct characters in string and printing them

            System.out.println(hs.size());
        }

    }
}
