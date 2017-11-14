import java.util.Scanner;

public class SumOfThePowers {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    System.out.println("Type a number");
    int end = Integer.parseInt(reader.nextLine());

    int i = 0;

    int result = 0;

    while (i <= end) {
      int power = (int)Math.pow(2, i);
      result += power;
      i++;
    }
    System.out.println(result);
    System.exit(0);
  }
}
