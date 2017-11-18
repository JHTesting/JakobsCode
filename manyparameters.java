import java.util.Scanner;

public class manyparameters {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    while (true) {
    System.out.println("Who would you like to greet?");
    String who = reader.nextLine();

    System.out.println("What's your name?");
    String greetings = reader.nextLine();

    System.out.println("Where are you from?");
    String home = reader.nextLine();

    greet(who, greetings, home);

    System.out.println("Would you like to greet another person?");
    String choice = reader.nextLine();

    if (choice.equals("no")) {
      break;
    }
    }
  }

  public static void greet(String name, String greetingsFrom, String location) {
    System.out.println("Hi " + name + ", greetings from " + greetingsFrom + " from " + location + ".");
  }

}
