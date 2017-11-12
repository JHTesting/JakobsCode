import java.util.Scanner;

public class secretmessage {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    String password = "ticklous";

    while (true) {
      System.out.println("Type the secret password.");
      String user = reader.nextLine();

      if (user.equals(password)) {
        System.out.println("The secret message is jryy qbar!");
        break;
      }

      System.out.println("Wrong! Try again!");
    }
  }
}
