import java.util.Scanner;

public class exercise36 {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    System.out.println("Please enter a number");

    int number = Integer.parseInt(reader.nextLine());
    int sum = 0;
    int counter = 0;
    int even = 0;
    int odd = 0;


    while (number != -1) {
      System.out.println("Your input was " + number);

      sum += number;
      counter++;


      if (number % 2 == 0) {
        even++;
      }

      else {
        odd++;
      }

      System.out.println("Please enter another number: ");
      number = Integer.parseInt(reader.nextLine());


    }

    double average = (double)sum / counter;
    System.out.println("The sum of all the numbers you entered is " + sum + ".");
    System.out.println("You entered " + counter + " numbers.");
    System.out.println("Average: " + average);
    System.out.println("You entered " + even + " even numbers.");
    System.out.println("You entered " + odd + " odd numbers.");
    System.out.println("Thank you and see you later!");
  }
}


// I expected this exercise to be way harder.
// The program is fully functional, but as of now it is not possible to enter doubles.
// I might have to check why that is lol.
