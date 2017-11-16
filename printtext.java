import java.util.Scanner;

public class printtext {

  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    System.out.println("How many times should my first selfwritten method be printed?");
    int times = Integer.parseInt(reader.nextLine());
    int counter = 1;

    while (counter <= times) {
      printText();
      counter++;
    }

  }

public static void printText() {

  System.out.println("In the beginning, there were the swamp, the hoe and Java.");

}

}
