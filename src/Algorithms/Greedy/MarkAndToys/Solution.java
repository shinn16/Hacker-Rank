package Algorithms.Greedy.MarkAndToys;

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
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int index=0;
        int toy[] = new int[n];
        while (index< n){
            toy[index]= sc.nextInt();
            index++;
        }
        Arrays.sort(toy);
        int totToys=0;
        for (int i = 0; i<n; i++ ){
            if (toy[i] < k){
                k= k-toy[i];
                totToys++;
            }else{
                break;
            }

        }

        System.out.println(totToys) ;
    }
}
