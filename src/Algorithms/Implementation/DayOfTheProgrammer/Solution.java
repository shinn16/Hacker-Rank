package Algorithms.Implementation.DayOfTheProgrammer;

import java.util.Scanner;

/**
 * Solution class
 *
 * @author Patrick Shinn
 * @version 4/23/17
 */
public class Solution {
    static String solve(int year){
        // Complete this function
        if(year < 1918){
            if(year % 4 != 0){//not leap year
                return("13.09."+year);
            }else{//leap year
                return("12.09."+year);
            }
        }else if(year == 1918){//year 1918
            return("26.09."+year);
        }else{
            if((year % 4 == 0) && (year % 100 != 0) ){//Leap year
                return("12.09."+year);
            }else if(year % 400 == 0){//Alsoleap year
                return("12.09."+year);
            }else//Lear year
                return("13.09."+year);

        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        String result = solve(year);
        System.out.println(result);
    }
}
