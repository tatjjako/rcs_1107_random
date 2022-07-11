import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // variables
        Scanner scan = new Scanner(System.in);
        Random rn = new Random();
        int randomNum, userNum;
        boolean exit = true;

        // about
        while (exit) {
            System.out.println("--------------------------------------------");
            System.out.println("The program selected a number from 0 to 100.\n\r" +
                    "Try to guess the number or exit the program:\n\r" +
                    "1 - start to guess \n\r" +
                    "2 - exit");

            switch (scan.nextInt()) {
                case 1:
                    randomNum = rn.nextInt(100);
                    System.out.println("Guess the number, please [0 .. 100]:");
                    while (true) {
                        userNum = scan.nextInt();
                        if (userNum == randomNum) {
                            System.out.println("Congratulations! You guessed the number!");
                            break;
                        }
                        if (userNum < randomNum) {
                            System.out.println("Your number is lower. Try to guess again, please!");
                        }
                        if (userNum > randomNum) {
                            System.out.println("Your number is greater. Try to guess again, please!");
                        }
                    }
                    break;
                case 2:
                    exit = false;
                    break;
                default:
                    System.out.println("Unknown command! Try again, please!");
            }
        }
    }
}