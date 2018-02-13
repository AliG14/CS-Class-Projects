import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.*;

public class palindrome {
    public static void main(String[]args) {
        int[] things = {213, 23, 21, 9, 90, 44};
        int[] stuff = {1, 2, 45, 8, 123};
        int[] everything = combine(things, stuff);
        int[] sortEverything = sort(everything);

       for (int i = 0; i < sortEverything.length; i++){
            System.out.println(sortEverything[i]);
       }
    }

    public static int[] combine(int[] things, int[] stuff) {
        int[] all = new int[things.length + stuff.length];

        for (int i = 0; i < things.length; i++){
            all[i] = things[i];
        }

        for (int i = things.length; i < all.length; i++) {
            all[i] = stuff[i - things.length];
        }

        return all;
    }

    public static boolean isPalindrome(String word){
        char[] letters = word.toCharArray();

        int i1 = 0;
        int i2 = word.length();

        while (i2 > i1){
            if (letters[i2] != letters[i1]){
                return false;
            }
            i1++;
            i2--;
        }
        return true;
    }

    public static int[] sort(int[] list){
        int temp;

        for (int i = 0; i < list.length; i++){
            for (int g = i + 1; g < list.length ; g++){
                if (list[i] > list[g]){
                    temp = list[i];
                    list[i] = list[g];
                    list[g] = temp;
                }
            }
        }
        return list;
    }
}