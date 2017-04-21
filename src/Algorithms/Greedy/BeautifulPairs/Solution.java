package Algorithms.Greedy.BeautifulPairs;

import java.util.ArrayList;
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
        int n = in.nextInt();
        ArrayList<Integer> x=new ArrayList<Integer>();
        ArrayList<Integer> y=new ArrayList<Integer>();
        for(int i=0;i<n;i++) x.add(in.nextInt());
        for(int i=0;i<n;i++) y.add(in.nextInt());

        int count=0;
        for(int i=0;i<x.size();i++){
            if(y.contains(x.get(i))) {count++;y.remove(x.get(i));}
        }

        System.out.println((count<n)? count+1:count-1);
    }
}
