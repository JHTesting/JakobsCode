import java.util.Scanner;

public class calculator {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.println("Welcome to this calculator");

    String thanks = "Thank you for using this calculator. Have a nice day.";

    while (true) {
      System.out.println("Please enter a command(sum, difference, multiplication, division, quit)");
      String command = reader.nextLine();
      if (command.equals("quit")) {
        break;
      }

      System.out.println("Please enter the numbers.");
      System.out.println("Please enter the first number.");

      int num1 = Integer.parseInt(reader.nextLine());

      System.out.println("Please enter the second number.");

      int num2 = Integer.parseInt(reader.nextLine());

      System.out.println("Would you like to enter another number?");

      String thirdnumber = reader.nextLine();

      if (thirdnumber.equals("yes")) {
        System.out.println("Please enter another number.");

        int num3 = Integer.parseInt(reader.nextLine());

        if (command.equals("sum")) {

        int result3 = num1 + num2 + num3;

        System.out.println("The result is " + result3);
        System.out.println(thanks);
        }
        else if (command.equals("difference")) {

          int dif3 = num1 - num2 - num3;

          System.out.println("The result is " + dif3);
          System.out.println(thanks);
        }

        else if (command.equals("multiplication")) {

          int product3 = num1 * num2 * num3;

          System.out.println("The result is " + product3);
          System.out.println(thanks);
        }
        else if (command.equals("division")) {

          int div3 = num1 / num2 / num3;

          System.out.println("The result is " + div3);
          System.out.println(thanks);
        }
        else {
          System.out.println("Please choose sum, difference, multiplication, division or quit.");
        }
      }

      else if (thirdnumber.equals("no")) {
      if (command.equals("sum")) {

      int result3 = num1 + num2;

      System.out.println("The result is " + result3);
      System.out.println(thanks);
      }
      else if (command.equals("difference")) {

        int dif3 = num1 - num2;

        System.out.println("The result is " + dif3);
        System.out.println(thanks);
      }

      else if (command.equals("multiplication")) {

        int product3 = num1 * num2;

        System.out.println("The result is " + product3);
        System.out.println(thanks);
      }
      else if (command.equals("division")) {

        int div3 = num1 / num2;

        System.out.println("The result is " + div3);
        System.out.println(thanks);
      }
      else {
        System.out.println("Please choose sum, difference, multiplication, division or quit.");
        }
      }
    }
    System.out.println(thanks);
    System.exit(0);
  }
}
