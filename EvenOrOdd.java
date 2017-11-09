import java.util.Scanner;

public class EvenOrOdd {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    System.out.println("Hello. Please choose a number.");

    int number = Integer.parseInt(reader.nextLine());

    if (number % 2 == 0) {
      System.out.println("You chose an even number. That means " + number + " is divisible by 2.");
    }
    else {
      System.out.println("You chose an odd number. That means " + number + " isn't divisible by 2.");
    }

    System.out.println("Thank you for using this program.");
  }
}
