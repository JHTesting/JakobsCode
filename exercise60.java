import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

public class exercise60 {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    ArrayList<String> words = new ArrayList<String>();

    while (true) {
      System.out.println("Type a word:");
      String word = reader.nextLine();

      if (word.isEmpty()) {
        break;
      }

      else {
        words.add(word);
      }

    }

    System.out.println("Would you like to see your input reversed, sorted or shuffled?");
    String choice = reader.nextLine();

    if (choice.equals("reversed")) {
      System.out.println("You entered the following words, in reverse order:");
      Collections.reverse(words);

      for (String name : words) {
        System.out.println(name);
      }
    }

    else if (choice.equals("sorted")) {
      System.out.println("You entered the following words, in alphabetical order:");
      Collections.sort(words);

      for (String name : words) {
        System.out.println(name);
      }
    }

    else if (choice.equals("shuffled")) {
      System.out.println("You entered the following words, in shuffled order:");
      Collections.shuffle(words);

      for (String name : words) {
        System.out.println(name);
      }
    }

    else {
      System.out.println("Unknown command.");
      System.out.println("Here are the words in the order in which you entered them:");

      for (String name : words) {
        System.out.println(name);
      }
    }


  }
}
