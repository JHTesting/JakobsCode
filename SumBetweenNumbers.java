import java.util.Scanner;

public class SumBetweenNumbers {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    System.out.println("Please choose the lower bound.");
    int lower_bound = Integer.parseInt(reader.nextLine());

    System.out.println("Please choose the upper bound.");
    int upper_bound = Integer.parseInt(reader.nextLine());

    int result = 0;

    while (lower_bound <= upper_bound) {
      result += lower_bound;
      lower_bound++;

    }

    System.out.println("The sum of all numbers between the bounds is " + result);
    System.exit(0);
  }
}
