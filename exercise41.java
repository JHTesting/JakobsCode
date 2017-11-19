import java.util.Scanner;
import java.util.Random;


public class exercise41 {

  public static void main(String[] args) {

    Scanner reader = new Scanner(System.in);

    Random rand = new Random();

    int n = rand.nextInt(100) + 1;

    int amount = 0;

    while (true) {

      System.out.println("Guess a number.");

      int guess = Integer.parseInt(reader.nextLine());

      if (guess < n) {
        System.out.println("The number is greater.");
      }

      else if (guess > n) {
        System.out.println("The number is lesser.");
      }

      else if (guess == n) {
        System.out.println("Congratulations, your guess is correct.");
        break;
      }

      amount++;
      System.out.println("Guesses made: " + amount + ".");


    }


  }


}
