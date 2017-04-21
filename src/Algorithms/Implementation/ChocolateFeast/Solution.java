package Algorithms.Implementation.ChocolateFeast;

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
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int c = in.nextInt();
            int m = in.nextInt();
            int chocs = n/c;  //chocolates bought with Money
            int wrapper = chocs; //wrappers from chocolate
            int ex_chocs = wrapper/m; //chocolates from wrappers
            while(wrapper>=m){
                ex_chocs = ex_chocs+(wrapper/m + wrapper%m)/m;
                wrapper = wrapper/m;
            }
            System.out.println(chocs+ex_chocs);

        }
    }
}
