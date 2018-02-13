import java.lang.reflect.Array;
import java.util.Arrays;
public class test2 {
    public static void main (String[] args){
        int[] numbers = new int[] {1, 2, 3, 4, 5};
        System.out.println(isNumInList(2, numbers));
    }

    public static boolean isNumInList(int num, int[] list){
        for (int i = 0; i <= Array.getLength(list); i++){
            if (i == num){
                return true;
            }
        }
        return false;
    }
}
