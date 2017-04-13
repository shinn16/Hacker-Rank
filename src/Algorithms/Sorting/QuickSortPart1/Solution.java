package Algorithms.Sorting.QuickSortPart1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * A class for QuickSortPart1
 *
 * @author Brandon Duke
 * @version 4/12/17
 */
public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ar[] = new int[n];
        int mid = sc.nextInt();
        for (int i = 1; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        ArrayList left = new ArrayList();
        ArrayList right = new ArrayList();
        for(int i=1;i<n;i++){
            if(ar[i]<=mid){
                left.add(ar[i]);
            }else{
                right.add(ar[i]);
            }
        }
        List fList = new ArrayList(left);
        fList.add(mid);
        fList.addAll(right);
        for(Object el : fList){
            System.out.print(el+" ");
        }
    }
}
