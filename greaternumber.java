import java.util.Scanner;

public class greaternumber {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    String thanks = "Thanks for using this simple program. Have a nice day you wanker.";

    System.out.println("Hello and welcome to this simple program.");
    System.out.println("Please choose a number: ");

    int num1 = Integer.parseInt(reader.nextLine());

    System.out.println("Please choose another number: ");

    int num2 = Integer.parseInt(reader.nextLine());

    if (num1 > num2) {
      System.out.println(num1 + " is bigger than " + num2);
      System.out.println(thanks);
      System.exit(0);
    }
    else if (num2 > num1) {
      System.out.println(num2 + "is bigger than " + num1);
      System.out.println(thanks);
      System.exit(0);
    }
    else if (num2 == num1) {
      System.out.println("Your two numbers are identical.");
      System.out.println(thanks);
      System.exit(0);
    }
  }
}
