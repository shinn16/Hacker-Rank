package Algorithms.Implementation.GradingStudents;

import java.io.File;
import java.util.Scanner;

/**
 * Solution class
 *
 * @author Patrick Shinn
 * @version 4/2/17
 */
public class Solution {
    public static void main(String[] args){
        try{
            Scanner scanner = new Scanner(System.in);
            int size = scanner.nextInt();
            for (int i = 0; i < size; i ++){
                int grade = scanner.nextInt();
                if (grade >= 38){
                    if (grade % 5 >= 3){
                        grade += 5 - (grade % 5);
                    }
                }
                System.out.println(grade);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
