package Algorithms.GameTheory.TowerBreakers;

import java.util.Scanner;

/**
 * A class for Solution
 *
 * @author Brandon Duke
 * @version 4/20/17
 */
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int m=sc.nextInt();
            if( n%2==0 || m==1)
            {
                System.out.println("2");
            }
            else
                System.out.println("1");
        }
    }
}
