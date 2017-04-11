package Algorithms.Implementation.DrawingBook;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        // your code goes here
        int middle=n/2,turns;
        if(p>middle)
            turns=(n-p)/2;
        else
            turns=p/2;
        System.out.println(turns);
    }
}
