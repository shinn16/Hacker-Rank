package Algorithms.Greedy.PriyankaAndToys;

import java.util.Arrays;
import java.util.Scanner;

/**
 * A class for Solution
 *
 * @author Brandon Duke
 * @version 4/20/17
 */
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] arr = new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = in.nextInt();
        }
        Arrays.sort(arr);
        int counter = 0;
        for(int i = 0; i < N; i++){
            if(arr[i] >= 0){
                counter++;
            } else{
                continue;
            }
            int j = 1;
            while(i + j < N){
                if(arr[i + j] <= arr[i] + 4){
                    arr[i + j] = -1;
                    j++;
                } else {
                    break;
                }
            }
            i +=j-1;
        }
        System.out.println(counter);
    }
}
