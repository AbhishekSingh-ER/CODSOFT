/* 
import java.util.*;

public class NumberGame{
    public static void main(String[] args) {
        System.out.println("***** Welcome To Random Number Guessing Game *****");
        Scanner sc = new Scanner(System.in);

        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        
        System.out.print("Guess the number between 1 to 100 : ");
        int guess = sc.nextInt();
        int i = 1, limit = 5, count = 1, win = 0;
        while (i!=limit+1) { 
            if(i==limit){
                System.out.println("You lose the game.");
                System.out.println("You want to play again choose : y/n");
                char ch = sc.next().charAt(0);
                if(ch == 'y' || ch == 'Y'){
                    randomNumber = random.nextInt(100) + 1;
                    i=0;
                    count++;
                }else{
                    break;
                }
            }
            else if(guess == randomNumber){
                win++;
                System.out.println("You win the game !");
                System.out.println("You want to play again choose : y/n");
                char ch = sc.next().charAt(0);
                if(ch == 'y' || ch == 'Y'){
                    randomNumber = random.nextInt(100) + 1;
                    i=0;
                    count++;
                }else{
                    break;
                }
            }else if( guess < randomNumber){
                System.out.println("Your guess number is less then random number....");
            }else {
                System.out.println("Your guess number is greater then random number....");
            }
            System.out.print("Again guess the number between 1 to 100 : ");
            guess = sc.nextInt();
            i++;
        }
        System.out.println("Your score is "+win+"/"+count);
    }
}
*/
import java.util.*;

public class NumberGame {
    public static void main(String[] args) {
        System.out.println("***** Welcome To Random Number Guessing Game *****");
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int limit = 5; // maximum attempts
        int totalRounds = 0;
        int win = 0;

        boolean playAgain = true;

        while (playAgain) {
            int randomNumber = random.nextInt(100) + 1;
            int attempts = 0;
            boolean guessedCorrectly = false;

            System.out.println("\nNew Game Started! Guess the number between 1 to 100.");

            while (attempts < limit) {
                System.out.print("Enter your guess: ");
                int guess = sc.nextInt();
                attempts++;

                if (guess == randomNumber) {
                    System.out.println("Congratulations! You guessed it right.");
                    win++;
                    guessedCorrectly = true;
                    break;
                } else if (guess < randomNumber) {
                    System.out.println("Your guess is too low.");
                } else {
                    System.out.println("Your guess is too high.");
                }

                System.out.println("Attempts left: " + (limit - attempts));
            }

            if (!guessedCorrectly) {
                System.out.println("You lost! The number was: " + randomNumber);
            }

            totalRounds++;

            System.out.print("Do you want to play again? (y/n): ");
            char choice = sc.next().charAt(0);
            if (choice != 'y' && choice != 'Y') {
                playAgain = false;
            }
        }

        System.out.println("\nTotal Rounds Played: " + totalRounds);
        System.out.println("Total Wins: " + win);
        System.out.println("Your Score: " + win + "/" + totalRounds);

        sc.close();
    }
}
