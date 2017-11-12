import java.util.Scanner;

public class manynumbers {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int sum = 0;

    while (true) {
      System.out.println("Please enter a number. Type 0 to break.");
      int read = Integer.parseInt(reader.nextLine());
      if (read == 0) {
        break;
      }

      sum = sum + read;

      System.out.println("Sum now: " + sum);
    }
    System.out.println("Thanks for using this program.");
  }
}
