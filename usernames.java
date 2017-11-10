import java.util.Scanner;

public class usernames {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    System.out.println("Welcome to this simple program.");
    System.out.println("Please type your username: ");

    String user = reader.nextLine();

    System.out.println("Please type your password: ");

    String password = reader.nextLine();

    if ((user.equals("alex")) && (password.equals("mightyducks"))) {
      System.out.println("Welcome Alex. You are now logged in.");
      System.exit(0);
    }
    else if ((user.equals("emily")) && (password.equals("cat"))) {
      System.out.println("Welcome Emily. You are now logged in.");
      System.exit(0);
    }
    else {
      System.out.println("Your username or password was invalid!");
      System.exit(0);
    }

  }
}
