import java.util.Scanner;

public class factorial {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    System.out.println("Type a number");

    int number = Integer.parseInt(reader.nextLine()); // We're looking for the factorial of this number

    int i = 1; // that's the counter
    int result = 1;

    while (i <= number) {
      result *= i; // This is the actual factorial
      i++;
    }
    System.out.println("The result is "+ result);
    System.exit(0);
  }
}
