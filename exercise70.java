import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class exercise70 {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    ArrayList<Integer> first = new ArrayList<Integer>();
    ArrayList<Integer> second = new ArrayList<Integer>();

    while(true) {
      System.out.println("Type a number: ");
      int number = Integer.parseInt(reader.nextLine());

      if (number == 0) {
        break;
      }

      else {
        first.add(number);
      }

    }

    System.out.println("Now type a few more numbers please");

    while(true) {
      System.out.println("Type a number: ");
      int number = Integer.parseInt(reader.nextLine());

      if (number == 0) {
        break;
      }

      else {
        second.add(number);
      }

    }

    combine(first, second);
    Collections.sort(first);

    System.out.println("All the numbers you entered: ");
    System.out.println(first);
  }

  public static ArrayList<Integer> combine(ArrayList<Integer> first, ArrayList<Integer> second) {
    for (int x : second) {
      if (!first.contains(x)) {
        first.add(x);
      }
    }

    return first;
  }

}
