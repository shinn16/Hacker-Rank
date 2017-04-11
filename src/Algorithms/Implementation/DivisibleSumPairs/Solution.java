package Algorithms.Implementation.DivisibleSumPairs;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Solution class
 *
 * @author Patrick Shinn
 * @version 4/10/17
 */
public class Solution {

    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(new File("/home/neo/Github/personal/Hacker-Rank/src/Algorithms/Implementation/DivisibleSumPairs/input.txt"));
            int n = in.nextInt();
            int k = in.nextInt();
            int[] a = new int[n];
            Map<Integer, Integer> buckets = new HashMap<>();
            int pairs = 0;
            for (int a_i = 0; a_i < n; a_i++) {
                int num = in.nextInt();
                num %= k;

                int complement = (k - num) % k;
                Integer count = buckets.get(complement);
                if (count != null) {
                    pairs += count;
                }

                count = buckets.get(num);
                if (count == null) {
                    buckets.put(num, 1);
                } else {
                    buckets.put(num, count + 1);
                }
            }
            System.out.println(pairs);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
