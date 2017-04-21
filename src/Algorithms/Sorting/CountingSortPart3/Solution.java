package Algorithms.Sorting.CountingSortPart3;

import java.util.Scanner;

/**
 * A class for Solution
 *
 * @author Brandon Duke
 * @version 4/20/17
 */
public class Solution {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[100];

        for(int i=0;i<n;i++){
            int input=sc.nextInt();
            String strinput=sc.next();
            arr[input]++;
        }
        sc.close();


        for(int i=0;i<100;i++){
            int count=0;
            for(int j=i;j>=0;j--){
                count+=arr[j];
            }
            System.out.print(count+" ");
        }

    }
}
