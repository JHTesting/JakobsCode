import java.util.Scanner;
import java.util.ArrayList;

public class exercise57 {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    ArrayList<String> musicians = new ArrayList<String>();

    while (true) {
      System.out.println("Type a word: ");
      String word = reader.nextLine();

      if ( word.isEmpty() ) {
        break;
      }

      else {
        musicians.add(word);
      }

    }

    System.out.println("You typed the following words: ");
    for (String musician : musicians) {
      System.out.println(musician);
    }
  }
}
