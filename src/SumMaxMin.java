import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SumMaxMin {
    public static void main(String[]args) throws Exception{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String userLine = input.readLine();
        String[] userValues = userLine.split(", ");
        int[] numValues = new int[userValues.length];

        for (int i = 0; i < numValues.length; i++) {
            numValues[i] = Integer.parseInt(userValues[i]);
        }
        SumMaxMin a = new SumMaxMin();
        System.out.println(a.findSum(numValues));
    }

    public int findSum(int[] numValues){
        int min = numValues[0];
        int max = numValues[0];

        for (int i = 0; i < numValues.length; i++){
            if (min > numValues[i]){
                min = numValues[i];
            }
            if (max < numValues[i]){
                max = numValues[i];
            }
        }
        return (min + max);
    }
}