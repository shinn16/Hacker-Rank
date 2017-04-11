package Algorithms.Strings.BeautifulBinaryString;

import java.util.Scanner;

/**
 * A class for Solution
 *
 * @author Brandon Duke
 * @version 4/10/17
 */
public class Solution {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        String s = in.next();
        int count=0;
        s = s.replaceAll("010", "A");
        for(char c:s.toCharArray())
            if(c=='A')
                count++;
        System.out.println(count);
        in.close();
    }
}
