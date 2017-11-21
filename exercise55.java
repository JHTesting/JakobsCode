import java.util.Scanner;

public class exercise55 {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    System.out.println("Type in the first word:");
    String firstword = reader.nextLine();

    System.out.println("Type in the second word:");
    String secondword = reader.nextLine();

    int result = inside(firstword, secondword);

    if (result != -1) {

      result += 1;
      System.out.println("The first word contains the second word.");
      System.out.println("The second word starts at " + result);
      System.out.println("Have a nice day");
      System.exit(0);
    }

    else {
      System.out.println("The first word does not contain the second word");
      System.exit(0);
    }
  }

  public static int inside(String word1, String word2) {
    int result = word1.indexOf(word2);

    return result;
  }

}
