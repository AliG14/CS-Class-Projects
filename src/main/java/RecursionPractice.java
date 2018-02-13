import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RecursionPractice {
    public static void main(String[]args) throws Exception{
        BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
        String input = userInput.readLine();
        int number = Integer.parseInt(input);

        RecursionPractice findFactorial = new RecursionPractice();
        System.out.println(findFactorial.factorial(number));
    }

    public static long factorial(long n){
        if (n <= 1){
            return 1;
        }
        else {
            return (n * factorial(n-1));
        }
    }
}
