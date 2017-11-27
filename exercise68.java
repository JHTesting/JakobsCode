import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class exercise68 {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    ArrayList<Integer> numbers = new ArrayList<Integer>();

    while(true) {
      System.out.println("Type a number: ");
      int number = Integer.parseInt(reader.nextLine());

      if (number == 0) {
        break;
      }

      else {
        numbers.add(number);
      }

    }

    System.out.println("Type another number:");
    int another = Integer.parseInt(reader.nextLine());

    if (moreThanOnce(numbers, another)) {
      System.out.println(another + " appears more than once.");
    }

    else {
      System.out.println("No number appears more than once.");
    }
  }

  public static boolean moreThanOnce(ArrayList<Integer> list, int x) {
    for (int y : list) {
      if (y == x) {
        return true;
      }
    }
    return false;
  }

}
