import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * IntegerPalindrome determines whether or not a given integer is a palindrome. It goes
 * about doing so by reversing the inputted value and comparing the original value to
 * the reversed value.
 *
 * @author Ali G
 * @version November 24, 2017
 */
public class IntegerPalindrome {
    public static void main(String[] args) throws Exception{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String userLine = input.readLine();
        int userValue = Integer.parseInt(userLine);
        IntegerPalindrome findPalindrome = new IntegerPalindrome();
        System.out.println(findPalindrome.isPalindrome(userValue));
    }

    /**
     * Reverses the original user value.
     *
     * @param  value the original value inputted by the user
     * @return the reversed value of the original
     */
    public int reverse(int value) {
        int temp = value;
        int temp2 = 0;
        while (temp != 0){
            temp2 = (temp2 * 10) + (temp % 10);
            temp /= 10;
        }
        return temp2;
    }

    /**
     * Checks to see whether the original value is a palindrome.
     *
     * @param  value the original value inputted by the user
     * @return true if the two values are equal; otherwise
     *         false
     */
    public boolean isPalindrome(int value) {
        return value == reverse(value);
    }
}
