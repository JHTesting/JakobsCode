import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

public class truthvalues {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    System.out.println("Type a number: ");
    int num1 = Integer.parseInt(reader.nextLine());

    System.out.println("Type another number: ");
    int num2 = Integer.parseInt(reader.nextLine());

    boolean firstgreater = true;

    if (num1 <= num2) {
      firstgreater = false;
    }

    if (firstgreater == true) {
      System.out.println("The first number is greater than the second one.");
    }

    else {
      System.out.println("The second number is greater than the first one.");
    }

  }

  public static boolean allpositive(ArrayList<Integer> list) {
    boolean nonegative = true;

    for (int number : list) {
      if (number < 0) {
        return false;
      }
    }
    return true;
  }

}
