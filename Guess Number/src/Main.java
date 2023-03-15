import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(100);
        //double number = (int)(Math.random()*100);
        Scanner scanner = new Scanner(System.in);
        int right = 0;
        int userNumber;
        int[] wrongNumbers = new int[5];
        boolean isWin = false;
        while(right < 5){
            System.out.println("Enter your Guess: ");
            userNumber = scanner.nextInt();
            if(userNumber <0 || userNumber >99){
                System.out.println("Please enter between 0 and 100.");
                continue;
            }
            if(number == userNumber){
                System.out.println("Congratulations! Guessed number: " +number);
                isWin = true;
                break;
            }else{
                wrongNumbers[right] = userNumber;
                right++;
                System.out.println("Wrong Number.");
                if(userNumber > number){
                    System.out.println(userNumber + "is greater than guess number.");
                }else{
                    System.out.println(userNumber +" is lesser than guess number.");
                }
                System.out.println("you have " +(5-right) +" more chance.");
            }

        }
        if(!isWin){
            System.out.println("You lost! The number was "+number);
        }


    }
}