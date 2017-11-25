import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

public class exercise59 {
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

    System.out.println("You entered the following words, in reverse order:");
    Collections.reverse(words);

    for (String name : words) {
      System.out.println(name);
    }
    
  }
}
