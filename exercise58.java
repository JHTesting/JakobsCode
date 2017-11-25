import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class exercise58 {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    ArrayList<String> words = new ArrayList<String>();

    while (true) {
      System.out.println("Type a word: ");
      String word = reader.nextLine();

      if ( words.contains(word) ) {
        System.out.println("You entered the same word twice!");
        break;
      }

      else {
        words.add(word);
      }



    }

    Collections.sort(words);

    System.out.println("You entered the following words: ");
    for (String name : words) {
      System.out.println(name);
    }



  }

}
