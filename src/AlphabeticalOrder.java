import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AlphabeticalOrder {
    public static void main(String[] args) throws Exception{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String userLine = input.readLine();
        String[] words = userLine.split(" ");

        AlphabeticalOrder arrange = new AlphabeticalOrder();

        for (int i = 0; i < words.length; i++){
            char[] userWord = words[i].toCharArray();
            System.out.println(arrange.sort(userWord));
        }
    }

    public char[] sort(char[] word){
        for (int i = 0; i < word.length; i++){
            for(int g = i + 1; g < word.length; g++){
                if (Character.toLowerCase(word[g]) < Character.toLowerCase(word[i])){
                    char temp = word[i];
                    word[i] = word[g];
                    word[g] = temp;
                }
            }
        }
        return word;
    }
}
