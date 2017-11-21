import java.util.Scanner;

public class stringex1 {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    System.out.println("Type a word:");
    String word1 = reader.nextLine();

    System.out.println("Type another word:");
    String word2 = reader.nextLine();

    String together = word1 + word2;

    System.out.println("The length of " + word1 + " is " + word1.length());
    System.out.println("The length of " + word2 + " is " + word2.length());
    System.out.println("The combined length is " + together.length());

    String long = "Supercalifragilisticexpialidocious";

    char character = long.charAt(12);

    System.out.println(character);
  }
}
