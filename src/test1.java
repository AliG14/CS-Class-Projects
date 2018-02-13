/**
 * Created by Ali G on 11/23/2017.
 */
import java.util.Scanner;
public class test1 {
    public static void main (String[]args){
        //rock beats scissor
        //scissor beats paper
        //paper beats rock
        Scanner console = new Scanner(System.in);

        System.out.println("Rock, paper, or scissors?");
        String choice = console.nextLine();

        if (isValid(choice)){
            int computerChoice = (int)(Math.random()*3);
            int userChoice = getVal(choice);

            System.out.println("You "+hasWon(userChoice, computerChoice));
            System.out.println("The computer's choice was "+getChoice(computerChoice));
        }
        else {
            System.out.println("That is not a valid choice");
        }
    }

    public static String getChoice(int cChoice){
        if (cChoice == 0){
            return "Rock";
        }
        if (cChoice == 1){
            return "paper";
        }
        else {
            return "scissors";
        }
    }

    public static String hasWon(int pChoice, int cChoice){
        if (pChoice == cChoice){
            return ("tie");
        }
        if (((pChoice == 0) && (cChoice == 2)) | ((pChoice == 1) && (cChoice == 0)) | ((pChoice == 2) && (cChoice == 1))){
            return "won";
        }
        else {
            return "lose";
        }
    }

    public static boolean isValid(String userChoice){
        if (userChoice.equalsIgnoreCase("paper")){
            return true;
        }
        if (userChoice.equalsIgnoreCase("rock")) {
            return true;
        }
        if (userChoice.equalsIgnoreCase("scissors")){
            return true;
        }
        else {
            return false;
        }
    }

    public static int getVal(String userChoice){
        if (userChoice.equalsIgnoreCase("rock")){
            return 0;
        }
        if (userChoice.equalsIgnoreCase("paper")){
            return 1;
        }
        else {
            return 2;
        }
    }
}
