import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class exercise69 {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    System.out.println("Type a word: ");
    String word = reader.nextLine();

    System.out.println("Backwards: " + reverse(word));
    if (palindrome(word)) {
      System.out.println("The word you entered is a palindrome! It's the same forward and backward!");
    }

  }

  public static String reverse(String word) {
    int length = (word.length()) - 1;
    int i = 0;
    String result = "";

    while (length >= i) {
      char character = word.charAt(length);
      result = result + character;
      length--;

    }

    return result;
  }



  public static boolean palindrome(String x) {
    String y = reverse(x);
    if (y.equals(x)) {
      return true;
    }
    else {
      return false;
    }
  }

}
