import java.util.Scanner;

public class stringcomparison {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    String trigger = "> ";
    String thanks = "Thank you for using this simple program. Have a nice day.";

    System.out.println("Hello and welcome to this simple string comparator.");
    System.out.println("Please enter a string: ");

    String text1 = reader.nextLine();

    System.out.println("Please enter another string: ");

    String text2 = reader.nextLine();

    if (text1.equals(text2)) {
      System.out.println("Your two strings are identical.");
      System.out.println(thanks);
      System.exit(0);
    }

    else if (text1.equals("Herbert") || text2.equals("Herbert")) {
      System.out.println("Herbert, huh? That's a dumb name.");
      System.out.println(thanks);
      System.exit(0);
    }

    else {
      System.out.println("Your two strings are not identical.");
      System.out.println(thanks);
      System.exit(0);
    }

  }
}
