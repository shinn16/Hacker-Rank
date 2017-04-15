package Algorithms.Implementation.TheHurdleRace;

import java.util.Scanner;

/**
 * Solution Class
 *
 * @author Patrick Shinn
 * @version 4/14/17
 */
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // your code goes here
        int n = in.nextInt();int magicbevrges=0;
        int k = in.nextInt();
        int[] height = new int[n];
        int max=height[0];
        for(int i=1; i < n; i++){
            int h=in.nextInt();
            if(h>max)
                max=h;
            if(max>k && h>k){
                magicbevrges=max-k;
            }
        }
        System.out.println(magicbevrges);
    }
}
