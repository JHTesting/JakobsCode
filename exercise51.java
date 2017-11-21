import java.util.Scanner;

public class exercise51 {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    System.out.println("What's your name?");

    String name = reader.nextLine();

    int i = 0;

    int length = name.length();


    while (i < length) {
      char character = name.charAt(i);
      System.out.println(i + ". Character: " + character);
      i++;
    }
  }
}
