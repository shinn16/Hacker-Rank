package Algorithms.Implementation.LibraryFine;

import java.util.Scanner;

/**
 * Solution class
 *
 * @author Patrick Shinn
 * @version 4/20/17
 */
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aDay = sc.nextInt();
        int aMonth = sc.nextInt();
        int aYear = sc.nextInt();
        int eDay = sc.nextInt();
        int eMonth = sc.nextInt();
        int eYear = sc.nextInt();
        int fine = 0;
        if(aYear == eYear) {
            if(aMonth == eMonth) {
                if(aDay > eDay) {
                    fine = 15 * (aDay - eDay);
                }
            } else if(aMonth > eMonth) fine = 500 * (aMonth - eMonth);
        } else if(aYear > eYear) fine = 10000 * (aYear - eYear);
        System.out.println(fine);
        sc.close();
    }
}
