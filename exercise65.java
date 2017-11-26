import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class exercise65 {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    ArrayList<String> list = new ArrayList<String>();

    while (true) {
      System.out.println("Type a word:");
      String word = reader.nextLine();

      if (word.isEmpty()) {
        break;
      }

      else {
        list.add(word);
      }

    }

    System.out.println("The lengths of the strings you entered is: " + lengths(list));

  }

  public static ArrayList<Integer> lengths(ArrayList<String> list) {
    ArrayList<Integer> x = new ArrayList<Integer>();

    for ( String word : list) {
      x.add(word.length());
    }

    return x;

  }

}
