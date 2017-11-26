import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

public class exercise62 {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    ArrayList<Integer> numbers = new ArrayList<Integer>();

    while (true) {
      System.out.println("Type a number");
      int input = Integer.parseInt(reader.nextLine());

      if (input == 0) {
        break;
      }

      else {
        numbers.add(input);
      }

    }

    System.out.println("The sum of all the numbers you entered is: " + sum(numbers));
    System.out.println("The average of all the numbers you entered is " + average(numbers));

  }

  public static int sum(ArrayList<Integer> list) {
    int result = 0;
    for (int number : list) {
      result += number;
    }

    return result;

  }

  public static double average(ArrayList<Integer> list) {
    int x = sum(list);
    int y = list.size();
    double result = (double)x / y;
    return result;
  }

}
