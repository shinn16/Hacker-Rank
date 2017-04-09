package Algorithms.Warmups.PlusMinus;

import java.util.Scanner;

/**
 * Solution class
 *
 * @author Patrick Shinn
 * @version 4/2/17
 */
public class Solution {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        double pos = 0;
        double neg = 0;
        double zero = 0;
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        while(scanner.hasNextInt()){
            int num = scanner.nextInt();
            if(num < 0) neg ++;
            else if(num > 0) pos ++;
            else zero ++;
        }
        pos /= size;
        neg /= size;
        zero /= size;

        System.out.println(pos);
        System.out.println(neg);
        System.out.println(zero);
    }
}
