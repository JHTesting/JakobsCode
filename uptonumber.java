import java.util.Scanner;

public class uptonumber {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);


    System.out.println("Up to what number?");

    int number = Integer.parseInt(reader.nextLine());

    System.out.println("From where?");

    int start = Integer.parseInt(reader.nextLine());

    while (start < number) {
      System.out.println(start);
      start++;
    }

    while (start > number) {
      System.out.println(start);
      start--;
    }

    System.out.println("Thanks for using this program. Have a nice day.");
    System.exit(0);
  }
}
