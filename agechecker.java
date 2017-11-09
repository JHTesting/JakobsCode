//I'm shamelessly copying your program. Hope you don't mind. If you do, just sue me you fucker.

import java.util.Scanner;

public class agechecker {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.println("So you're trying to play The Evil Within 2, huh?");
    System.out.println("You have to be 18 years or older to play this game.");
    System.out.println("How old are you?");
    System.out.println("Please only enter Integers.");

    int age = Integer.parseInt(reader.nextLine());

    if (age <= 17 && age >= 1) {
      System.out.println("You're just " + age + " years old. You're not allowed to play this game.");
      System.exit(0);
    }
    else if (age <= 0) {
      System.out.println("So you're " + age + " years old, huh? That doesn't make any sense.");
      System.exit(0);
    }
    else if (age >= 18 && age <= 100) {
      System.out.println("You have a reasonable age. Have fun playing the game.");
      System.exit(0);
    }
    else if (age > 100) {
      System.out.println("Aren't you a little old to play video games?");
      System.exit(0);
    }
    else {
      System.out.println("You entered an invalid number.");
      System.exit(0);
    }
  }
}
