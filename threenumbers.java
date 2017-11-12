import java.util.Scanner;

public class threenumbers {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int sum = 0;
    int read;

    System.out.println("This program can tell you the sum of three numbers.");
    System.out.println("Please enter the first number.");

    read = Integer.parseInt(reader.nextLine());

    sum = sum + read;

    System.out.println("Please enter the second number.");

    read = Integer.parseInt(reader.nextLine());

    sum = sum + read;

    System.out.println("Please enter the third number.");

    read = Integer.parseInt(reader.nextLine());

    sum = sum + read;

    System.out.println("Sum " + sum);

  }
}
