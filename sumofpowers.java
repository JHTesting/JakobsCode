import java.util.Scanner;

public class sumofpowers {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    System.out.println("Hello and welcome to this program.");
    System.out.println("Please type the base number.");

    int base = Integer.parseInt(reader.nextLine());

    System.out.println("Please type the exponent");

    int exponent = Integer.parseInt(reader.nextLine());

    int result = (int)Math.pow(base, exponent);

    System.out.println("The result is " + result);
    System.out.println("Would you like to know the sum of all exponents up to " + exponent + " ?");

    String answer = reader.nextLine();

    if (answer.equals("yes")) {
      int counter = 0;
      int end = 0;

      while (counter <= exponent) {
        int math = (int)Math.pow(base, counter);

        end += math;
        counter++;

      }

      System.out.println("The result is " + end);
      System.exit(0);

    }

    else {

      System.out.println("Have it your way.");
      System.exit(0);

    }

  }
}
