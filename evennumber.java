import java.util.Scanner;

public class evennumber {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    int number = 2;

    System.out.println("This program will print out all even numbers from 1 to 100.");

    while (number < 101) {
      System.out.println(number);
      number = number + 2;
    }
    System.exit(0);
  }
}
