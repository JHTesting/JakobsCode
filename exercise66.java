import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class exercise66 {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    ArrayList<Integer> numbers = new ArrayList<Integer>();

    while(true) {
      System.out.println("Type a number");
      int number = Integer.parseInt(reader.nextLine());

      if (number == 0) {
        break;
      }

      else {
        numbers.add(number);
      }

    }

    System.out.println("The biggest number you entered is " + biggest(numbers));

  }

  public static int biggest( ArrayList<Integer> list ) {
    int result = Collections.max(list);
    return result;
  }

}
