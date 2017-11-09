import java.util.Scanner;

public class positivenumber {
  public static void main(String[] args) {
    Scanner reader = new Scanner(reader.nextLine());
    System.out.println("Hello!");
    System.out.println("Please choose a number.");

    int choice = Integer.parseInt(reader.nextLine);

    System.out.println("You chose " +  choice " as your number.");

    if (choice > 0) {
      System.out.println("Your chosen number is positive.");
      System.exit(0);
    }
    else if (choice == 0) {
      System.out.println("Your chosen number equals 0.");
      System.exit(0);
    }
    else {
      System.out.println("Your chosen number is negative.");
      System.exit(0);
    }
  }
}
