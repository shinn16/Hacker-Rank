package Algorithms.Strings.TwoCharacters;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/** COME BACK
 * A class for Solution
 *
 * @author Brandon Duke
 * @version 4/8/17
 */
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        String s = in.next();

        int[] ints = s.chars().distinct().toArray();
        int max=0;

        if (ints.length > 2){
            for (int i = 0; i < ints.length; i++) {
                for (int j = i + 1; j < ints.length; j++) {
                    int i1 = ints[i];
                    int i2 = ints[j];
                    int[] ints1 = s.chars().filter(v ->  v == i1 || v == i2).toArray();
                    if (max < ints1.length && check(ints1)) {
                        max = ints1.length;
                    }
                }
            }
        } else if (ints.length == 2 && check(ints)) {
            max = ints.length;
        }


        System.out.println(max);
    }

    private static boolean check(int[] chars) {
        if(chars.length>2){
            int c1 = chars[0];
            int c2 = chars[1];
            for (int i = 2; i < chars.length; i++) {
                int aChar = chars[i];

                if(i%2==0 && aChar==c1) continue;
                else if( i%2==1 && aChar==c2) continue;
                else return false;

            }
        }
        return true;
    }

    /*
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(new File("src/Algorithms/Strings/TwoCharacters/input.txt"));
            int len = in.nextInt();
            String s = in.next();
            StringBuilder sb = new StringBuilder(s);

            ArrayList<Character> chars = new ArrayList<>();

            for (int i = 0; i < sb.length(); i++){
                if (!chars.contains(sb.charAt(i))) chars.add(sb.charAt(i));
            }

            int[] charsIndex = new int[chars.size()];

            for (int i = 0; i < chars.size(); i++){
                for (int j = 0; j < sb.length(); j++){
                    if (chars.get(i) == sb.charAt(j)) {
                        charsIndex[i]++;
                    }
                }
            }



            System.out.println(Arrays.toString(charsIndex));

            removeSingles(sb, chars, charsIndex);
            removeDoubles(sb, chars, charsIndex);

            System.out.println(sb.length());
        }catch (Exception e) {e.printStackTrace();}
    }

    public static void removeSingles(StringBuilder sb, ArrayList<Character> chars, int[] charsIndex){
        boolean again = true;

        while (again){
            again = false;
            int[] temp = new int[0];
            int i = 0;
            for (; i < charsIndex.length; i++){ //get the one
                if (charsIndex[i] == 1){
                    charsIndex[i] = -1;

                    temp = removeBadCharIndex(charsIndex, temp);

                    charsIndex = Arrays.copyOf(temp, temp.length);

                    //remove f rom string
                    removeOccurrences(sb, chars, i);

                    chars.remove(i);

                    again = true;
                    break;
                }
            }

            //System.out.println("single removed: " + Arrays.toString(charsIndex));
            //System.out.println("new string: " + sb);


        }

    }

    public static void removeOccurrences(StringBuilder sb, ArrayList<Character> chars, int i){
        int[] lettersToRemove = new int[0];
        for (int j = 0; j < sb.length(); j++){
            if (chars.get(i) == sb.charAt(j)){
                lettersToRemove = Arrays.copyOf(lettersToRemove, lettersToRemove.length + 1);
                lettersToRemove[lettersToRemove.length - 1] = j;
            }
        }

        int counter = 0;
        for (int j : lettersToRemove) {
            sb.deleteCharAt(j - counter);
            counter++;
        }
        //System.out.println("done: " + sb);
    }

    public static int[] removeBadCharIndex(int[] charsIndex, int[] temp){
        for (int j : charsIndex){ //remove bad
            if (j != -1){
                temp = Arrays.copyOf(temp, temp.length + 1);
                temp[temp.length - 1] = j;
            }
        }
        return temp;
    }

    public static void removeDoubles(StringBuilder sb, ArrayList<Character> chars, int[] charsIndex){
        boolean again = true;

        while (again){
            again = false;
            int[] temp = new int[0];

            int i = 0;
            for (; i < sb.length(); i++){
                try {
                    if (sb.charAt(i) == sb.charAt(i + 1)){

                        //remove all occurrences of letter at i
                        char c = sb.charAt(i);

                        int j = 0;
                        for (; j < chars.size(); j++){
                            if (c == chars.get(j)) {
                                break;
                            }
                        }

                        charsIndex[j] = -1;
                        temp = removeBadCharIndex(charsIndex, temp);
                        charsIndex = Arrays.copyOf(temp, temp.length);

                        removeOccurrences(sb, chars, j);

                        chars.remove(j);

                        again = true;
                        break;
                    }
                }catch (Exception e){}
            }

            //System.out.println("multi removed: " + Arrays.toString(charsIndex));
            //System.out.println("new string: " + sb);
        }
    }*/
}
