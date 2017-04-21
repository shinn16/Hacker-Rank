package Algorithms.Implementation.RepeatedString;

import java.util.Scanner;

/**
 * Solution class
 *
 * @author Patrick Shinn
 * @version 4/20/17
 */
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        long n = in.nextLong();
        long count =0;
        for(char c : s.toCharArray())
            if(c == 'a')
                count++;

        long factor = (n/s.length());
        long rem = (n%s.length());
        count =  factor*count  ;
        for(int i=0;i<rem;i++)
            if(s.charAt(i)=='a')
                count++;
        System.out.println(count);

    }
}
