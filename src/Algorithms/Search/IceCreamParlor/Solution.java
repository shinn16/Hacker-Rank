package Algorithms.Search.IceCreamParlor;

import java.util.Scanner;

/**
 * A class for Solution
 *
 * @author Brandon Duke
 * @version 4/20/17
 */
public class Solution {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int t =s.nextInt();
        while(t-- >0)
        {
            int m = s.nextInt();
            int n = s.nextInt();;
            int[] arr = new int[n];
            for(int i=0;i<n;i++)
                arr[i]=s.nextInt();
            LOOP: for(int i=0;i<n;i++)
            {
                for(int j=i+1;j<n;j++)
                {
                    if((arr[i]+arr[j])==m)
                    {
                        System.out.println((i+1)+" "+(j+1));
                        break LOOP;
                    }
                }
            }
        }
    }
}
