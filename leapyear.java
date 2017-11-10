import java.util.Scanner;

public class leapyear {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    System.out.println("This program can tell you whether a year is a leap year or not.");
    System.out.println("Please choose a year.");

    int year = Integer.parseInt(reader.nextLine());

    if ((year % 4 == 0) && (year % 100 != 0)) {
      System.out.println(year + " is a leapy year.");
      System.out.println("Thanks for using this program. Have a nice day.");
      System.exit(0);
    }
    else if ((year % 100 == 0) && (year % 400 == 0)) {
      System.out.println(year + " is a leap year.");
      System.out.println("Thanks for using this program. Have a nice day.");
      System.exit(0);
    }
    else {
      System.out.println(year + " is not a leapy year.");
      System.out.println("Thanks for using this program. Have a nice day.");
      System.exit(0);
    }
  }
}
