package Algorithms.Implementation.Warmups.TimeConversion;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Solution class
 *
 * @author Patrick Shinn
 * @version 4/2/17
 */
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String time = scanner.nextLine();
        SimpleDateFormat sdfin = new SimpleDateFormat("hh:mm:ssa");
        SimpleDateFormat sdfout = new SimpleDateFormat("HH:mm:ss");
        Date date = new Date(-1);
        try{
            date = sdfin.parse(time);
        }catch(Exception e){
        }
        System.out.println(sdfout.format(date));
    }
}
