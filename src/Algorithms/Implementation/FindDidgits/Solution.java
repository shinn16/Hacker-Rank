package Algorithms.Implementation.FindDidgits;

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

            int r = n;
            int count = 0;
            while(r > 0){
                if(r % 10 != 0 && n % (r % 10) == 0) count++;
                r = r / 10;
            }
            System.out.println(count);
        }

    }
}
