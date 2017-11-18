import java.util.Scanner;

public class MethodsCallingEachOther {

  public static void greet(String name) {
    System.out.println("Hi " + name + ", greetings from the world of methods!");
  }

  public static void greetmanytimes(String name, int times) {
    int i = 1;
    while (i <= times) {
      greet(name);
      i++;
    }

  }

  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    while (true) {
      System.out.println("Who would you like to greet?");
      String dude = reader.nextLine();

      System.out.println("How many times would you like to greet them?");
      int number = Integer.parseInt(reader.nextLine());

      greetmanytimes(dude, number);

      System.out.println("Would you like to greet another person?");
      String choice = reader.nextLine();

      if (choice.equals("no")) {
        break;
      }

    }

  }

}
