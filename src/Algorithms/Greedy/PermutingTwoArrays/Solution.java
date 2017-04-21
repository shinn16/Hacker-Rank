package Algorithms.Greedy.PermutingTwoArrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * A class for Solution
 *
 * @author Brandon Duke
 * @version 4/20/17
 */
public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();

        for(int i_t = 0; i_t<t;i_t++){
            int n=s.nextInt();
            Integer k=s.nextInt();
            Integer[] arr1 = new Integer[n];
            Integer[] arr2 = new Integer[n];
            for(int i=0;i<n;i++){
                arr1[i]=s.nextInt();
            }
            for(int i=0;i<n;i++){
                arr2[i]=s.nextInt();
            }

            if(isPermutable(arr1,arr2,k)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }


    static boolean isPermutable(Integer[] arr1, Integer[] arr2, Integer k){
        //sort in ascending order
        Arrays.sort(arr1);
        //sort in descending order
        Arrays.sort(arr2, Collections.reverseOrder());
        //matching largest with smaller, 2nd largest with 2nd smallest, and so on
        for(int i=0;i<arr1.length;i++){
            //if any of those pairs is less than k, return false
            if(arr1[i]+arr2[i]<k){
                return false;
            }
        }
        //after traversing the whole length, return true
        return true;
    }
}
