package Algorithms.Sorting.ClosestNumbers;

import java.util.ArrayList;
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
        Scanner scanner=new Scanner(System.in);
        ArrayList<Integer> arr=new ArrayList<>();
        int n=scanner.nextInt();
        scanner.nextLine();
        for(int i=0; i<n; i++){
            arr.add(scanner.nextInt());
        }
        scanner.close();

        Collections.sort(arr);

        int minDiff=Integer.MAX_VALUE;
        for(int i=0; i<arr.size()-1; i++){
            int current=arr.get(i);
            int next=arr.get(i+1);
            int diff=next-current;
            if(diff<minDiff){
                minDiff=diff;
            }
        }

        ArrayList<ArrayList<Integer>> output=new ArrayList<ArrayList<Integer>>();

        for(int i=0; i<arr.size()-1; i++){
            int current=arr.get(i);
            int next=arr.get(i+1);
            int diff=next-current;
            if(diff==minDiff){
                output.add(new ArrayList(Arrays.asList(current, next)));
            }
        }

        for(int i=0; i<output.size(); i++){
            for(int j: output.get(i)){
                System.out.print(j+" ");
            }
        }
    }
}
