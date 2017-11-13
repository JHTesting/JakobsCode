import java.util.Scanner;

public class moreloops {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    System.out.println("Please enter a number.");

    int number = Integer.parseInt(reader.nextLine());

    int end = number + 10;

    while (number < end) {
      System.out.println(number);
      number++;
    }

    System.out.println("Thanks for using this program. Have a nice day.");
    System.exit(0);
  }
}
