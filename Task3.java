//Create a simple number guessing game where the program randomly selects a number between 1 and 100, 
//and the player has to guess the number. The program should provide feedback on whether the guess is too high, too low, or correct. 
//The player should have a limited number of attempts to guess the number.

import java.util.Random;
import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Game game = new Game();
        game.start();
    }
}

class Game {

    int num;
    int guess;
    int ok = 10;
    Scanner key;

    public void start() {
        while (true) {
            game();
            key = new Scanner(System.in);
            System.out.printf("Do you want to play again?%n");
            String replay = key.next();
            switch (replay) {
                case "yes":
                    ok = 10;
                    break;
                case "no":
                    System.out.println(" See you next time then ! ");
                    key.nextLine();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid input. Exiting the game.");
                    break;
            }
        }
    }

    public void game() {
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a number between 1 and 100. You have 10 attempts to guess it.");
        System.out.println();
        Scanner key = new Scanner(System.in);
        Random random = new Random();
        num = random.nextInt(100)+1;
        while (ok > 0) {
            System.out.print("Guess: ");
            guess = key.nextInt();
         if (guess > num) {
                System.out.println("Lower!!");
            }
            if (guess < num) {
                System.out.println("Higher!!");
            }
            if (guess == num) {
                System.out.printf("You found it !!! %n", num);
                ok = 1;
            }
            ok--;
            System.out.println("Lifes left: " + ok);
        }
    }
}
