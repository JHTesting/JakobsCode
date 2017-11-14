import java.util.Scanner;



public class sumofset {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    System.out.println("Please enter a number.");
    int i = Integer.parseInt(reader.nextLine()); //Asks the user for a number

    int counter = 1; // counts how many times the loop has been executed.

    int result = 0; // This is the variable to which counter will be added after each iteration

    while (counter <= i) { //As long as the counter is smaller or equal to the number defined by the user

      result += counter; // Adds the counter to the result
      counter++;         // adds 1 to the counter

      // So what happens is: 1 + 2 + 3 + .... + i = result

    }
    System.out.println("Sum is " + result);
    System.exit(0);
  }
}
