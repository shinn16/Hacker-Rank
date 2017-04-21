package Algorithms.Implementation.ExtraLongFactorials;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Solution class
 *
 * @author Patrick Shinn
 * @version 4/20/17
 */
public class Solution {
    public static void main(String[] args) {
        int n = (new Scanner(System.in)).nextInt();
        BigInteger factorial = new BigInteger("1");
        while (n>1){
            factorial = factorial.multiply(BigInteger.valueOf(n));
            n--;
        }
        System.out.println(factorial);
    }
}
