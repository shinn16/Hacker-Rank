package Algorithms.Implementation.Warmups.MiniMaxSum;

import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * Solution class
 *
 * @author Patrick Shinn
 * @version 4/2/17
 */
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();
        long d = in.nextLong();
        long e = in.nextLong();

        PriorityQueue<Long> heap = new PriorityQueue<>();
        heap.add(a);
        heap.add(b);
        heap.add(c);
        heap.add(d);
        heap.add(e);

        long[] array = new long[5];
        array[0] = heap.remove();
        array[1] = heap.remove();
        array[2] = heap.remove();
        array[3] = heap.remove();
        array[4] = heap.remove();

        long mini = array[0] + array[1] + array[2] + array[3];
        long max = array[1] + array[2] + array[3] + array[4];

        System.out.print(mini + " " + max);

    }
}
