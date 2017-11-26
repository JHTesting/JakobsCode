import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

public class exercise67 {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    ArrayList<Integer> numbers = new ArrayList<Integer>();

    while (true) {
      System.out.println("Type a number");
      int number = Integer.parseInt(reader.nextLine());

      if (number == 0) {
        break;
      }

      else {
        numbers.add(number);
      }

    }

    System.out.println("The sum of all the numbers you entered is " + sum(numbers));
    System.out.println("The average of all the numbers you entered is " + average(numbers));
    System.out.println("The greatest number you entered is " + greatest(numbers));
    System.out.println("The smallest number you entered is " + least(numbers));
    double var = variance(numbers);
    System.out.println("The variance is " + var);
    System.out.println("The standard deviation is " + StdDev(var));

  }

  public static int sum(ArrayList<Integer> list) {
    int result = 0;
    for (int x : list) {
      result += x;
    }

    return result;

  }

  public static double average(ArrayList<Integer> list) {
    int x = sum(list);
    int y = list.size();
    double result = (double)x / y;
    return result;
  }

  public static int greatest(ArrayList<Integer> list) {
    int result = Collections.max(list);
    return result;
  }

  public static int least(ArrayList<Integer> list) {
    int result = Collections.min(list);
    return result;
  }

  public static double variance(ArrayList<Integer> list) {
    double avg = average(list);
    int size = list.size();
    double temp = 0;
    for (double a : list) {
      temp += (a-avg)*(a-avg);
    }

    return temp/(size - 1);
  }

  public static double StdDev(double x) {
    return Math.sqrt(x);
  }

}
