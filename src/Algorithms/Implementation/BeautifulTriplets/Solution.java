package Algorithms.Implementation.BeautifulTriplets;

import java.util.Scanner;

/**
 * Solution class
 *
 * @author Patrick Shinn
 * @version 4/20/17
 */
public class Solution {
    /*Binary Search which returns index of the value.If index is not found it returns -1*/
    public int search(int[] arr,int left,int right,int value)
    {
        int found=0,copy;
        while(left<=right)
        {
            int mid = (left+right)/2;
            if(value==arr[mid])
            {
                found=1;
                copy = mid;
                return mid;
            }
            else
            {
                if(value<arr[mid])
                    right=mid-1;
                else
                    left=mid+1;
            }
        }
        if(found==0)
        {
            return -1;
        }

        return -1;


    }

    public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Solution s = new Solution();
        int n,d;
        Scanner reader = new Scanner(System.in);

        n= reader.nextInt();
        d=reader.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i]=reader.nextInt();
        }

        int count=0,value1,value2,index1,index2;

        for(int i=0;i<n;i++)
        {
            value1 = arr[i]+d;
            index1 = s.search(arr,i+1,n-1,value1);
            if(index1!=-1 && index1!=n-1)/*If index1 is -1 then value is not in the array and if index1 is the last element then
                                        there is no chance of triplet*/
            {
                value2 = arr[index1]+d;
                index2= s.search(arr,index1+1,n-1,value2);
                if(index2!=-1)
                    count++;

            }
        }

        System.out.println(count);
    }
}
