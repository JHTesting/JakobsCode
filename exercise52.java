import java.util.Scanner;

public class exercise52 {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    System.out.println("What's your name?");
    String name = reader.nextLine();

    int length = (name.length()) - 1;

    int i = 0;

    System.out.println("In reverse order: ");

    while (length >= i) {
      char character = name.charAt(length);
      System.out.print(character);
      length--;

    }

    System.out.println(" ");

  }
}
