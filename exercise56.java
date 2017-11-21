import java.util.Scanner;

public class exercise56 {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    System.out.println("Type a word:");
    String text = reader.nextLine();

    String result = reverse(text);

    System.out.println("In reverse order: " + result);
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

}
