package Algorithms.Implementation.BirthdayChocolate;

import java.util.Scanner;

/**
 * Solution class
 *
 * @author Patrick Shinn
 * @version 4/10/17
 */
public class Solution {

    static int getWays(int[] squares, int d, int m){
        int sum=0 ,c=0;
        int n = squares.length;
        for(int i=0;i<n-m+1;i++){
            sum=0;
            for(int j=0;j<m;j++){
                sum=sum+squares[i+j];
            }
            if(sum==d)
                c++;
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int d = in.nextInt();
        int m = in.nextInt();
        int result = getWays(s, d, m);
        System.out.println(result);
    }
}
