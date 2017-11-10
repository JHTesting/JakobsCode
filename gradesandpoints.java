import java.util.Scanner;

public class gradesandpoints {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    String thanks = "Thanks for using this program. Have a nice day you fucker.";

    System.out.println("Hello and welcome to this simple grade checker.");
    System.out.println("How many points out of 60 would you give this program?");

    int points = Integer.parseInt(reader.nextLine());

    System.out.println("So you would give this program " + points + " points.");

    if (points >= 0 && points <= 29) {
      System.out.println("That's a 1. Guess this program sucks.");
      System.out.println(thanks);
      System.exit(0);
    }

    else if (points >= 30 && points <= 34) {
      System.out.println("That's a 2. Guess this program isn't as good as I thought.");
      System.out.println(thanks);
      System.exit(0);
    }

    else if (points >= 35 && points <= 39) {
      System.out.println("That's a 3. Guess I still have to improve this program.");
      System.out.println(thanks);
      System.exit(0);
    }
    else if (points >= 40 && points <= 49) {
      System.out.println("That's a 4. That means this program is pretty good!");
      System.out.println(thanks);
      System.exit(0);
    }
    else if (points >= 50 && points <= 60) {
      System.out.println("That's a 5. That means this program is fantastic!");
      System.out.println(thanks);
      System.exit(0);
    }
    else if (points >= 61 || points < 0) {
    System.out.println("Please enter a number between 0 and 60.");
    System.out.println(thanks);
    System.exit(0);
    }
  }
}
