import java.util.Scanner;

public class logicaloperators {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    System.out.println("Please choose a number.");

    int num1 = Integer.parseInt(reader.nextLine());

    if ((num1 > 4 && num1 < 11) || num1 > 100) {
      System.out.println("The number is either between 5 or 10 or bigger than 100.");
    }
    else {
      System.out.println("The number is smaller than 5 or in the range of 11 - 99.");
    }

    System.out.println("Please choose another number.");

    int num2 = Integer.parseInt(reader.nextLine());

    if (!(num2 < 0 || num2 > 100)) {
      System.out.println("Your number is somewhere between 1 and 99!");
    }
    else {
      System.out.println("Your number is either smaller than 0 or bigger than 100.");
    }

    System.out.println("Please enter a string");

    String word = reader.nextLine();

    if (!(word.equals("milk"))) {
      System.out.println("Your chosen string was not equal to milk. You're a monster!");
    }
    else {
      System.out.println("Your chosen string was equal to milk! You're a hero!");
    }

    System.out.println("Thanks for using this simple program. Have a nice day you cunt.");
    System.exit(0);
  }
}
